import java.util.Scanner;
class LCM

{
	public static void main(String [] args)

	{
		int a, b; 
		int n ;
		int x =0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two Number");


		a = sc.nextInt();
		b = sc.nextInt();

		n = a>b ? a : b;

		while(true)

		{
			if (n%a ==0 && n%b == 0)break;
			
			n = n+x ;

		}
			System.out.println("LCM "+n);

	}

}