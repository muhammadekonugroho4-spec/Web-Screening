package com.stockbit.domain.model.entity.securities;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f83518a;

    /* renamed from: b, reason: collision with root package name */
    public final p f83519b;

    public q(String r1, p r2) {
        this.f83518a = r1;
        this.f83519b = r2;
    }

    public final p a() {
        return this.f83519b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (kotlin.jvm.internal.p.g(this.f83518a, r52.f83518a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83519b, r52.f83519b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f83518a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        p r2 = this.f83519b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "FormulaPreviewFee(brokerFee=" + this.f83518a + ", exchange=" + this.f83519b + ')';
    }

    public /* synthetic */ q(String r2, p r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
