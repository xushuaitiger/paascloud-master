/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：Oauth2ClientProperties.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.security.feign;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The class Oauth 2 client properties.
 *
 * @author tiger
 */
@Data
@ConfigurationProperties(prefix = "paascloud.oauth2.client")
public class Oauth2ClientProperties {
	private String id;
	private String accessTokenUrl;
	private String clientId;
	private String clientSecret;
	private String clientAuthenticationScheme;
}

