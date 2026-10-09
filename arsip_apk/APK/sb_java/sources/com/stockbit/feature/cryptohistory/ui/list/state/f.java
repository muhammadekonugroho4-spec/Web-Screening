package com.stockbit.feature.cryptohistory.ui.list.state;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f94067a;

    /* renamed from: b, reason: collision with root package name */
    public final List f94068b;

    static {
    }

    public f(i r2, List r3) {
        p.l(r2, "summary");
        p.l(r3, "rows");
        this.f94067a = r2;
        this.f94068b = r3;
    }

    public final List a() {
        return this.f94068b;
    }

    public final i b() {
        return this.f94067a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f94067a, r52.f94067a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94068b, r52.f94068b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f94067a.hashCode() * 31) + this.f94068b.hashCode();
    }

    public String toString() {
        return "CryptoHistoryRealizedUIData(summary=" + this.f94067a + ", rows=" + this.f94068b + ')';
    }
}
