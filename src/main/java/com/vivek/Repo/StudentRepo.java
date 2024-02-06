package com.vivek.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vivek.Entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{
	
	@Query(" from Student")
	public List<Student>getAllStudent();
	
	@Query("from Student order by sName asc")
	public List<Student>getOrderBySName();
	
	
	@Query("from Student where sId>3 ")
	public List<Student> getSalGreaterThan();

}
