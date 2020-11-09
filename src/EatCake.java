
public class EatCake {
	
	private EatCake() {
		//Haha, you can't call this constructor from another class now!
	}
	
	public static void eatCake(Cake cake) {
		if (!cake.isEmpty()) {
			cake.takeABite();
			eatCake(cake);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Let them eat cake!");
		Cake aLie = new Cake();
		eatCake(aLie);
		System.out.println("Cake eaten (+3000 calories!)");
		
	}

}
