package com.skydoves.balloon;

/* loaded from: classes6.dex */
public final /* synthetic */ class k implements r, kotlin.jvm.internal.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.a f44150a;

    public k(kotlin.jvm.functions.a r2) {
        kotlin.jvm.internal.p.l(r2, "function");
        this.f44150a = r2;
    }

    @Override // com.skydoves.balloon.r
    public final /* synthetic */ void a() {
        this.f44150a.invoke();
    }

    @Override // kotlin.jvm.internal.l
    public final kotlin.g b() {
        return this.f44150a;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof r) == true) goto L5;
    L8:
        return false;
    L5:
        if ((r3 instanceof kotlin.jvm.internal.l) == false) goto L8;
        return kotlin.jvm.internal.p.g(b(), ((kotlin.jvm.internal.l) r3).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
