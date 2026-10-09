package com.stockbit.domain.model.sharetrade;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f85793a;

    public a(b r1) {
        this.f85793a = r1;
    }

    public final b a() {
        return this.f85793a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f85793a, ((a) r4).f85793a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        b r02 = this.f85793a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "AutoShareTradeSettingStatusEntity(autoShare=" + this.f85793a + ")";
    }
}
