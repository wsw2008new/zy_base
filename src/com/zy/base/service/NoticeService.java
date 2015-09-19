package com.zy.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.base.dao.NoticeDao;
import com.zy.base.entity.Notice;
import com.zy.common.entity.PageModel;
import com.zy.common.service.CommonService;

@Service
public class NoticeService extends CommonService<Notice,String>{

	@Autowired
	private NoticeDao noticeDao;

	@Autowired
	public void setNoticeDao(NoticeDao noticeDao) {
		super.setCommonDao(noticeDao);
	}
	
	public PageModel<Notice> queryForPage(Notice queryDto,PageModel<Notice> pageModel) {
		return noticeDao.queryForPage(queryDto, pageModel);
	}
	
	public void updateDeleteFlag(String[] ids,Integer isDelete){
		noticeDao.updateDeleteFlag(ids, isDelete);
	}
	
}
