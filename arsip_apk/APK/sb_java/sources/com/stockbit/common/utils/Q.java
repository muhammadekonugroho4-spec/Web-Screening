package com.stockbit.common.utils;

import android.os.SystemClock;
import android.view.View;

/* loaded from: classes7.dex */
public final class Q implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public int f61935a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.l f61936b;

    /* renamed from: c, reason: collision with root package name */
    public long f61937c;

    static {
    }

    public Q(int r2, kotlin.jvm.functions.l r3) {
        kotlin.jvm.internal.p.l(r3, "onSafeCLick");
        this.f61935a = r2;
        this.f61936b = r3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r5) {
        kotlin.jvm.internal.p.l(r5, "v");
        if ((SystemClock.elapsedRealtime() - this.f61937c) >= this.f61935a) goto L5;
        return;
    L5:
        this.f61937c = SystemClock.elapsedRealtime();
        this.f61936b.invoke(r5);
    }

    public /* synthetic */ Q(int r1, kotlin.jvm.functions.l r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = 1000;
    L5:
        this(r1, r2);
    }
}
