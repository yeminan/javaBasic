package sec2;

public class ClassEx2 {

	public static void main(String[] args) {
		Class2 obj1 = new Class2();  
		
		//Class2 :method1(); (X)
		obj1.mathod1(); //(O)
		//ojb1.method2(); (X)
		Class2.mathod2();//(O)
		//static :객체를 생성하여 활용하는 것이 아니고,원래 클래스 그대로 활용
	}
}
