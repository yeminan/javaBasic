package sec3;

public class StringBuilderEx1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("java");
		sb.append("퍽킹");
		sb.append("좋아");
		System.out.println(sb);
		
		sb.insert(4, "6"); // 특정위치에 삽임
		System.out.println(sb);
		
		sb.setCharAt(4,'8' ); // 특정 위치의 문자를 변경
		System.out.println(sb);
		
		sb.replace(5,8, "존좋아"); // 특정 번째 문자열들을 바꾸기
		System.out.println(sb);
		
		sb.delete(2, 3);	//특정 범위에 있는 글자들을 삭제
		System.out.println(sb);
		
		System.out.println("글자수 : "+sb.length());
		//StringBuilder를 String으로 변환
		String res =sb.toString();
		System.out.println("문자열로 반환된 결과 : "+res);
	}

}
