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


import com.dao.DiscussfuwuliebiaoDao;
import com.entity.DiscussfuwuliebiaoEntity;
import com.service.DiscussfuwuliebiaoService;
import com.entity.vo.DiscussfuwuliebiaoVO;
import com.entity.view.DiscussfuwuliebiaoView;

@Service("discussfuwuliebiaoService")
public class DiscussfuwuliebiaoServiceImpl extends ServiceImpl<DiscussfuwuliebiaoDao, DiscussfuwuliebiaoEntity> implements DiscussfuwuliebiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfuwuliebiaoEntity> page = this.selectPage(
                new Query<DiscussfuwuliebiaoEntity>(params).getPage(),
                new EntityWrapper<DiscussfuwuliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfuwuliebiaoEntity> wrapper) {
		  Page<DiscussfuwuliebiaoView> page =new Query<DiscussfuwuliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfuwuliebiaoVO> selectListVO(Wrapper<DiscussfuwuliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfuwuliebiaoVO selectVO(Wrapper<DiscussfuwuliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfuwuliebiaoView> selectListView(Wrapper<DiscussfuwuliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfuwuliebiaoView selectView(Wrapper<DiscussfuwuliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
