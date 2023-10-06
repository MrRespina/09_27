package Practice;

public class RMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++) {

			if(i%2==0) {
				System.out.println("ㅋ");
			}else {
				continue;
			}
			System.out.println("맛점");
			
		}
		
		for(int i=1;i<51;i++) {
			
			if(i%3!=0) continue;
			System.out.print(i+" ");
			
		}

	}

}
