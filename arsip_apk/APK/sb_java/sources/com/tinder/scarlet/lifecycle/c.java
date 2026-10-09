package com.tinder.scarlet.lifecycle;

import kotlin.jvm.functions.p;

/* loaded from: classes2.dex */
public final class c implements io.reactivex.functions.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f173769a;

    public c(p r1) {
        this.f173769a = r1;
    }

    @Override // io.reactivex.functions.b
    public final /* synthetic */ boolean a(Object r2, Object r3) {
        Object r22 = this.f173769a.invoke(r2, r3);
        kotlin.jvm.internal.p.k(r22, "invoke(...)");
        return ((Boolean) r22).booleanValue();
    }
}
