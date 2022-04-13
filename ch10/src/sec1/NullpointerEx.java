package sec1;

public class NullpointerEx {
	public static void main(String[] args) {
	String last = null;
	try {
	System.out.println(last.toString());
	} catch(NullPointerException e) {
		System.out.println("출력할 내용에 null이 있음");
		e.printStackTrace();
	} catch(Exception e) {
		System.out.println("이유를 알 수 없는 예외 발생");
		e.printStackTrace();
	} finally { //try가 되든 catch가 되든 관계없이 반드시 해야하는 실행문장
		System.out.println("프로그램 종료");
	}
}
}