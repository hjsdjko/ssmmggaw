package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JifenpaixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JifenpaixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JifenpaixingView;


/**
 * 积分排行
 *
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface JifenpaixingService extends IService<JifenpaixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JifenpaixingVO> selectListVO(Wrapper<JifenpaixingEntity> wrapper);
   	
   	JifenpaixingVO selectVO(@Param("ew") Wrapper<JifenpaixingEntity> wrapper);
   	
   	List<JifenpaixingView> selectListView(Wrapper<JifenpaixingEntity> wrapper);
   	
   	JifenpaixingView selectView(@Param("ew") Wrapper<JifenpaixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JifenpaixingEntity> wrapper);
   	
}

