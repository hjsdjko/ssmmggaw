package com.entity.view;

import com.entity.YanglaozhengceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 养老政策
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
@TableName("yanglaozhengce")
public class YanglaozhengceView  extends YanglaozhengceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YanglaozhengceView(){
	}
 
 	public YanglaozhengceView(YanglaozhengceEntity yanglaozhengceEntity){
 	try {
			BeanUtils.copyProperties(this, yanglaozhengceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
