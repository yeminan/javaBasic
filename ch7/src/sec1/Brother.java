package sec1;

public class Brother extends Parent{
	double field5;
	Brother(){ }
	Brother(int field1,String field2,double field3,double field4,double field5){
		this.field1=field1;
		this.field2=field2;
		this.field5=field5;
	}
		@Override
		public void method2() {System.out.println("형제메서드2 입니다.");}
		public void method3() {}
	}
