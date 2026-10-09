package com.stockbit.feature.cryptohistory.ui.detail.state;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f93783a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93784b;

    static {
    }

    public b(int r1, String r2) {
        this.f93783a = r1;
        this.f93784b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f93783a == r52.f93783a) goto L12;
        return false;
    L12:
        if (p.g(this.f93784b, r52.f93784b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f93783a) * 31;
        String r1 = this.f93784b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoHistoryDetailErrorUIData(errorMessageRes=" + this.f93783a + ", dynamicError=" + this.f93784b + ')';
    }

    public /* synthetic */ b(int r1, String r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
