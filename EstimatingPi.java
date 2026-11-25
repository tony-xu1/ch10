public class EstimatingPi{
	public static void main (String[] args){
		Fraction MILU = new Fraction(355, 113);
		final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
		int num = 3;
		int den = 1;
		Fraction estimate = new Fraction (num, den);
		
		while (Math.abs( Math.PI - estimate.toDouble()) >= EPSILON){
			if (estimate.toDouble() < Math.PI){
				num++;
			} else {
				den++;
			}
			estimate = new Fraction (num, den);
		}
		System.out.println(estimate);
	}
}
