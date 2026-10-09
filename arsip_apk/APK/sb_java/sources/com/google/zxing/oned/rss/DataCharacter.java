package com.google.zxing.oned.rss;

/* loaded from: classes6.dex */
public class DataCharacter {
    private final int checksumPortion;
    private final int value;

    public DataCharacter(int r1, int r2) {
        this.value = r1;
        this.checksumPortion = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof DataCharacter) == true) goto L5;
        return false;
    L5:
        DataCharacter r42 = (DataCharacter) r4;
        if (this.value == r42.value) goto L8;
    L11:
        return false;
    L8:
        if (this.checksumPortion != r42.checksumPortion) goto L11;
        return true;
    }

    public final int getChecksumPortion() {
        return this.checksumPortion;
    }

    public final int getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value ^ this.checksumPortion;
    }

    public final String toString() {
        return this.value + "(" + this.checksumPortion + ')';
    }
}
