package sec2;

public class NullEx1 {

	public static void main(String[] args) {
		//int a = null; 기본형은 null값을 가질 수 엇다.
		String b= null;
		int c = 20; //기본형은 ==나 != 비교할 수 있음
		int d =20;
		System.out.println("c == d : "+(c == d));
		System.out.println("c != d : "+(c != d));
		
		int[] e = {10,20,30};   //참조형은 ==나 !=로 비교할 수 없음 : 주소와 주소를 비교하게 되므로 
		int[] f = {10,20,30};
		System.out.println("e == f :"+(e == f));
		System.out.println("e != f :"+(e != f));
		
		System.out.println("e == f :"+e.equals(f));
		//참조형의 비교는 각각 비교하려면 equals로 해야함
		
		String g ="이민환";
		String h ="이민환";
		System.out.println("g == h " + (g == h));
		System.out.println("g != h " + (g != h));
	
		String i = new String("이민환"); // new를 활용한경우 참조형이 됨
		String j = new String("이민환");
		System.out.println("i == j " + (i == j));
		System.out.println("i != j " + (i != j));
		System.out.println("***************************");
		System.out.println("i == j : "+i.equals(j)); //참조형을 값 비교하려면 equals
		
	}

}
