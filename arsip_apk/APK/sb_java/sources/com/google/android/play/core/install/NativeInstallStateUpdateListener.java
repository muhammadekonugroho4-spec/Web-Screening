package com.google.android.play.core.install;

/* loaded from: classes5.dex */
final class NativeInstallStateUpdateListener implements InstallStateUpdatedListener {
    public NativeInstallStateUpdateListener() {
    }

    /* renamed from: onStateUpdate, reason: avoid collision after fix types in other method */
    public native void onStateUpdate2(InstallState r1);

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final /* bridge */ /* synthetic */ void onStateUpdate(InstallState r1) {
        onStateUpdate2(r1);
    }
}
