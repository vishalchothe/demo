package com.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Students;

public interface StudentRepo extends JpaRepository<Students, Integer>{

}
