package assignment.week3day1;

public class Students {
public void getStudentInfo(int id) {
	System.out.println("Class id is "+id);
}
public void getStudentInfo(int id,String name) {
	System.out.println("Id is "+id);
	System.out.println("Name is "+name);
}
public void getStudentInfo(String email,long phonenumber) {
System.out.println("Email is "+email);	
System.out.println("Phone number is "+phonenumber);	
}
public static void main(String[] args) {
	Students detail=new Students();
	detail.getStudentInfo(9);
	detail.getStudentInfo(9, "Vallabbi");
	detail.getStudentInfo("vallabbi#09@gmail.com",9012345678l );
}
}