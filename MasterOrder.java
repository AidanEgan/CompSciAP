import java.util.*;
public class MasterOrder {
	
	//The implementation
	public static void main(String[] args) {
		MasterOrder goodies = new MasterOrder();
		goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
		goodies.addOrder(new CookieOrder("Shortbread", 5));
		goodies.addOrder(new CookieOrder("Macaroon", 2));
		goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
		
		goodies.printData();
		System.out.println();
		System.out.println(goodies.getTotalBoxes());
		System.out.println();
		goodies.removeVariety("Chocolate Chip");
		goodies.printData();
		System.out.println("\n" + goodies.getTotalBoxes());
	}
	
	private List<CookieOrder> orders;
	
	//Constructor
	public MasterOrder() {
		orders = new ArrayList<CookieOrder>();
	}
	
	public void addOrder(CookieOrder theOrder) {
		orders.add(theOrder);
	}
	
	public int getTotalBoxes() {
		int box = 0;
		for(CookieOrder o : orders) {
			box += o.getNumBoxes();
		}
		return box;
	}
	
	public int removeVariety(String cookieVar) {
		int numRemoved = 0;
		int iterator = 0;
		while(iterator < orders.size()) {
			if(orders.get(iterator).getVariety() == cookieVar) {
				numRemoved += orders.get(iterator).getNumBoxes();
				orders.remove(iterator);
			}else {
				iterator++;
			}
		}
		return numRemoved;
	}
	
	public void printData() {
		int i = 1;
		for(CookieOrder o: orders) {
			System.out.print(i + ": " + o.getVariety() + ", " + o.getNumBoxes() + "\n");
			i++;
		}
	}
}
