package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
    @Select("select * from notice_view")
    List<NoticeView> getList();

    Notice get(int id);

}
