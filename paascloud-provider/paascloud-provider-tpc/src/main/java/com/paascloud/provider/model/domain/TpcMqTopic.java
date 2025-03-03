/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：TpcMqTopic.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.model.domain;

import com.paascloud.core.mybatis.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * The class Tpc mq topic.
 *
 * @author tiger
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "pc_tpc_mq_topic")
@Alias(value = "tpcMqTopic")
public class TpcMqTopic extends BaseEntity {
	private static final long serialVersionUID = 5642946024630652202L;

	/**
	 * 城市编码
	 */
	@Column(name = "topic_code")
	private String topicCode;

	/**
	 * 区域编码
	 */
	@Column(name = "topic_name")
	private String topicName;

	/**
	 * MQ类型, 10 rocketmq 20 kafka
	 */
	@Column(name = "mq_type")
	private Integer mqType;

	/**
	 * 消息类型, 10 无序消息, 20 无序消息
	 */
	@Column(name = "msg_type")
	private Integer msgType;

	/**
	 * 状态, 0生效,10,失效
	 */
	private Integer status;

	/**
	 * 备注
	 */
	private String remarks;
}
