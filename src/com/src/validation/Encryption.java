package com.src.validation;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class Encryption {
	private Encryption() {
		
	}
	
	public static String encryptPassword(String password) {
		StringBuffer sb=new StringBuffer();
		try {
			MessageDigest instance = MessageDigest.getInstance("sha-256");
			byte[] digest = instance.digest(password.getBytes());
			for(byte b:digest) {
				sb.append(Integer.toHexString(b & 0xff));
								
			}
		
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}
