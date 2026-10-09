package com.gojek.ojosdk.exif;

import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes4.dex */
public class Rational {
    private final long mDenominator;
    private final long mNumerator;

    public Rational(long r1, long r3) {
        this.mNumerator = r1;
        this.mDenominator = r3;
    }

    public boolean equals(Object r7) {
        if (r7 != null) goto L6;
        return false;
    L6:
        if (this != r7) goto L9;
        return true;
    L9:
        if ((r7 instanceof Rational) == false) goto L15;
        Rational r72 = (Rational) r7;
        if (this.mNumerator != r72.mNumerator) goto L15;
        if (this.mDenominator != r72.mDenominator) goto L15;
        return true;
    L15:
        return false;
    }

    public long getDenominator() {
        return this.mDenominator;
    }

    public long getNumerator() {
        return this.mNumerator;
    }

    public double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    public String toString() {
        return this.mNumerator + RemoteSettings.FORWARD_SLASH_STRING + this.mDenominator;
    }

    public Rational(Rational r3) {
        this.mNumerator = r3.mNumerator;
        this.mDenominator = r3.mDenominator;
    }
}
