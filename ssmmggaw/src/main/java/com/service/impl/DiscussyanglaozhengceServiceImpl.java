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


import com.dao.DiscussyanglaozhengceDao;
import com.entity.DiscussyanglaozhengceEntity;
import com.service.DiscussyanglaozhengceService;
import com.entity.vo.DiscussyanglaozhengceVO;
import com.entity.view.DiscussyanglaozhengceView;

@Service("discussyanglaozhengceService")
public class DiscussyanglaozhengceServiceImpl extends ServiceImpl<DiscussyanglaozhengceDao, DiscussyanglaozhengceEntity> implements DiscussyanglaozhengceService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyanglaozhengceEntity> page = this.selectPage(
                new Query<DiscussyanglaozhengceEntity>(params).getPage(),
                new EntityWrapper<DiscussyanglaozhengceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyanglaozhengceEntity> wrapper) {
		  Page<DiscussyanglaozhengceView> page =new Query<DiscussyanglaozhengceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyanglaozhengceVO> selectListVO(Wrapper<DiscussyanglaozhengceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyanglaozhengceVO selectVO(Wrapper<DiscussyanglaozhengceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyanglaozhengceView> selectListView(Wrapper<DiscussyanglaozhengceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyanglaozhengceView selectView(Wrapper<DiscussyanglaozhengceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
