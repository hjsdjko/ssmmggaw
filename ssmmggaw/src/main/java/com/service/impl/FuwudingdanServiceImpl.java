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


import com.dao.FuwudingdanDao;
import com.entity.FuwudingdanEntity;
import com.service.FuwudingdanService;
import com.entity.vo.FuwudingdanVO;
import com.entity.view.FuwudingdanView;

@Service("fuwudingdanService")
public class FuwudingdanServiceImpl extends ServiceImpl<FuwudingdanDao, FuwudingdanEntity> implements FuwudingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwudingdanEntity> page = this.selectPage(
                new Query<FuwudingdanEntity>(params).getPage(),
                new EntityWrapper<FuwudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwudingdanEntity> wrapper) {
		  Page<FuwudingdanView> page =new Query<FuwudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwudingdanVO> selectListVO(Wrapper<FuwudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwudingdanVO selectVO(Wrapper<FuwudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwudingdanView> selectListView(Wrapper<FuwudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwudingdanView selectView(Wrapper<FuwudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
