package com.stockbit.component.wheeldatepicker;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.stockbit.component.wheeldatepicker.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6712l {

    /* renamed from: a, reason: collision with root package name */
    public final String f78044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78045b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78046c;

    static {
    }

    public C6712l(String r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TEXT);
        this.f78044a = r2;
        this.f78045b = r3;
        this.f78046c = r4;
    }

    public final int a() {
        return this.f78046c;
    }

    public final String b() {
        return this.f78044a;
    }

    public final int c() {
        return this.f78045b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6712l) == true) goto L8;
        return false;
    L8:
        C6712l r52 = (C6712l) r5;
        if (kotlin.jvm.internal.p.g(this.f78044a, r52.f78044a) == true) goto L12;
        return false;
    L12:
        if (this.f78045b == r52.f78045b) goto L15;
        return false;
    L15:
        if (this.f78046c == r52.f78046c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f78044a.hashCode() * 31) + Integer.hashCode(this.f78045b)) * 31) + Integer.hashCode(this.f78046c);
    }

    public String toString() {
        return "DayOfMonth(text=" + this.f78044a + ", value=" + this.f78045b + ", index=" + this.f78046c + ')';
    }
}
