import java.util.*;
class Matrix_Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int g[][]=new int[3][3];
    int h[][]=new int[3][3];
    int sum[][]=new int[3][3];
    System.out.println("Enter the elements of A");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            int l=sc.nextInt();
            g[i][j]=l;
        }
    }
    System.out.println("Enter the elements of B");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            int k=sc.nextInt();
            h[i][j]=k;
        }
    }
    System.out.println("Sum of two matrix is:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
             sum[i][j]=g[i][j]+h[i][j];
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           System.out.print(sum[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
    }
}
