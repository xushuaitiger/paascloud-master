/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：OmcShippingMapper.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.mapper;

import com.paascloud.core.mybatis.MyMapper;
import com.paascloud.provider.model.domain.OmcShipping;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Omc shipping mapper.
 *
 * @author tiger
 */
@Mapper
@Component
public interface OmcShippingMapper extends MyMapper<OmcShipping> {
	/**
	 * Delete by shipping id user id int.
	 *
	 * @param userId     the user id
	 * @param shippingId the shipping id
	 *
	 * @return the int
	 */
	int deleteByShippingIdUserId(@Param("userId") Long userId, @Param("shippingId") Integer shippingId);

	/**
	 * Select by shipping id user id omc shipping.
	 *
	 * @param userId     the user id
	 * @param shippingId the shipping id
	 *
	 * @return the omc shipping
	 */
	OmcShipping selectByShippingIdUserId(@Param("userId") Long userId, @Param("shippingId") Long shippingId);

	/**
	 * Select by user id list.
	 *
	 * @param userId the user id
	 *
	 * @return the list
	 */
	List<OmcShipping> selectByUserId(@Param("userId") Long userId);

	/**
	 * Select default address by user id omc shipping.
	 *
	 * @param userId the user id
	 *
	 * @return the omc shipping
	 */
	OmcShipping selectDefaultAddressByUserId(Long userId);
}
