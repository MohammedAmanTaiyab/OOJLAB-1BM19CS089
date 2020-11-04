import java.util.Scanner;
abstract class Player{
	String name;
	int no_match;
	float avg;
	abstract float cal_avg(String p_name,int no_m,int runs);
}
class batsman extends Player{
	int runs_taken;
	float cal_avg(String name,int no_match,int runs_taken)
	{
		return(runs_taken/no_match);
	}
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter batsman name:");
		name=sc.next();
		System.out.println("Enter number of matches played:");
		no_match=sc.nextInt();
		System.out.println("Enter total runs scored:");
		runs_taken=sc.nextInt();
	}

}
class bowler extends Player{
	int runs_given;
	float cal_avg(String name,int no_match,int runs_given)
	{
		return(runs_given/no_match);
	}
	void getData()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bowler name:");
		name=sc.next();
		System.out.println("Enter number of matches played:");
		no_match=sc.nextInt();
		System.out.println("Enter total runs given:");
		runs_given=sc.nextInt();
	}

}
public class PlayerMain{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,n,i;
		System.out.println("Enter number of batsman and bowlers:");
		m=sc.nextInt();
		n=sc.nextInt();
		Player[]p=new Player[m+n];
		batsman[]b=new batsman[m];
		bowler[]bow=new bowler[n];
		for(i=0;i<m;i++)
		{
			
			b[i]=new batsman();
			b[i].getData();
		}
		for(i=0;i<n;i++)
		{
		
			bow[i]=new bowler();
			bow[i].getData();
		}
		System.out.println("Batsmen:");
		for(i=0;i<m;i++)
		{
			System.out.println("Name:"+b[i].name+"\nAverage runs scored:"+b[i].cal_avg(b[i].name,b[i].no_match,b[i].runs_taken));
			System.out.println("-------");
		}
		System.out.println("\nBowlers:");
		for(i=0;i<m;i++)
		{
			System.out.println("Name:"+bow[i].name+"\nAverage runs given:"+bow[i].cal_avg(bow[i].name,bow[i].no_match,bow[i].runs_given));
			System.out.println("-------");
		}

	}
}
