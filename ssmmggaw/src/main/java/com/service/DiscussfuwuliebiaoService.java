package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfuwuliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfuwuliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfuwuliebiaoView;


/**
 * 服务列表评论表
 *
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface DiscussfuwuliebiaoService extends IService<DiscussfuwuliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfuwuliebiaoVO> selectListVO(Wrapper<DiscussfuwuliebiaoEntity> wrapper);
   	
   	DiscussfuwuliebiaoVO selectVO(@Param("ew") Wrapper<DiscussfuwuliebiaoEntity> wrapper);
   	
   	List<DiscussfuwuliebiaoView> selectListView(Wrapper<DiscussfuwuliebiaoEntity> wrapper);
   	
   	DiscussfuwuliebiaoView selectView(@Param("ew") Wrapper<DiscussfuwuliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfuwuliebiaoEntity> wrapper);
   	
}

