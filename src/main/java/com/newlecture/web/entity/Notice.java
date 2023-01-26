package com.newlecture.web.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    private int id;
    private String title;
    private String content;
    private Date regdate;
    private int hit;
    private boolean pub;
    private int memberId;
}
