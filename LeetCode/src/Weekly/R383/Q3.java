package Weekly.R383;

public class Q3 {
    public int[][] resultGrid(int[][] image, int threshold) {
        int n = image.length;
        int m = image[0].length;
        int[][] ans = new int[n][m];
        int[][] cnt = new int[n][m];
        for (int i = 2; i < n; i++) {
            next:
            for (int j = 2; j < m; j++) {
                //检查左右相邻格子
                for (int x = i - 2; x <= i; x++) {
                    if (Math.abs(image[x][j - 2] - image[x][j - 1]) > threshold || Math.abs(image[x][j - 1] - image[x][j]) > threshold) {
                        continue next;
                    }
                }
                //检查上下相邻格子
                for (int y = j - 2; y <= j; y++) {
                    if (Math.abs(image[i - 2][y] - image[i - 1][y]) > threshold || Math.abs(image[i - 1][y] - image[i][y]) > threshold) {
                        continue next;
                    }
                }
                int avg = 0;
                for (int k = i - 2; k <= i; k++) {
                    for (int l = j - 2; l <= j; l++) {
                        avg += image[k][l]; //计算平均值
                    }
                }
                avg /= 9;
                //更新ans数组
                for (int k = i - 2; k <= i; k++) {
                    for (int l = j - 2; l <= j; l++) {
                        ans[k][l] += avg;
                        cnt[k][l]++;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (cnt[i][j] != 0) {
                    ans[i][j] /= cnt[i][j];
                } else {
                    ans[i][j] = image[i][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        int[][] image = {{10, 20, 30}, {15, 25, 35}, {20, 30, 40}, {25, 35, 45}};
        int threshold = 12;
        int[][] ans = q3.resultGrid(image, threshold);
        for (int[] an : ans) {
            for (int i : an) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
