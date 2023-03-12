package org.student;

import org.department.Department;

public class Student extends Department{
public void studentName() {
	// TODO Auto-generated method stub
System.out.println("Student name is Vallabbi");
}
public void studentDept() {
	// TODO Auto-generated method stub
System.out.println("Student dept is IT");
}
public void studentId() {
	// TODO Auto-generated method stub
System.out.println("Student Id is 14567");
}
public static void main(String[] args) {
	Student details=new Student();
	details.collegeName();
	details.collegeCode();
	details.collegeRank();
	details.deptName();
	details.studentName();
	details.studentDept();
	details.studentId();
}
}
