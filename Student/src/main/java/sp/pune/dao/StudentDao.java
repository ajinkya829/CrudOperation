package sp.pune.dao;



import java.util.List;

import sp.pune.model.StudentForm;

public interface StudentDao 
{
	List<StudentForm> getStudList();
	void insertStudDetails(StudentForm studentForm);
	StudentForm getStudListbySno(int sno);
	void updateStudbySno(StudentForm studentForm);
	void deleteStudbySno(int sno);
}
