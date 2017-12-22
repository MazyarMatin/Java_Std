package Aufgabe4;

/**
 * @author Mazyar Matin
 * @author 
 *
 */

public class DreiDPunkt extends Punkt {

	public int z;
	// InstanzVariablen

	// Standard Konstruktor
	public DreiDPunkt(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	// Leer Konstruktor
	public DreiDPunkt() {

	}

	// KlassenMethode
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	// Methoden zum Punkte Addieren
		public int  punktaddition( ) {

			return  getX()+getY()+getZ();
		}
		
		// Methode zum 
		public int  punktMultipikation( int  koeffizient ) {
			return getX()*koeffizient+getY()*koeffizient+getZ()*koeffizient;
		}

		@Override
		public String toString() {
			return "3DPunkt [z=" + z + ", x=" + getX() + ", y=" + getY() + "]";
		}
		
}
