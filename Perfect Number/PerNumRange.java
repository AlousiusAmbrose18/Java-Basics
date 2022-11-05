import java.util.Scanner;

class PerNumRange

{
	public static void main(String[] args)

	{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Number : ");

	int n = sc.nextInt();

	for (int i =1; i<=n ; i++ )
	
	{
		//System.out.println("input i value "+i);
		int perNum = 0;

		for (int j=1; j<i ; j++ )
		
		{
			if (i%j==0)
			{
				perNum += j;

				//System.out.println("value of perNum: "+perNum);
			}
		}

		if (perNum == i)
		
		{
			System.out.print(" "+i);
		}

	}




	}
}