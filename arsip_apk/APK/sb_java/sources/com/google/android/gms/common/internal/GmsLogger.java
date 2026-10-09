package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public final class GmsLogger {
    private final String zza;
    private final String zzb;

    @KeepForSdk
    public GmsLogger(String r2) {
        this(r2, null);
    }

    private final String zza(String r2) {
        String r02 = this.zzb;
        if (r02 != null) goto L6;
        return r2;
    L6:
        return r02.concat(r2);
    }

    private final String zzb(String r2, Object... r3) {
        String r02 = this.zzb;
        String r22 = String.format(r2, r3);
        if (r02 != null) goto L6;
        return r22;
    L6:
        return r02.concat(r22);
    }

    @KeepForSdk
    public boolean canLog(int r2) {
        return Log.isLoggable(this.zza, r2);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    public void d(String r2, String r3) {
        if (canLog(3) == false) goto L6;
        Log.d(r2, zza(r3));
        return;
    }

    @KeepForSdk
    public void e(String r2, String r3) {
        if (canLog(6) == false) goto L6;
        Log.e(r2, zza(r3));
        return;
    }

    @KeepForSdk
    public void efmt(String r2, String r3, Object... r4) {
        if (canLog(6) == false) goto L6;
        Log.e(r2, zzb(r3, r4));
        return;
    }

    @KeepForSdk
    public void i(String r2, String r3) {
        if (canLog(4) == false) goto L6;
        Log.i(r2, zza(r3));
        return;
    }

    @KeepForSdk
    public void pii(String r1, String r2) {
    }

    @KeepForSdk
    public void v(String r2, String r3) {
        if (canLog(2) == false) goto L6;
        Log.v(r2, zza(r3));
        return;
    }

    @KeepForSdk
    public void w(String r2, String r3) {
        if (canLog(5) == false) goto L6;
        Log.w(r2, zza(r3));
        return;
    }

    @KeepForSdk
    public void wfmt(String r1, String r2, Object... r3) {
        if (canLog(5) == false) goto L6;
        Log.w(this.zza, zzb(r2, r3));
        return;
    }

    @KeepForSdk
    public void wtf(String r2, String r3, Throwable r4) {
        if (canLog(7) == false) goto L6;
        Log.e(r2, zza(r3), r4);
        Log.wtf(r2, zza(r3), r4);
        return;
    }

    @KeepForSdk
    public GmsLogger(String r4, String r5) {
        Preconditions.checkNotNull(r4, "log tag cannot be null");
        Object[] r2 = {r4, 23};
        if (r4.length() > 23) goto L5;
        boolean r02 = true;
    L6:
        Preconditions.checkArgument(r02, "tag \"%s\" is longer than the %d character maximum", r2);
        this.zza = r4;
        if (r5 != null) goto L9;
    L10:
        r5 = null;
    L11:
        this.zzb = r5;
        return;
    L9:
        if (r5.length() > 0) goto L11;
    L5:
        r02 = false;
        goto L6
    }

    @KeepForSdk
    public void pii(String r1, String r2, Throwable r3) {
    }

    @KeepForSdk
    public void d(String r2, String r3, Throwable r4) {
        if (canLog(3) == false) goto L6;
        Log.d(r2, zza(r3), r4);
        return;
    }

    @KeepForSdk
    public void e(String r2, String r3, Throwable r4) {
        if (canLog(6) == false) goto L6;
        Log.e(r2, zza(r3), r4);
        return;
    }

    @KeepForSdk
    public void i(String r2, String r3, Throwable r4) {
        if (canLog(4) == false) goto L6;
        Log.i(r2, zza(r3), r4);
        return;
    }

    @KeepForSdk
    public void v(String r2, String r3, Throwable r4) {
        if (canLog(2) == false) goto L6;
        Log.v(r2, zza(r3), r4);
        return;
    }

    @KeepForSdk
    public void w(String r2, String r3, Throwable r4) {
        if (canLog(5) == false) goto L6;
        Log.w(r2, zza(r3), r4);
        return;
    }
}
