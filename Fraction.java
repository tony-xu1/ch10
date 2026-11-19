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
	
	public void reduce(){
		int GCF = GCF(numerator, denominator);
		numerator = numerator/GCF;
		denominator = denominator/GCF;
	}
	
	//static methods
	public static Fraction multiply(Fraction f1, Fraction f2){
		Fraction f = new Fraction();
		f.numerator = f1.numerator * f2.numerator;
		f.denominator = f1.denominator * f2.denominator;
		f.reduce();
		return f;
	}
	
	public static Fraction divide(Fraction f1, Fraction f2){
		Fraction f = new Fraction();
		f.numerator = f1.numerator * f2.denominator;
		f.denominator = f1.denominator * f2.numerator;
		f.reduce();
		return f;
	}
	
	public static Fraction add(Fraction f1, Fraction f2){
		Fraction f = new Fraction();
		f.numerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
		f.denominator = f1.denominator * f2.denominator;
		f.reduce();
		return f;
	}
	
	public static Fraction subtract(Fraction f1, Fraction f2){
		Fraction f = new Fraction();
		f.numerator = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
		f.denominator = f1.denominator * f2.denominator;
		f.reduce();
		return f;
	}
	
	//helper methods
	public int GCF (int n, int m){
		while(n != m){
			if (n > m){
				n = n - m;
			} else{
				m = m - n;
			}
		}
		return n;
	}
}
