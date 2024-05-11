package com.entity.vo;

import com.entity.JifenpaixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 积分排行
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public class JifenpaixingVO  implements Serializable {
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
