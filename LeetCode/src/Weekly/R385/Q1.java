package Weekly.R385;

public class Q1 {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i = 0;i < words.length;i++){
            for(int j = i + 1;j < words.length;j++){
                if(words[i].length() > words[j].length()) continue;
                if(check(words[i],words[j])){
                    ans++;
                }
            }
        }
        return ans;
    }
    private boolean check(String a,String b){
        for(int i = 0;i < a.length();i++){
            if(a.charAt(i) != b.charAt(i)) return false;
        }
        //比较后缀
        for(int i = 0;i < a.length();i++){
            if(a.charAt(a.length() - 1 - i) != b.charAt(b.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        String[] words = {"a","abb"};
        System.out.println(q1.countPrefixSuffixPairs(words));
    }
}
