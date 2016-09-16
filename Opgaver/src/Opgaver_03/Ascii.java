package Opgaver_03;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		while(true){
			String input = scanner.nextLine();
			
			char [] spec = {'#', '!', '+','\\'};
			char ch =input.charAt(0);
			
			if (input.toLowerCase().equals("exit")){
				return;
			}
			else if (Character.isLowerCase(ch)){
				System.out.println("Tegnet er et lille bogstav");
			}
			else if (Character.isUpperCase(ch)){
				System.out.println("Tegnet er et stort bogstav");
			}
			else if (Character.isDigit(ch)){
				System.out.println("Tegnet er et tal");
			}
			else if (ch == spec[0] || ch == spec[1] || ch == spec[2] || ch == spec[3]){
				System.out.println("Tegnet er et af de 4 specialtegn");
			}
			else  System.out.println("Tegnet er ikke kendt af dette program");
				
		}

	

	}

}
