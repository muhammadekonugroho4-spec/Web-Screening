package com.stockbit.domain.param.securities;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f87475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87477c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87478e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87479f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87480g;

    public e(String r1, String r2, String r3, String r4, String r5, String r6, String r7) {
        this.f87475a = r1;
        this.f87476b = r2;
        this.f87477c = r3;
        this.d = r4;
        this.f87478e = r5;
        this.f87479f = r6;
        this.f87480g = r7;
    }

    public final String a() {
        return this.f87475a;
    }

    public final String b() {
        return this.f87476b;
    }

    public final String c() {
        return this.f87477c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f87478e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f87475a, r52.f87475a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87476b, r52.f87476b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87477c, r52.f87477c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87478e, r52.f87478e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87479f, r52.f87479f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f87480g, r52.f87480g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f87479f;
    }

    public final String g() {
        return this.f87480g;
    }

    public int hashCode() {
        String r02 = this.f87475a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f87476b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f87477c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f87478e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f87479f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f87480g;
        if (r211 == null) goto L31;
        r1 = r211.hashCode();
    L31:
        return r09 + r1;
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "PatchStopOrderDomainParam(newOrderExpiryType=" + this.f87475a + ", newOrderPrice=" + this.f87476b + ", newOrderType=" + this.f87477c + ", newPrice=" + this.d + ", newShares=" + this.f87478e + ", newTriggerPrice=" + this.f87479f + ", newTriggerType=" + this.f87480g + ")";
    }
}
