package com.airbnb.lottie.model;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f31362a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31363b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31364c;

    public g(String r1, float r2, float r3) {
        this.f31362a = r1;
        this.f31364c = r3;
        this.f31363b = r2;
    }

    public boolean a(String r5) {
        if (this.f31362a.equalsIgnoreCase(r5) == false) goto L6;
        return true;
    L6:
        if (this.f31362a.endsWith("\r") == false) goto L10;
        String r02 = this.f31362a;
        if (r02.substring(0, r02.length() - 1).equalsIgnoreCase(r5) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
