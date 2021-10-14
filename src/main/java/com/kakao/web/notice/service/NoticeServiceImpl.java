package com.kakao.web.notice.service;

import java.util.List;

import com.kakao.web.index.model.dto.User;
import com.kakao.web.notice.model.dao.NoticeDao;
import com.kakao.web.notice.model.dao.NoticeDaoImpl;
import com.kakao.web.notice.model.dto.NoticeDto;

public class NoticeServiceImpl implements NoticeService {
	private NoticeDao noticeDao;

	
	public NoticeServiceImpl() {
		noticeDao = new NoticeDaoImpl();
	}
	
	@Override
	public List<NoticeDto> getNoticeListAll() {
		return noticeDao.getNoticeAll();
	}
	
	
}
