package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 服务订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-22 00:34:43
 */
@TableName("fuwudingdan")
public class FuwudingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FuwudingdanEntity() {
		
	}
	
	public FuwudingdanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 服务单号
	 */
					
	private String fuwudanhao;
	
	/**
	 * 服务标题
	 */
					
	private String fuwubiaoti;
	
	/**
	 * 服务类型
	 */
					
	private String fuwuleixing;
	
	/**
	 * 服务详情
	 */
					
	private String fuwuxiangqing;
	
	/**
	 * 服务金额
	 */
					
	private String fuwujine;
	
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
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：服务单号
	 */
	public void setFuwudanhao(String fuwudanhao) {
		this.fuwudanhao = fuwudanhao;
	}
	/**
	 * 获取：服务单号
	 */
	public String getFuwudanhao() {
		return fuwudanhao;
	}
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
	 * 设置：服务金额
	 */
	public void setFuwujine(String fuwujine) {
		this.fuwujine = fuwujine;
	}
	/**
	 * 获取：服务金额
	 */
	public String getFuwujine() {
		return fuwujine;
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
