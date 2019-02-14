//Requires MasterOrder.java to run
public class CookieOrder {
	String var;
	int num;
	public CookieOrder(String variety, int numBoxes) {
		var = variety;
		num = numBoxes;
	}
	public String getVariety() {
		return var;
	}
	public int getNumBoxes() {
		return num;
	}
}
