
public class Cake {

	private int bites = 100;
	
	public Cake() {
		//nothing to implement
	}
	
	public void takeABite() {
		if (bites > 0) {
			--bites;
			if (bites % 7 == 0) {
				System.out.println("I LOVE CAKE");
			}
			else if (bites % 2 == 0) {
				System.out.println("MMMMMMMM!");
			}
			else if (bites % 3 == 0) {
				System.out.println("Tasty!");
			}
			else {
			System.out.println("Yum!");
			}
		}
	}
	
	public boolean isEmpty() {
		return bites == 0;
	}

}
