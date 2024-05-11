package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhiyuanzhejifenEntity;
import com.entity.view.ZhiyuanzhejifenView;

import com.service.ZhiyuanzhejifenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 志愿者积分
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
@RestController
@RequestMapping("/zhiyuanzhejifen")
public class ZhiyuanzhejifenController {
    @Autowired
    private ZhiyuanzhejifenService zhiyuanzhejifenService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiyuanzhejifenEntity zhiyuanzhejifen, 
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		zhiyuanzhejifen.setUserid((Long)request.getSession().getAttribute("userId"));
    	}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			zhiyuanzhejifen.setZhiyuanhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhiyuanzhejifenEntity> ew = new EntityWrapper<ZhiyuanzhejifenEntity>();
		PageUtils page = zhiyuanzhejifenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzhejifen), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiyuanzhejifenEntity zhiyuanzhejifen, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			zhiyuanzhejifen.setZhiyuanhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhiyuanzhejifenEntity> ew = new EntityWrapper<ZhiyuanzhejifenEntity>();
		PageUtils page = zhiyuanzhejifenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzhejifen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiyuanzhejifenEntity zhiyuanzhejifen){
       	EntityWrapper<ZhiyuanzhejifenEntity> ew = new EntityWrapper<ZhiyuanzhejifenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiyuanzhejifen, "zhiyuanzhejifen")); 
        return R.ok().put("data", zhiyuanzhejifenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiyuanzhejifenEntity zhiyuanzhejifen){
        EntityWrapper< ZhiyuanzhejifenEntity> ew = new EntityWrapper< ZhiyuanzhejifenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiyuanzhejifen, "zhiyuanzhejifen")); 
		ZhiyuanzhejifenView zhiyuanzhejifenView =  zhiyuanzhejifenService.selectView(ew);
		return R.ok("查询志愿者积分成功").put("data", zhiyuanzhejifenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiyuanzhejifenEntity zhiyuanzhejifen = zhiyuanzhejifenService.selectById(id);
        return R.ok().put("data", zhiyuanzhejifen);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiyuanzhejifenEntity zhiyuanzhejifen = zhiyuanzhejifenService.selectById(id);
        return R.ok().put("data", zhiyuanzhejifen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiyuanzhejifenEntity zhiyuanzhejifen, HttpServletRequest request){
    	zhiyuanzhejifen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiyuanzhejifen);
    	zhiyuanzhejifen.setUserid((Long)request.getSession().getAttribute("userId"));

        zhiyuanzhejifenService.insert(zhiyuanzhejifen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiyuanzhejifenEntity zhiyuanzhejifen, HttpServletRequest request){
    	zhiyuanzhejifen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiyuanzhejifen);
    	zhiyuanzhejifen.setUserid((Long)request.getSession().getAttribute("userId"));

        zhiyuanzhejifenService.insert(zhiyuanzhejifen);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhiyuanzhejifenEntity zhiyuanzhejifen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiyuanzhejifen);
        zhiyuanzhejifenService.updateById(zhiyuanzhejifen);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiyuanzhejifenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhiyuanzhejifenEntity> wrapper = new EntityWrapper<ZhiyuanzhejifenEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}
		if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wrapper.eq("userid", (Long)request.getSession().getAttribute("userId"));
    	}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			wrapper.eq("zhiyuanhao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhiyuanzhejifenService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
