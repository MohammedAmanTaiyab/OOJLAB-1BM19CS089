import java.io.*; 
import java.util.*;

public class Main {
    public static void main(String[] args){
        int n, j=0, k=0, sum=0, avg, max, min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n=s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.println("Enter the element of array:");
        for(int i = 0; i<n; i++){
            a[i] = s.nextInt();
        }
        for(int i=0; i<n; i++){
            if (a[i] % 2 ==0) {
                c[j] = a[i];
                sum += a[i];
                j++;
            } else {
                b[k] = a[i];
                k++;
            }
        }
        max = c[0];
        min = c[0];
        for(int i=0; i<j; i++){
            if (c[i] > max){
                max = c[i];
            }
            if (c[i] <min){
                min = c[i];
            }
        }
        System.out.println("Sum of even array is "+sum+", Average is "+(sum/j)+", Maximum is "+max+", Minimum is "+min);
    }
}
