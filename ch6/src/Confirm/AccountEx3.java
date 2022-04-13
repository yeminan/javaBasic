package Confirm;

import java.util.Scanner;

public class AccountEx3 {
	
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성, 2.계좌목록, 3.입금, 4.출금, 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				createAccount();	
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit(); 
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5){
				run = false;
			}
		}
	}
	private static void createAccount() {	
		System.out.println("-------------------------------");
		System.out.println("------- 계좌 생성하기  --------");
		System.out.println("-------------------------------");
		
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("예금주 : ");
		String owner = scanner.next();
		System.out.println("입금액 : ");
		int balance = scanner.nextInt();

		Account2 account = new Account2(ano, owner, balance);		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("계좌 생성");
				break;
			}
		}
	}
	private static void accountList() {	
		System.out.println("-------------------------------");
		System.out.println("------- 계좌 목록보기  --------");
		System.out.println("-------------------------------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno()+
				"\t"+accountArray[i].getOwner()+"\t"+
				accountArray[i].getBalance());
			} else {
				break;
			}
		}
	}	
	private static void deposit() {	
		System.out.println("-------------------------------");
		System.out.println("------- 입금하기  --------");
		System.out.println("-------------------------------");
		
		String ano = scanner.next();
		int balance = scanner.nextInt();
		Account2 account = findAccount(ano);
		if(account == null) {
			System.out.println("존재하지 않는 계좌이므로 입금되지 못했습니다.");
			return;
		}
		account.setBalance(account.getBalance()+balance);
		System.out.println("의뢰하신 "+balance+"가 입금처리 되었습니다.");
	}	
	private static void withdraw() {	
		System.out.println("-------------------------------");
		System.out.println("------- 출금하기  --------");
		System.out.println("-------------------------------");
		
		String ano = scanner.next();
		int balance = scanner.nextInt();
		Account2 account = findAccount(ano);
		if(account == null) {
			System.out.println("존재하지 않는 계좌이므로 출금되지 못했습니다.");
			return;
		}
		account.setBalance(account.getBalance()-balance);
		System.out.println("의뢰하신 "+balance+"가 출금처리 되었습니다.");
	}	
	private static Account2 findAccount(String ano) {
		Account2 account = null;	
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}