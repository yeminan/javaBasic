package sec1;

public class BreadEx1 {
	 static void main(String[] args) {
	//croissant, cream, bean
		Bread cream1 = new Bread("크림빵","생크림",120,1500,10);
		Bread cream2 = new Bread("밤빵","슈크림",150,1200,5);
		Bread cross3 = new Bread("크로와상","크림",130,1700,15);
		Bread crosses4 = new Bread("단팥빵","단팥",100,1000,20);
		//각 단팥빵,크로와상,크림빵의 객체를 생성자의 매개변수의 개ㅜ를 달리하여 두 개씩 만들고,
		//해당 제품명과 금액을 처리한 후 출력
		System.out.println(cream2.getName()+cream2.getPrice()+cream2.getGram());
	}
}
