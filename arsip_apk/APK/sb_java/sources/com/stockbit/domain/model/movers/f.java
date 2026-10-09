package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f84367a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f84368b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f84369c;
    public final Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f84370e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f84371f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f84372g;

    public f(Boolean r1, Boolean r2, Boolean r3, Boolean r4, Boolean r5, Boolean r6, Boolean r7) {
        this.f84367a = r1;
        this.f84368b = r2;
        this.f84369c = r3;
        this.d = r4;
        this.f84370e = r5;
        this.f84371f = r6;
        this.f84372g = r7;
    }

    public final Boolean a() {
        return this.f84369c;
    }

    public final Boolean b() {
        return this.f84368b;
    }

    public final Boolean c() {
        return this.f84367a;
    }

    public final Boolean d() {
        return this.d;
    }

    public final Boolean e() {
        return this.f84372g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f84367a, r52.f84367a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84368b, r52.f84368b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84369c, r52.f84369c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f84370e, r52.f84370e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f84371f, r52.f84371f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f84372g, r52.f84372g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final Boolean f() {
        return this.f84370e;
    }

    public final Boolean g() {
        return this.f84371f;
    }

    public int hashCode() {
        Boolean r02 = this.f84367a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.f84368b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.f84369c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Boolean r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Boolean r27 = this.f84370e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Boolean r29 = this.f84371f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Boolean r211 = this.f84372g;
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
        return "MoversFilterEntity(isBoardMainChecked=" + this.f84367a + ", isBoardDevelopmentChecked=" + this.f84368b + ", isBoardAccelerationChecked=" + this.f84369c + ", isBoardNewEconomicChecked=" + this.d + ", isSpecialMonitoringChecked=" + this.f84370e + ", isWarrantOrRightChecked=" + this.f84371f + ", isShariaOnlyChecked=" + this.f84372g + ")";
    }
}
