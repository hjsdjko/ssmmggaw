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


import com.dao.ZhiyuanzhejifenDao;
import com.entity.ZhiyuanzhejifenEntity;
import com.service.ZhiyuanzhejifenService;
import com.entity.vo.ZhiyuanzhejifenVO;
import com.entity.view.ZhiyuanzhejifenView;

@Service("zhiyuanzhejifenService")
public class ZhiyuanzhejifenServiceImpl extends ServiceImpl<ZhiyuanzhejifenDao, ZhiyuanzhejifenEntity> implements ZhiyuanzhejifenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanzhejifenEntity> page = this.selectPage(
                new Query<ZhiyuanzhejifenEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanzhejifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanzhejifenEntity> wrapper) {
		  Page<ZhiyuanzhejifenView> page =new Query<ZhiyuanzhejifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuanzhejifenVO> selectListVO(Wrapper<ZhiyuanzhejifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanzhejifenVO selectVO(Wrapper<ZhiyuanzhejifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanzhejifenView> selectListView(Wrapper<ZhiyuanzhejifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanzhejifenView selectView(Wrapper<ZhiyuanzhejifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
