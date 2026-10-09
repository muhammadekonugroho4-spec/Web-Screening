package com.stockbit.domain.model.user;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f86665a;

    public n(String r2) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        this.f86665a = r2;
    }

    public final String a() {
        return this.f86665a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof n) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f86665a, ((n) r4).f86665a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f86665a.hashCode();
    }

    public String toString() {
        return "SupportEntity(id=" + this.f86665a + ")";
    }

    public /* synthetic */ n(String r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
