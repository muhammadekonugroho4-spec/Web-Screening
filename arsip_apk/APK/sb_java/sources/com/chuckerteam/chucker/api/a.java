package com.chuckerteam.chucker.api;

import android.content.Context;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f33411a;

    public a(Context r2, boolean r3, RetentionManager$Period r4) {
        p.l(r2, "context");
        p.l(r4, "retentionPeriod");
        this.f33411a = r3;
    }

    public /* synthetic */ a(Context r1, boolean r2, RetentionManager$Period r3, int r4, i r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = RetentionManager$Period.ONE_WEEK;
    L8:
        this(r1, r2, r3);
    }
}
