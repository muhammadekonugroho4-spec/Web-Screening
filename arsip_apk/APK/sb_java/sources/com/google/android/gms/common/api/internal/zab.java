package com.google.android.gms.common.api.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    public zab(zaa r2) {
        this.zaa = new WeakReference(r2);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    @CanIgnoreReturnValue
    public final ActivityLifecycleObserver onStopCallOnce(Runnable r2) {
        zaa r02 = (zaa) this.zaa.get();
        if (r02 == null) goto L7;
        zaa.zab(r02, r2);
        return this;
    L7:
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
