package Confirm;

public class Parent {
	public String name;
	public String studentNo;
	
	public Parent() {
		this("name");
		System.out.println("Parent(String name) call");
	}
	
	public Parent(String studentNo) {
		this.name = name;
		this.studentNo = studentNo;
		
	}
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	
}