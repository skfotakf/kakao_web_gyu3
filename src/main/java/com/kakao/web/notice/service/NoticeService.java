package com.kakao.web.notice.service;

import java.util.List;

import com.kakao.web.index.model.dto.User;
import com.kakao.web.notice.model.dto.NoticeDto;

public interface NoticeService {

	public List<NoticeDto> getNoticeListAll();
}
