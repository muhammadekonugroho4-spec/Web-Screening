package com.stockbit.domain.model.securities.account;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f85021a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85022b;

    public f(String r2, String r3) {
        p.l(r2, "type");
        p.l(r3, Constants.KEY_TEXT);
        this.f85021a = r2;
        this.f85022b = r3;
    }

    public final String a() {
        return this.f85022b;
    }

    public final String b() {
        return this.f85021a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f85021a, r52.f85021a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85022b, r52.f85022b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85021a.hashCode() * 31) + this.f85022b.hashCode();
    }

    public String toString() {
        return "PortfolioPurposeEntity(type=" + this.f85021a + ", text=" + this.f85022b + ")";
    }
}
