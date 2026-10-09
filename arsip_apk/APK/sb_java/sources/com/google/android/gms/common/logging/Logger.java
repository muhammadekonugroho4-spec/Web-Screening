package com.google.android.gms.common.logging;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

@KeepForSdk
/* loaded from: classes5.dex */
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(String r7, String... r8) {
        int r02 = r8.length;
        if (r02 != 0) goto L5;
        String r82 = "";
    L12:
        this.zzb = r82;
        this.zza = r7;
        this.zzc = new GmsLogger(r7);
        int r72 = 2;
    L14:
        if (r72 > 7) goto L18;
        if (Log.isLoggable(this.zza, r72) == true) goto L18;
        r72 = r72 + 1;
    L18:
        this.zzd = r72;
        return;
    L5:
        StringBuilder r1 = new StringBuilder();
        r1.append('[');
        int r2 = 0;
    L6:
        if (r2 >= r02) goto L11;
        String r3 = r8[r2];
        if (r1.length() <= 1) goto L10;
        r1.append(Constants.SEPARATOR_COMMA);
    L10:
        r1.append(r3);
        r2 = r2 + 1;
        goto L6
    L11:
        r1.append("] ");
        r82 = r1.toString();
        goto L12
    }

    @KeepForSdk
    public void d(String r2, Object... r3) {
        if (isLoggable(3) == false) goto L6;
        Log.d(this.zza, format(r2, r3));
        return;
    }

    @KeepForSdk
    public void e(String r2, Throwable r3, Object... r4) {
        Log.e(this.zza, format(r2, r4), r3);
    }

    @KeepForSdk
    public String format(String r2, Object... r3) {
        if (r3 == null) goto L7;
        if (r3.length <= 0) goto L7;
        r2 = String.format(Locale.US, r2, r3);
    L7:
        return this.zzb.concat(r2);
    }

    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    public void i(String r2, Object... r3) {
        Log.i(this.zza, format(r2, r3));
    }

    @KeepForSdk
    public boolean isLoggable(int r2) {
        if (this.zzd > r2) goto L6;
        return true;
    L6:
        return false;
    }

    @KeepForSdk
    public void v(String r2, Throwable r3, Object... r4) {
        if (isLoggable(2) == false) goto L6;
        Log.v(this.zza, format(r2, r4), r3);
        return;
    }

    @KeepForSdk
    public void w(String r2, Object... r3) {
        Log.w(this.zza, format(r2, r3));
    }

    @KeepForSdk
    public void wtf(String r2, Throwable r3, Object... r4) {
        Log.wtf(this.zza, format(r2, r4), r3);
    }

    @KeepForSdk
    public void e(String r2, Object... r3) {
        Log.e(this.zza, format(r2, r3));
    }

    @KeepForSdk
    public void wtf(Throwable r2) {
        Log.wtf(this.zza, r2);
    }

    @KeepForSdk
    public void v(String r2, Object... r3) {
        if (isLoggable(2) == false) goto L6;
        Log.v(this.zza, format(r2, r3));
        return;
    }
}
