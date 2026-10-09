package com.stockbit.domain.model.entity;

import java.util.List;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public String f83709a;

    /* renamed from: b, reason: collision with root package name */
    public String f83710b;

    /* renamed from: c, reason: collision with root package name */
    public String f83711c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public List f83712e;

    /* renamed from: f, reason: collision with root package name */
    public String f83713f;

    public t(String r1, String r2, String r3, String r4, List r5, String r6) {
        this.f83709a = r1;
        this.f83710b = r2;
        this.f83711c = r3;
        this.d = r4;
        this.f83712e = r5;
        this.f83713f = r6;
    }

    public final String a() {
        return this.f83709a;
    }

    public final String b() {
        return this.f83710b;
    }

    public final String c() {
        return this.f83711c;
    }

    public final String d() {
        return this.d;
    }

    public final List e() {
        return this.f83712e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof t) == true) goto L8;
        return false;
    L8:
        t r52 = (t) r5;
        if (kotlin.jvm.internal.p.g(this.f83709a, r52.f83709a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83710b, r52.f83710b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83711c, r52.f83711c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83712e, r52.f83712e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83713f, r52.f83713f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f83713f;
    }

    public int hashCode() {
        String r02 = this.f83709a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83710b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83711c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        List r27 = this.f83712e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83713f;
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
        return "Snk(bankAccountNumber=" + this.f83709a + ", customerCode=" + this.f83710b + ", date=" + this.f83711c + ", fullName=" + this.d + ", rewardStocks=" + this.f83712e + ", sidNumber=" + this.f83713f + ')';
    }
}
