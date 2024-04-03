package RedBook.Summer2024_4_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<String> set = new HashSet<>();
        while(n-- > 0){
            String s = scan.next();
            int len = set.size();
            set.add(s);
            if(len != set.size()){
                System.out.println(s);
            }
        }
    }
}
