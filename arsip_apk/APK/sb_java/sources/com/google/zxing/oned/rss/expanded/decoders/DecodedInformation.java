package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes6.dex */
final class DecodedInformation extends DecodedObject {
    private final String newString;
    private final boolean remaining;
    private final int remainingValue;

    public DecodedInformation(int r1, String r2) {
        super(r1);
        this.newString = r2;
        this.remaining = false;
        this.remainingValue = 0;
    }

    public String getNewString() {
        return this.newString;
    }

    public int getRemainingValue() {
        return this.remainingValue;
    }

    public boolean isRemaining() {
        return this.remaining;
    }

    public DecodedInformation(int r1, String r2, int r3) {
        super(r1);
        this.remaining = true;
        this.remainingValue = r3;
        this.newString = r2;
    }
}
