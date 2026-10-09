package com.stockbit.domain.model.alert;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AlertConditionItemType f80583a;

    /* renamed from: b, reason: collision with root package name */
    public final AlertConditionOperatorType f80584b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80585c;

    public d(AlertConditionItemType r2, AlertConditionOperatorType r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "item");
        kotlin.jvm.internal.p.l(r3, "operator");
        kotlin.jvm.internal.p.l(r4, "value");
        this.f80583a = r2;
        this.f80584b = r3;
        this.f80585c = r4;
    }

    public static /* synthetic */ d b(d r02, AlertConditionItemType r1, AlertConditionOperatorType r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f80583a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f80584b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f80585c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final d a(AlertConditionItemType r2, AlertConditionOperatorType r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "item");
        kotlin.jvm.internal.p.l(r3, "operator");
        kotlin.jvm.internal.p.l(r4, "value");
        return new d(r2, r3, r4);
    }

    public final AlertConditionItemType c() {
        return this.f80583a;
    }

    public final AlertConditionOperatorType d() {
        return this.f80584b;
    }

    public final String e() {
        return this.f80585c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f80583a == r52.f80583a) goto L12;
        return false;
    L12:
        if (this.f80584b == r52.f80584b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80585c, r52.f80585c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f80583a.hashCode() * 31) + this.f80584b.hashCode()) * 31) + this.f80585c.hashCode();
    }

    public String toString() {
        return "AlertConditionEntity(item=" + this.f80583a + ", operator=" + this.f80584b + ", value=" + this.f80585c + ")";
    }
}
