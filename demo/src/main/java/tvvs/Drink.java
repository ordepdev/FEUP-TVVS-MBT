package tvvs;

public class Drink {
	
	private String name;
	private int price;
	private int count;
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return this.name;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public void setPrice(int newPrice) {
		if (newPrice > 0) {
			this.price = newPrice;
		}
	}

	public int getCount(){
		return this.count;
	}

	public void setCount(int newCount) {
		if (newCount > 0) {
			this.count = newCount;
		}
	}
	
	public void sell() {
		this.count++;
	}
	
	public String toString() {
		return this.name + "[" + this.count + "]: " + this.price + " cents";
	}
}
