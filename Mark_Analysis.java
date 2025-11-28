// sum of two numbers
import java.util.*;
public class Mark_Analysis{
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A : ");
        int g=s.nextInt();
        System.out.print("Enter B : ");
        int h=s.nextInt();
        System.out.println("Sum = "+sum(g,h));
        s.close();
    }
}

