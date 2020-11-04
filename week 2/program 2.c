#include <stdio.h>

int main ()
{
  int marks1, marks2;
  printf ("enter the CIE marks:");
  scanf ("%d", &marks1);
  printf ("enter the SEE marks:");
  scanf ("%d", &marks2);
  if (marks1 < 20)
    printf ("grade is f ");
  else if (marks2 >= 90)
    printf ("grade is A ");
  else if (marks2 >= 80)
    printf ("grade is B ");
    else if (marks2 >= 70)
    printf ("grade is C");
    else if (marks2 >= 60)
    printf ("grade is D ");
    else if (marks2 >= 40)
    printf ("grade is E ");
    else 
    printf("grade is F");
}