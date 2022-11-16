package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ThreadEntity;
import com.example.demo.repository.ThreadRepository;

@Service
public class ThreadService {
    @Autowired
    ThreadRepository threadRepository;

    public List<ThreadEntity> findAll() {
        return threadRepository.findAll();
    }
    
}
