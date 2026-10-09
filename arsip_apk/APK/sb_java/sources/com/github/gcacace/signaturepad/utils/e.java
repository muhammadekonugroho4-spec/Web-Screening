package com.github.gcacace.signaturepad.utils;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f37615a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f37616b;

    public e(f r2) {
        this.f37615a = Integer.valueOf(Math.round(r2.f37617a));
        this.f37616b = Integer.valueOf(Math.round(r2.f37618b));
    }

    public String a() {
        return this.f37615a + Constants.SEPARATOR_COMMA + this.f37616b;
    }

    public String b(e r4) {
        return new e(this.f37615a.intValue() - r4.f37615a.intValue(), this.f37616b.intValue() - r4.f37616b.intValue()).toString();
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if (r4 != null) goto L8;
    L15:
        return false;
    L8:
        if (getClass() != r4.getClass()) goto L15;
        e r42 = (e) r4;
        if (this.f37615a.equals(r42.f37615a) == true) goto L14;
        return false;
    L14:
        return this.f37616b.equals(r42.f37616b);
    }

    public int hashCode() {
        return (this.f37615a.hashCode() * 31) + this.f37616b.hashCode();
    }

    public String toString() {
        return a();
    }

    public e(int r1, int r2) {
        this.f37615a = Integer.valueOf(r1);
        this.f37616b = Integer.valueOf(r2);
    }
}
