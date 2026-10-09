package com.stockbit.feature.cryptohistory.ui.list.state;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f94048a;

    static {
    }

    public a(List r2) {
        p.l(r2, "rows");
        this.f94048a = r2;
    }

    public final List a() {
        return this.f94048a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f94048a, ((a) r4).f94048a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f94048a.hashCode();
    }

    public String toString() {
        return "CryptoHistoryAllUIData(rows=" + this.f94048a + ')';
    }
}
