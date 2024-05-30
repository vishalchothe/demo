package com.crud.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.customException.RecordsAreNotPresent;
import com.crud.customException.StudentNotFoundException;
import com.crud.model.Students;
import com.crud.repo.StudentRepo;
import com.crud.service.StudentService;

@Service
public class StudentserviceImpl implements StudentService{
	@Autowired
	StudentRepo sr;

	@Override
	public Students addData(Students s) {
		sr.save(s);
		return s;
	}

	@Override
	public Students getOne(int id) {
		Optional<Students> op=sr.findById(id);
		if(op.isPresent())
		{
			return op.get();
		}
		else
		{
			throw new StudentNotFoundException("Student Record is not present");
		}
	}

	@Override
	public List<Students> getAll() {
		List<Students> list=sr.findAll();
		if(list.isEmpty())
		{
			throw new RecordsAreNotPresent("Records are not available");
		}
		else
		{
			return list;
		}
	}

}
