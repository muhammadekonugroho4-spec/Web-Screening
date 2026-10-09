package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f85001a;

    /* renamed from: b, reason: collision with root package name */
    public final c f85002b;

    /* renamed from: c, reason: collision with root package name */
    public final c f85003c;

    public a(b r1, c r2, c r3) {
        this.f85001a = r1;
        this.f85002b = r2;
        this.f85003c = r3;
    }

    public final b a() {
        return this.f85001a;
    }

    public final c b() {
        return this.f85003c;
    }

    public final c c() {
        return this.f85002b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f85001a, r52.f85001a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85002b, r52.f85002b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85003c, r52.f85003c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        b r02 = this.f85001a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        c r2 = this.f85002b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        c r23 = this.f85003c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "HistoryAdditionalInfoEntity(nego=" + this.f85001a + ", stockDividend=" + this.f85002b + ", stockBonus=" + this.f85003c + ")";
    }

    public /* synthetic */ a(b r2, c r3, c r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
