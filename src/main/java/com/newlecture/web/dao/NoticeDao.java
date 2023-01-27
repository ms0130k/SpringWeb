package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
    List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub);
    int getCount();

    NoticeView getView(int id);
    Notice getNext(int id);
    Notice getPrev(int id);
    
    int update(Notice notice);
    int insert(Notice notice);
    int delete(Notice notice);
    int updatePubAll(int[] pubIds, int[] closeIds);
    int updatePubAll(int[] ids, boolean pub);
    int deleteAll(int[] ids);

}
