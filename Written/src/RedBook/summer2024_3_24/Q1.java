package RedBook.summer2024_3_24;

import java.util.HashSet;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<String> set = new HashSet<>();
        while(n-- > 0){
            int len = set.size();
            String s = scan.next();
            set.add(s);
            if(len != set.size()){
                System.out.println(s);
            }
        }
    }
}
