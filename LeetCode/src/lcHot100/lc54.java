package lcHot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
public class lc54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l = 0;
        int t = 0;
        int b = matrix.length - 1;
        int r = matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();
        while (true) {
            //从左往右
            for (int i = l; i <= r; i++) {
                ans.add(matrix[t][i]);
            }
            if (++t > b) break;
            //从上往下
            for (int i = t; i <= b; i++) {
                ans.add(matrix[i][r]);
            }
            if (--r < l) break;
            //从右往左
            for (int i = r; i >= l; i--) {
                ans.add(matrix[b][i]);
            }
            if (--b < t) break;
            //从下往上
            for (int i = b; i >= t; i--) {
                ans.add(matrix[i][l]);
            }
            if (++l > r) break;
        }
        return ans;
    }
}
