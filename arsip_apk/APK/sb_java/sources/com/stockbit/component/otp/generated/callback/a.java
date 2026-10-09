package com.stockbit.component.otp.generated.callback;

import kotlin.w;

/* loaded from: classes7.dex */
public final class a implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0715a f73365a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73366b;

    /* renamed from: com.stockbit.component.otp.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0715a {
        w c(int r1);
    }

    public a(InterfaceC0715a r1, int r2) {
        this.f73365a = r1;
        this.f73366b = r2;
    }

    public w a() {
        return this.f73365a.c(this.f73366b);
    }

    @Override // kotlin.jvm.functions.a
    public /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
