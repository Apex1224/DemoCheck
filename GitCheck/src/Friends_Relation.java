import java.util.Scanner;
public class Friends_Relation {
	public static void main(String [] args)
	{
		int m=0,n=0,z=0,s=0,d=2,h=0,g=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int a = sc.nextInt();
		int b[]=new int [a];
		int l[]=new int [a];
		System.out.println("Enter the lines");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
			l[i]=((b[i]*2)-2);
			
		
		}
		while (h < a)
		{
		for(int f=0;f<b[m];f++)
		{
			
			for(int j=0;j<=f;j++)
			{
				System.out.print("#");
			}
			
			  for(int k=f+1;k<(l[m]+g);k++)
				{
					System.out.print("*");
				}
			  l[m]=l[m]-2;
			  g++;
			  System.out.println();
			  
		}
		h++;
		m++;
	}
	}

}
