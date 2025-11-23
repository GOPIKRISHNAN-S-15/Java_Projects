import java.util.*;
class SelectionSort{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Elements : ");
        int l=s.nextInt();
        int r[]=new int[l];
        System.out.println("Enter the elements");
        for(int i=0;i<l;i++){
            r[i]=s.nextInt();
        }
        for(int i=0;i<l-1;i++){
            int min=i;
            for(int j=i+1;j<l;j++){
                if(r[j]<r[min]){
                    min=j;
                }
            }
            int temp=r[min];
            r[min]=r[i];
            r[i]=temp;
        }
        for(int i=0;i<l;i++){
            System.out.print(r[i]+" ");
        }
        s.close();
    }
}
