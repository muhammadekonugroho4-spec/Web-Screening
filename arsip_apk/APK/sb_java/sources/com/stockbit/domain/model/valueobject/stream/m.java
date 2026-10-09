package com.stockbit.domain.model.valueobject.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public String f87176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87177b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87178c;

    public m(String r2, String r3, boolean r4) {
        p.l(r2, "periodName");
        p.l(r3, "periodValue");
        this.f87176a = r2;
        this.f87177b = r3;
        this.f87178c = r4;
    }

    public final String a() {
        return this.f87176a;
    }

    public final String b() {
        return this.f87177b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f87176a, r52.f87176a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87177b, r52.f87177b) == true) goto L15;
        return false;
    L15:
        if (this.f87178c == r52.f87178c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f87176a.hashCode() * 31) + this.f87177b.hashCode()) * 31) + Boolean.hashCode(this.f87178c);
    }

    public String toString() {
        return "TargetPricePeriod(periodName=" + this.f87176a + ", periodValue=" + this.f87177b + ", isChecked=" + this.f87178c + ')';
    }

    public /* synthetic */ m(String r2, String r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r2, r3, r4);
    }
}
