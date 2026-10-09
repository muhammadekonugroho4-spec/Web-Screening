package com.stockbit.personalamend.generated.callback;

import kotlin.w;

/* loaded from: classes10.dex */
public final class a implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1101a f125270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125271b;

    /* renamed from: com.stockbit.personalamend.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1101a {
        w c(int r1);
    }

    public a(InterfaceC1101a r1, int r2) {
        this.f125270a = r1;
        this.f125271b = r2;
    }

    public w a() {
        return this.f125270a.c(this.f125271b);
    }

    @Override // kotlin.jvm.functions.a
    public /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
