package sec1;

public class CellPhone {
	String model;
	String color;
	CellPhone(){}
	CellPhone(String model,String color){
		this.model=model;
		this.color=color;
	}

	public void powerOn(String model) {System.out.println("전원을 켭니다");}
	public void powerOff(String model) {System.out.println("전원을 끔니다");}
	public void bell(String model) {System.out.println("벨이 울림니다");}
	public void sendVoice(String model) {System.out.println("전달한 메시지를 출력");}
	public void receiveVoice(String model) {System.out.println("전달받은 메시지를 출력");}
	public void hangUp(String model) {System.out.println("전화를 끊습니다");}
	
}