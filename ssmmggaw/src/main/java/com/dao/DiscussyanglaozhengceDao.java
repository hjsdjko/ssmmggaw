package com.dao;

import com.entity.DiscussyanglaozhengceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyanglaozhengceVO;
import com.entity.view.DiscussyanglaozhengceView;


/**
 * 养老政策评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface DiscussyanglaozhengceDao extends BaseMapper<DiscussyanglaozhengceEntity> {
	
	List<DiscussyanglaozhengceVO> selectListVO(@Param("ew") Wrapper<DiscussyanglaozhengceEntity> wrapper);
	
	DiscussyanglaozhengceVO selectVO(@Param("ew") Wrapper<DiscussyanglaozhengceEntity> wrapper);
	
	List<DiscussyanglaozhengceView> selectListView(@Param("ew") Wrapper<DiscussyanglaozhengceEntity> wrapper);

	List<DiscussyanglaozhengceView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyanglaozhengceEntity> wrapper);
	
	DiscussyanglaozhengceView selectView(@Param("ew") Wrapper<DiscussyanglaozhengceEntity> wrapper);
	
}
