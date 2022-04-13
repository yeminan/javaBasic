package Confirm;

public class ChildEx extends Parent {
	public static void main(String[] args) {
		Child child1 = new Child();
		child1.name = "이민환";
		child1.name = "stu";
		
		Child child2 = new Child("이민환");
		child2.name = "";
		
		Child child3 = new Child("이민환", "네임");
	}
}