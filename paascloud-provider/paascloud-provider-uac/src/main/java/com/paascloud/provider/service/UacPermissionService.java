/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：UacPermissionService.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.service;


import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * The interface Uac permission service.
 *
 * @author tiger
 */
public interface UacPermissionService {

	/**
	 * Has permission boolean.
	 *
	 * @param authentication the authentication
	 * @param request        the request
	 *
	 * @return the boolean
	 */
	boolean hasPermission(Authentication authentication, HttpServletRequest request);
}
