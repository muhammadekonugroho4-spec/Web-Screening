package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;

/* loaded from: classes6.dex */
final class ExpandedPair {
    private final FinderPattern finderPattern;
    private final DataCharacter leftChar;
    private final boolean mayBeLast;
    private final DataCharacter rightChar;

    public ExpandedPair(DataCharacter r1, DataCharacter r2, FinderPattern r3, boolean r4) {
        this.leftChar = r1;
        this.rightChar = r2;
        this.finderPattern = r3;
        this.mayBeLast = r4;
    }

    private static boolean equalsOrNull(Object r02, Object r1) {
        if (r02 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r02.equals(r1);
    }

    private static int hashNotNull(Object r02) {
        if (r02 != null) goto L6;
        return 0;
    L6:
        return r02.hashCode();
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof ExpandedPair) == true) goto L5;
        return false;
    L5:
        ExpandedPair r42 = (ExpandedPair) r4;
        if (equalsOrNull(this.leftChar, r42.leftChar) == true) goto L8;
    L13:
        return false;
    L8:
        if (equalsOrNull(this.rightChar, r42.rightChar) == false) goto L13;
        if (equalsOrNull(this.finderPattern, r42.finderPattern) == false) goto L13;
        return true;
    }

    public FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public DataCharacter getLeftChar() {
        return this.leftChar;
    }

    public DataCharacter getRightChar() {
        return this.rightChar;
    }

    public int hashCode() {
        return (hashNotNull(this.leftChar) ^ hashNotNull(this.rightChar)) ^ hashNotNull(this.finderPattern);
    }

    public boolean mayBeLast() {
        return this.mayBeLast;
    }

    public boolean mustBeLast() {
        if (this.rightChar != null) goto L6;
        return true;
    L6:
        return false;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder("[ ");
        r02.append(this.leftChar);
        r02.append(" , ");
        r02.append(this.rightChar);
        r02.append(" : ");
        FinderPattern r1 = this.finderPattern;
        if (r1 != null) goto L5;
        Object r12 = "null";
    L6:
        r02.append(r12);
        r02.append(" ]");
        return r02.toString();
    L5:
        r12 = Integer.valueOf(r1.getValue());
        goto L6
    }
}
