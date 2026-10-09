package com.skydoves.balloon;

import android.view.View;

/* loaded from: classes6.dex */
public final /* synthetic */ class j implements q, kotlin.jvm.internal.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.l f44149a;

    public j(kotlin.jvm.functions.l r2) {
        kotlin.jvm.internal.p.l(r2, "function");
        this.f44149a = r2;
    }

    @Override // com.skydoves.balloon.q
    public final /* synthetic */ void a(View r2) {
        this.f44149a.invoke(r2);
    }

    @Override // kotlin.jvm.internal.l
    public final kotlin.g b() {
        return this.f44149a;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof q) == true) goto L5;
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
