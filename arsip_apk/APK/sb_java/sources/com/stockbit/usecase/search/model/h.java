package com.stockbit.usecase.search.model;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f160011a;

    /* renamed from: b, reason: collision with root package name */
    public final double f160012b;

    /* renamed from: c, reason: collision with root package name */
    public final double f160013c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160014e;

    /* renamed from: f, reason: collision with root package name */
    public final String f160015f;

    public h(double r2, double r4, double r6, String r8, String r9, String r10) {
        kotlin.jvm.internal.p.l(r8, "formattedLot");
        kotlin.jvm.internal.p.l(r9, "formattedValue");
        kotlin.jvm.internal.p.l(r10, "formattedFrequency");
        this.f160011a = r2;
        this.f160012b = r4;
        this.f160013c = r6;
        this.d = r8;
        this.f160014e = r9;
        this.f160015f = r10;
    }

    public final String a() {
        return this.f160015f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f160014e;
    }

    public final double d() {
        return this.f160013c;
    }

    public final double e() {
        return this.f160011a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (Double.compare(this.f160011a, r82.f160011a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f160012b, r82.f160012b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f160013c, r82.f160013c) == 0) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f160014e, r82.f160014e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f160015f, r82.f160015f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final double f() {
        return this.f160012b;
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.f160011a) * 31) + Double.hashCode(this.f160012b)) * 31) + Double.hashCode(this.f160013c)) * 31) + this.d.hashCode()) * 31) + this.f160014e.hashCode()) * 31) + this.f160015f.hashCode();
    }

    public String toString() {
        return "MarketDataValueUIState(lot=" + this.f160011a + ", value=" + this.f160012b + ", frequency=" + this.f160013c + ", formattedLot=" + this.d + ", formattedValue=" + this.f160014e + ", formattedFrequency=" + this.f160015f + ")";
    }

    public /* synthetic */ h(double r3, double r5, double r7, String r9, String r10, String r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r5 = 0.0d;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r7 = 0.0d;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r9 = "-";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r10 = "-";
    L18:
        if ((r12 & 32) == 0) goto L21;
        String r122 = "-";
    L22:
        this(r3, r5, r7, r9, r10, r122);
        return;
    L21:
        r122 = r11;
        goto L22
    }
}
