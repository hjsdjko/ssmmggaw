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
 * 志愿者积分
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-22 00:34:44
 */
@TableName("zhiyuanzhejifen")
public class ZhiyuanzhejifenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiyuanzhejifenEntity() {
		
	}
	
	public ZhiyuanzhejifenEntity(T t) {
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
	 * 志愿者积分
	 */
					
	private String zhiyuanzhejifen;
	
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
	 * 设置：志愿者积分
	 */
	public void setZhiyuanzhejifen(String zhiyuanzhejifen) {
		this.zhiyuanzhejifen = zhiyuanzhejifen;
	}
	/**
	 * 获取：志愿者积分
	 */
	public String getZhiyuanzhejifen() {
		return zhiyuanzhejifen;
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
