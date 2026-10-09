package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
interface PatternCompiler {
    CommonPattern compile(String r1);

    boolean isPcreLike();
}
