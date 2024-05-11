package com.dao;

import com.entity.ZhiyuanzhejifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanzhejifenVO;
import com.entity.view.ZhiyuanzhejifenView;


/**
 * 志愿者积分
 * 
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface ZhiyuanzhejifenDao extends BaseMapper<ZhiyuanzhejifenEntity> {
	
	List<ZhiyuanzhejifenVO> selectListVO(@Param("ew") Wrapper<ZhiyuanzhejifenEntity> wrapper);
	
	ZhiyuanzhejifenVO selectVO(@Param("ew") Wrapper<ZhiyuanzhejifenEntity> wrapper);
	
	List<ZhiyuanzhejifenView> selectListView(@Param("ew") Wrapper<ZhiyuanzhejifenEntity> wrapper);

	List<ZhiyuanzhejifenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanzhejifenEntity> wrapper);
	
	ZhiyuanzhejifenView selectView(@Param("ew") Wrapper<ZhiyuanzhejifenEntity> wrapper);
	
}
