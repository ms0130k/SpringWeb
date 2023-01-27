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
    public List<NoticeView> getViewList() {
        return getViewList(1, "title", "", true);
    }

    @Override
    public List<NoticeView> getViewList(String field, String query) {
        return getViewList(1, field, query, true);
    }

    @Override
    public List<NoticeView> getViewList(int page, String field, String query, boolean pub) {
        int size = 10;
        int offset = size * (page - 1);
        List<NoticeView> list = noticeDao.getViewList(offset, size, field, query, pub);
        return list;
    }
    
    @Override
    public int getCount() {
        return getCount("title", "");
    }

    @Override
    public int getCount(String field, String query) {
        return noticeDao.getCount();
    }

    @Override
    public NoticeView getView(int id) {
        return noticeDao.getView(id);
    }

    @Override
    public Notice getNext(int id) {
        return noticeDao.getNext(id);
    }

    @Override
    public Notice getPrev(int id) {
        return noticeDao.getPrev(id);
    }

    @Override
    public int updatePubAll(int[] pubIds, int[] closeIds) {
        return noticeDao.updatePubAll(pubIds, closeIds);
    }

    @Override
    public int deleteAll(int[] ids) {
        return noticeDao.deleteAll(ids);
    }

    @Override
    public int update(Notice notice) {
        return noticeDao.update(notice);
    }

    @Override
    public int delete(Notice notice) {
        return noticeDao.delete(notice);
    }

    @Override
    public int insert(Notice notice) {
        return noticeDao.insert(notice);
    }

}
