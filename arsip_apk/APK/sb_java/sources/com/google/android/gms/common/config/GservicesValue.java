package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public abstract class GservicesValue<T> {
    private static final Object zzc = null;
    protected final String zza;
    protected final Object zzb;
    private Object zzd;

    static {
        zzc = new Object();
    }

    public GservicesValue(String r2, Object r3) {
        this.zzd = null;
        this.zza = r2;
        this.zzb = r3;
    }

    @KeepForSdk
    public static boolean isInitialized() {
        Object r02 = zzc;
        monitor-enter(r02);
        monitor-exit(r02);     // Catch: Throwable -> L7
        return false;
    L7:
        th = move-exception;
        throw th;
    }

    @KeepForSdk
    public static GservicesValue<Float> value(String r1, Float r2) {
        return new zzd(r1, r2);
    }

    @KeepForSdk
    public final T get() {
        T r02 = (T) this.zzd;
        if (r02 == null) goto L5;
        return r02;
    L5:
        StrictMode.ThreadPolicy r03 = StrictMode.allowThreadDiskReads();
        Object r1 = zzc;
        monitor-enter(r1);
        monitor-exit(r1);     // Catch: Throwable -> L28
        monitor-enter(r1);
        monitor-exit(r1);     // Catch: Throwable -> L25
        T r12 = (T) zza(this.zza);
    L18:
        StrictMode.setThreadPolicy(r03);
        return r12;
    L14:
        long r13 = Binder.clearCallingIdentity();     // Catch: Throwable -> L12
        Object r3 = zza(this.zza);     // Catch: Throwable -> L20
        Binder.restoreCallingIdentity(r13);     // Catch: Throwable -> L12
        r12 = (T) r3;
        goto L18
    L20:
        th = move-exception;
        Binder.restoreCallingIdentity(r13);     // Catch: Throwable -> L12
        throw th;     // Catch: Throwable -> L12
    L25:
        th = move-exception;
        throw th;
    L12:
        th = move-exception;
        StrictMode.setThreadPolicy(r03);
        throw th;
    L28:
        th = move-exception;
        throw th;
    }

    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @KeepForSdk
    public void override(T r3) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzd = r3;
        Object r32 = zzc;
        monitor-enter(r32);
        monitor-enter(r32);     // Catch: Throwable -> L8
        monitor-exit(r32);     // Catch: Throwable -> L10
        monitor-exit(r32);     // Catch: Throwable -> L8
        return;
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    @KeepForSdk
    public void resetOverride() {
        this.zzd = null;
    }

    public abstract Object zza(String r1);

    @KeepForSdk
    public static GservicesValue<Integer> value(String r1, Integer r2) {
        return new zzc(r1, r2);
    }

    @KeepForSdk
    public static GservicesValue<Long> value(String r1, Long r2) {
        return new zzb(r1, r2);
    }

    @KeepForSdk
    public static GservicesValue<String> value(String r1, String r2) {
        return new zze(r1, r2);
    }

    @KeepForSdk
    public static GservicesValue<Boolean> value(String r1, boolean r2) {
        return new zza(r1, Boolean.valueOf(r2));
    }
}
