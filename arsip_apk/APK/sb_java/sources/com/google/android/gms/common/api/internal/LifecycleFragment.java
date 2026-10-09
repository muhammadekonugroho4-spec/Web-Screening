package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public interface LifecycleFragment {
    @KeepForSdk
    void addCallback(String r1, LifecycleCallback r2);

    @KeepForSdk
    <T extends LifecycleCallback> T getCallbackOrNull(String r1, Class<T> r2);

    @KeepForSdk
    Activity getLifecycleActivity();

    @KeepForSdk
    boolean isCreated();

    @KeepForSdk
    boolean isStarted();

    @KeepForSdk
    void startActivityForResult(Intent r1, int r2);
}
