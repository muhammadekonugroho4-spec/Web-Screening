package com.stockbit.onboarding.generated.callback;

import kotlin.w;

/* loaded from: classes10.dex */
public final class a implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1074a f123366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123367b;

    /* renamed from: com.stockbit.onboarding.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1074a {
        w c(int r1);
    }

    public a(InterfaceC1074a r1, int r2) {
        this.f123366a = r1;
        this.f123367b = r2;
    }

    public w a() {
        return this.f123366a.c(this.f123367b);
    }

    @Override // kotlin.jvm.functions.a
    public /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
