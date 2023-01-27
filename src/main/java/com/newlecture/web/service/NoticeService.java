package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public interface NoticeService {

    List<NoticeView> getViewList();
    List<NoticeView> getViewList(String field, String query);
    List<NoticeView> getViewList(int page, String field, String query, boolean pub);
    int getCount();
    int getCount(String field, String query);
    NoticeView getView(int id);
    Notice getNext(int id);
    Notice getPrev(int id);
    int updatePubAll(int[] pubIds, int[] closeIds);
    int deleteAll(int[] ids);
    
    int update(Notice notice);
    int delete(Notice notice);
    int insert(Notice notice);

}
