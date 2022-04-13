package sec1; //중첩클래스

class A {	//외부클래스
	int item1;
	static int item2;
	void function1() {}
	static void function2() {}
	class B {	//내부클래스 : 정적 멤버를 둘 수 없음
		B() { }//내부생성자
		int field1; //내부 필드
		void method1() { }//내부 메서드
		//static int field2;
		//static void method2() { }
	}
}
public class NestingEx {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.item1);
		System.out.println(A.item2);
		a.function1();
		A.function2();
		A.B b =a.new B();
		System.out.println(b.field1);
		b.method1();
	}
}

