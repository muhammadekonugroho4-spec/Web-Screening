package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

/* loaded from: classes6.dex */
final class DecodedNumeric extends DecodedObject {
    static final int FNC1 = 10;
    private final int firstDigit;
    private final int secondDigit;

    public DecodedNumeric(int r1, int r2, int r3) throws FormatException {
        super(r1);
        if (r2 < 0) goto L11;
        if (r2 > 10) goto L11;
        if (r3 < 0) goto L11;
        if (r3 > 10) goto L11;
        this.firstDigit = r2;
        this.secondDigit = r3;
        return;
    L11:
        throw FormatException.getFormatInstance();
    }

    public int getFirstDigit() {
        return this.firstDigit;
    }

    public int getSecondDigit() {
        return this.secondDigit;
    }

    public int getValue() {
        return (this.firstDigit * 10) + this.secondDigit;
    }

    public boolean isAnyFNC1() {
        if (this.firstDigit != 10) goto L5;
        return true;
    L5:
        if (this.secondDigit == 10) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean isFirstDigitFNC1() {
        if (this.firstDigit != 10) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isSecondDigitFNC1() {
        if (this.secondDigit != 10) goto L6;
        return true;
    L6:
        return false;
    }
}
