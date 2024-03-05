package com.example.demo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.demo.entity.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long>{

}
