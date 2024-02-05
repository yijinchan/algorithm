package Weekly.R383;


public class Q2 {
    public int minimumTimeToInitialState(String word, int k) {
//        int ans = 0;
//        StringBuilder sb = new StringBuilder(word);
//        int n = sb.length();
//        StringBuilder temp = new StringBuilder(word);
//        //去除前k个，检查剩下n-k个，是不是sb的前n-k个，如果是，则返回ans，不是则ans++，继续去除前k个
//        while (temp.length() != 0) {
//            ans++;
//            for (int i = 0; i < k; i++) {
//                if(temp.length() > 0){
//                temp.deleteCharAt(0);
//                }
//            }
//            //判断temp是不是等于sb.substring(0, n - k)
//            if (temp.toString().equals(sb.substring(0, temp.length()))) {
//                break;
//            }
//        }
//        return ans;
        int ans = 0;
        StringBuilder sb = new StringBuilder(word);
        StringBuilder temp = new StringBuilder(word);

        while (temp.length() > 0) {
            ans++;
            temp.delete(0, Math.min(k, temp.length()));

            if (temp.toString().equals(sb.substring(0, temp.length()))) {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        String word = "abacaba";
        int k = 3;
        System.out.println(q2.minimumTimeToInitialState(word, k));
    }
}

