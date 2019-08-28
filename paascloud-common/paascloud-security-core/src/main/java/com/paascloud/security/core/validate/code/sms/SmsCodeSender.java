package com.paascloud.security.core.validate.code.sms;

/**
 * The interface Sms code sender.
 *
 * @author tiger
 */
public interface SmsCodeSender {

	/**
	 * Send.
	 *
	 * @param mobile the mobile
	 * @param code   the code
	 * @param ip     the ip
	 */
	void send(String mobile, String code, String ip);

}
