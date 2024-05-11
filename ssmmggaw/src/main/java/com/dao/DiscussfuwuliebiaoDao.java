package com.dao;

import com.entity.DiscussfuwuliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfuwuliebiaoVO;
import com.entity.view.DiscussfuwuliebiaoView;


/**
 * 服务列表评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface DiscussfuwuliebiaoDao extends BaseMapper<DiscussfuwuliebiaoEntity> {
	
	List<DiscussfuwuliebiaoVO> selectListVO(@Param("ew") Wrapper<DiscussfuwuliebiaoEntity> wrapper);
	
	DiscussfuwuliebiaoVO selectVO(@Param("ew") Wrapper<DiscussfuwuliebiaoEntity> wrapper);
	
	List<DiscussfuwuliebiaoView> selectListView(@Param("ew") Wrapper<DiscussfuwuliebiaoEntity> wrapper);

	List<DiscussfuwuliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfuwuliebiaoEntity> wrapper);
	
	DiscussfuwuliebiaoView selectView(@Param("ew") Wrapper<DiscussfuwuliebiaoEntity> wrapper);
	
}
