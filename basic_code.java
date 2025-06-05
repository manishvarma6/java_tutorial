import java.util.Scanner;

// Constant example
public class FinalVar
{
	final double PI = 3.14159;
	
	public static void main( String args[ ] )
	{
		double r = 10.0, a;
		a = PI * r * r;
		System.out.println("Area of Circle : " + a);
	}
}


public class Constant1
{
    final static int NUMBER_OF_MONTHS = 12;
	static final double PI = (double) 22 / 7;

	public static void main( String args[] )
	{
		System.out.println("NUMBER_OF_MONTHS : " + NUMBER_OF_MONTHS);
		System.out.println("PI : " + PI );
	}
}





// to find interest
// public class Interset {
//     public static void main(String args[]){
//         Scanner sr= new Scanner(System.in);
        
//         System.out.print("Enter Principle Amount :");
//         double p = sr.nextDouble();
//         System.out.print("Enter Interest rate :");
//         double r = sr.nextDouble();
//         System.out.print("Enter time/ period :");
//         double t = sr.nextDouble();
        
//         double i = (p*r*t)/100;
//         double total = p+i;
        
//         System.out.println("Interest amount: "+ String.format("%.2f"), i);
//         System.out.println("Total amount to pay: "+ total);
        
//     }
// }
//to convert ruppess into paisa
public class Rpaisa{
    public static void main(String arg[]){
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter amount in ruppes: ");
        double rs = sr.nextDouble();
        double paisa = rs*100;
        
        System.out.println("Rs " + String.format("%.2f", rs) + " is equal to " + (long)paisa + " Paisa"); 
        // System.out.println("Rs " + rs + " Into paisa "+ paisa);
        
    }
}
        

// add two integer
public class Addint{
    public static void main(String arg[]){
        int a, b, c;
        
        a= 20;
        b=21;
        c= a+b;
        System.out.println("Sum of "+a +" and " +b+ " is "+c);
    }
}

public class Myname{
    public static void main(String args[]){
        System.out.print("Hello World");
    }
}


