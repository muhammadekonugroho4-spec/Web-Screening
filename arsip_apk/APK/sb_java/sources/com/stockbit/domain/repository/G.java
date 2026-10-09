package com.stockbit.domain.repository;

/* loaded from: classes8.dex */
public interface G {
    static /* synthetic */ Object b(G r02, String r1, String r2, kotlin.coroutines.e r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r2 = "json";
    L7:
        return r02.a(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEmbed");
    }

    Object a(String r1, String r2, kotlin.coroutines.e r3);
}
