package Weekly.R391;

public class Q2 {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = 0;
        int bottlesDrunk = 0;
        while (numBottles != 0) {
            bottlesDrunk += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;
            while (emptyBottles >= numExchange){
                emptyBottles -= numExchange++;
                numBottles++;
            }
        }
        return bottlesDrunk;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        System.out.println(q2.maxBottlesDrunk(10,3));
    }
}
