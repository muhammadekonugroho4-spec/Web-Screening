package com.stockbit.referral.ui.spinningwheel;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f129086a = null;

    static {
        f129086a = new b();
    }

    public b() {
    }

    public final float a(float r2, Context r3) {
        p.l(r3, "context");
        return TypedValue.applyDimension(1, r2, r3.getResources().getDisplayMetrics());
    }
}
