import java.util.Scanner;

public class Trekant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Indtast sidelængden a: ");
		double a = scanner.nextInt();
		System.out.println("Indtast sidelængden b: ");
		double b = scanner.nextInt();
		System.out.println("Indtast sidelængden c: ");
		double c = scanner.nextInt();
		double cosa,cosb,cosc;
		cosa = (Math.pow(b, 2)+ Math.pow(c, 2)- Math.pow(a, 2)) / (2* b * c);
		cosb = (Math.pow(a, 2)+ Math.pow(c, 2)- Math.pow(b, 2)) / (2* a* c);
		cosc = (Math.pow(a, 2)+ Math.pow(b, 2)- Math.pow(c, 2)) / (2* a* b);


		double cosa1 = Math.toDegrees(Math.acos(cosa));
		double cosb1 = Math.toDegrees(Math.acos(cosb));
		double cosc1 = Math.toDegrees(Math.acos(cosc));

		if (a==b && b==c){
			System.out.println("Trekanten er ligesidet");
			return;
		}else if(a==0 || b == 0 || c==0 || a+b< c){
			System.out.println("Noget er galt!");
			return;
		}else if (a==b & c>a || a==c && b>c || b==c && a>c){
			System.out.println("Trekanten er ligebenet");
			return;
		}else if (Math.pow(a, 2)+ Math.pow(b, 2)== Math.pow(c, 2)|| Math.pow(a, 2)+ Math.pow(c, 2)== Math.pow(b, 2) || Math.pow(b, 2)+ Math.pow(c, 2)== Math.pow(a, 2)){
			System.out.println("Trekanten er retvinklet");	
			return;
		}else if( cosa1 > 90 && cosa1 + cosb1 + cosc1  == 180 || cosb1 > 90 && cosa1 + cosb1 + cosc1  == 180 || 
				cosc1 > 90 && cosa1 + cosb1 + cosc1  == 180)
		{
			System.out.println("Trekanten er stump");
			return;
		}
		else if(cosa1 + cosb1 + cosc1  <= 180){
			System.out.println("Trekanten er spids");
			return;
		}else{
			System.out.println("Noget er galt!");
		}


	}

}

