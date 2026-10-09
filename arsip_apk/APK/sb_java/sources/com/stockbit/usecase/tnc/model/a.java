package com.stockbit.usecase.tnc.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f163092a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163093b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163094c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f163095e;

    public a(int r2, String r3, String r4, String r5, boolean r6) {
        p.l(r3, "language");
        p.l(r4, "url");
        p.l(r5, "featureId");
        this.f163092a = r2;
        this.f163093b = r3;
        this.f163094c = r4;
        this.d = r5;
        this.f163095e = r6;
    }

    public final String a() {
        return this.f163094c;
    }

    public final int b() {
        return this.f163092a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f163092a == r52.f163092a) goto L12;
        return false;
    L12:
        if (p.g(this.f163093b, r52.f163093b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163094c, r52.f163094c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f163095e == r52.f163095e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f163092a) * 31) + this.f163093b.hashCode()) * 31) + this.f163094c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f163095e);
    }

    public String toString() {
        return "TncUIState(version=" + this.f163092a + ", language=" + this.f163093b + ", url=" + this.f163094c + ", featureId=" + this.d + ", isAccepted=" + this.f163095e + ")";
    }

    public /* synthetic */ a(int r3, String r4, String r5, String r6, boolean r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        boolean r82 = false;
    L17:
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82);
        return;
    L18:
        r82 = r7;
        goto L17
    }
}
