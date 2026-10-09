package com.stockbit.android.local.dao;

import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* renamed from: com.stockbit.android.local.dao.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4895t {
    static /* synthetic */ Object c(InterfaceC4895t r02, List r1, kotlin.coroutines.e r2) {
        r02.b();
        r02.a(r1);
        return kotlin.w.f180450a;
    }

    void a(List r1);

    void b();

    default Object d(List r1, kotlin.coroutines.e r2) {
        return c(this, r1, r2);
    }

    Flow getAll();
}
