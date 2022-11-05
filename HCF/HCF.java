import java.util.Scanner;
class HCF
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b,i;

		System.out.println("Enter two values to Find HCF or GDC : ");

		a = sc.nextInt();
		b = sc.nextInt();

		int hcf1 =0 ; 
		
		for (i=1;i<=a && i<b ;i++ )

			{

				 if ( a % i == 0 && b % i == 0  )
						
				{
					hcf1 = i;
						
					
				}
					
			}
			System.out.println("HCF OF TWO NUMBEERS : "+hcf1);

	}
}
