package Opgaver_03;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String input = null;
		while (true){
		input = scanner.nextLine();
		if(input.length()<= 4){
			System.out.println("Password for kort");
		}else if(input.length()>= 9){
			System.out.println("Password for langt");
		}else{System.out.println("Password tilpas");break;}
		}
		scanner.close();
		
		

	}

}
