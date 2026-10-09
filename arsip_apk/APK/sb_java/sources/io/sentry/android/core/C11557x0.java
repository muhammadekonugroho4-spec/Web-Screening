package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: io.sentry.android.core.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11557x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f175672a;

    public C11557x0() {
        this(Looper.getMainLooper());
    }

    public Thread a() {
        return this.f175672a.getLooper().getThread();
    }

    public void b(Runnable r2) {
        this.f175672a.post(r2);
    }

    public C11557x0(Looper r2) {
        this.f175672a = new Handler(r2);
    }
}
