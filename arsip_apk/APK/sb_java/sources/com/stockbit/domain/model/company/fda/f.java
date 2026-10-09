package com.stockbit.domain.model.company.fda;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f81518a;

    /* renamed from: b, reason: collision with root package name */
    public final a f81519b;

    public f(String r2, a r3) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r3, "value");
        this.f81518a = r2;
        this.f81519b = r3;
    }

    public final String a() {
        return this.f81518a;
    }

    public final a b() {
        return this.f81519b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f81518a, r52.f81518a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81519b, r52.f81519b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81518a.hashCode() * 31) + this.f81519b.hashCode();
    }

    public String toString() {
        return "FDAValueSummaryEntity(label=" + this.f81518a + ", value=" + this.f81519b + ")";
    }

    public /* synthetic */ f(String r7, a r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r7 = "";
    L6:
        if ((r9 & 2) == 0) goto L8;
        r8 = new a(null, 0.0d, 3, null);
    L8:
        this(r7, r8);
    }
}
