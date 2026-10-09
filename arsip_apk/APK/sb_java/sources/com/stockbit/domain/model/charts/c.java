package com.stockbit.domain.model.charts;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f81184a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81185b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81186c;

    public c(String r2, String r3, String r4) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "unit");
        p.l(r4, "value");
        this.f81184a = r2;
        this.f81185b = r3;
        this.f81186c = r4;
    }

    public final String a() {
        return this.f81184a;
    }

    public final String b() {
        return this.f81186c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f81184a, r52.f81184a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81185b, r52.f81185b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81186c, r52.f81186c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81184a.hashCode() * 31) + this.f81185b.hashCode()) * 31) + this.f81186c.hashCode();
    }

    public String toString() {
        return "ChartsValueEntity(key=" + this.f81184a + ", unit=" + this.f81185b + ", value=" + this.f81186c + ")";
    }
}
