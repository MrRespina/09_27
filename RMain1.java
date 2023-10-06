package Practice;

import java.util.Scanner;

public class RMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word=null;
		
		while(true) {
			
			System.out.print("단어 입력 : ");
			word = s.nextLine();
			System.out.println("입력된 단어 : "+word);
			if(word.equals("안녕")) {
				System.out.println("== 종료 ==");
				break;
			}
			
		}
		
	}

}
