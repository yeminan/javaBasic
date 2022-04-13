package sec3;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		//string객체.split("구분기호");
		String str = "괴물쥐&파카&랄로-오킹&마젠타%주다사&저라뎃";
		String[]arr = str.split("&|,|-|%|,^");//분리할 기호나열
		for(String name : arr) {
			System.out.println(name);	
		}
		System.out.println("==============================================");
		//StringTokenizer클래스 :countToken() - 토큰의수, hasMoreTokens() - 남아있는토큰의여부
		str = "괴물쥐/파카/랄로/오킹/마젠타/주다사/저라뎃";
		StringTokenizer s = new StringTokenizer(str,"/");
		int l = s.countTokens();
		for(int i=0;i<l;i++) {
			String t = s.nextToken();
			System.out.println(t);
		}
		System.out.println("=============================================");
		StringTokenizer s2 = new StringTokenizer(str,"/");
		while(s2.hasMoreTokens()) {
			String t2 = s2.nextToken();
			System.out.println(t2);
		}
	}

}
