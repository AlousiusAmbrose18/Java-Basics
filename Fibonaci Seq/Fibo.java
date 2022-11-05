import java.util.Scanner;  //Print Seq of n numbers

class Fibo
{
	public static void main(String[] args) 
	{
		
		int i,n;
		int a = 0, b = 1, c;
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the value find Fibo Seq : ");
		
		n = sc.nextInt();

		

		for (i=0; i<=n ; i++ )
		{

			System.out.println(a);

			c = a + b;
			a = b;
			b = c;
		}

	}
}