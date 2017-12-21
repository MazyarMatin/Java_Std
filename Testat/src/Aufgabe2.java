/**
 * @author Mazyar Matin
 *
 */

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		wiederholezeichen(10, '8');
		
		
		
	}
	
	public static void wiederholezeichen(int i, char c ) {
		
		    for (int j=0; j<(i-1); j++)
		        System.out.print(" ");
		    System.out.println(c);
		    for (int j=1; j<(i-1); j++)
		    {
		        for (int k=0;k<(i-1-j); k++)
		            System.out.print(" ");
		        System.out.print(c);
		        for (int k=0;k<(j*2)-1; k++)
		            System.out.print(" ");
		        System.out.println(c);
		    }
		    for (int j=0; j<(i*2-1); j++)
		        System.out.print(c);
		    System.out.println("");
		    
	}


}
