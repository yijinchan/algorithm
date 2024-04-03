package Weekly.R391;

public class Q1 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        if (n == 1) {
            return x;
        } else if (n == 2) {
            int sum = s.charAt(0) - '0' + s.charAt(1) - '0';
            if (x % sum == 0) {
                return sum;
            } else {
                return -1;
            }
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        System.out.println(q1.sumOfTheDigitsOfHarshadNumber(18));
    }
}
