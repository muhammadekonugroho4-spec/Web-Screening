package com.stockbit.feature.cryptohistory.contract;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f93566a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93567b;

    /* renamed from: c, reason: collision with root package name */
    public final String f93568c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f93569e;

    public a(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "txnType");
        p.l(r3, "txnId");
        p.l(r4, "coinSymbol");
        p.l(r5, "coinName");
        p.l(r6, "coinLogo");
        this.f93566a = r2;
        this.f93567b = r3;
        this.f93568c = r4;
        this.d = r5;
        this.f93569e = r6;
    }

    public final String a() {
        return this.f93569e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f93568c;
    }

    public final String d() {
        return this.f93567b;
    }

    public final String e() {
        return this.f93566a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f93566a, r52.f93566a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f93567b, r52.f93567b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f93568c, r52.f93568c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f93569e, r52.f93569e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f93566a.hashCode() * 31) + this.f93567b.hashCode()) * 31) + this.f93568c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f93569e.hashCode();
    }

    public String toString() {
        return "CryptoHistoryDetailContractArgs(txnType=" + this.f93566a + ", txnId=" + this.f93567b + ", coinSymbol=" + this.f93568c + ", coinName=" + this.d + ", coinLogo=" + this.f93569e + ')';
    }

    public /* synthetic */ a(String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
        if ((r7 & 4) == 0) goto L6;
        r4 = "";
    L6:
        if ((r7 & 8) == 0) goto L9;
        r5 = "";
    L9:
        if ((r7 & 16) == 0) goto L12;
        String r72 = "";
    L11:
        String r62 = r5;
        this(r2, r3, r4, r62, r72);
        return;
    L12:
        r72 = r6;
        goto L11
    }
}
