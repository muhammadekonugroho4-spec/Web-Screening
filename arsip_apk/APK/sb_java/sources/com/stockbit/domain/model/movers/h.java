package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final i f84375a;

    /* renamed from: b, reason: collision with root package name */
    public final i f84376b;

    /* renamed from: c, reason: collision with root package name */
    public final i f84377c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final i f84378e;

    /* renamed from: f, reason: collision with root package name */
    public final i f84379f;

    /* renamed from: g, reason: collision with root package name */
    public final i f84380g;

    public h(i r2, i r3, i r4, i r5, i r6, i r7, i r8) {
        kotlin.jvm.internal.p.l(r2, "iep");
        kotlin.jvm.internal.p.l(r3, "iev");
        kotlin.jvm.internal.p.l(r4, "ieval");
        kotlin.jvm.internal.p.l(r5, "iepChange");
        kotlin.jvm.internal.p.l(r6, "iepChangePrev");
        kotlin.jvm.internal.p.l(r7, "iepPriceDiff");
        kotlin.jvm.internal.p.l(r8, "iepPrevPriceDiff");
        this.f84375a = r2;
        this.f84376b = r3;
        this.f84377c = r4;
        this.d = r5;
        this.f84378e = r6;
        this.f84379f = r7;
        this.f84380g = r8;
    }

    public final i a() {
        return this.f84375a;
    }

    public final i b() {
        return this.d;
    }

    public final i c() {
        return this.f84378e;
    }

    public final i d() {
        return this.f84380g;
    }

    public final i e() {
        return this.f84379f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f84375a, r52.f84375a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84376b, r52.f84376b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84377c, r52.f84377c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f84378e, r52.f84378e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f84379f, r52.f84379f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f84380g, r52.f84380g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final i f() {
        return this.f84376b;
    }

    public final i g() {
        return this.f84377c;
    }

    public int hashCode() {
        return (((((((((((this.f84375a.hashCode() * 31) + this.f84376b.hashCode()) * 31) + this.f84377c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84378e.hashCode()) * 31) + this.f84379f.hashCode()) * 31) + this.f84380g.hashCode();
    }

    public String toString() {
        return "MoversIepIevDetailEntity(iep=" + this.f84375a + ", iev=" + this.f84376b + ", ieval=" + this.f84377c + ", iepChange=" + this.d + ", iepChangePrev=" + this.f84378e + ", iepPriceDiff=" + this.f84379f + ", iepPrevPriceDiff=" + this.f84380g + ")";
    }
}
