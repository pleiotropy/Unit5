public class CoinGame {
    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played
    private int roundTracker = 1; // *** ADDED TO ENABLE TESTING ***

    public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }


    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
     * NOTE: THIS CODE WAS NOT PROVIDED IN THE FRQ ("implementation not shown")
     *       BUT IS INCLUDED HERE TO ENABLE TESTING
     */
    public int getPlayer1Move()
    {
        int result;
        if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
            result = 2;
        } else if (roundTracker == 3) {
            result = 1;
        } else {
            result = 3;
        }
        roundTracker++;
        return result;
    }


    /** Returns the number of coins (1, 2, or 3) that player 2 will spend,
     * as described in part (a).
     */
    public int getPlayer2Move(int round) {
        if (round % 3 == 0) {
            return 3;
        }
        else if (round % 2 == 0) {
            return 2;
        }
        else {
            return 1;
        }
    }


    /** Plays a simulated game between two players, as described in part
     * (b).
     */
    public void playGame() {
        // variables
        int p1Coin = startingCoins;
        int p2Coin = startingCoins;
        int round = 1;
        int p1Change, p2Change;

        // while loop (both players have at least 3 coins, and rounds > 0)
        while (p1Coin >= 3 && p2Coin >= 3 && round <= maxRounds) {
            // player 1 spends
            int p1Spend = getPlayer1Move();

            // player 2 spends
            int p2Spend = getPlayer2Move(round);

//            System.out.println("==============================");
//            System.out.println("Round #: " + round);
//            System.out.println("p1Spend: " + p1Spend);
//            System.out.println("p2Spend: " + p2Spend);

            // compare p1 and p2
            int diff = Math.abs(p1Spend - p2Spend);
//            System.out.println("difference: " + diff);

            // if the same -- math.abs() p1-p2 == 0
            // p1Change = 0
            // p2Change = 1
            // if diff = 1 -- math.abs() p1-p2 == 1
            // p1Change = 0
            // p2Change = 1
            // if diff = 2 -- math.abs() p1-p2 == 2
            // p1Change = 2
            // p2Change = 0

            if (diff == 0 || diff == 1) {
                p1Change = 0;
                p2Change = 1;
            }
            else {
                p1Change = 2;
                p2Change = 0;
            }

            // compute p1coin and p2coin
//            System.out.println("p1Coin calculation: " + p1Coin + " - " + p1Spend + " + " + p1Change);
            p1Coin = p1Coin - p1Spend + p1Change;
//            System.out.println("p1Coin is now: " + p1Coin);

//            System.out.println("p2Coin calculation: " + p2Coin + " - " + p2Spend + " + " + p2Change);
            p2Coin = p2Coin - p2Spend + p2Change;
//            System.out.println("p2Coin is now: " + p2Coin);

            // maxRounds--
            round++;
        }

        // when game is over, determine winner
        // if p1coin == p2coin -> print "tie game"
        // if p1coin > p2coin -> print "player 1 wins"
        // if p2coin > p1coin -> print "player 2 wins"
        if (p1Coin == p2Coin) {
            System.out.println("tie game");
        }
        else if (p1Coin > p2Coin) {
            System.out.println("player 1 wins");
        }
        else {
            System.out.println("player 2 wins");
        }
    }
}

