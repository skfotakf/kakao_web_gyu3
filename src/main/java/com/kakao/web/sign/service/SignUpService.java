package com.kakao.web.sign.model;

public interface SignUpService {
	public int idCheck(String id);
	public int phoneNumberCheck(String phone, String name);
}
