import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class StudentService {


  serverPath="http://localhost:8086/";
  //path="/assets/data/students.json";
  constructor(private http:HttpClient) { }

  getStudList(url):Observable<any>
  {
    return this.http.get(this.serverPath  + url);
  }
  
  insertData(url, obj):Observable<any>
  {
    return this.http.post(this.serverPath + url, obj);
  }
  updateData(url, obj):Observable<any>
  {
    return this.http.put(this.serverPath + url, obj);
  }

  deleteData(url,obj):Observable<any>
  {

    return this.http.delete(this.serverPath+ url, obj);
  }
  
}
