package com.tinder.scarlet.websocket.okhttp;

import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c implements io.reactivex.functions.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f173790a;

    public c(l r1) {
        this.f173790a = r1;
    }

    @Override // io.reactivex.functions.c
    public final /* synthetic */ void accept(Object r2) {
        p.k(this.f173790a.invoke(r2), "invoke(...)");
    }
}
