
public class Print_Prg5 {


	public static void main(String[] args) {

		for(int k=0; k<4; k++) {
			for(int j=k; j<4; j++) 
				System.out.print(" ");
			for(int i=0; i<(k+1); i++) 
				System.out.print("* ");
			System.out.println();	
		}	
		
		for(int k=1; k<4; k++) {
			for(int j=0; j<k; j++) 
				System.out.print(" ");
			for(int i=k; i<4; i++) 
				System.out.print(" *");
			System.out.println();	
		}
	}
}
