package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuliebiaoView;


/**
 * 服务列表
 *
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
public interface FuwuliebiaoService extends IService<FuwuliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuliebiaoVO> selectListVO(Wrapper<FuwuliebiaoEntity> wrapper);
   	
   	FuwuliebiaoVO selectVO(@Param("ew") Wrapper<FuwuliebiaoEntity> wrapper);
   	
   	List<FuwuliebiaoView> selectListView(Wrapper<FuwuliebiaoEntity> wrapper);
   	
   	FuwuliebiaoView selectView(@Param("ew") Wrapper<FuwuliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuliebiaoEntity> wrapper);
   	
}

