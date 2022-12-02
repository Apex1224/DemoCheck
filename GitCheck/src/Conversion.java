import java.util.Scanner;
public class Conversion {
	public static void main(String [] args)
	{
		// Decimal to binary
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int a=sc.nextInt();
		System.out.println("Binary representation of a: ");
		String p=Integer.toBinaryString(a);
		int l=Integer.parseInt(p);
		System.out.println(l);
    	System.out.println(Integer.toBinaryString(a));
    	
    	// Binary to decimal
    	System.out.println("Enter a binary number:");
    	 String n=sc.nextLine();
      System.out.println(Integer.parseInt(n,2));
      System.out.print("Enter a binary number: ");
      String binaryString =sc.nextLine();
      System.out.println("Output: "+Integer.parseInt(binaryString,2));
	}

}
