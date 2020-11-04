import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i;
		int positiveCount = 0, negativeCount = 0, zerocount = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] > 0)
			{
				positiveCount++;
			}
			else if (a[i] == 0) 
			{
			    zerocount++;
			}
			else
			{
				negativeCount++;
			}
		}		
		System.out.println("\n Total Number of Positive Numbers in this Array = " + positiveCount);
		System.out.println("\n Total Number of Negative Numbers in this Array = " + negativeCount);
		System.out.println("\n Total Number of Zero's in this Array = " + zerocount);
	}
}