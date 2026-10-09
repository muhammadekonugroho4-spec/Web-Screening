package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
/* loaded from: classes5.dex */
public class LifecycleCallback {

    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    public LifecycleCallback(LifecycleFragment r1) {
        this.mLifecycleFragment = r1;
    }

    @KeepForSdk
    public static LifecycleFragment getFragment(Activity r1) {
        return getFragment(new LifecycleActivity(r1));
    }

    @KeepForSdk
    public void dump(String r1, FileDescriptor r2, PrintWriter r3, String[] r4) {
    }

    @KeepForSdk
    public Activity getActivity() {
        Activity r02 = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(r02);
        return r02;
    }

    @KeepForSdk
    public void onActivityResult(int r1, int r2, Intent r3) {
    }

    @KeepForSdk
    public void onCreate(Bundle r1) {
    }

    @KeepForSdk
    public void onDestroy() {
    }

    @KeepForSdk
    public void onResume() {
    }

    @KeepForSdk
    public void onSaveInstanceState(Bundle r1) {
    }

    @KeepForSdk
    public void onStart() {
    }

    @KeepForSdk
    public void onStop() {
    }

    @KeepForSdk
    public static LifecycleFragment getFragment(ContextWrapper r02) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public static LifecycleFragment getFragment(LifecycleActivity r1) {
        if (r1.zzd() == false) goto L7;
        return zzd.zza(r1.zzb());
    L7:
        if (r1.zzc() == false) goto L11;
        return zza.zza(r1.zza());
    L11:
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
