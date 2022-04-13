package Confirm;
//현재 클래스에 있는 필드가 아니므로 Suprer 클래스인 parent클래스를 거쳐야함
public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		
		super.name=name;
		this.studentNo=studentNo;
	}
}
