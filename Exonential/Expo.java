import java.util.Scanner;

class Expo

{
	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Base Value: ");
		int a = sc.nextInt();

		System.out.print("Enter the Power Value:  ");
		int p = sc.nextInt();

		int expo = 1;


		for (int i=1; i<= p ; i++ )

		{
			expo = expo * a;
		}
		
		System.out.println("Result of Given Value : "+expo);
	}
}
