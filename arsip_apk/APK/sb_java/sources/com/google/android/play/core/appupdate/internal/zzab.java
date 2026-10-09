package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* loaded from: classes5.dex */
public final class zzab {
    private static final zzm zza = null;

    static {
        zza = new zzm("PhoneskyVerificationUtils");
    }

    public static boolean zza(Context r6) {
        if (r6.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled == false) goto L24;
        Signature[] r62 = r6.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;     // Catch: PackageManager.NameNotFoundException -> L25
        if (r62 == null) goto L23;
        int r02 = r62.length;
        if (r02 == 0) goto L23;
        int r2 = 0;
    L11:
        if (r2 >= r02) goto L24;
        String r3 = zzaa.zza(r62[r2].toByteArray());
        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(r3) == true) goto L33;
        String r4 = Build.TAGS;
        if (r4.contains("dev-keys") == true) goto L19;
        if (r4.contains("test-keys") == true) goto L19;
    L20:
        r2 = r2 + 1;
    L19:
        if ("GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(r3) == false) goto L20;
        return true;
    L33:
        return true;
    L23:
        zza.zze("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
    L24:
        return false;
    }
}
