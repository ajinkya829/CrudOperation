import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
//import { TestComponent } from './test/test.component';
//import { EmpComponent } from './emp/emp.component';
import{StudentComponent} from './student/student.component';
  import { from } from 'rxjs';


const routes: Routes = [
  
  {path:'studpath',component:StudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
