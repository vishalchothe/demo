package com.crud.service;

import java.util.List;

import com.crud.model.Students;

public interface StudentService {

	Students addData(Students s);

	Students getOne(int id);

	List<Students> getAll();

}
