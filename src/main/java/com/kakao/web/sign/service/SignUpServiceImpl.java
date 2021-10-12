package com.kakao.web.sign.model;

import com.kakao.web.sign.model.dao.SignUpDao;
import com.kakao.web.sign.model.dao.SignUpDaoImpl;

public class SignUpServiceImpl implements SignUpService {

	private SignUpDao signUpDao;
	
	public SignUpServiceImpl() {
		signUpDao = new SignUpDaoImpl();
		
	}
	
	@Override
	public int idCheck(String id) {
		return signUpDao.idCheck(id);
	}

	@Override
	public int phoneNumberCheck(String phone, String name) {
		
		return 0;
	}

	
}
