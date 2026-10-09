package com.stockbit.domain.model.entity.securities;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f83498a;

    public h(String r2) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
        this.f83498a = r2;
    }

    public final String a() {
        return this.f83498a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f83498a, ((h) r4).f83498a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f83498a.hashCode();
    }

    public String toString() {
        return "FilterHeader(title=" + this.f83498a + ')';
    }
}
