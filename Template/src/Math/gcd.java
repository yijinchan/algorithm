package Math;

/**
 * 求最大公约数。最小公倍数乘以最大公约数等于两数乘积。
 */
public class gcd {
    private int gcd1(int a, int b) {
        return b == 0 ? a : gcd1(b, a % b);
    }
    public static void main(String[] args) {
        gcd gcd = new gcd();
        System.out.println(gcd.gcd1(12, 8));
    }
}
