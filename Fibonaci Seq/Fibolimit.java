import java.util.Scanner;  //Print Seq of with limited given values//
																	
						//if input is 10.it will print upto value 10 only

class Fibolimit
{
	public static void main(String[] args) 
	{
		
		int i,n;
		int a = 0, b = 1, c;
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the value find Fibo Seq : ");
		
		n = sc.nextInt();

		while (a<=n)
		{

			System.out.println(a);

			c = a + b;
			a = b;
			b = c;
		}

	}
}