package Practice;

public class RMain4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int a=1;a<=30;a++) {
			
			for(int i=0;i<24;i++) {
				
				for(int j=0;j<60;j++) {
					
					for(int k=0;k<60;k++) {
						
						System.out.printf("[DAY%02d] %02d:%02d:%02d\n",a,i,j,k);
						Thread.sleep(1000);
						
					}
					
				}
				
			}
			
		}
		
		
		
	}

}
