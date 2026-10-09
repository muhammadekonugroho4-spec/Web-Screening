package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* loaded from: classes5.dex */
public final class zzcq {
    static volatile zzdh zza;
    private static final Object zzb = null;

    static {
        zza = zzdh.zzc();
        zzb = new Object();
    }

    public static boolean zza(Context r5, Uri r6) {
        String r62 = r6.getAuthority();
        boolean r1 = false;
        if ("com.google.android.gms.phenotype".equals(r62) == true) goto L7;
        Log.e("PhenotypeClientHelper", String.valueOf(r62).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
        return false;
    L7:
        if (zza.zzb() == true) goto L9;
        Object r63 = zzb;
        monitor-enter(r63);
    L17:
        th = move-exception;
        throw th;
    L13:
        if (zza.zzb() == false) goto L20;
        boolean r52 = ((Boolean) zza.zza()).booleanValue();     // Catch: Throwable -> L17
        monitor-exit(r63);     // Catch: Throwable -> L17
        return r52;
    L20:
        if ("com.google.android.gms".equals(r5.getPackageName()) == true) goto L44;
        PackageManager r02 = r5.getPackageManager();     // Catch: Throwable -> L17
        if (Build.VERSION.SDK_INT >= 29) goto L25;
        int r3 = 0;
    L26:
        ProviderInfo r03 = r02.resolveContentProvider("com.google.android.gms.phenotype", r3);     // Catch: Throwable -> L17
        if (r03 != null) goto L29;
    L36:
        zza = zzdh.zzd(Boolean.valueOf(r1));     // Catch: Throwable -> L17
        monitor-exit(r63);     // Catch: Throwable -> L17
        return ((Boolean) zza.zza()).booleanValue();
    L29:
        if ("com.google.android.gms".equals(r03.packageName) == true) goto L44;
    L25:
        r3 = 268435456;
    L44:
        if ((r5.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) == 0) goto L36;
        r1 = true;
        goto L36
    L9:
        return ((Boolean) zza.zza()).booleanValue();
    }
}
