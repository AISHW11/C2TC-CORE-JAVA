package com.tns.service; 

import com.tns.dao.StudentDao; 
import com.tns.dao.StudentDaoImpl; 
import com.tns.entities.*; 
 
public class StudentServiceImpl implements StudentService { 
 
 	private StudentDao Dao; 
 
 	public StudentServiceImpl()  
         { 
 	 	Dao = new StudentDaoImpl(); 
         }
  	@Override 
 	public void addStudent(Student student) 
  	{  	
  		Dao.beginTransaction();  	
  		Dao.addStudent(student);  	
  		Dao.commitTransaction(); 
 	} 
 	 
 	@Override 
 	public void updateStudent(Student student) 
 	{  	
 		Dao.beginTransaction();  	
 		Dao.updateStudent(student);  	
 		Dao.commitTransaction(); 
 	} 
 	 
 	@Override 
 	public void removeStudent(Student student) 
 	{  	
 		Dao.beginTransaction();  	
 		Dao.removeStudent(student); 
 	 	Dao.commitTransaction(); 
 	} 
 	 
 	@Override 
 	public Student findStudentById(int id) { 
 	 	//no need of transaction, as it's an read operation  	
 		Student student  = Dao.getStudentById(id);  	
 		return student; 
 	}
}