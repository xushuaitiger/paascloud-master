/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：UacApiConstant.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.model.constant;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * The class Uac api constant.
 *
 * @author tiger
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UacApiConstant {
	/**
	 * token变量
	 */
	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class Valid {
		/**
		 * The constant EMAIL.
		 */
		public static final String EMAIL = "email";
		/**
		 * The constant LOGIN_NAME.
		 */
		public static final String LOGIN_NAME = "loginName";
		/**
		 * The constant MOBILE_NO.
		 */
		public static final String MOBILE_NO = "mobileNo";
	}
}
