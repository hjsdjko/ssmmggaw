package com.dao;

import com.entity.FuwudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwudingdanVO;
import com.entity.view.FuwudingdanView;


/**
 * 服务订单
 * 
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
public interface FuwudingdanDao extends BaseMapper<FuwudingdanEntity> {
	
	List<FuwudingdanVO> selectListVO(@Param("ew") Wrapper<FuwudingdanEntity> wrapper);
	
	FuwudingdanVO selectVO(@Param("ew") Wrapper<FuwudingdanEntity> wrapper);
	
	List<FuwudingdanView> selectListView(@Param("ew") Wrapper<FuwudingdanEntity> wrapper);

	List<FuwudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<FuwudingdanEntity> wrapper);
	
	FuwudingdanView selectView(@Param("ew") Wrapper<FuwudingdanEntity> wrapper);
	
}
