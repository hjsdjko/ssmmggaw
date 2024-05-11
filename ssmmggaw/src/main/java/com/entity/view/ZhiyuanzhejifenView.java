package com.entity.view;

import com.entity.ZhiyuanzhejifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 志愿者积分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
@TableName("zhiyuanzhejifen")
public class ZhiyuanzhejifenView  extends ZhiyuanzhejifenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyuanzhejifenView(){
	}
 
 	public ZhiyuanzhejifenView(ZhiyuanzhejifenEntity zhiyuanzhejifenEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyuanzhejifenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
