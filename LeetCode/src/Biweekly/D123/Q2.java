package Biweekly.D123;

import java.util.Arrays;

public class Q2 {
    public int numberOfPairs(int[][] points) {
        //将points排序，先横坐标按照从小到大的顺序，然后当横坐标相同时，纵坐标按照从大到小的顺序，使用java8新特性
        Arrays.sort(points, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int ans = 0;
        for (int i = 0; i < points.length; i++) {
            int maxY = Integer.MIN_VALUE;
            int y0 = points[i][1];
            for (int j = i + 1; j < points.length; j++) {
                int y1 = points[j][1];
                if(y1 <= y0 && y1 > maxY) {
                    ans++;
                    maxY = y1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        int[][] points = {{1,1},{2,2},{3,3}};
        System.out.println(q2.numberOfPairs(points));
    }
}
