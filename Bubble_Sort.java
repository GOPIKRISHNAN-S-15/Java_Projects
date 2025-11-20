import java.util.*;
public class Bubble_Sort{
    public static void main(String[] args){
       int n,temp;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Length : ");
       n=sc.nextInt();
       int []a = new int[n];
       System.out.print("Enter Elements : ");
       for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
       }
       System.out.print("Original Array: ");
       for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n-i-1;j++){
               if(a[j]>a[j+1]){
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
            }
           }
       }
       System.out.print("\nSorted Array (Ascending): ");
       for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n-i-1;j++){
               if(a[j]<a[j+1]){
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
            }
           }
       }
       System.out.print("\nSorted Array (Descending): ");
       for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
       }
    }
}
