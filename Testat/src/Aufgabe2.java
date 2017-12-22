/**
 * @author Mazyar Matin
 *
 */

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hier werden int und char parameter mitgegeben und die Methode ausgeführt.
		wiederholezeichen(10, '8');

	}

	public static void wiederholezeichen(int i, char c) {

		for (int j = 0; j < (i - 1); j++) // zeichnet die Spitze
			System.out.print(" "); // zeichnet leerzeichen
		System.out.println(c); //

		for (int j = 1; j < (i - 1); j++) {

			for (int k = 0; k < (i - 1 - j); k++) // zeichnet den Linken Arm des Dreiecks
				System.out.print(" ");
			System.out.print(c);

			for (int k = 0; k < (j * 2) - 1; k++) // Zeichnet den Rechten Arm
				System.out.print(" ");
			System.out.println(c);
		}

		for (int j = 0; j < (i * 2 - 1); j++) // Zeichnet das Boden des Dreiecks
			System.out.print(c);
		;
	}

}
