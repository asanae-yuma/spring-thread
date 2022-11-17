package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ThreadEntity;
import com.example.demo.form.ThreadForm;
import com.example.demo.repository.ThreadRepository;

@Service
public class ThreadService {
    @Autowired
    ThreadRepository threadRepository;

    public List<ThreadEntity> findAll() {
        return threadRepository.findAll();
    }

    public void insert(ThreadForm form) {
        ThreadEntity entity = new ThreadEntity();
        entity.setName(form.getName());
        entity.setMessage(form.getMessage());
        threadRepository.insert(entity);
    }
}
