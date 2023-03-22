package com.springboot.demo.mycoolapp.repository;

import com.springboot.demo.mycoolapp.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentImplementation extends   CrudRepository<Student,Long> {
    @Override
    Optional<Student> findById(Long aLong);
}
