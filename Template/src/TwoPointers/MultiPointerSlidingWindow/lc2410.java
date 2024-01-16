package TwoPointers.MultiPointerSlidingWindow;

import java.util.Arrays;

public class lc2410 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n = players.length;
        int m = trainers.length;
        int l = 0, r = 0;
        int res = 0;
        while (l < n && r < m) {
            if (players[l] <= trainers[r]) {
                l++;
                res++;
            }
            r++;
        }
        return res;
    }
}
