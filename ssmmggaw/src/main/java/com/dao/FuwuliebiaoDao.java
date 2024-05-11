package com.dao;

import com.entity.FuwuliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuliebiaoVO;
import com.entity.view.FuwuliebiaoView;


/**
 * 服务列表
 * 
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
public interface FuwuliebiaoDao extends BaseMapper<FuwuliebiaoEntity> {
	
	List<FuwuliebiaoVO> selectListVO(@Param("ew") Wrapper<FuwuliebiaoEntity> wrapper);
	
	FuwuliebiaoVO selectVO(@Param("ew") Wrapper<FuwuliebiaoEntity> wrapper);
	
	List<FuwuliebiaoView> selectListView(@Param("ew") Wrapper<FuwuliebiaoEntity> wrapper);

	List<FuwuliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuliebiaoEntity> wrapper);
	
	FuwuliebiaoView selectView(@Param("ew") Wrapper<FuwuliebiaoEntity> wrapper);
	
}
