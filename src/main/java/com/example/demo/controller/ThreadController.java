package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.ThreadEntity;
import com.example.demo.form.ThreadForm;
import com.example.demo.service.ThreadService;

@Controller
public class ThreadController {
    @Autowired
    ThreadService threadService;
    @RequestMapping("/view")
    public ModelAndView view() {
        List<ThreadEntity> threads = threadService.findAll();
        return new ModelAndView("/view").addObject("threads", threads);
    }
    @RequestMapping("/create")
    public String create() {
        return "create";
    }
    @RequestMapping("/insert")
    public ModelAndView newPost(ThreadForm form) {
        threadService.insert(form);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/view");
        return mav;
    }
    @RequestMapping("/edit")
    public ModelAndView edit(@RequestParam("id") Integer id) {
        return new ModelAndView("/edit").addObject("thread", threadService.getOne(id));
    }
}
