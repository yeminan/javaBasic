package sec4;

import java.util.Arrays;

public class ArraysEx1 {
	public static void main(String[] args) {
		char[] arr1= {'J','A','V','A','S','R','W','Q','F','M'};
		char[] arr2 = arr1;
		System.out.println("얕은 복제");
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println("깊은복제");
		char[] arr3 = Arrays.copyOf(arr1,arr1.length);
		System.out.println(arr3);
		char[] arr4 = Arrays.copyOfRange(arr1, 3, 8);
		System.out.println(arr4);
		System.out.println("얕은 복제의 비교 : "+Arrays.equals(arr1, arr2));
		System.out.println("깊은 복제의 비교 : "+Arrays.equals(arr1, arr3));
		//System.out.println("얕은 복제의 비교 : "+Arrays.deepEquals(arr1, arr4));
		//System.out.println("얕은 복제의 비교 : "+Arrays.deepEquals(arr2, arr3));
		System.out.println("arr1의 주소"+Arrays.hashCode(arr1));
		System.out.println("arr1의 주소"+Arrays.hashCode(arr2));
		System.out.println("arr1의 주소"+Arrays.hashCode(arr4));
		String[] arr5 = {"파카","랄로","기모노","장장장","장비장"};
		Arrays.sort(arr5);
		System.out.println("정렬 후");
		for(String name : arr5) {
			System.out.println(name);
		}
		System.out.println("정보 검색 몇번째에 있는지 ?");
		String data = "랄로";
		int idx = Arrays.binarySearch(arr5,data);
		System.out.println("랄로 인덱스 : "+idx);
	}

}
