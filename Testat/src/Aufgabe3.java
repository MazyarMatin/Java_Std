/**
 * @author Mazyar Matin
 *
 */

public class Aufgabe3 {

	public static void main(String[] args) {

		generiereReihe(4, 20,3);
		
	}

	
	public static int[] generiereReihe(int von, int bis, int schritt) {
				
		int [] zahlenreieh = new int[bis-von];
		zahlenreieh[0] = von;
		
		for( int i=von ;von<bis; von=von+schritt ) {
			
			zahlenreieh[i] = von;
			System.out.print(" "+zahlenreieh[i]);
			
			
		}

		
			
		
		
		return zahlenreieh;
				
	}
}
