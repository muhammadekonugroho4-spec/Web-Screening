package com.skydoves.balloon;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public final /* synthetic */ class m implements t, kotlin.jvm.internal.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.p f44152a;

    public m(kotlin.jvm.functions.p r2) {
        kotlin.jvm.internal.p.l(r2, "function");
        this.f44152a = r2;
    }

    @Override // com.skydoves.balloon.t
    public final /* synthetic */ void a(View r2, MotionEvent r3) {
        this.f44152a.invoke(r2, r3);
    }

    @Override // kotlin.jvm.internal.l
    public final kotlin.g b() {
        return this.f44152a;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof t) == true) goto L5;
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
