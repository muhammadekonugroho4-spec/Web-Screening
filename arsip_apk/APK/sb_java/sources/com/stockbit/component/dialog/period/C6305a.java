package com.stockbit.component.dialog.period;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.stockbit.component.dialog.period.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6305a {

    /* renamed from: a, reason: collision with root package name */
    public final String f70545a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70546b;

    static {
    }

    public C6305a(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r3, "param");
        this.f70545a = r2;
        this.f70546b = r3;
    }

    public final String a() {
        return this.f70546b;
    }

    public final String b() {
        return this.f70545a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6305a) == true) goto L8;
        return false;
    L8:
        C6305a r52 = (C6305a) r5;
        if (kotlin.jvm.internal.p.g(this.f70545a, r52.f70545a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f70546b, r52.f70546b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f70545a.hashCode() * 31) + this.f70546b.hashCode();
    }

    public String toString() {
        return "DialogPeriodOption(title=" + this.f70545a + ", param=" + this.f70546b + ')';
    }
}
