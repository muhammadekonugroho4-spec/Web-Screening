package com.stockbit.feature.cryptohistory.ui.detail.state;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f93789a;

    static {
    }

    public d(a r2) {
        p.l(r2, "content");
        this.f93789a = r2;
    }

    public final a a() {
        return this.f93789a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f93789a, ((d) r4).f93789a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f93789a.hashCode();
    }

    public String toString() {
        return "CryptoHistoryDetailUIData(content=" + this.f93789a + ')';
    }
}
