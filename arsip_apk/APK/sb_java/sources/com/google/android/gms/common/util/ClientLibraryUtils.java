package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

@KeepForSdk
/* loaded from: classes5.dex */
public class ClientLibraryUtils {
    private ClientLibraryUtils() {
    }

    @KeepForSdk
    public static int getClientVersion(Context r1, String r2) {
        PackageInfo r12 = getPackageInfo(r1, r2);
        if (r12 == null) goto L11;
        ApplicationInfo r13 = r12.applicationInfo;
        if (r13 == null) goto L11;
        Bundle r14 = r13.metaData;
        if (r14 == null) goto L11;
        return r14.getInt("com.google.android.gms.version", -1);
    L11:
        return -1;
    }

    @KeepForSdk
    public static PackageInfo getPackageInfo(Context r1, String r2) {
        return Wrappers.packageManager(r1).getPackageInfo(r2, 128);
    L4:
        return null;
    }

    @KeepForSdk
    public static boolean isPackageSide() {
        return false;
    }
}
