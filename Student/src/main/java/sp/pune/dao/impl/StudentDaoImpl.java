package sp.pune.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sp.pune.dao.StudentDao;
import sp.pune.dao.extractor.StudbySnoExtractor;
import sp.pune.dao.extractor.StudentListExtractor;
import sp.pune.model.StudentForm;


	@AllArgsConstructor
	@NoArgsConstructor
	@Repository
	public class StudentDaoImpl implements StudentDao{
		
		@Autowired
		@Setter
		private JdbcTemplate jdbcTemplate;
		
		@Autowired
		@Setter
		private StudentListExtractor studentListExtractor;
		
		@Autowired
		@Setter
		private StudbySnoExtractor studbySnoExtractor;

		@Override
		public List<StudentForm> getStudList() {
			// TODO Auto-generated method stub
			//System.out.println("List"+studentListExtractor);
			return jdbcTemplate.query("select * from stud order by sno", studentListExtractor::extractData);
		}

		@Override
		public void insertStudDetails(StudentForm studentForm) {
			// TODO Auto-generated method stub
			String query = "insert into stud values("+studentForm.getSno()+",'"+studentForm.getSname()+"','"+studentForm.getAge()+"')";
			jdbcTemplate.update(query);
		}

		@Override
		public StudentForm getStudListbySno(int sno) {
			// TODO Auto-generated method stub
			return jdbcTemplate.query("select * from stud where sno="+sno,studbySnoExtractor::extractData); 
		}

		@Override
		public void updateStudbySno(StudentForm studentForm) {
			// TODO Auto-generated method stub
			String query="Update stud set sname='" + studentForm.getSname() + "', age='" + studentForm.getAge() + "' where sno=" + studentForm.getSno();
			jdbcTemplate.update(query);
		}

		@Override
		public void deleteStudbySno(int sno) {
			// TODO Auto-generated method stub
			String query="delete from stud where sno="+sno;
			jdbcTemplate.update(query);
		}
	}
		
		/*
	@Override
	public void insertStudDetails(StudentForm studentForm) {
		// TODO Auto-generated method stub
		String query = "insert into student values("+studentForm.getSno()+",'"+studentForm.getSname()+"',"+studentForm.getAge()+")";
		jdbcTemplate.update(query);
	}
	@Override 
	public StudentForm getStudListbySno(int sno) { 
		return jdbcTemplate.query("select * from student where sno="+sno,studbySnoExtractor::extractData); 
	}
	@Override
	public void updateStudbySno(StudentForm studentForm) {
		// TODO Auto-generated method stub
		String query="Update student set sname='" + studentForm.getSname() + "', age=" + studentForm.getAge() + " where sno=" + studentForm.getSno();
		jdbcTemplate.update(query);
	}
	@Override
	public void deleteStudbySno(int sno) {
		// TODO Auto-generated method stub
		String query="delete from student where sno="+sno;
		jdbcTemplate.update(query);
		
	}*/



