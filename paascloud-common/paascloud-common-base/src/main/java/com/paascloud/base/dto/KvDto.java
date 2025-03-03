/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：KvDto.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */
package com.paascloud.base.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * The class Kv dto.
 *
 * @author tiger
 */
@Data
public class KvDto<K, V> implements Serializable {

	private static final long serialVersionUID = -7712636075929650779L;

	/**
	 * Instantiates a new Kv dto.
	 */
	public KvDto() {
	}

	/**
	 * Instantiates a new Kv dto.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	public KvDto(K key, V value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * key
	 */
	private K key;
	/**
	 * value
	 */
	private V value;

}
