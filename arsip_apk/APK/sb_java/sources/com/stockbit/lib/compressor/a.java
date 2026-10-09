package com.stockbit.lib.compressor;

import java.io.File;
import kotlin.coroutines.e;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ Object b(a r02, File r1, com.stockbit.lib.compressor.model.a r2, e r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r2 = null;
    L7:
        return r02.a(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: compress");
    }

    Object a(File r1, com.stockbit.lib.compressor.model.a r2, e r3);
}
