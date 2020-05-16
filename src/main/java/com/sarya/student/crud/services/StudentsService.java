package com.sarya.student.crud.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sarya.student.crud.exception.EntityException;
import com.sarya.student.crud.model.Student;
import com.sarya.student.crud.repo.StudentRepository;

/**
 * @author mayur
 *
 */
@Service
public class StudentsService {

	/**
	 * Logger to log events from UsersService.
	 */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(StudentsService.class);

	@Autowired
	StudentRepository studentRepository;

	public Student getStudentsById(Long studentID) throws EntityException {
		try {
			int a = 1 / 0;
			return studentRepository.findOne(studentID);
		} catch (Exception exception) {
			LOGGER.error(String
					.format("Error occured while fetching Users by id = %d.",
							studentID), exception);
			// ErrorMessage errorMessage = new ErrorMessage(String.format(
			// "Error occured while fetching Users by id = %d.", usersId),
			// exception);
			throw new EntityException(String.format(
					exception.getLocalizedMessage(), studentID), exception);
		}
	}

	public Student createStudents(Student student) throws Exception {
		return studentRepository.save(student);
	}

	public Student updateStudentsById(Long id, Student student) {
		return studentRepository.save(student);
	}

	public Student deleteStudentsById(Long id) throws EntityException {
		// Check if user exist
		Student oldStudent = getStudentsById(id);

		// Delete user
		studentRepository.delete(id);

		return oldStudent;
	}

	public Iterable<Student> getAllStudents() {

		int pageNumber = 0;
		int pageSize = 1;

		Pageable pageable = new PageRequest(pageNumber, pageSize);

		return studentRepository.findAllStudents(pageable);

	}
}
