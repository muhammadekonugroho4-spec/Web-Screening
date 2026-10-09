package com.stockbit.company.generated.callback;

import kotlin.w;

/* loaded from: classes7.dex */
public final class a implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0650a f64262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64263b;

    /* renamed from: com.stockbit.company.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0650a {
        w c(int r1);
    }

    public a(InterfaceC0650a r1, int r2) {
        this.f64262a = r1;
        this.f64263b = r2;
    }

    public w a() {
        return this.f64262a.c(this.f64263b);
    }

    @Override // kotlin.jvm.functions.a
    public /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
