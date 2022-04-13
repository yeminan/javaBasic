package sec4;

public class MathEx1 {

	public static void main(String[] args) {
		int i = 6;
		float f = 6.8f;
		double d =6.3;
		
		System.out.println("6.3 => "+Math.ceil(i));
		System.out.println("6.3 => "+Math.ceil(-i));
		System.out.println("6.3 => "+Math.floor(d));
		System.out.println("6.3 => "+Math.floor(-d));
		System.out.println("6.3 => "+Math.rint(f));
		System.out.println("6.3 => "+Math.rint(-f));
		System.out.println("6.3 => "+Math.round(d));
		System.out.println("6.3 => "+Math.round(-d));
		System.out.println("6.3 => "+Math.round(f));
		System.out.println("6.3 => "+Math.round(-f));
		System.out.println("돗수분포에서 가장 큰 수 => "+Math.max(8, 9));
		System.out.println("돗수분포에서 가장 작은 수 => "+Math.min(8, 9));
		System.out.println("랜덤수 : "+Math.random());
		
		

	}

}
