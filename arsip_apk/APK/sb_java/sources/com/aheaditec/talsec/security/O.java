package com.aheaditec.talsec.security;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class O {
    public static /* bridge */ /* synthetic */ ApplicationInfo a(PackageManager r02, String r1, PackageManager.ApplicationInfoFlags r2) {
        return r02.getApplicationInfo(r1, r2);
    }
}
