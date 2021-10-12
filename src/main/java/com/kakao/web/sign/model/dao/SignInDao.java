package com.kakao.web.sign.model.dao;

import com.kakao.web.index.model.dto.User;

public interface SignInDao {
	public User getUser(String id);
	public int signIn(String login_id, String login_password);
}
