/* Perfect Numbers:

	<<Sum of Factors of Number is Same as given Number>> 1st 5 Perfect Numbers (6,28,496,8128, 33550336)

	ex1:
		28 - Factors : 1, 2, 4, 7, 14 ;

		Sum of factors : 28

		*/
	    




import java.util.Scanner;

class PerNum

{
	public static void main(String[] args)

	{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("");
	System.out.print("Enter the Number : ");

	int per = sc.nextInt();

	int pertemp = per;

	int perNum = 0;

	int z; 

	for (z=1 ; z<=per/2 ; z++ )
	
	{
		if (per%z==0)
		
		{
			perNum = perNum + z;

			System.out.println(" sum of factors: "+perNum);
		}

	}


	if (per==perNum)

	{
		System.out.println(perNum+" is Perfect Number ***");
	}

	else
		System.out.println(perNum+" is Not Perfect Number !!!");



	}
}
