package Weekly.R379;

//
public class Q1 {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int n = dimensions.length;
        double s = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            s = Math.max(s, Math.sqrt(dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1]));
        }
        for (int i = 0; i < n; i++) {
            if (s == Math.sqrt(dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1])) {
                ans = Math.max(ans, dimensions[i][1] * dimensions[i][0]);
            }
        }
        return ans;
    }
    
}
