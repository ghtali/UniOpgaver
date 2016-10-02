package Opgaver_04;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int count = new Scanner(System.in).nextInt();
        int n1=1,n2=1,n3,i;
        if (count == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n1);    
        System.out.println(n2);
        for(i=2;i<count;++i)   
        {    
            n3=n1+n2;    
            System.out.println(n3);    
            n1=n2;    
            n2=n3;    
 
        }
        return;

	}

}
