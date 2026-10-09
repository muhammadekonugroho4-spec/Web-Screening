package com.stockbit.setting.ui.ktur;

import java.util.List;

/* loaded from: classes11.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.ktur.resource.a f136014a;

    /* renamed from: b, reason: collision with root package name */
    public final List f136015b;

    /* renamed from: c, reason: collision with root package name */
    public final List f136016c;

    static {
    }

    public x(com.stockbit.usecase.ktur.resource.a r2, List r3, List r4) {
        kotlin.jvm.internal.p.l(r2, "resource");
        kotlin.jvm.internal.p.l(r3, "today");
        kotlin.jvm.internal.p.l(r4, "upcoming");
        this.f136014a = r2;
        this.f136015b = r3;
        this.f136016c = r4;
    }

    public static /* synthetic */ x b(x r02, com.stockbit.usecase.ktur.resource.a r1, List r2, List r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f136014a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f136015b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f136016c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final x a(com.stockbit.usecase.ktur.resource.a r2, List r3, List r4) {
        kotlin.jvm.internal.p.l(r2, "resource");
        kotlin.jvm.internal.p.l(r3, "today");
        kotlin.jvm.internal.p.l(r4, "upcoming");
        return new x(r2, r3, r4);
    }

    public final com.stockbit.usecase.ktur.resource.a c() {
        return this.f136014a;
    }

    public final List d() {
        return this.f136015b;
    }

    public final List e() {
        return this.f136016c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof x) == true) goto L8;
        return false;
    L8:
        x r52 = (x) r5;
        if (kotlin.jvm.internal.p.g(this.f136014a, r52.f136014a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f136015b, r52.f136015b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f136016c, r52.f136016c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f136014a.hashCode() * 31) + this.f136015b.hashCode()) * 31) + this.f136016c.hashCode();
    }

    public String toString() {
        return "KTURScreenUIState(resource=" + this.f136014a + ", today=" + this.f136015b + ", upcoming=" + this.f136016c + ')';
    }
}
