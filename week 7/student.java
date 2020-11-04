import java.util.Scanner;
class Student{
	String name;
	String usn;
	int sem;
}
class Test extends Student{
	float []cie=new float[5];
	int []credits=new int[5];
}
class Exam extends Test{
	float[]see=new float[5];
}
class Result extends Exam{
	float res=0;
	void getData(int n)
	{	Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Student name,usn and sem:");
			name=sc.next();
			usn=sc.next();
			sem=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter CIE and SEE marks of sub"+(i+1)+":");
			cie[i]=sc.nextFloat();
			see[i]=sc.nextFloat();
			System.out.println("Enter credits of sub"+(i+1)+":");
			credits[i]=sc.nextInt();
		}
	}
	void calc()
	{
		float total=0;
		for(int i=0;i<5;i++)
		{
			res=res+grade(cie[i]+see[i])*credits[i];
			total=total+credits[i];
		}
		res=res/total;

	}
	float grade(float t)
	{
		if(t>=90)return 10;
		if(t>=80)return 9;
		if(t>=70)return 8;
		if(t>=60)return 7;
		if(t>=50)return 5;
		if(t>=40)return 4;
		return 3;
	}
	void display(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Name :"+name+"\nUSN:"+usn+"\nSem:"+sem+"\nCGPA:"+res);
		}

	}
}
public class StudentM{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=sc.nextInt();
		Student[]s=new Student[n];
		Test[]t=new Test[n];
		Exam[]e=new Exam[n];
		Result[]r=new Result[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			t[i]=new Test();
			e[i]=new Exam();
			r[i]=new Result();
			r[i].getData(n);
			r[i].calc();
			r[i].display(n);
		}
	}
}