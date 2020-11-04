import java.util.*;

class market
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of items");
		int n = sn.nextInt();
		double[] cost = new double[n];
		int[] q = new int[n];
		for(int i=0; i<n;i++)
		{
			System.out.println("Enter the cost of item "+(i+1));
			cost[i] = sn.nextDouble();
			System.out.println("Enter the quantity of the item");
			q[i] = sn.nextInt();
		}
		double total = 0;
		for(int i=0;i<n;i++)
			total += q[i]*cost[i];
		if(total>= 10000)
			total -= 0.05*total;
		else if(total>=7500)
			total -= 0.03*total;
		else if(total>5000)
			total -= 0.02*total;
		System.out.println("The total bill amount is "+total);
	}
}

