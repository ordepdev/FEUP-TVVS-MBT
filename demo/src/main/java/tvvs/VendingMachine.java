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
	
	public VendingMachine(){
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

	public void setDrink(String drink, int newPrice, int newCount){
		if (drink.equalsIgnoreCase(COFFEE)){
			this.coffee.setPrice(newPrice);
			this.coffee.setCount(newCount);
		} else if (drink.equalsIgnoreCase(JUICE)){
			this.juice.setPrice(newPrice);
			this.juice.setCount(newCount);
		} else if (drink.equalsIgnoreCase(SODA)){
			this.soda.setPrice(newPrice);
			this.soda.setCount(newCount);
		}
	}
		
	private void calculateChange(int price) {
		this.change = this.deposit - price;
		this.deposit = 0;
	}

	public void insertCoin(Coin coin){
		this.deposit += coin.value();
	}

	public void returnCoins(){
		this.deposit = 0 ;
	}

	public boolean purchase(String drink) {
		if (drink.equalsIgnoreCase(COFFEE)) {
			if (this.coffee.getCount() > 0 && this.deposit >= this.coffee.getPrice()) {
				this.coffee.sell();
				calculateChange(this.coffee.getPrice());
				return true;
			}
		} else if (drink.equalsIgnoreCase(JUICE)){
			if (this.juice.getCount() > 0 && this.deposit >= this.juice.getPrice()) {
				this.juice.sell();
				calculateChange(this.juice.getPrice());
				return true;
			}
		} else if (drink.equalsIgnoreCase(SODA)){
			if (this.soda.getCount() > 0 && this.deposit >= this.soda.getPrice()) {
				this.soda.sell();
				calculateChange(this.soda.getPrice());
				return true;
			}
		}
		return false;
	}
}
