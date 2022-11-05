import java.util.Scanner;
class  pali
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		int rev =0;
		System.out.println("Enter the Value : ");

		int n = sc.nextInt();

		int n1=n;
		int d = 0;

		while (n != 0)
		
		{
			d = n % 10;

			rev = (rev *10) + d;

			n = n/10;
		}

		if(n1 == rev)

			System.out.println("Number is Palindrome... " );

		else

			System.out.println("Number not Palindrome !!!" );


	}
}
