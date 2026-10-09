package com.stockbit.usecase.securities.model.account;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f160374g = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f160375a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160376b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160377c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f160378e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f160379f;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f160374g = new a(null);
    }

    public d(String r2, String r3, String r4, String r5, boolean r6, boolean r7) {
        p.l(r2, "accountNumber");
        p.l(r3, "accountName");
        p.l(r4, "amountBalance");
        p.l(r5, "amountEquity");
        this.f160375a = r2;
        this.f160376b = r3;
        this.f160377c = r4;
        this.d = r5;
        this.f160378e = r6;
        this.f160379f = r7;
    }

    public final String a() {
        return this.f160376b;
    }

    public final String b() {
        return this.f160377c;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.f160379f;
    }

    public final boolean e() {
        return this.f160378e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f160375a, r52.f160375a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160376b, r52.f160376b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160377c, r52.f160377c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f160378e == r52.f160378e) goto L24;
        return false;
    L24:
        if (this.f160379f == r52.f160379f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f160375a.hashCode() * 31) + this.f160376b.hashCode()) * 31) + this.f160377c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f160378e)) * 31) + Boolean.hashCode(this.f160379f);
    }

    public String toString() {
        return "SubAccountAssetUIState(accountNumber=" + this.f160375a + ", accountName=" + this.f160376b + ", amountBalance=" + this.f160377c + ", amountEquity=" + this.d + ", isMainAccount=" + this.f160378e + ", isLocked=" + this.f160379f + ")";
    }

    public /* synthetic */ d(String r2, String r3, String r4, String r5, boolean r6, boolean r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r8 & 32) == 0) goto L21;
        boolean r82 = false;
    L20:
        boolean r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
