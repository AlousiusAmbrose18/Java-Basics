import java.util.Scanner;
class NOD 
{

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int n = sc.nextInt();

		int i =0;

		while (n > 0)
		{
			n = n / 10;

			i++;
			
		}



		System.out.println("Number of Digits : "+i);
	}
}
