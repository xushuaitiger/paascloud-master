/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：OptAttachmentRespDto.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.model.dto.attachment;

import lombok.Data;

import java.io.Serializable;

/**
 * The class Opt attachment resp dto.
 *
 * @author tiger
 */
@Data
public class OptAttachmentRespDto implements Serializable {
	private static final long serialVersionUID = 7156713126848745258L;
	private Long id;
	private String serialNo;
	private String refNo;
	private String name;
	private String path;
	private String type;
	private String format;
	private String description;
	/**
	 * 文件服务器根目录
	 */
	private String bucketName;

}
