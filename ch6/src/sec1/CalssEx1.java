package sec1;

public class CalssEx1 {
	public static void main(String[] args) {
		int field1;
		//객체 생성
		//클래스명 객체명 = new 생성자함수();
		Sample1 obj1 = new Sample1();
		System.out.println("obj1.field1="+obj1.field1);
		obj1.field1 = 100;
		System.out.println("obj1.field1="+obj1.field1);
		obj1.field1 = 200;
		System.out.println("obj1.field1="+obj1.field1);
		Sample1 obj2 = new Sample1(10);
		System.out.println("**** obj2 ****");
		System.out.println(obj2.field1);
		System.out.println(obj2.getField1());
		Sample1 obj3 = new Sample1(20,3.14f);
	}
}
