package sec1;

public class RemoteEx {
	public static void main(String[] args) {
		RemoteControl rc1; // 선언을 인터페이스 타입으로 했으므로 필드의 직접 접근이 불가능
		rc1 = new TvRemote();
		rc1.turnOn();
		rc1.setVolume(10);
		//인터페이스에 선언되었으므로 gecVolume()과 setVolume()로 접근
		System.out.println("TV볼륨 : "+rc1.getVolume());
		//인터페이스에 선언되어있지 않으므로 gecChannel()과 setChannel()로 활용 불가능
		//System.out.println("채널 : "+rc1.getChannel());
		rc1.turnOff();
		rc1 = new AudioRemote();
		rc1.turnOn();
		//rc1은 객체 생성을 새로 하였으므로 볼륨값은 다시 0으로 초기화가 됨
		
		rc1.setVolume(10);
		System.out.println("오디오볼륨 : "+rc1.getVolume());
		rc1.turnOff();
		
		TvRemote rc2 = new TvRemote();// 선언을 클래스 타입으로 하였으므로
										//필드의 직접 접근이 가능
		rc2.volume = 20;
		rc2.channel = 24;
		
		//형제끼리의 형변환은 허용안됨 - 크기가 다르므로 허용안됨
		//AudioRemote rc5 = (AudioRemoto) rc2;
		RemoteControl rc4 = rc2; // 자동 형변환
		
		//메서드를 호출하여 값을 전달 할 때 클래스로 묶어서 전달하는 것이 효율적임 
		RemoteEx.play(rc2); // call by reference
		RemoteEx.play(rc2.volume, rc2.channel);//call by value
		//RemoteEx.play(20,24);
		System.out.println(rc2);
		}
	private static void play(TvRemote tv1) {
		System.out.println("TV의 볼륨 : "+tv1.volume);
		System.out.println("TV의 채널 : "+tv1.channel);
		System.out.println("플레이를 합니다.");
	}
	private static void play(int volume,int channal) {
		System.out.println("TV의 볼륨 : "+volume);
		System.out.println("TV의 채널 : "+channal);
		System.out.println("플레이를 합니다.");
	}
}
