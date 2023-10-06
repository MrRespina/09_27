package Practice;

import java.util.Scanner;
import java.util.Random;

//1 > 예금 , 2 > 출금 , 3 > 잔액 , 4 > 종료
public class RMain7 {

	static Scanner s = new Scanner(System.in);
	static int money = 0;

	public static void addMoney(int in) {

		if (in <= 0) {

			System.out.println("예금할 금액을 정확히 입력해주세요!");
			System.out.println("==== 예금 실패 ====");

		} else {

			money += in;
			System.out.println("예금 액수 : " + in);
			System.out.println("현재 잔고 : " + money);
			System.out.println("==== 예금 완료 ====");

		}

	}

	public static void checkMoney() {

		System.out.println("현재 잔고 : " + money);

	}

	public static void exitCount() throws InterruptedException {

		for (int i = 0; i < 5; i++) {

			System.out.print(" * ");
			Thread.sleep(1000);

		}
		System.out.println();
		System.out.println("이용해 주셔서 감사합니다.");

	}
	
	public static void getNumber() throws InterruptedException {
		
		Random r = new Random();
		int i = r.nextInt(10)+1;	
		for(int x=1;x<i;x++) {
			
			System.out.println("현재 "+(i-x)+"명의 고객님을 처리중입니다. 대기열 "+(i-x)+"번");
			Thread.sleep(3000);
			
		}
		System.out.println("고객님의 순번입니다.");
		
	}

	public static void reMoney(int out) {

		if (out <= 0) {

			System.out.println("출금할 금액을 정확히 입력해주세요!");
			System.out.println("==== 출금 실패 ====");

		} else if ((money - out) < 0) {

			System.out.println("출금할 금액이 부족합니다!");
			System.out.println("현재 잔고 : " + money);
			System.out.println("출금 액수 : " + out);
			System.out.println("==== 출금 실패 ====");

		} else {

			money = money - out;
			System.out.println("출금 액수 : " + out);
			System.out.println("현재 잔고 : " + money);
			System.out.println("==== 출금 완료 ====");

		}

	}
	
	public static void start() throws InterruptedException {

		int num, stmt;
		boolean b = true;

		while (b == true) {

			getNumber();
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액");
			System.out.println("4. 종료");
			System.out.print("사용할 동작 입력 : ");
			num = s.nextInt();

			switch (num) {

			case 1:
				System.out.print("예금할 금액을 입력해주세요 : ");
				stmt = s.nextInt();
				addMoney(stmt);
				continue;

			case 2:
				System.out.print("출금할 금액을 입력해주세요 : ");
				stmt = s.nextInt();
				reMoney(stmt);
				continue;

			case 3:
				checkMoney();
				continue;

			case 4:
				exitCount();
				b = false;

			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		start();
		s.close();

	}

}
