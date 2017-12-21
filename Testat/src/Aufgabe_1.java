/**
 * @author Mazyar Matin
 *
 */
public class Aufgabe_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] zahlen = {1,2,3,4,5,6,7,8,9,10};
		int aktuel;
		
		for(int i=0; i<zahlen.length; i++) {
			System.out.print(zahlen[i]+":");
			 aktuel = zahlen[i];
			for(int j=0; j<zahlen.length;j++) {
				
				System.out.print(" "+zahlen[j]*aktuel);
			}
			System.out.println();
		
		}
	}

}
