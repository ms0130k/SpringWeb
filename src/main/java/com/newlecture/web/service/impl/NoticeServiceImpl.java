package com.newlecture.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeDao noticeDao;

    @Override
    public List<NoticeView> getList(int page, String field, String query) {
        List<NoticeView> list = noticeDao.getList();
        return list;
    }

    @Override
    public Notice get(int id) {
        Notice notice = noticeDao.get(id);
        return notice;
    }

}
