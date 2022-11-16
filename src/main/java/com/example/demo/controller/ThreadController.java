package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.ThreadEntity;
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
}
