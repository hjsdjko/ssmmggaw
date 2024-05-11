package com.entity.model;

import com.entity.FuwuliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 服务列表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
public class FuwuliebiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服务标题
	 */
	
	private String fuwubiaoti;
		
	/**
	 * 服务类型
	 */
	
	private String fuwuleixing;
		
	/**
	 * 服务内容
	 */
	
	private String fuwuneirong;
		
	/**
	 * 服务详情
	 */
	
	private String fuwuxiangqing;
		
	/**
	 * 服务地址
	 */
	
	private String fuwudizhi;
		
	/**
	 * 服务图片
	 */
	
	private String fuwutupian;
		
	/**
	 * 服务金额
	 */
	
	private Integer fuwujine;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：服务标题
	 */
	 
	public void setFuwubiaoti(String fuwubiaoti) {
		this.fuwubiaoti = fuwubiaoti;
	}
	
	/**
	 * 获取：服务标题
	 */
	public String getFuwubiaoti() {
		return fuwubiaoti;
	}
				
	
	/**
	 * 设置：服务类型
	 */
	 
	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}
	
	/**
	 * 获取：服务类型
	 */
	public String getFuwuleixing() {
		return fuwuleixing;
	}
				
	
	/**
	 * 设置：服务内容
	 */
	 
	public void setFuwuneirong(String fuwuneirong) {
		this.fuwuneirong = fuwuneirong;
	}
	
	/**
	 * 获取：服务内容
	 */
	public String getFuwuneirong() {
		return fuwuneirong;
	}
				
	
	/**
	 * 设置：服务详情
	 */
	 
	public void setFuwuxiangqing(String fuwuxiangqing) {
		this.fuwuxiangqing = fuwuxiangqing;
	}
	
	/**
	 * 获取：服务详情
	 */
	public String getFuwuxiangqing() {
		return fuwuxiangqing;
	}
				
	
	/**
	 * 设置：服务地址
	 */
	 
	public void setFuwudizhi(String fuwudizhi) {
		this.fuwudizhi = fuwudizhi;
	}
	
	/**
	 * 获取：服务地址
	 */
	public String getFuwudizhi() {
		return fuwudizhi;
	}
				
	
	/**
	 * 设置：服务图片
	 */
	 
	public void setFuwutupian(String fuwutupian) {
		this.fuwutupian = fuwutupian;
	}
	
	/**
	 * 获取：服务图片
	 */
	public String getFuwutupian() {
		return fuwutupian;
	}
				
	
	/**
	 * 设置：服务金额
	 */
	 
	public void setFuwujine(Integer fuwujine) {
		this.fuwujine = fuwujine;
	}
	
	/**
	 * 获取：服务金额
	 */
	public Integer getFuwujine() {
		return fuwujine;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
