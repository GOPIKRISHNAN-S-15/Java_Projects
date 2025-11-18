import java.util.*;
public class Pangram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String str = sc.nextLine().toLowerCase();
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(ch>= 'a' && ch <= 'z'){
                set.add(ch);
            }
        }
        if(set.size()==26){
            System.out.println("This is a pangram.");
        }
        else{
             System.out.println("This is not a pangram.");
        }
        sc.close();
    }
}
