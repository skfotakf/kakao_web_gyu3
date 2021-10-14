package com.kakao.web.notice.service;

import java.util.ArrayList;
import java.util.List;

import com.kakao.web.index.model.dto.User;
import com.kakao.web.notice.model.dao.NoticeDao;
import com.kakao.web.notice.model.dao.NoticeDaoImpl;
import com.kakao.web.notice.model.dto.NoticeDto;

public class NoticeServiceImpl implements NoticeService {
	private NoticeDao noticeDao;
	private int totalPage;
	
	public NoticeServiceImpl() {
		noticeDao = new NoticeDaoImpl();
	}

	public int getTotalPage() {
		return totalPage;
	}
	
	@Override
	public List<NoticeDto> getNoticeListAll() {
		List<NoticeDto> noticeListAll = noticeDao.getNoticeAll();
		totalPage = noticeListAll.size();
		
		return noticeListAll;
	}

	@Override
	public List<NoticeDto> getNoticeList(String pageNum) {
		List<NoticeDto> noticeListAll = getNoticeListAll();  // 전체 리스트
		List<NoticeDto> noticeList = new ArrayList<NoticeDto>();  // 비어있는 리스트
		
		int page = Integer.parseInt(pageNum);
		
		int startIndex = (page - 1)*5;
		int endIndex = page*5;
		
		for(int i=startIndex; i<endIndex; i++) {
			noticeList.add(noticeListAll.get(i));
		}
		
		return noticeList;
	}
	
	
}
