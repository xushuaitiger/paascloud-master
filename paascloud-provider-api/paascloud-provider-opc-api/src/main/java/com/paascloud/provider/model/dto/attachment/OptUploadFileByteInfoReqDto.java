/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：OptUploadFileByteInfoReqDto.java
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
 * The class Opt upload file byte info req dto.
 *
 * @author tiger
 */
@Data
public class OptUploadFileByteInfoReqDto implements Serializable {
	private static final long serialVersionUID = 4695223041316258658L;

	/**
	 * 文件字节码
	 */
	private byte[] fileByteArray;

	/**
	 * 文件名
	 */
	private String fileName;

	/**
	 * 文件类型
	 */
	private String fileType;
}
