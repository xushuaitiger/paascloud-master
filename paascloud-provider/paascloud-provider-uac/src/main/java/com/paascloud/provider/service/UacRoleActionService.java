/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：UacRoleActionService.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.service;

import com.paascloud.provider.model.domain.UacRoleAction;
import com.paascloud.core.support.IService;

import java.util.List;
import java.util.Set;

/**
 * The interface Uac role action service.
 *
 * @author tiger
 */
public interface UacRoleActionService extends IService<UacRoleAction> {
	/**
	 * List by role id list.
	 *
	 * @param roleId the role id
	 *
	 * @return the list
	 */
	List<UacRoleAction> listByRoleId(Long roleId);

	/**
	 * Delete by role id.
	 *
	 * @param roleId the role id
	 */
	void deleteByRoleId(Long roleId);

	/**
	 * Insert.
	 *
	 * @param roleId       the role id
	 * @param actionIdList the action id list
	 */
	void insert(Long roleId, Set<Long> actionIdList);

	/**
	 * Delete by role id list int.
	 *
	 * @param roleIdList the role id list
	 *
	 * @return the int
	 */
	int deleteByRoleIdList(List<Long> roleIdList);
}
