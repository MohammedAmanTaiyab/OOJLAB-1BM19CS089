import java.util.Scanner;
class Age
{
    int years;
    int months;
}
public class Agem
{
    public static void main(String args[])
    {
        Age p1=new Age();
        Age p2=new Age();
        System.out.println("Enter age of 1st Person :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter years:");
        p1.years=sc.nextInt();
        System.out.println("Enter Months:");
        p1.months=sc.nextInt();
        
        System.out.println("Enter age of 2nd Person :");
        System.out.println("Enter years:");
        p2.years=sc.nextInt();
        System.out.println("Enter Months:");
        p2.months=sc.nextInt();
        
        if(p1.years*12+p1.months>p2.years*12+p2.months)
        {
            System.out.println("1st person is older");
        }
        else
        {
            System.out.println("2nd person is older");
        }
        
        
    }
}