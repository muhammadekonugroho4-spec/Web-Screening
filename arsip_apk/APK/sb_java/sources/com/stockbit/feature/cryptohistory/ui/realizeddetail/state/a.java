package com.stockbit.feature.cryptohistory.ui.realizeddetail.state;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f94147a;

    /* renamed from: b, reason: collision with root package name */
    public final List f94148b;

    static {
    }

    public a(List r2, List r3) {
        p.l(r2, "rows");
        p.l(r3, "trades");
        this.f94147a = r2;
        this.f94148b = r3;
    }

    public final List a() {
        return this.f94147a;
    }

    public final List b() {
        return this.f94148b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f94147a, r52.f94147a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94148b, r52.f94148b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f94147a.hashCode() * 31) + this.f94148b.hashCode();
    }

    public String toString() {
        return "CryptoHistoryRealizedDetailUIData(rows=" + this.f94147a + ", trades=" + this.f94148b + ')';
    }
}
