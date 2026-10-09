package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* loaded from: classes6.dex */
class InstallerPackageNameProvider {
    private static final String NO_INSTALLER_PACKAGE_NAME = "";
    private String installerPackageName;

    public InstallerPackageNameProvider() {
    }

    private static String loadInstallerPackageName(Context r1) {
        String r12 = r1.getPackageManager().getInstallerPackageName(r1.getPackageName());
        if (r12 != null) goto L6;
        return "";
    L6:
        return r12;
    }

    public synchronized String getInstallerPackageName(Context r2) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.installerPackageName != null) goto L9;
        this.installerPackageName = loadInstallerPackageName(r2);     // Catch: Throwable -> L6
    L9:
        if ("".equals(this.installerPackageName) == false) goto L11;
        String r22 = null;
    L12:
        monitor-exit(this);
        return r22;
    L11:
        r22 = this.installerPackageName;     // Catch: Throwable -> L6
        goto L12
    }
}
