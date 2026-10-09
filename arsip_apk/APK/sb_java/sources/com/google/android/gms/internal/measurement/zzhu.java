package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.C2337a;

/* loaded from: classes5.dex */
public final class zzhu {
    private static final C2337a zza = null;

    static {
        zza = new C2337a();
    }

    public static synchronized Uri zza(String r5) {
        monitor-enter(zzhu.class);
        C2337a r1 = zza;     // Catch: Throwable -> L8
        Uri r2 = (Uri) r1.get(r5);     // Catch: Throwable -> L8
        if (r2 != null) goto L10;
        r2 = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(r5));     // Catch: Throwable -> L8
        r1.put(r5, r2);     // Catch: Throwable -> L8
    L10:
        monitor-exit(zzhu.class);
        return r2;
    L8:
        th = move-exception;
        throw th;
    }

    public static String zza(Context r2, String r3) {
        if (r3.contains("#") == true) goto L7;
        return r3 + "#" + r2.getPackageName();
    L7:
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + r3);
    }

    public static boolean zza(String r1, String r2) {
        if (r1.equals("eng") == true) goto L7;
        if (r1.equals("userdebug") == true) goto L7;
        return false;
    L7:
        if (r2.contains("dev-keys") == false) goto L9;
        return true;
    L9:
        if (r2.contains("test-keys") == true) goto L16;
        return false;
    L16:
        return true;
    }
}
