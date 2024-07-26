package bank.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*BankApp class*/
public class BankApp {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
				
			}else if(selectNo == 4) {
				//withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
}	
	/*1. creatAccount 메소드*/
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		System.out.print("초기 입금액 :");
		int balance = Integer.parseInt(scanner.nextLine());
		accounts.add(new Account(ano,owner,balance));
	}
	
	/*2. accountList 메소드*/
	private static void accountList() {
		for(Account ac : accounts) {
			System.out.println(ac.getAno() + " " + ac.getOwner() + " " +ac.getBalance());
		}
	}
	
	
	/*3. deposit 메소드*/
	private static void deposit() {
		System.out.print("계좌번호 : ");
		findAccount(scanner.nextLine());
		
	}
	
	/*4. withdraw 메소드*/
	private static void withdraw() {
		
		
		
	}
	
	/*5. findAccoun 메소드*/
	private static Account findAccount(String ano) {
		Account a = null;
		for(Account as : accounts) {
			if(as.equals(as.getAno())){
				a = as;
			}			
		}
		return a;
	
	
	}
}
	
	
	
	
	
	
	
	


