package com.stockbit.usecase.securities.auth.usecase;

import com.stockbit.repository.local.only.b;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f160241a;

    public a(b r2) {
        p.l(r2, "sessionRepository");
        this.f160241a = r2;
    }

    public final Integer a() {
        return this.f160241a.y();
    }
}
