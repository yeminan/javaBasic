package sec1;

public class Array1 {

	public static void main(String[] args) {
		// 배열 : 같은 타입을 가진 여러개의 연속한 기억장소 
		int[] arr2 = {10,40,20,15,25};
		int[] arr3;
		//arr3 = {40,15,10,30,20}; 컴파일 에러 
		arr3 =new int[] {40,15,10,30,20};
		
		String[] names;
		names = new String[] {"이민환","이민훤","이민헌","이민한"};
		for(int i=0;i<names.length;i++);{
			System.out.println(names);
		}
		float[] arr4 = {3.14f,2.14f,4.14f,5.15f};
		
		int[] arr5 = new int [5]; //arr4[0]~arr4[4] 는 초기화가 0으로 됨
		double[] arr6 = new double[5];
		for(int i=0;i<arr6.length;i++) {
			System.out.println(arr6[i]);
		
		}	
	}
}
