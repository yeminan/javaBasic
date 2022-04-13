package sec1;

public class DmbPhone extends CellPhone {
	int channel;
	DmbPhone(){ }
	DmbPhone(String model,String Color){
		this.model=model;
		this.color=color;
		this.channel=channel;
		
		
	}
	public void turnOnDmb() {System.out.println("현재xx번 채널의 방송을 시작합니다.");}
	public void changechannelDmb(int channel) {System.out.println("채널XX번으로 변경합니다");}
	public void turnOffDmb() {System.out.println("DMB 방송을 종료합니다");}
	
}
