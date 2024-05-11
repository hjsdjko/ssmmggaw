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


import com.dao.FuwuliebiaoDao;
import com.entity.FuwuliebiaoEntity;
import com.service.FuwuliebiaoService;
import com.entity.vo.FuwuliebiaoVO;
import com.entity.view.FuwuliebiaoView;

@Service("fuwuliebiaoService")
public class FuwuliebiaoServiceImpl extends ServiceImpl<FuwuliebiaoDao, FuwuliebiaoEntity> implements FuwuliebiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuliebiaoEntity> page = this.selectPage(
                new Query<FuwuliebiaoEntity>(params).getPage(),
                new EntityWrapper<FuwuliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuliebiaoEntity> wrapper) {
		  Page<FuwuliebiaoView> page =new Query<FuwuliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwuliebiaoVO> selectListVO(Wrapper<FuwuliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwuliebiaoVO selectVO(Wrapper<FuwuliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwuliebiaoView> selectListView(Wrapper<FuwuliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuliebiaoView selectView(Wrapper<FuwuliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
