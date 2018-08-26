
public class SandwichSculptor {

	public static void main(String[] argv) {
		
		Hoagie cust12Hoagie = new ItalianHoagie();
		cust12Hoagie.makeSandwich();
		
		Hoagie cust13Hoagie = new VeggieHoagie();
		cust13Hoagie.makeSandwich();
	}
}
