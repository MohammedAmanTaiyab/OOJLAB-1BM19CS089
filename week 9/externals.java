package SEE;
import java.util.*;
import CIE.*;

public class Externals extends CIE.Student
{
   public double seem[];
   
   public void display()
   {
	   seem=new double[5];
	  Scanner s=new Scanner(System.in);
   System.out.println("SEE Marks for 5 subjects(out of 100):");
   for(int i=0;i<5;i++)
   seem[i]=s.nextDouble();
   }
}