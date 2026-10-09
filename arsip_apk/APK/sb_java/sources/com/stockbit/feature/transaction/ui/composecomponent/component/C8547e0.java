package com.stockbit.feature.transaction.ui.composecomponent.component;

/* renamed from: com.stockbit.feature.transaction.ui.composecomponent.component.e0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8547e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f112387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f112388b;

    /* renamed from: c, reason: collision with root package name */
    public final String f112389c;

    static {
    }

    public C8547e0(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "expirySelectionDDId");
        kotlin.jvm.internal.p.l(r3, "expiryGFDId");
        kotlin.jvm.internal.p.l(r4, "expiryGTCId");
        this.f112387a = r2;
        this.f112388b = r3;
        this.f112389c = r4;
    }

    public final String a() {
        return this.f112388b;
    }

    public final String b() {
        return this.f112389c;
    }

    public final String c() {
        return this.f112387a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C8547e0) == true) goto L8;
        return false;
    L8:
        C8547e0 r52 = (C8547e0) r5;
        if (kotlin.jvm.internal.p.g(this.f112387a, r52.f112387a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f112388b, r52.f112388b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f112389c, r52.f112389c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f112387a.hashCode() * 31) + this.f112388b.hashCode()) * 31) + this.f112389c.hashCode();
    }

    public String toString() {
        return "ExpiryIdentifier(expirySelectionDDId=" + this.f112387a + ", expiryGFDId=" + this.f112388b + ", expiryGTCId=" + this.f112389c + ')';
    }
}
