import java.util.Scanner;
class employee{
	int empid;
	String empname;
	float empnohrs,empbasic,emphra,empda,empit,empgross;
	void getDetails()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter id : ");
		empid = scr.nextInt();
		System.out.println("Enter name : ");
		empname = scr.next();
		System.out.println("Enter no. of hours  : ");
		empnohrs = scr.nextFloat();
		System.out.println("Enter basic salary : ");
		empbasic = scr.nextFloat();
		System.out.println("Enter hra : ");
		emphra = scr.nextFloat();
		System.out.println("Enter da : ");
		empda = scr.nextFloat();
		System.out.println("Enter it : ");
		empit = scr.nextFloat();
	}
	void gross()
	{
		empgross = empbasic*(1+(emphra/100)+(empda/100)-(empit/100));
		empgross += (empnohrs-200)*100;
	}
	void display()
	{
		System.out.println("ID : "+empid+"\nName : "+empname+"\nGross : "+empgross);
	}
}
public class emplyeem {
	public static void main(String args[])
	{
		employee e = new employee();
		e.getDetails();
		e.gross();
		e.display();
	}
}
