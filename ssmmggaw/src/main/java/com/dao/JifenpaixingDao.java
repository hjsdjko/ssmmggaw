package com.dao;

import com.entity.JifenpaixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JifenpaixingVO;
import com.entity.view.JifenpaixingView;


/**
 * 积分排行
 * 
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface JifenpaixingDao extends BaseMapper<JifenpaixingEntity> {
	
	List<JifenpaixingVO> selectListVO(@Param("ew") Wrapper<JifenpaixingEntity> wrapper);
	
	JifenpaixingVO selectVO(@Param("ew") Wrapper<JifenpaixingEntity> wrapper);
	
	List<JifenpaixingView> selectListView(@Param("ew") Wrapper<JifenpaixingEntity> wrapper);

	List<JifenpaixingView> selectListView(Pagination page,@Param("ew") Wrapper<JifenpaixingEntity> wrapper);
	
	JifenpaixingView selectView(@Param("ew") Wrapper<JifenpaixingEntity> wrapper);
	
}
