package com.stockbit.usecase.securities.model.account;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f160369a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160370b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160371c;

    public b(String r2, String r3, String r4) {
        p.l(r2, "url");
        p.l(r3, "version");
        p.l(r4, "featureId");
        this.f160369a = r2;
        this.f160370b = r3;
        this.f160371c = r4;
    }

    public final String a() {
        return this.f160371c;
    }

    public final String b() {
        return this.f160369a;
    }

    public final String c() {
        return this.f160370b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f160369a, r52.f160369a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160370b, r52.f160370b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160371c, r52.f160371c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f160369a.hashCode() * 31) + this.f160370b.hashCode()) * 31) + this.f160371c.hashCode();
    }

    public String toString() {
        return "CreatePortfolioTnCUIState(url=" + this.f160369a + ", version=" + this.f160370b + ", featureId=" + this.f160371c + ")";
    }

    public /* synthetic */ b(String r2, String r3, String r4, int r5, i r6) {
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
