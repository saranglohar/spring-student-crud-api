/**
 * 
 */
package com.sarya.student.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sarya.student.crud.exception.EntityException;
import com.sarya.student.crud.model.Student;
import com.sarya.student.crud.services.StudentsService;

/**
 * @author Sarang
 *
 */
@CrossOrigin
@RestController
public class StudentsController {

	/**
	 * Intermediate service to communicate between controller and CRUD layer.
	 */
	@Autowired
	private StudentsService studentsService;

	/**
	 * Get all Students.
	 * 
	 * @return List of all Students.
	 * 
	 * @throws EntityException
	 *             In case of any exception.
	 */
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public final Iterable<Student> getAllStudents() {
		Iterable<Student> listStudentssResult = studentsService
				.getAllStudents();
		return listStudentssResult;
	}

	/**
	 * Create new Students.
	 * 
	 * @param students
	 *            Students to be created.
	 * 
	 * @return Created Students.
	 * @throws Exception
	 * 
	 * @throws EntityException
	 *             In case of any other exception.
	 */
	@RequestMapping(value = "/students", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public final Student createStudents(@RequestBody final Student students)
			throws Exception {
		Student studentsResult = studentsService.createStudents(students);
		return studentsResult;
	}

	/**
	 * Get Students by id.
	 * 
	 * @param id
	 *            The id of the Students to be retrieved.
	 * 
	 * @return Students with given id. null if not found.
	 * 
	 * @throws EntityException
	 *             In case of null Students id passed as an argument or any
	 *             other exception.
	 */
	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public final Student getStudentsById(@PathVariable final Long id) throws EntityException {
		Student studentsResult = studentsService.getStudentsById(id);
		return studentsResult;
	}

	/**
	 * Update Students by id.
	 * 
	 * @param id
	 *            The id of the Students to be updated.
	 * 
	 * @param students
	 *            The Students with updated fields.
	 * 
	 * @return Updated Students.
	 * 
	 * 
	 * @throws EntityException
	 *             In case of null id passed as an argument.
	 * 
	 * @throws EntityException
	 *             In case of null Students id passed as an argument, Students
	 *             with given id not found or any other exception.
	 */
	@RequestMapping(value = "/students/{id}", method = RequestMethod.PUT, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public final Student updateStudentsById(@PathVariable final Long id,
			@RequestBody final Student students) {
		Student studentsResult = studentsService.updateStudentsById(id,
				students);
		return studentsResult;
	}

	/**
	 * Delete Students by id.
	 * 
	 * @param id
	 *            The id of the Students to be deleted.
	 * 
	 * @return true if deletion is successful.
	 * 
	 * @throws EntityException
	 *             In case of null entity passed for deletion.
	 * 
	 * @throws EntityException
	 *             In case of null Students id passed as an argument or any
	 *             other exception.
	 */
	@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
	public final Student deleteStudentsById(@PathVariable final Long id)
			throws EntityException {
		Student result = studentsService.deleteStudentsById(id);
		return result;
	}

}
