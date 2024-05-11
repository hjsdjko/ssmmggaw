package com.entity.model;

import com.entity.DingdanfukuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订单付款
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
public class DingdanfukuanModel  implements Serializable {
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
	 * 服务图片
	 */
	
	private String fuwutupian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 志愿号
	 */
	
	private String zhiyuanhao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
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
