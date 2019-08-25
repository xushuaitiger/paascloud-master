package com.paascloud.security.core.authentication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUser;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;

import java.util.ArrayList;
import java.util.List;

/**
 * 默认的SocialUserDetailsService实现
 * 不做任何处理，只在控制台打印一句日志，然后抛出异常，提醒业务系统自己配置SocialUserDetailsService。
 *
 * @author paascloud.net @gmail.com
 */
@Slf4j
public class DefaultSocialUserDetailsServiceImpl implements SocialUserDetailsService {

	/**
	 * Load user by user id social user details.
	 *
	 * @param userId the user id
	 *
	 * @return the social user details
	 *
	 * @throws UsernameNotFoundException the username not found exception
	 */
	@Override
	public SocialUserDetails loadUserByUserId(String userId) throws UsernameNotFoundException {
		log.warn("请配置 SocialUserDetailsService 接口的实现.");
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		return new SocialUser("admin","admin",true,true,true,true,authorities);
		//throw new UsernameNotFoundException(userId);
	}

}
