/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：UserBindRoleVo.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.model.vo;

import com.paascloud.provider.model.dto.user.BindRoleDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * The class Role bind user dto.
 *
 * @author tiger
 */
@Data
@ApiModel(value = "角色绑定用户")
public class UserBindRoleVo implements Serializable {

	private static final long serialVersionUID = -2521583668470612548L;
	/**
	 * 未绑定的用户集合
	 */
	@ApiModelProperty(value = "所有用户集合")
	private Set<BindRoleDto> allRoleSet;

	/**
	 * 已经绑定的用户集合
	 */
	@ApiModelProperty(value = "已经绑定的用户集合")
	private Set<Long> alreadyBindRoleIdSet;
}
