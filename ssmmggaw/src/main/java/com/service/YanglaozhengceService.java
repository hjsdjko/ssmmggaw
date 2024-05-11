package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YanglaozhengceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YanglaozhengceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YanglaozhengceView;


/**
 * 养老政策
 *
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface YanglaozhengceService extends IService<YanglaozhengceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YanglaozhengceVO> selectListVO(Wrapper<YanglaozhengceEntity> wrapper);
   	
   	YanglaozhengceVO selectVO(@Param("ew") Wrapper<YanglaozhengceEntity> wrapper);
   	
   	List<YanglaozhengceView> selectListView(Wrapper<YanglaozhengceEntity> wrapper);
   	
   	YanglaozhengceView selectView(@Param("ew") Wrapper<YanglaozhengceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YanglaozhengceEntity> wrapper);
   	
}

