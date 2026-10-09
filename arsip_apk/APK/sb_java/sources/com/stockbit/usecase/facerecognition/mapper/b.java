package com.stockbit.usecase.facerecognition.mapper;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {
    public b() {
    }

    public final com.stockbit.usecase.facerecognition.model.b a(com.stockbit.domain.model.facerecognition.b r8, String r9) {
        p.l(r8, "entity");
        p.l(r9, "username");
        String r4 = r8.b();
        String r6 = r8.a();
        String r5 = r8.c();
        return new com.stockbit.usecase.facerecognition.model.b(r8.b(), r9, r4, r5, r6);
    }
}
