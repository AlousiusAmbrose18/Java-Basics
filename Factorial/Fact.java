import java.util.Scanner;

class Fact
  
{
	public static void main(String[] args) 
	{
		int i,n;
		int fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to find Factorial: ");

		n = sc.nextInt();

		for (i=1 ; i<=n ; i++ )
		{
			fact = fact * i;

			
		}
			System.out.println("Factorial of "+n+" is : "+fact);
		
	}
}
