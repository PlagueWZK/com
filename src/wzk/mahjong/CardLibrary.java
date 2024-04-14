package wzk.mahjong;


import java.util.Arrays;
import java.util.Random;

public class CardLibrary {
    public static Card[] CardLibrary = new Card[Card.MIX_NUMBER];

    public static void createCardLibrary() {
        addCard(Card.values());
    }

    private static void addCard(Card... C) {
        int i = 0;
        for (Card value : C) {
            while (value.count > 0) {
                CardLibrary[i] = value;
                i++;
                value.count--;
            }
        }
    }

    public static String toStringLibrary() {
        return Arrays.toString(CardLibrary);
    }

    public static void shuffleCardLibrary(Card[] c) {
        Random r = new Random();
        for (int i = c.length - 1; i >= 0; i--) {
            swap(i,r.nextInt(Card.MIX_NUMBER));
        }
    }
    private static void swap(int a,int b) {
        Card temp = CardLibrary[a];
        CardLibrary[a] = CardLibrary[b];
        CardLibrary[b] = temp;
    }
}