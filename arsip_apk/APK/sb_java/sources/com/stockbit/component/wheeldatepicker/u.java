package com.stockbit.component.wheeldatepicker;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f78085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78087c;

    public u(String r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TEXT);
        this.f78085a = r2;
        this.f78086b = r3;
        this.f78087c = r4;
    }

    public final int a() {
        return this.f78087c;
    }

    public final String b() {
        return this.f78085a;
    }

    public final int c() {
        return this.f78086b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (kotlin.jvm.internal.p.g(this.f78085a, r52.f78085a) == true) goto L12;
        return false;
    L12:
        if (this.f78086b == r52.f78086b) goto L15;
        return false;
    L15:
        if (this.f78087c == r52.f78087c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f78085a.hashCode() * 31) + Integer.hashCode(this.f78086b)) * 31) + Integer.hashCode(this.f78087c);
    }

    public String toString() {
        return "Month(text=" + this.f78085a + ", value=" + this.f78086b + ", index=" + this.f78087c + ')';
    }
}
