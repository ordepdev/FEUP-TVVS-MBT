package tvvs;

public class VendingMachine {
	
	public static final String COFFEE = "Coffee";
	public static final String JUICE = "Juice";
	public static final String SODA = "Soda";
	
	private int deposit;
	private int change;
	private Drink coffee;
	private Drink juice;
	private Drink soda;
	
	public VendingMachine() {
		this.deposit = 0;
		this.change = 0 ;
		this.coffee = new Drink(COFFEE, 0, 0);
		this.juice = new Drink(JUICE, 0, 0);
		this.soda = new Drink(SODA, 0, 0);
	}

	public int getDeposit(){
		return this.deposit;
	}

	public int getChange(){
		return this.change;
	}
	
	public Drink getCoffee(){
		return this.coffee;
	}
	
	public Drink getJuice(){
		return this.juice;
	} 
	
	public Drink getSoda(){
		return this.soda;
	}

	public void setDrink(String drink, int newPrice, int newCount) {
		if (drink.equalsIgnoreCase(COFFEE)){
			this.coffee.setPrice(newPrice);
			this.coffee.setCount(newCount);
		} else if (drink.equalsIgnoreCase(JUICE)){
			this.juice.setPrice(newPrice);
			this.coffee.setCount(newCount);
		} else if (drink.equalsIgnoreCase(SODA)){
			this.soda.setPrice(newCount);
			this.soda.setCount(newCount);
		}
	}
}
