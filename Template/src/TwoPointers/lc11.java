package TwoPointers;

public class lc11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0,r = n - 1;
        int ans = 0;
        while(l < r){
            int h = Math.min(height[l],height[r]);
            ans = Math.max(ans,h * (r - l - 1));
            if(h == height[l]){
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        lc11 lc111 = new lc11();
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(lc111.maxArea(height));
    }
}
