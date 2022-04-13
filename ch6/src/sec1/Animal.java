package sec1;

public class Animal {
	private String name;
	private String type;
	private int leg1;
	private int wings2;
	private boolean spine;
	private int speed;
	
	Animal(){}
	Animal(String name){
		this(name,"포유류");
	}
	Animal(String name, String type){
		this(name,type,4);
	}
	Animal(String name, String type, int leg1){
		this(name,type,leg1,2);
	}
	Animal(String name, String type, int leg1, int wings2){
		this(name,type,leg1,wings2,false);
	}
	Animal(String name, String type, int leg1, int wings2, boolean spine){
		this(name,type,leg1,wings2,spine,0);
	}
	Animal(String name, String type, int num1, int num2, boolean spine,int speed){
		this.name = name;
		this.type = type;
		this.leg1 = num1;
		this.wings2 = num2;
		this.spine = spine;
		this.speed = speed;
	}
	public void running() {
		System.out.println("동물이 달립니다.");
	}
}
