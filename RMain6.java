package Practice;

import java.util.Scanner;

//1 > 예금 , 2 > 출금 , 3 > 잔액 , 4 > 종료
public class RMain6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int money = 0, num, in, out;

		while (true) {

			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액");
			System.out.println("4. 종료");
			System.out.print("사용할 동작 입력 : ");
			num = s.nextInt();

			if (num == 1) {

				System.out.print("예금할 금액을 입력해주세요 : ");
				in = s.nextInt();

				if (in <= 0) {

					System.out.println("예금할 금액을 정확히 입력해주세요!");
					System.out.println("==== 예금 실패 ====");

				} else {

					money += in;
					System.out.println("예금 액수 : " + in);
					System.out.println("현재 잔고 : " + money);
					System.out.println("==== 예금 완료 ====");

				}

			} else if (num == 2) {

				System.out.print("출금할 금액을 입력해주세요 : ");
				out = s.nextInt();

				if (money - out < 0) {

					System.out.println("출금할 금액이 부족합니다!");
					System.out.println("현재 잔고 : " + money);
					System.out.println("출금 액수 : " + out);
					System.out.println("==== 출금 실패 ====");

				} else if (out <= 0) {

					System.out.println("출금할 금액을 정확히 입력해주세요!");
					System.out.println("==== 출금 실패 ====");

				} else {

					money = money - out;
					System.out.println("출금 액수 : " + out);
					System.out.println("현재 잔고 : " + money);
					System.out.println("==== 출금 완료 ====");

				}

			} else if (num == 3) {

				System.out.println("현재 잔고 : " + money);
				System.out.println("================");

			} else if (num == 4) {

				System.out.println("이용해주셔서 감사합니다.");
				System.out.println("================");
				break;

			} else {

				System.out.println("정수 1,2,3,4 중 하나를 정확히 입력해주세요!");

			}

		}
		
		for(int i=0;i<3;i++) {
			
			Thread.sleep(1000);
			System.out.print(" . ");

		}
		System.out.println("종료되었습니다.");

		s.close();

	}

}
