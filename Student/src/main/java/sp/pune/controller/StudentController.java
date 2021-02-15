package sp.pune.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sp.pune.model.StudentForm;
import sp.pune.service.StudentService;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "stud")
@CrossOrigin("*")
public class StudentController
{
	
	@Autowired
	@Setter
	private StudentService studentService;
	
	
	@GetMapping
	public List<StudentForm> getStudListCtrl()
	{
		return studentService.getStudListService();
	}
	@PostMapping
	public void insertStudCtrl(@RequestBody StudentForm studentForm)
	{
		studentService.insertStudService(studentForm);
	}
	@GetMapping("/{sno}")
	public StudentForm StudbySnoCtrl(@PathVariable(value = "sno") int sno)
	{
		return studentService.StudbySnoService(sno);
		
	}
	@PutMapping
	public void updateStudbySnoCtrl(@RequestBody StudentForm studentForm)
	{
		studentService.updateStudbySnoService(studentForm);
	}
	@DeleteMapping("/{sno}")
	public void deleteStudbySnoCtrl(@PathVariable(value = "sno")int sno)
	{
		studentService.deleteStudbySno(sno);
	}
	

}