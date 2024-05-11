package com.dao;

import com.entity.YanglaozhengceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YanglaozhengceVO;
import com.entity.view.YanglaozhengceView;


/**
 * 养老政策
 * 
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface YanglaozhengceDao extends BaseMapper<YanglaozhengceEntity> {
	
	List<YanglaozhengceVO> selectListVO(@Param("ew") Wrapper<YanglaozhengceEntity> wrapper);
	
	YanglaozhengceVO selectVO(@Param("ew") Wrapper<YanglaozhengceEntity> wrapper);
	
	List<YanglaozhengceView> selectListView(@Param("ew") Wrapper<YanglaozhengceEntity> wrapper);

	List<YanglaozhengceView> selectListView(Pagination page,@Param("ew") Wrapper<YanglaozhengceEntity> wrapper);
	
	YanglaozhengceView selectView(@Param("ew") Wrapper<YanglaozhengceEntity> wrapper);
	
}
