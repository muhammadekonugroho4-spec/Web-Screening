package com.stockbit.usecase.chat.usecase.websocket;

import com.stockbit.domain.model.websocket.social.a;
import com.stockbit.repository.K2;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final K2 f155987a;

    public b(K2 r2) {
        p.l(r2, "webSocketSocialRepository");
        this.f155987a = r2;
    }

    public final void a(int r3) {
        this.f155987a.a(new a.b.C0809a(r3));
    }
}
