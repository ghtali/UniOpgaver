package Opgaver_2_2_8;

import java.util.Scanner;
public class Areal_opg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Det kan skrives p� 2 metoder 
		// f�rst som konstante variabler:
		System.out.println("Et rektangel har l�ngde 4 og bredde 5");
		System.out.println("Formlen : L�ngde*Bredde");
		int l = 4; // l�ngden er defineret 
		int b = 5; // bredde er defineret
		System.out.println("Arealet af rektanglet " +l*b );
		
		System.out.println("Test 21");
		
		
		System.out.println("--------------------");
		
		// metode 2 vi inds�tter de �nskede v�rdi ind i inputtet
		Scanner scanner = new Scanner(System.in);
		System.out.println("inds�t l�ngde : ");
		double laengde = scanner.nextDouble();
		System.out.println("inds�t bredde : ");
		double bredde = scanner.nextDouble();
		double areal = laengde*bredde;
		System.out.println("Arealet af rektanglet er :"+areal);		
	}

}
