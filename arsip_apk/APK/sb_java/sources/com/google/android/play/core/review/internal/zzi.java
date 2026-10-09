package com.google.android.play.core.review.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzi {
    private final String zza;

    public zzi(String r5) {
        this.zza = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(r5);
    }

    private static String zzf(String r3, String r4, Object... r5) {
        if (r5.length <= 0) goto L9;
        r4 = String.format(Locale.US, r4, r5);     // Catch: IllegalFormatException -> L6
    L6:
        e = move-exception;
        Log.e("PlayCore", "Unable to format ".concat(r4), e);
        r4 = r4 + " [" + TextUtils.join(", ", r5) + Constants.AES_SUFFIX;
    L9:
        return r3 + " : " + r4;
    }

    public final int zza(String r3, Object... r4) {
        if (Log.isLoggable("PlayCore", 3) == true) goto L5;
        return 0;
    L5:
        return Log.d("PlayCore", zzf(this.zza, "Already connected to the service.", r4));
    }

    public final int zzb(String r3, Object... r4) {
        if (Log.isLoggable("PlayCore", 6) == true) goto L5;
        return 0;
    L5:
        return Log.e("PlayCore", zzf(this.zza, "Play Store app is either not installed or not the official version", r4));
    }

    public final int zzc(Throwable r3, String r4, Object... r5) {
        if (Log.isLoggable("PlayCore", 6) == true) goto L5;
        return 0;
    L5:
        return Log.e("PlayCore", zzf(this.zza, r4, r5), r3);
    }

    public final int zzd(String r3, Object... r4) {
        if (Log.isLoggable("PlayCore", 4) == true) goto L5;
        return 0;
    L5:
        return Log.i("PlayCore", zzf(this.zza, r3, r4));
    }

    public final int zze(String r3, Object... r4) {
        if (Log.isLoggable("PlayCore", 5) == true) goto L5;
        return 0;
    L5:
        return Log.w("PlayCore", zzf(this.zza, "Phonesky package is not signed -- possibly self-built package. Could not verify.", r4));
    }
}
