package sec3;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String[] args) {
		int[] intArr = {20,40,35,25};
		String[] strArr= {"이","일","삼","사","오","육","칠","팔","구"};
		Object[] objArr= {"1",2,3,4,"2","3","4",5,"5",6,"6",7,"7"};
		System.out.println("요소의 수 : " +strArr.length);
		System.out.println("strArr");
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+", ");
		}
		Set set1 =new HashSet();
		for(int i=0;i<strArr.length;i++) {
			set1.add(strArr[i]);
		}
		System.out.println("\nset : "+set1);
}
}
