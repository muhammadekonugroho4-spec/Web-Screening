package com.stockbit.common.utils.recyclerview;

import android.content.Context;
import androidx.recyclerview.widget.q;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a extends q {
    static {
    }

    public a(Context r2) {
        p.l(r2, "context");
        super(r2);
    }

    @Override // androidx.recyclerview.widget.q
    public int calculateDtToFit(int r1, int r2, int r3, int r4, int r5) {
        return (r3 + ((r4 - r3) / 2)) - (r1 + ((r2 - r1) / 2));
    }
}
