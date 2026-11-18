public class Fraction{
	// instance variables (attributes or field)
	private int numerator;
	private int denominator;
	// construtor
	public Fraction() { //default
		numerator = 1;
		denominator = 2;
	}
	
	public Fraction(int n, int d){
		numerator = n;
		if (d != 0){
			denominator = d;
		} else System.out.println("Error: Denominator cannot be 0.");
	}
	
	public Fraction(String str){
		int i = str.indexOf("/");
			numerator = Integer.parseInt(str.substring(0, i));
		if (!str.substring(i+1).equals("0")){
			denominator = Integer.parseInt(str.substring(i+1));
		} else System.out.println("Error: Denominator cannot be 0.");
	}
	
	public Fraction(Fraction f){
		numerator = f.numerator;
		denominator = f.denominator;
	}
	//behaviour methods
	//accessors
	public int getNum(){
		return numerator;
	}
	
	public int getDem(){
		return denominator;
	}
	
	public String toString(){
		return numerator + "/" + denominator;
	}
	
	public double toDouble(){
		return ((double)numerator)/((double) denominator);
	}
	
	//mutator
	public void setNum(int n){
		numerator = n;
	}
	
	public void setDen(int d){
		if (d != 0){
			denominator = d;
		} else System.out.println("Error: Denominator cannot be 0.");
	}
}
