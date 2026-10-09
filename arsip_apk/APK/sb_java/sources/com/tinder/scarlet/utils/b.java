package com.tinder.scarlet.utils;

import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b implements io.reactivex.functions.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f173781a;

    public b(l r1) {
        this.f173781a = r1;
    }

    @Override // io.reactivex.functions.c
    public final /* synthetic */ void accept(Object r2) {
        p.k(this.f173781a.invoke(r2), "invoke(...)");
    }
}
