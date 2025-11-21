import java.util.Scanner;
public class GCD {
    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        int result = findGCD(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + result);
        sc.close();
    }
}
