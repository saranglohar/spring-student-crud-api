package com.sarya.student.crud.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sarya.student.crud.model.Student;

/**
 * This repository defines database related operations carried out on Student
 * table.
 * 
 * @author Sarang
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	/**
	 * Query to get all courses .
	 * 
	 * @param pageable
	 * 
	 * @return Page<ProspectCustomer>
	 */
	@Query(value = "SELECT students FROM Student students", nativeQuery = false)
	Page<Student> findAllStudents(Pageable pageable);

}
