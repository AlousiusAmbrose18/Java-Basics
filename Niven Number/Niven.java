import java.util.Scanner;

class Niven

{

	public static void main (String [] args)
	{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the value : ");

	int n = sc.nextInt();

	int temp = n ;

	int sum = 0;

	int m, i;

	int niv = 0;

	while ( n != 0 )

	{
		m = n % 10;

		sum = sum + m;

		n = n / 10;
	}

	System.out.println("Sum of Given Number is : "+sum);

	if ( temp % sum == 0)

	{
		System.out.println(temp+" is Niven Number...");
	}

	else
		System.out.println(temp+" is Not Niven  Number...");

	}
}

