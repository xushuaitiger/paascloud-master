/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：MdcDictCheckNameDto.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;


/**
 * The class Uac menu check code dto.
 *
 * @author tiger
 */
@Data
@ApiModel
public class MdcDictCheckNameDto implements Serializable {
	private static final long serialVersionUID = 8687848883145768024L;
	/**
	 * 菜单的id
	 */
	@ApiModelProperty(value = "数据字典id")
	private Long dictId;
	/**
	 * 菜单的url
	 */
	@ApiModelProperty(value = "数据字典名称")
	@NotBlank(message = "数据字典名称不能为空")
	private String dictName;


}
