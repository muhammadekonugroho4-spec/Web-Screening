package com.stockbit.feature.cryptohistory.ui.common.state;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f93678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93679b;

    /* renamed from: c, reason: collision with root package name */
    public final String f93680c;

    static {
    }

    public a(String r2, String r3, String r4) {
        p.l(r2, "coinSymbol");
        p.l(r3, "coinName");
        p.l(r4, "coinLogo");
        this.f93678a = r2;
        this.f93679b = r3;
        this.f93680c = r4;
    }

    public static /* synthetic */ a b(a r02, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f93678a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f93679b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f93680c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final a a(String r2, String r3, String r4) {
        p.l(r2, "coinSymbol");
        p.l(r3, "coinName");
        p.l(r4, "coinLogo");
        return new a(r2, r3, r4);
    }

    public final String c() {
        return this.f93680c;
    }

    public final String d() {
        return this.f93679b;
    }

    public final String e() {
        return this.f93678a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f93678a, r52.f93678a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f93679b, r52.f93679b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f93680c, r52.f93680c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f93678a.hashCode() * 31) + this.f93679b.hashCode()) * 31) + this.f93680c.hashCode();
    }

    public String toString() {
        return "CryptoHistoryHeaderUIData(coinSymbol=" + this.f93678a + ", coinName=" + this.f93679b + ", coinLogo=" + this.f93680c + ')';
    }

    public /* synthetic */ a(String r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
