package Practice;

import java.util.Random;
import java.util.Scanner;

public class RMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int rand = r.nextInt(1000)+1;
		int check;
		System.out.println("AI가 숫자를 뽑았습니다.");
		
		for(int i=1;i>=-1;i++) {
			
			System.out.print("숫자를 맞춰보세요 : ");
			check = s.nextInt();
			
			if(check>rand) {
				System.out.println("DOWN!");
			}else if(check<rand) {
				System.out.println("UP");
			}else {
				System.out.println("정답! 정답은 "+rand+"이고 "+i+"번 시도했습니다.");
				break;
			}
			
		}
		
		s.close();
		
	}

}
