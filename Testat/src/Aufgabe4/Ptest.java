package Aufgabe4;

/**
 * @author Mazyar Matin
 * @author
 */

public class Ptest extends Punkt {

	public static void main(String[] args) {

		int koeffiziert = 2;

//**************************2D Punkt
		Punkt BD = new Punkt(10, 20); // Ein 2D Punkt erzeugen
		int AdditioErgebnis = BD.punktaddition(); // Punkte addieren
		int MultipikationsErg = BD.punktMultipikation(koeffiziert); // Punkte multipizieren
		
		System.out.println(BD.toString() + "\nErgebnis der Addition= " + AdditioErgebnis
				+ "\nErgebnis der Multipikation mit " + koeffiziert + " = " + MultipikationsErg);

//**************************3DPunkt		
		DreiDPunkt AD = new DreiDPunkt(10, 3, 20); // Ein 3D Punkt erzeugen
		AdditioErgebnis = AD.punktaddition(); // Punkte addieren
		MultipikationsErg = AD.punktMultipikation(koeffiziert); // Punkte multipizieren
		
		System.out.println("\n" + AD.toString() + "\nErgebnis der Addition= " + AdditioErgebnis
				+ "\nErgebnis der Multipikation mit " + koeffiziert + " = " + MultipikationsErg);

	}

}
