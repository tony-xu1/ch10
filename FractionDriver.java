public class FractionDriver{
	public static void main (String[] args){
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(1, 2);
		Fraction f3 = new Fraction("100/23");
		Fraction f4 = new Fraction(f2);
		Fraction sum = Fraction.add(f2, f1);
		
		System.out.println(f2);
		System.out.println(sum);
	}
}
