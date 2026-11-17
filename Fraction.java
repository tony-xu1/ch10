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
		} else System.out.println("Denominator cannot be 0");
	}
	
	public Fraction(String str){
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == '/'){
				numerator = Integer.parseInt(str.substring(0, i));
				denominator = Integer.parseInt(str.substring(i+1));
			}
		}
	}
	//behaviour methods
	
	
}
