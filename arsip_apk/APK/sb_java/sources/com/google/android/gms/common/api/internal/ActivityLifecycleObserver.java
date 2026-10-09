package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public abstract class ActivityLifecycleObserver {
    public ActivityLifecycleObserver() {
    }

    @KeepForSdk
    public static final ActivityLifecycleObserver of(Activity r1) {
        return new zab(zaa.zaa(r1));
    }

    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(Runnable r1);
}
