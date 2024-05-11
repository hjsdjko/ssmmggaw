package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyanglaozhengceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyanglaozhengceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyanglaozhengceView;


/**
 * 养老政策评论表
 *
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface DiscussyanglaozhengceService extends IService<DiscussyanglaozhengceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyanglaozhengceVO> selectListVO(Wrapper<DiscussyanglaozhengceEntity> wrapper);
   	
   	DiscussyanglaozhengceVO selectVO(@Param("ew") Wrapper<DiscussyanglaozhengceEntity> wrapper);
   	
   	List<DiscussyanglaozhengceView> selectListView(Wrapper<DiscussyanglaozhengceEntity> wrapper);
   	
   	DiscussyanglaozhengceView selectView(@Param("ew") Wrapper<DiscussyanglaozhengceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyanglaozhengceEntity> wrapper);
   	
}

