package wzk.mahjong;

public enum Card {
    TEN_THOUSAND("一萬"),TWENTY_THOUSAND("二萬"),THIRTY_THOUSAND("三萬"),FORTY_THOUSAND("四萬"),FIFTY_THOUSAND("五萬"),
    SIXTY_THOUSAND("六萬"),SEVENTY_THOUSAND("七萬"),EIGHTY_THOUSAND("八萬"),NINETY_THOUSAND("九萬"),
    ONE_COOKIES("一餅"),TWO_COOKIES("二餅"),THREE_COOKIES("三餅"),FOUR_COOKIES("四餅"),FIVE_COOKIES("五餅"),
    SIX_COOKIES("六餅"),SEVEN_COOKIES("七餅"),EIGHT_COOKIES("八餅"),NINE_COOKIES("九餅"),
    ONE_Sliver("一條"),TWO_Sliver("二條"),THREE_Sliver("三條"),FOUR_Sliver("四條"),FIVE_Sliver("五條"),
    SIX_Sliver("六條"),SEVEN_Sliver("七條"),EIGHT_Sliver("八條"),NINE_Sliver("九條"),
    EAST_WIND("東風"),WEST_WIND("西風"),SOUTH_WIND("南風"),NORTH_WIND("北風"),
    HONG_ZHONG("紅中"),FA_CAI("發財"),BAI_BAN("白板");
    final String name;
    final static int MIX_NUMBER = 136;
    int count = 4;

    private Card(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
