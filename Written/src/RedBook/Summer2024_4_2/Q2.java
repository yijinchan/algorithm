package RedBook.Summer2024_4_2;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>((a, b) -> b - a);
        Set<String> set = new HashSet<>();
        while (q-- > 0) {
            set.add(scan.next());
        }
        while (n-- > 0) {
            String name = scan.next();
            int c = scan.nextInt();
            int cnt = 0;
            while (c-- > 0) {
                if (set.contains(scan.next())) {
                    cnt++;
                }
            }
            treeMap.putIfAbsent(cnt, new ArrayList<>());
            treeMap.get(cnt).add(name);
        }
        for (List<String> names : treeMap.values()) {
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
