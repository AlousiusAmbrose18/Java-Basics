import java.util.Scanner;

class SOD

{
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");

		int n = sc.nextInt();

		int d =0;
	




		
		while (n > 0)
		
		{
			d = d + (n % 10 );

			n = n / 10;


		}

		System.out.println("Sum of Digits : "+d);

	}
}