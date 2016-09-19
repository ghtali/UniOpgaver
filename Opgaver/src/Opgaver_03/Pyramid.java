package Opgaver_03;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,t,c,n;
        Scanner scanner =new Scanner(System.in);
        n=scanner.nextInt();
        t = n;
        System.out.println("Pyramid "+n);
        for ( r = 1 ; r <= n ; r++ )//for-loop til pyramider. 
           {
              for ( c = 1 ; c < t ; c++ )
                System.out.print(" ");//for-loop til  antal mellemrum.

              t--;

              for ( c = 1 ; c <= 2*r - 1 ; c++ )
            	  
                  System.out.print("#");

              System.out.println("");
           }
        scanner.close();
        
    }

}