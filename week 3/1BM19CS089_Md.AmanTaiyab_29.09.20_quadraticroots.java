import java.util.*;

public class Main
{


  public static void main (String[]args)
  {



    double root1, root2;

    Scanner in = new Scanner (System.in);


      System.out.println ("Enter value for a : ");

    double a = in.nextFloat ();

      System.out.println ("Enter value for b : ");

    double b = in.nextFloat ();

      System.out.println ("Enter value for c : ");

    double c = in.nextFloat ();



    double determinant = b * b - 4 * a * c;


    if (determinant > 0)
      {

	root1 = (-b + Math.sqrt (determinant)) / (2 * a);

	root2 = (-b - Math.sqrt (determinant)) / (2 * a);


	System.out.format ("root1 = %.2f and root2 = %.2f", root1, root2);

      }

    else if (determinant == 0)
      {

	root1 = root2 = -b / (2 * a);


	System.out.format ("root1 = root2 = %.2f;", root1);

      }

    else
      {

	double realPart = -b / (2 * a);

	double imaginaryPart = Math.sqrt (-determinant) / (2 * a);


	System.out.format ("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi",
			   realPart, imaginaryPart, realPart, imaginaryPart);

	System.
	  out.println ("----This quadratic equation has no real roots----");

      }
  }
}
