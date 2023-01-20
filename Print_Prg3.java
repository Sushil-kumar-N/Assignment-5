
public class Print_Prg3 {
	
	public static void main(String[] args) {
					
		for (int k=0; k<5; k++) { 
				
				for(int j=1; j<5-k; j++) 
					System.out.print(" ");
				
				for (int i=0; i<=k; i++)										
					System.out.print("*");
				
				System.out.println();
			}	
	}
	
}
