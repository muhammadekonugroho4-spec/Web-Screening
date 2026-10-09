package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* loaded from: classes5.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private static final s f38343a = null;

    static {
        f38343a = new s("PhoneskyVerificationUtils");
    }

    public static int a(Context r2) {
        PackageInfo r22 = r2.getPackageManager().getPackageInfo("com.android.vending", 64);     // Catch: PackageManager.NameNotFoundException -> L14
        ApplicationInfo r02 = r22.applicationInfo;
        if (r02 != null) goto L6;
        return 0;
    L6:
        if (r02.enabled == true) goto L8;
        return 0;
    L8:
        if (c(r22.signatures) == true) goto L11;
        return 0;
    L11:
        return r22.versionCode;
    L19:
        return 0;
    }

    public static boolean b(Context r3) {
        if (r3.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled == false) goto L10;
        if (c(r3.getPackageManager().getPackageInfo("com.android.vending", 64).signatures) == false) goto L10;
        return true;
    L10:
        return false;
    }

    private static boolean c(Signature[] r6) {
        if (r6 == null) goto L20;
        int r1 = r6.length;
        if (r1 == 0) goto L20;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L19;
        String r3 = ah.a(r6[r2].toByteArray());
        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(r3) == true) goto L17;
        String r4 = Build.TAGS;
        if (r4.contains("dev-keys") == true) goto L15;
        if (r4.contains("test-keys") == true) goto L15;
    L16:
        r2 = r2 + 1;
    L15:
        if ("GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(r3) == false) goto L16;
        return true;
    L17:
        return true;
    L19:
        return false;
    L20:
        f38343a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
        return false;
    }
}
