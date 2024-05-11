package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanfukuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanfukuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanfukuanView;


/**
 * 订单付款
 *
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
public interface DingdanfukuanService extends IService<DingdanfukuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanfukuanVO> selectListVO(Wrapper<DingdanfukuanEntity> wrapper);
   	
   	DingdanfukuanVO selectVO(@Param("ew") Wrapper<DingdanfukuanEntity> wrapper);
   	
   	List<DingdanfukuanView> selectListView(Wrapper<DingdanfukuanEntity> wrapper);
   	
   	DingdanfukuanView selectView(@Param("ew") Wrapper<DingdanfukuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanfukuanEntity> wrapper);
   	
}

