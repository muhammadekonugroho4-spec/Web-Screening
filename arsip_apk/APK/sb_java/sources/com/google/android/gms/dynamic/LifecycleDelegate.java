package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public interface LifecycleDelegate {
    @KeepForSdk
    void onCreate(Bundle r1);

    @KeepForSdk
    View onCreateView(LayoutInflater r1, ViewGroup r2, Bundle r3);

    @KeepForSdk
    void onDestroy();

    @KeepForSdk
    void onDestroyView();

    @KeepForSdk
    void onInflate(Activity r1, Bundle r2, Bundle r3);

    @KeepForSdk
    void onLowMemory();

    @KeepForSdk
    void onPause();

    @KeepForSdk
    void onResume();

    @KeepForSdk
    void onSaveInstanceState(Bundle r1);

    @KeepForSdk
    void onStart();

    @KeepForSdk
    void onStop();
}
