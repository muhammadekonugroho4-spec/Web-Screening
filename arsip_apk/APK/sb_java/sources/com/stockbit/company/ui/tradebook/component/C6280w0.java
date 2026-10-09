package com.stockbit.company.ui.tradebook.component;

/* renamed from: com.stockbit.company.ui.tradebook.component.w0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6280w0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.p f68580a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f68581b;

    static {
    }

    public C6280w0(kotlin.jvm.functions.p r2, Object r3) {
        kotlin.jvm.internal.p.l(r2, "getLabel");
        this.f68580a = r2;
        this.f68581b = r3;
    }

    public final kotlin.jvm.functions.p a() {
        return this.f68580a;
    }

    public final Object b() {
        return this.f68581b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6280w0) == true) goto L8;
        return false;
    L8:
        C6280w0 r52 = (C6280w0) r5;
        if (kotlin.jvm.internal.p.g(this.f68580a, r52.f68580a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f68581b, r52.f68581b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f68580a.hashCode() * 31;
        Object r1 = this.f68581b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "TradeBookOptionUIParam(getLabel=" + this.f68580a + ", type=" + this.f68581b + ')';
    }
}
