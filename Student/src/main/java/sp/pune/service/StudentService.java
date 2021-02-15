package sp.pune.service;

import java.util.List;

import sp.pune.model.StudentForm;

public interface StudentService {
	List<StudentForm> getStudListService();
	void insertStudService(StudentForm studentForm);
	StudentForm StudbySnoService(int sno);
	void updateStudbySnoService(StudentForm studentForm);
	void deleteStudbySno(int sno);
}

