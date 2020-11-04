import java.util.Scanner;
public class transpose {

	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int m = scr.nextInt();
		System.out.println("Enter number of columns : ");
		int n = scr.nextInt();
		int mat[][]=new int[m][n];
		int m2[][]=new int[n][m];
		System.out.println("Enter elements of matrix : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=scr.nextInt();
				m2[j][i]=mat[i][j];
			}
		}
		
		System.out.println("Transpose of matrix : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
	}
}