package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes6.dex */
final class DecodedChar extends DecodedObject {
    static final char FNC1 = '$';
    private final char value;

    public DecodedChar(int r1, char r2) {
        super(r1);
        this.value = r2;
    }

    public char getValue() {
        return this.value;
    }

    public boolean isFNC1() {
        if (this.value != '$') goto L6;
        return true;
    L6:
        return false;
    }
}
