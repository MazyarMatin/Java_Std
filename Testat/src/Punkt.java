/**
 * @author Mazyar Matin
 *
 */
public  class Punkt {

	private static int x;
	private int y;

	public static int getX() {
		return x;
	}

	public  void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Punkt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int  punktaddition(int x, int y ) {
 		return x+y;
	}
	
	public int  punktaddition(int x, int y,int koeffizient ) {
 		return x*koeffizient+y*koeffizient;
 		
	}
}
