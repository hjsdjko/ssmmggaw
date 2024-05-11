package com.entity.vo;

import com.entity.ZhiyuanzhejifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 志愿者积分
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
public class ZhiyuanzhejifenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 志愿号
	 */
	
	private String zhiyuanhao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 积分图
	 */
	
	private String jifentu;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：志愿号
	 */
	 
	public void setZhiyuanhao(String zhiyuanhao) {
		this.zhiyuanhao = zhiyuanhao;
	}
	
	/**
	 * 获取：志愿号
	 */
	public String getZhiyuanhao() {
		return zhiyuanhao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：积分图
	 */
	 
	public void setJifentu(String jifentu) {
		this.jifentu = jifentu;
	}
	
	/**
	 * 获取：积分图
	 */
	public String getJifentu() {
		return jifentu;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
