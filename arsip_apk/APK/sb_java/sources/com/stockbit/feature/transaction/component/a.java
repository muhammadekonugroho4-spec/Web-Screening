package com.stockbit.feature.transaction.component;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f107351a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107352b;

    static {
    }

    public a(String r2, String r3) {
        p.l(r2, "selectedText");
        p.l(r3, "unselectedText");
        this.f107351a = r2;
        this.f107352b = r3;
    }

    public final String a() {
        return this.f107351a;
    }

    public final String b() {
        return this.f107352b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f107351a, r52.f107351a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f107352b, r52.f107352b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f107351a.hashCode() * 31) + this.f107352b.hashCode();
    }

    public String toString() {
        return "CustomSegmentedButtonModel(selectedText=" + this.f107351a + ", unselectedText=" + this.f107352b + ')';
    }
}
