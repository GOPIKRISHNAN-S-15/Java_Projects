import java.util.*;

class ArraySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");
        int g = s.nextInt();
        System.out.println("Enter elements of array:");
        int k[] = new int[g];
        for (int i = 0; i < g; i++) {
            k[i] = s.nextInt();
        }
        Arrays.sort(k);
        System.out.println("Sorted Array: " + Arrays.toString(k));
        System.out.print("Enter element to search: ");
        int key = s.nextInt();
        int res = Arrays.binarySearch(k, key);
        if (res >= 0) {
            System.out.println("Element found at index: " + res);
        } else {
            System.out.println("Element not found in the array.");
        }
        s.close();
    }
}
