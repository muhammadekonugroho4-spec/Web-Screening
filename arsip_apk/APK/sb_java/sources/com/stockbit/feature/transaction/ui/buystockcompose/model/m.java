package com.stockbit.feature.transaction.ui.buystockcompose.model;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111640a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111641b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.l f111642c;
    public final kotlin.jvm.functions.l d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.functions.l f111643e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.jvm.functions.a f111644f;

    static {
    }

    public m(boolean r2, boolean r3, kotlin.jvm.functions.l r4, kotlin.jvm.functions.l r5, kotlin.jvm.functions.l r6, kotlin.jvm.functions.a r7) {
        kotlin.jvm.internal.p.l(r4, "onVTOCheckedChange");
        kotlin.jvm.internal.p.l(r5, "onVTOLotChange");
        kotlin.jvm.internal.p.l(r6, "onVTOTriggerPriceChange");
        kotlin.jvm.internal.p.l(r7, "onRequestVolumeTradeOrderTnC");
        this.f111640a = r2;
        this.f111641b = r3;
        this.f111642c = r4;
        this.d = r5;
        this.f111643e = r6;
        this.f111644f = r7;
    }

    public final kotlin.jvm.functions.a a() {
        return this.f111644f;
    }

    public final kotlin.jvm.functions.l b() {
        return this.f111642c;
    }

    public final kotlin.jvm.functions.l c() {
        return this.d;
    }

    public final kotlin.jvm.functions.l d() {
        return this.f111643e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (this.f111640a == r52.f111640a) goto L12;
        return false;
    L12:
        if (this.f111641b == r52.f111641b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f111642c, r52.f111642c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f111643e, r52.f111643e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f111644f, r52.f111644f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f111640a) * 31) + Boolean.hashCode(this.f111641b)) * 31) + this.f111642c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f111643e.hashCode()) * 31) + this.f111644f.hashCode();
    }

    public String toString() {
        return "BuyVolumeTriggerOrderSectionParam(isAutoOrderTnCAccepted=" + this.f111640a + ", isVTOCheckedFromTnC=" + this.f111641b + ", onVTOCheckedChange=" + this.f111642c + ", onVTOLotChange=" + this.d + ", onVTOTriggerPriceChange=" + this.f111643e + ", onRequestVolumeTradeOrderTnC=" + this.f111644f + ')';
    }
}
