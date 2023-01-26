package com.newlecture.web.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeView extends Notice {
    private String memberName;

    public NoticeView() {
        super();
    }

    public NoticeView(int id, String title, String content, Date regdate, int hit, boolean pub, int memberId, String memberName) {
        super(id, title, content, regdate, hit, pub, memberId);
        this.memberName = memberName;
    }
    
}
