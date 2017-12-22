package Aufgabe4;
/**
 * 
 * @author Mazyar Matin
 * @author 
 */
public  class Punkt {

	//Instanzvariablen
	
	private  int x;
	private  int y;
	
	//Instanzmethoden
	
	public  int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// Methoden zum Punkte Addieren
	public int  punktaddition(/*int x, int y*/ ) {
//		this.x=x;
//		this.y=y;
		return getX()+getY();
	}
	
	// Methode  Skalar * Vector
	public int  punktMultipikation(int koeffizient ) {
		return x*koeffizient+y*koeffizient;
	}
	
	// Konstruktor
	public Punkt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//Leer Konstruktor 
	public Punkt() {
		
	}

	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
