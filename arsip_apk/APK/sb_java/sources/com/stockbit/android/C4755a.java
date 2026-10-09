package com.stockbit.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.stockbit.android.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4755a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final C4755a f46563a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f46564b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f46565c = 0;

    static {
        f46563a = new C4755a();
        f46565c = 8;
    }

    public C4755a() {
    }

    public final boolean a() {
        if (f46564b <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r1, Bundle r2) {
        kotlin.jvm.internal.p.l(r1, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "activity");
        f46564b--;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "activity");
        f46564b++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity r2, Bundle r3) {
        kotlin.jvm.internal.p.l(r2, "p0");
        kotlin.jvm.internal.p.l(r3, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "p0");
    }
}
