package com.entity.view;

import com.entity.DingdanfukuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单付款
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
@TableName("dingdanfukuan")
public class DingdanfukuanView  extends DingdanfukuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanfukuanView(){
	}
 
 	public DingdanfukuanView(DingdanfukuanEntity dingdanfukuanEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanfukuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
