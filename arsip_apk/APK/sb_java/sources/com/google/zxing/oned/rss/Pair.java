package com.google.zxing.oned.rss;

/* loaded from: classes6.dex */
final class Pair extends DataCharacter {
    private int count;
    private final FinderPattern finderPattern;

    public Pair(int r1, int r2, FinderPattern r3) {
        super(r1, r2);
        this.finderPattern = r3;
    }

    public int getCount() {
        return this.count;
    }

    public FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public void incrementCount() {
        this.count++;
    }
}
