package Weekly.R379;

public class Q2 {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        //1.同一行
        if (a == c && c == e) {
            if ((b < d && d < f) || (d > f && b > d)) {
                if (Math.abs(f - d) % 2 == 0) {
                    return 2;
                }
                return 3;
            } else {
                return 1;
            }
        }
        //2.同一列
        if (b == d && d == f) {
            if ((a < c && c < e) || (a > c && c > e)) {
                if (Math.abs(e - c) % 2 == 0) {
                    return 2;
                }
                return 3;
            } else {
                return 1;
            }
        }
        //3.不同行，不同列
        if (a == e || b == f) {
            return 1;
        }
        //车不在皇与象的对角线中间，1
        if (Math.abs(a - e) != Math.abs(b - f)) {
            return 2;
        }
        //车在皇与象的对角线中间，2
        return 3;
    }
}
