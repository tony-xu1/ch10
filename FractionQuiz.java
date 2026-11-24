import java.util.Scanner;
public class FractionQuiz{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!\n");
		System.out.println();
		String input = "";
		int questions = 0;
		int right = 0;
		
		while (!input.equals("quit")){
			Fraction f1 = new Fraction();
			Fraction f2 = new Fraction();
			Fraction ans;
			
			int operation = (int) (Math.random() * 4);
			
			if (operation == 0){
				System.out.print(f1 + " + " + f2 + " = ");
				ans = Fraction.add(f1, f2);
			} else if (operation == 1){
				System.out.print(f1 + " - " + f2 + " = ");
				ans = Fraction.subtract(f1, f2);
			} else if (operation == 2){
				System.out.print(f1 + " * " + f2 + " = ");
				ans = Fraction.multiply(f1, f2);
			} else {
				System.out.print(f1 + " / " + f2 + " = ");
				ans = Fraction.divide(f1, f2);
			}
			
			input = in.nextLine();
			
			if (!input.equals("quit")){
				Fraction user = new Fraction(input);
				if (equals(user, ans)){
					System.out.println("Correct!");
					System.out.println();
					right++;
					questions++;
				} else {
					System.out.println("Wrong, the answer was " + ans);
					System.out.println();
					questions++;
				}
			}
		}
		System.out.println("You answered " + right + "/" + questions + " correctly, for a score of " + right/questions + " percent!");
	
	}
	public static boolean equals (Fraction f1, Fraction f2){
		if (f1.getNum() == f2.getNum() && f1.getDem() == f2.getDem()){
			return true;
		} else return false;
	}
}
