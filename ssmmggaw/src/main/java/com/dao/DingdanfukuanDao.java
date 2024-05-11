package com.dao;

import com.entity.DingdanfukuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdanfukuanVO;
import com.entity.view.DingdanfukuanView;


/**
 * 订单付款
 * 
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
public interface DingdanfukuanDao extends BaseMapper<DingdanfukuanEntity> {
	
	List<DingdanfukuanVO> selectListVO(@Param("ew") Wrapper<DingdanfukuanEntity> wrapper);
	
	DingdanfukuanVO selectVO(@Param("ew") Wrapper<DingdanfukuanEntity> wrapper);
	
	List<DingdanfukuanView> selectListView(@Param("ew") Wrapper<DingdanfukuanEntity> wrapper);

	List<DingdanfukuanView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanfukuanEntity> wrapper);
	
	DingdanfukuanView selectView(@Param("ew") Wrapper<DingdanfukuanEntity> wrapper);
	
}
