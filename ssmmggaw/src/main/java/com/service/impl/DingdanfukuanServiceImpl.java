package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DingdanfukuanDao;
import com.entity.DingdanfukuanEntity;
import com.service.DingdanfukuanService;
import com.entity.vo.DingdanfukuanVO;
import com.entity.view.DingdanfukuanView;

@Service("dingdanfukuanService")
public class DingdanfukuanServiceImpl extends ServiceImpl<DingdanfukuanDao, DingdanfukuanEntity> implements DingdanfukuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanfukuanEntity> page = this.selectPage(
                new Query<DingdanfukuanEntity>(params).getPage(),
                new EntityWrapper<DingdanfukuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanfukuanEntity> wrapper) {
		  Page<DingdanfukuanView> page =new Query<DingdanfukuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanfukuanVO> selectListVO(Wrapper<DingdanfukuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanfukuanVO selectVO(Wrapper<DingdanfukuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanfukuanView> selectListView(Wrapper<DingdanfukuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanfukuanView selectView(Wrapper<DingdanfukuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
