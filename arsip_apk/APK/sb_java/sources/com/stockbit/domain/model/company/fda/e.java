package com.stockbit.domain.model.company.fda;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f81515a;

    /* renamed from: b, reason: collision with root package name */
    public final a f81516b;

    /* renamed from: c, reason: collision with root package name */
    public final a f81517c;

    public e(String r2, a r3, a r4) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r3, "percentage");
        p.l(r4, "value");
        this.f81515a = r2;
        this.f81516b = r3;
        this.f81517c = r4;
    }

    public final String a() {
        return this.f81515a;
    }

    public final a b() {
        return this.f81516b;
    }

    public final a c() {
        return this.f81517c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f81515a, r52.f81515a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81516b, r52.f81516b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81517c, r52.f81517c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81515a.hashCode() * 31) + this.f81516b.hashCode()) * 31) + this.f81517c.hashCode();
    }

    public String toString() {
        return "FDAValuePercentageEntity(label=" + this.f81515a + ", percentage=" + this.f81516b + ", value=" + this.f81517c + ")";
    }

    public /* synthetic */ e(String r7, a r8, a r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r7 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r8 = new a(null, 0.0d, 3, null);
    L9:
        if ((r10 & 4) == 0) goto L11;
        r9 = new a(null, 0.0d, 3, null);
    L11:
        this(r7, r8, r9);
    }
}
