package sp.pune.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import sp.pune.model.StudentForm;

@Component
public class StudbySnoExtractor implements ResultSetExtractor<StudentForm> {

	@Override
	public StudentForm extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub

		StudentForm sf = new StudentForm();
		if(rs.next())
		{
			sf.setSno(rs.getInt("sno"));
			sf.setSname(rs.getString("sname"));
			sf.setAge(rs.getInt("age"));
			/*sf.setGender(rs.getString("gender"));
			sf.setMarathi(rs.getBoolean("marathi"));
			sf.setHindi(rs.getBoolean("hindi"));
	     	sf.setEnglish(rs.getBoolean("english"));
		    sf.setBirthdate(rs.getDate("birthdate"));
			*/
		}
		return sf;
	}

}

