package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C11617l1;

/* loaded from: classes3.dex */
public class C implements io.sentry.V {
    public C() {
    }

    @Override // io.sentry.V
    public void c() {
    }

    @Override // io.sentry.V
    public void d(C11617l1 r7) {
        long r02 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long r2 = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        r7.f(Long.valueOf(r02));
        r7.g(Long.valueOf(r2));
    }
}
