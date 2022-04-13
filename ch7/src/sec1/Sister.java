package sec1;

public class Sister extends Parent {
	double field4;
	Sister(){ }
	Sister(int field1,String field2,double field3,double field4){
		this.field1=field1;
		this.field2=field2;
		this.field4=field4;
	}
	@Override
	public void method2() {System.out.println("자매메서드2 입니다.");}
	public void method3() {}
}
