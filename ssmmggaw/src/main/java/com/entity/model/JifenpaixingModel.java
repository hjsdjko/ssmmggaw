package com.entity.model;

import com.entity.JifenpaixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 积分排行
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public class JifenpaixingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 排行表
	 */
	
	private String paixingbiao;
		
	/**
	 * 排行图
	 */
	
	private String paixingtu;
				
	
	/**
	 * 设置：排行表
	 */
	 
	public void setPaixingbiao(String paixingbiao) {
		this.paixingbiao = paixingbiao;
	}
	
	/**
	 * 获取：排行表
	 */
	public String getPaixingbiao() {
		return paixingbiao;
	}
				
	
	/**
	 * 设置：排行图
	 */
	 
	public void setPaixingtu(String paixingtu) {
		this.paixingtu = paixingtu;
	}
	
	/**
	 * 获取：排行图
	 */
	public String getPaixingtu() {
		return paixingtu;
	}
			
}
