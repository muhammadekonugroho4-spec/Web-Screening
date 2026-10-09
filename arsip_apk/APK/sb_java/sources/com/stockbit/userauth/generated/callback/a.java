package com.stockbit.userauth.generated.callback;

import kotlin.w;

/* loaded from: classes2.dex */
public final class a implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1738a f165083a;

    /* renamed from: b, reason: collision with root package name */
    public final int f165084b;

    /* renamed from: com.stockbit.userauth.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1738a {
        w c(int r1);
    }

    public a(InterfaceC1738a r1, int r2) {
        this.f165083a = r1;
        this.f165084b = r2;
    }

    public w a() {
        return this.f165083a.c(this.f165084b);
    }

    @Override // kotlin.jvm.functions.a
    public /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
