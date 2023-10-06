package Practice;

public class RMain1_1 {
	
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			
			System.out.println(i+" + "+sum+" = "+(sum+i));
			sum+=i;
			
			if(sum>100) {
				System.out.println("100 초과!");
				System.out.println("마지막 숫자 = "+sum);
				break;
			}
			
		}
		
	}

}
