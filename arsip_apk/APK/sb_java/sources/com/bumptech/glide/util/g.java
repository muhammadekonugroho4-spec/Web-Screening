package com.bumptech.glide.util;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final double f33390a = 0.0d;

    static {
        f33390a = 1.0d / Math.pow(10.0d, 6.0d);
    }

    public static double a(long r2) {
        return (b() - r2) * f33390a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
