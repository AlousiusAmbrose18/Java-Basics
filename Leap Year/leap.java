import java.util.Scanner;

class leap

{
	public static void main (String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");

		int a = sc.nextInt();

		if(a%400 == 0)

		{
			System.out.println("This is leap year");

		}

		else if(a%4==0 && a%100!=0)
		{
			System.out.println("This is leap year");

		}

		else
		{
			System.out.println("This is not leap year");
		}



	}




}
