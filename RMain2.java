package Practice;

import java.util.Scanner;

public class RMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String tag = null;
		
		a : while(true) {
			
			System.out.print("직급을 입력해주세요 : ");
			tag=s.nextLine();
			
			switch(tag) {
			case "매니저": System.out.print("시스템 관리,");
			case "강사": System.out.print("학생 관리,");
			case "학생":	System.out.print("공부 관련 기능\n"); break;
			case "끝":break a;
			}

		}
		
		s.close();	
		
	}

}
