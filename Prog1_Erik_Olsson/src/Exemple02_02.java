import java.util.Scanner;

public class Exemple02_02 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Skriv namn: ");
		String namn = input.nextLine();
		
		System.out.println("Skriv ålder: ");
		int ålder = input.nextInt();
		
		System.out.println("Skriv längd: ");
		double längd = input.nextDouble();
		
		System.out.println(namn+" är "+ålder+" år gammal och "+längd+"m lång.");
		
		System.out.println("Stämmer det?");

	}

}
