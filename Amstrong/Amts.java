import java.util.Scanner;
import java.lang.Math;
class Amts
{

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int n = sc.nextInt();

		int n1 = n;
		int n2 =n;

		int i=0;
		double m =0;
		double amt = 0;

		while (n1>0)
		
		{
			n1 = n1/10;
			i++;
		}

		System.out.println(i);

		while (n2 > 0)

		{
			m = n2 % 10;


			n2 = n2 / 10;

			amt =(int) amt +  Math.pow(m, i);

			System.out.println(amt);


		} 
		
	if (n == amt)
	{
		System.out.println(n+" is Amstrong number");

	}

	else
		System.out.println(n+" is not Amstrong number");
	}
}
