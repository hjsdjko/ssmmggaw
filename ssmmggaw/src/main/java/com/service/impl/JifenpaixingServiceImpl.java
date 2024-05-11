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


import com.dao.JifenpaixingDao;
import com.entity.JifenpaixingEntity;
import com.service.JifenpaixingService;
import com.entity.vo.JifenpaixingVO;
import com.entity.view.JifenpaixingView;

@Service("jifenpaixingService")
public class JifenpaixingServiceImpl extends ServiceImpl<JifenpaixingDao, JifenpaixingEntity> implements JifenpaixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JifenpaixingEntity> page = this.selectPage(
                new Query<JifenpaixingEntity>(params).getPage(),
                new EntityWrapper<JifenpaixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JifenpaixingEntity> wrapper) {
		  Page<JifenpaixingView> page =new Query<JifenpaixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JifenpaixingVO> selectListVO(Wrapper<JifenpaixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JifenpaixingVO selectVO(Wrapper<JifenpaixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JifenpaixingView> selectListView(Wrapper<JifenpaixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JifenpaixingView selectView(Wrapper<JifenpaixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
