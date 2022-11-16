package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ThreadEntity;
import com.example.demo.jpa.ThreadJpa;

@Repository
public class ThreadRepository {
    @Autowired
    ThreadJpa threadJpa;

    public List<ThreadEntity> findAll() {
        return threadJpa.findAll();
    }

}
