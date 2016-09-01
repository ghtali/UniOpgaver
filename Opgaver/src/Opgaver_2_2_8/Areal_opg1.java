package Opgaver_2_2_8;

import java.util.Scanner;
public class Areal_opg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Det kan skrives på 2 metoder 
		// først som konstante variabler:
		System.out.println("Et rektangel har længde 4 og bredde 5");
		System.out.println("Formlen : Længde*Bredde");
		int l = 4; // længden er defineret 
		int b = 5; // bredde er defineret
		System.out.println("Arealet af rektanglet " +l*b );
		
		
		
		System.out.println("--------------------");
		
		// metode 2 vi indsætter de ønskede værdi ind i inputtet
		Scanner scanner = new Scanner(System.in);
		System.out.println("indsæt længde : ");
		double laengde = scanner.nextDouble();
		System.out.println("indsæt bredde : ");
		double bredde = scanner.nextDouble();
		double areal = laengde*bredde;
		System.out.println("Arealet af rektanglet er :"+areal);		
	}

}
