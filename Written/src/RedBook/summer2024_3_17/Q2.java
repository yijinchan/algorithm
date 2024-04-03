package RedBook.summer2024_3_17;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>((a, b) -> b - a);
        HashSet<String> set = new HashSet<>();
        while (q-- > 0) {
            set.add(scan.next());
        }
        while (n-- > 0) {
            String name = scan.next();
            int len = scan.nextInt();
            int cnt = 0;
            while (len-- > 0) {
                String s = scan.next();
                if (set.contains(s)) {
                    cnt++;
                }
            }
            treeMap.putIfAbsent(cnt, new ArrayList<>());
            treeMap.get(cnt).add(name);
        }
        //输出treeMap中的所有值，按照key降序输出，如果key相同，按照加入的顺序输出
        for (List<String> names : treeMap.values()) {
            for (String name : names){
                System.out.println(name);
            }
        }
    }
}
