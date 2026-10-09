package com.github.gcacace.signaturepad.utils;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    public static final Character f37610e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final Character f37611f = null;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f37612a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f37613b;

    /* renamed from: c, reason: collision with root package name */
    public final e f37614c;
    public e d;

    static {
        f37610e = Character.valueOf(Constants.INAPP_POSITION_CENTER);
        f37611f = 'M';
    }

    public d(e r1, Integer r2) {
        this.f37613b = r2;
        this.f37614c = r1;
        this.d = r1;
        StringBuilder r12 = new StringBuilder();
        this.f37612a = r12;
        r12.append(f37610e);
    }

    public d a(e r2, e r3, e r4) {
        this.f37612a.append(d(r2, r3, r4));
        this.d = r4;
        return this;
    }

    public final e b() {
        return this.d;
    }

    public final Integer c() {
        return this.f37613b;
    }

    public final String d(e r2, e r3, e r4) {
        String r22 = r2.b(this.d) + " " + r3.b(this.d) + " " + r4.b(this.d) + " ";
        if ("c0 0 0 0 0 0".equals(r22) == false) goto L6;
        return "";
    L6:
        return r22;
    }

    public String toString() {
        return "<path stroke-width=\"" + this.f37613b + "\" d=\"" + f37611f + this.f37614c + this.f37612a + "\"/>";
    }
}
