package com.stockbit.personalamend.ui.changedata.verifydatachange;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f125550a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f125551b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f125552c;

    static {
    }

    public a(Integer r1, Integer r2, Integer r3) {
        this.f125550a = r1;
        this.f125551b = r2;
        this.f125552c = r3;
    }

    public final Integer a() {
        return this.f125550a;
    }

    public final Integer b() {
        return this.f125551b;
    }

    public final Integer c() {
        return this.f125552c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f125550a, r52.f125550a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f125551b, r52.f125551b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f125552c, r52.f125552c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f125550a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f125551b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f125552c;
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
        return "DataPickerData(dayOfMonth=" + this.f125550a + ", monthOfYear=" + this.f125551b + ", year=" + this.f125552c + ')';
    }

    public /* synthetic */ a(Integer r2, Integer r3, Integer r4, int r5, kotlin.jvm.internal.i r6) {
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
