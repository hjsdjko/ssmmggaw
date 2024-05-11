package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwudingdanView;


/**
 * 服务订单
 *
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
public interface FuwudingdanService extends IService<FuwudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwudingdanVO> selectListVO(Wrapper<FuwudingdanEntity> wrapper);
   	
   	FuwudingdanVO selectVO(@Param("ew") Wrapper<FuwudingdanEntity> wrapper);
   	
   	List<FuwudingdanView> selectListView(Wrapper<FuwudingdanEntity> wrapper);
   	
   	FuwudingdanView selectView(@Param("ew") Wrapper<FuwudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwudingdanEntity> wrapper);
   	
}

