import java.util.Random;

public class Deal {
    public static void main(String[] args) {

        int CARD_PER_PLAYER = 5;

        int NUMBER_PLAYERS = Integer.parseInt(args[0]) ;

        String[] RANK = {
                "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "JACK" , "QUEEN" , "KING" , "ACE"
        };

        String[] SUITS = {
                "Spades" , "Clubs" , "Diamonds" , "Hearts"
        };

        int n = RANK.length * SUITS.length;
        if (CARD_PER_PLAYER * NUMBER_PLAYERS > n ) {
            throw new RuntimeException("Too many players");
        }

        String[] CARD = new String[n];
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANK.length; j++) {
                CARD[SUITS.length * j + i] = RANK[j] + " of " + SUITS[i];
                //System.out.println(CARD[SUITS.length * i + j]);
            }
        }

        Random rand = new Random();
        System.out.println();
        for(int i = 0; i < n; i ++ ) {
            int r = rand.nextInt(CARD.length);
            String temp = CARD[i];
            CARD[i] = CARD[r];
            CARD[r] = temp;

        }

        for (int i = 0; i < CARD_PER_PLAYER * NUMBER_PLAYERS; i++ ) {
            if(i % CARD_PER_PLAYER == 0 ) System.out.println();
            System.out.println(CARD[i]);
        }

    }
}
