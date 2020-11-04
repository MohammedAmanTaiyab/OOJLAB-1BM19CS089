import java.io.*; 
import java.util.*;
  
class Main { 
    public static void main(String args[]) 
    {   Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            arr[i] = s.nextInt();
        }
       
        int even = 0, odd = 0; 
  
        
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 == 0) 
                even += arr[i]; 
            else
                odd += arr[i]; 
        } 
        System.out.println(Arrays.toString(arr));
        System.out.println("Even index positions sum: " + even); 
        System.out.println("Odd index positions sum: " + odd); 
    } 
} 
