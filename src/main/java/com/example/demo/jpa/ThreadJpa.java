package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ThreadEntity;

public interface ThreadJpa extends JpaRepository<ThreadEntity,Integer>{

}
