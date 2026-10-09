package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.d;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
/* loaded from: classes5.dex */
public class PackageManagerWrapper {
    protected final Context zza;

    public PackageManagerWrapper(Context r1) {
        this.zza = r1;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(String r2) {
        return this.zza.checkCallingOrSelfPermission(r2);
    }

    @KeepForSdk
    public int checkPermission(String r2, String r3) {
        return this.zza.getPackageManager().checkPermission(r2, r3);
    }

    @KeepForSdk
    public ApplicationInfo getApplicationInfo(String r2, int r3) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationInfo(r2, r3);
    }

    @KeepForSdk
    public CharSequence getApplicationLabel(String r4) throws PackageManager.NameNotFoundException {
        Context r02 = this.zza;
        return r02.getPackageManager().getApplicationLabel(r02.getPackageManager().getApplicationInfo(r4, 0));
    }

    @KeepForSdk
    public d getApplicationLabelAndIcon(String r3) throws PackageManager.NameNotFoundException {
        ApplicationInfo r32 = this.zza.getPackageManager().getApplicationInfo(r3, 0);
        return d.a(this.zza.getPackageManager().getApplicationLabel(r32), this.zza.getPackageManager().getApplicationIcon(r32));
    }

    @KeepForSdk
    public PackageInfo getPackageInfo(String r2, int r3) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getPackageInfo(r2, r3);
    }

    @KeepForSdk
    public String[] getPackagesForUid(int r2) {
        return this.zza.getPackageManager().getPackagesForUid(r2);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        if (Binder.getCallingUid() != Process.myUid()) goto L7;
        return InstantApps.isInstantApp(this.zza);
    L7:
        if (PlatformVersion.isAtLeastO() == false) goto L12;
        String r02 = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (r02 != null) goto L11;
        return false;
    L11:
        return this.zza.getPackageManager().isInstantApp(r02);
    L12:
        return false;
    }

    @TargetApi(19)
    public final boolean zza(int r3, String r4) {
        AppOpsManager r02 = (AppOpsManager) this.zza.getSystemService("appops");     // Catch: SecurityException -> L8
        if (r02 == null) goto L7;
        r02.checkPackage(r3, r4);     // Catch: SecurityException -> L8
        return true;
    L7:
        throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");     // Catch: SecurityException -> L8
    L8:
        return false;
    }
}
