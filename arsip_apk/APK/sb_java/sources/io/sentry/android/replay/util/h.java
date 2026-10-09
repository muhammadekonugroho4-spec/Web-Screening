package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f176010a;

    static {
    }

    public h(Looper r2) {
        kotlin.jvm.internal.p.l(r2, "looper");
        this.f176010a = new Handler(r2);
    }

    public final Handler a() {
        return this.f176010a;
    }

    public final boolean b(Runnable r2) {
        kotlin.jvm.internal.p.l(r2, "runnable");
        return this.f176010a.post(r2);
    }

    public final boolean c(Runnable r2, long r3) {
        Handler r02 = this.f176010a;
        if (r2 != null) goto L7;
        return false;
    L7:
        return r02.postDelayed(r2, r3);
    }

    public final void d(Runnable r2) {
        Handler r02 = this.f176010a;
        if (r2 != null) goto L5;
        return;
    L5:
        r02.removeCallbacks(r2);
    }

    public /* synthetic */ h(Looper r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = Looper.getMainLooper();
        kotlin.jvm.internal.p.k(r1, "getMainLooper(...)");
    L5:
        this(r1);
    }
}
