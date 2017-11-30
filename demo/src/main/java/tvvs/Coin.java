package tvvs;

public class Coin {
	
    public static final Coin NICKEL = new Coin("Nickel", 5);
    public static final Coin DIME = new Coin("Dime", 10);
    public static final Coin QUARTER = new Coin("Quarter", 25);
    public static final Coin DOLLAR = new Coin("Dollar", 100);

    private final String name;
    private final int value;

    public Coin(String name, int value) {
    	this.name = name;
    	this.value = value; 
    }    
    
    public String name() { 
    	return this.name;
    }

    public int value() { 
    	return this.value;
    }
    
    public String toString(){
    	return this.name + "[" + value + "]";
    }
}