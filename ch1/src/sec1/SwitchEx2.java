package sec1;

import java.util.Scanner;

//본인의 월을 숫자 정수로 입력하면, 해당하는 월의 탄생석을 출력
//1월 : 석류석
//2월 : 자수정
//3월 : 남옥
//4월 : 다이아몬드
//5월 : 비취(에머럴드)
//6월 : 진주(펄)
//7월 : 홍옥(루비)
//8월 : 감람석
//9월 : 청옥(사파이어)
//10월 : 오팔
//11월 : 황옥(토파즈)
//12월 : 터키석 
public class SwitchEx2 {

	public static void main(String[] args) {
		//태어난 월을 입력[1-12] : 
		System.out.println("1:석류석, 2:자수정, 3:남옥, 4:다이아몬드, 5:비취, 6:진주, 7:홍옥, 8:감람석, 9:청옥, 10:오팔, 11:황옥, 12:터키석 0:종료");
		System.out.println("작업할 번호를 입력 [0-12] : ");
		Scanner sc = new Scanner(System.in);
		int mode = sc.nextInt();
		
		switch(mode) {
			case 1:
				System.out.println("1월은 석류석입니다");
				break;
			case 2:
				System.out.println("2월은 자수정입니다");
				break;
			case 3:
				System.out.println("3월은 청옥입니다");
				break;
			case 4:
				System.out.println("4월은 다이아몬드입니다");
				break;
			case 5:
				System.out.println("5월은 비취입니다");
				break;
			case 6:
				System.out.println("6월은 진주입니다");
				break;
			case 7:
				System.out.println("7월은 홍옥입니다");
				break;
			case 8:
				System.out.println("8월은 감람석입니다");
				break;
			case 9:
				System.out.println("9월은 청옥입니다");
				break;
			case 10:
				System.out.println("10월은 오팔입니다");
				break;
			case 11:
				System.out.println("11월은 황옥입니다");
				break;
			case 12:
				System.out.println("12월은 터키석입니다");
				break;
			default:
				System.out.println("작업을 종료합니다");
				break;
			
		}
		
	}

}
