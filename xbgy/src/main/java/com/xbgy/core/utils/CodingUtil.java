package com.xbgy.core.utils;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class CodingUtil {
	
	public static String encodingByMd5(String rawPass){
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		encoder.setEncodeHashAsBase64(false);
		return encoder.encodePassword(rawPass , null);
	}

}
