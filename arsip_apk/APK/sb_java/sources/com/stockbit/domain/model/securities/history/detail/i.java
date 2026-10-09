package com.stockbit.domain.model.securities.history.detail;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f85322a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85323b;

    public i(String r2, String r3) {
        p.l(r2, "lightMode");
        p.l(r3, "darkMode");
        this.f85322a = r2;
        this.f85323b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f85322a, r52.f85322a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85323b, r52.f85323b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85322a.hashCode() * 31) + this.f85323b.hashCode();
    }

    public String toString() {
        return "HistoryRealizedColorEntity(lightMode=" + this.f85322a + ", darkMode=" + this.f85323b + ")";
    }

    public /* synthetic */ i(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
