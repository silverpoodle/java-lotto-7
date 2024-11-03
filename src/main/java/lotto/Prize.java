package lotto;

enum Prize {
    FIRST(6, false, 2_000_000_000),
    SECOND(5, true, 30_000_000),
    THIRD(5, false, 1_500_000),
    FOURTH(4, false, 50_000),
    FIFTH(3, false, 5_000),
    NONE(0, false, 0);

    private final int matchCount;
    private final boolean needBonusMatch;
    private final int prize;

    Prize(int matchCount, boolean needBonusMatch, int prize) {
        this.matchCount = matchCount;
        this.needBonusMatch = needBonusMatch;
        this.prize = prize;
    }

    public static Prize of(int matchCount, boolean bonusMatch) {
        if (matchCount == 6) return FIRST;
        if (matchCount == 5 && bonusMatch) return SECOND;
        if (matchCount == 5) return THIRD;
        if (matchCount == 4) return FOURTH;
        if (matchCount == 3) return FIFTH;
        return NONE;
    }

    public int getPrize() {
        return prize;
    }
}
