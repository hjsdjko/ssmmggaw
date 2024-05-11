package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanzhejifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanzhejifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanzhejifenView;


/**
 * 志愿者积分
 *
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public interface ZhiyuanzhejifenService extends IService<ZhiyuanzhejifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanzhejifenVO> selectListVO(Wrapper<ZhiyuanzhejifenEntity> wrapper);
   	
   	ZhiyuanzhejifenVO selectVO(@Param("ew") Wrapper<ZhiyuanzhejifenEntity> wrapper);
   	
   	List<ZhiyuanzhejifenView> selectListView(Wrapper<ZhiyuanzhejifenEntity> wrapper);
   	
   	ZhiyuanzhejifenView selectView(@Param("ew") Wrapper<ZhiyuanzhejifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanzhejifenEntity> wrapper);
   	
}

