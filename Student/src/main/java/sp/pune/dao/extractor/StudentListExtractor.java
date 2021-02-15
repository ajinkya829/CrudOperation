package sp.pune.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import sp.pune.model.StudentForm;
@Component
@AllArgsConstructor
public class StudentListExtractor implements ResultSetExtractor<List<StudentForm>> {

	@Override
	public List<StudentForm> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		ArrayList<StudentForm> studList = new ArrayList<StudentForm>();
		StudentForm sf = null;
		
		while(rs.next())
		{
			sf= new StudentForm();
			sf.setSno(rs.getInt("sno"));
			sf.setSname(rs.getString("sname"));
			sf.setAge(rs.getInt("age"));
			/*sf.setGender(rs.getString("gender"));
            sf.setMarathi(rs.getBoolean("marathi"));
            sf.setHindi(rs.getBoolean("hindi"));
            sf.setEnglish(rs.getBoolean("english"));
            sf.setBirthdate(rs.getDate("birthdate"));           
           */
            
            
            
        	studList.add(sf);
		}
		return studList;
	}
	}

