import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/service/student.service';
import { Student } from 'src/pojo/student';

@Component({ 
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  private students=[];
   public studObj:Student=new Student();
  constructor(private studService:StudentService) { }

  ngOnInit() {
     this.fillList();
  }
  fillList()
  {
    this.studService.getStudList("stud").subscribe(data=>{this.students=data;});
    this.clearData();
  }
  clearData()
  {
          this.studObj.sno=null;
          this.studObj.sname=null;
          this.studObj.age=null;
  }

  insert()
  {
    this.studService.insertData("stud",this.studObj).subscribe(data=>{this.fillList();});
  }
  update(sno)
  {
    this.studService.getStudList("stud/"+ sno).subscribe(data=>{this.studObj=data;});
  }
  edit()
  {
    this.studService.updateData("stud", this.studObj).subscribe(data=>{this.fillList();});
  }

  delete(sno)
  {
    this.studService.deleteData("stud/"+ sno, this.studObj).subscribe
    (data=>
      {
        this.fillList();
    }
    );
  }
  // this.taskService.deleteData("tasks/" + _id, obj).subscribe(data=>{this.fillList();});
  

}

/* Student name:
    <input type="text" [(ngModel)]="studObj.sname"><br>
   Student age:
    <input type="text" [(ngModel)]="studObj.age"><br>
 <br>
    <button (click)="insert()">Save</button>
    
<button (click)="edit()">Edit</button>*/