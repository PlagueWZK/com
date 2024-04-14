package wzk.mahjong;

public class Main {
    public static void main(String[] args) {
        CardLibrary.createCardLibrary();
        System.out.println(CardLibrary.toStringLibrary());
        CardLibrary.shuffleCardLibrary(CardLibrary.CardLibrary);
        System.out.println(CardLibrary.toStringLibrary());
    }
}
