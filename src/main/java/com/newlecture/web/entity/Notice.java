package com.newlecture.web.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Notice {
    private int id;
    private String title;
    private String content;
    private Date regdate;
    private int hit;
    private boolean pub;
    private int memberId;
}
