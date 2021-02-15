package sp.pune.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sp.pune.dao.StudentDao;
import sp.pune.model.StudentForm;
import sp.pune.service.StudentService;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	@Setter
	private StudentDao studentDao;

	@Override
	public List<StudentForm> getStudListService() {
		// TODO Auto-generated method stub
		return studentDao.getStudList();
	}

	@Override
	public void insertStudService(StudentForm studentForm) {
		// TODO Auto-generated method stub
		studentDao.insertStudDetails(studentForm);
	}

	@Override
	public StudentForm StudbySnoService(int sno) {
		// TODO Auto-generated method stub
		return studentDao.getStudListbySno(sno);

	}

	@Override
	public void updateStudbySnoService(StudentForm studentForm) {
		// TODO Auto-generated method stub
		studentDao.updateStudbySno(studentForm);
	}

	@Override
	public void deleteStudbySno(int sno) {
		// TODO Auto-generated method stub
		studentDao.deleteStudbySno(sno);
	}

	
}