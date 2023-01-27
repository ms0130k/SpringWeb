package com.newlecture.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("customer/notice/")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @RequestMapping("list")
    public String list(Model model) {
        int page = 3;
        String field = "title";
        String query = "";
        
        List<NoticeView> list = noticeService.getViewList(page, field, query, true);
        model.addAttribute("list", list );
        return "customer.notice.list";
    }
    
    @RequestMapping("detail")
    public String detail() {
        return "customer.notice.detail";
    }
}
