package com.stockbit.domain.param.securities.volumetrigger;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87578b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87579c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87580e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87581f;

    public a(String r1, String r2, String r3, String r4, String r5, String r6) {
        this.f87577a = r1;
        this.f87578b = r2;
        this.f87579c = r3;
        this.d = r4;
        this.f87580e = r5;
        this.f87581f = r6;
    }

    public final String a() {
        return this.f87581f;
    }

    public final String b() {
        return this.f87577a;
    }

    public final String c() {
        return this.f87578b;
    }

    public final String d() {
        return this.f87579c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87577a, r52.f87577a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87578b, r52.f87578b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87579c, r52.f87579c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87580e, r52.f87580e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87581f, r52.f87581f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f87580e;
    }

    public int hashCode() {
        String r02 = this.f87577a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f87578b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f87579c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f87580e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f87581f;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
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
        return "AmendVolumeTriggerOrderDomainParam(newOrderExpiryType=" + this.f87577a + ", newOrderPrice=" + this.f87578b + ", newOrderType=" + this.f87579c + ", newShares=" + this.d + ", newTriggerVolumeShares=" + this.f87580e + ", newEvaluationPrice=" + this.f87581f + ")";
    }
}
