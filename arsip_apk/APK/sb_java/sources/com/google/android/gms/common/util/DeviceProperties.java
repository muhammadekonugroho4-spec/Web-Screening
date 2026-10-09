package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public final class DeviceProperties {
    private static Boolean zza;
    private static Boolean zzb;
    private static Boolean zzc;
    private static Boolean zzd;
    private static Boolean zze;
    private static Boolean zzf;
    private static Boolean zzg;
    private static Boolean zzh;
    private static Boolean zzi;
    private static Boolean zzj;
    private static Boolean zzk;
    private static Boolean zzl;
    private static Boolean zzm;
    private static Boolean zzn;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean isAuto(Context r2) {
        PackageManager r22 = r2.getPackageManager();
        if (zzj != null) goto L11;
        boolean r1 = false;
        if (PlatformVersion.isAtLeastO() == true) goto L7;
    L9:
        zzj = Boolean.valueOf(r1);
        goto L11
    L7:
        if (r22.hasSystemFeature("android.hardware.type.automotive") == false) goto L9;
        r1 = true;
    L11:
        return zzj.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(Context r2) {
        if (zzm != null) goto L11;
        boolean r1 = false;
        if (PlatformVersion.isAtLeastR() == true) goto L7;
    L9:
        zzm = Boolean.valueOf(r1);
        goto L11
    L7:
        if (r2.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") == false) goto L9;
        r1 = true;
    L11:
        return zzm.booleanValue();
    }

    @KeepForSdk
    public static boolean isFoldable(Context r2) {
        if (zzc != null) goto L11;
        boolean r1 = false;
        if (PlatformVersion.isAtLeastR() == true) goto L7;
    L9:
        zzc = Boolean.valueOf(r1);
        goto L11
    L7:
        if (r2.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle") == false) goto L9;
        r1 = true;
    L11:
        return zzc.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(Context r2) {
        if (zzg != null) goto L11;
        PackageManager r22 = r2.getPackageManager();
        boolean r1 = false;
        if (r22.hasSystemFeature("com.google.android.feature.services_updater") == true) goto L7;
    L9:
        zzg = Boolean.valueOf(r1);
        goto L11
    L7:
        if (r22.hasSystemFeature("cn.google.services") == false) goto L9;
        r1 = true;
    L11:
        return zzg.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(Context r4) {
        if (zza != null) goto L34;
        boolean r1 = true;
        if (isFoldable(r4) == false) goto L7;
    L32:
        zza = Boolean.valueOf(r1);
        goto L34
    L7:
        if (isTablet(r4) == false) goto L9;
    L31:
        r1 = false;
        goto L32
    L9:
        if (isWearable(r4) == true) goto L31;
        if (zzb(r4) == true) goto L31;
        if (zzi != null) goto L16;
        zzi = Boolean.valueOf(r4.getPackageManager().hasSystemFeature("org.chromium.arc"));
    L16:
        if (zzi.booleanValue() == true) goto L31;
        if (isAuto(r4) == true) goto L31;
        if (isTv(r4) == true) goto L31;
        if (zzl != null) goto L25;
        zzl = Boolean.valueOf(r4.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
    L25:
        if (zzl.booleanValue() == true) goto L31;
        if (isBstar(r4) == true) goto L31;
        if (isXr(r4) == true) goto L31;
    L34:
        return zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(Context r02) {
        return zzc(r02.getResources());
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean isSidewinder(Context r02) {
        return zza(r02);
    }

    @KeepForSdk
    public static boolean isTablet(Context r02) {
        return isTablet(r02.getResources());
    }

    @KeepForSdk
    public static boolean isTv(Context r2) {
        PackageManager r22 = r2.getPackageManager();
        if (zzk != null) goto L16;
        boolean r1 = true;
        if (r22.hasSystemFeature("com.google.android.tv") == false) goto L7;
    L14:
        zzk = Boolean.valueOf(r1);
        goto L16
    L7:
        if (r22.hasSystemFeature("android.hardware.type.television") == true) goto L14;
        if (r22.hasSystemFeature("android.software.leanback") == true) goto L14;
        if (r22.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE") == true) goto L14;
        r1 = false;
    L16:
        return zzk.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int r02 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @KeepForSdk
    @TargetApi(20)
    public static boolean isWearable(Context r02) {
        return zzd(r02.getPackageManager());
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(Context r1) {
        if (isWearable(r1) == false) goto L7;
        if (PlatformVersion.isAtLeastN() == true) goto L7;
        return true;
    L7:
        if (zza(r1) == true) goto L9;
        return false;
    L9:
        if (PlatformVersion.isAtLeastO() == true) goto L11;
        return true;
    L11:
        if (PlatformVersion.isAtLeastR() == false) goto L18;
        return true;
    L18:
        return false;
    }

    @KeepForSdk
    public static boolean isXr(Context r1) {
        PackageManager r12 = r1.getPackageManager();
        if (zzn != null) goto L6;
        zzn = Boolean.valueOf(r12.hasSystemFeature("android.software.xr.immersive"));
    L6:
        return zzn.booleanValue();
    }

    @TargetApi(21)
    public static boolean zza(Context r1) {
        if (zzf != null) goto L6;
        zzf = Boolean.valueOf(r1.getPackageManager().hasSystemFeature("cn.google"));
    L6:
        return zzf.booleanValue();
    }

    public static boolean zzb(Context r2) {
        if (zzh != null) goto L12;
        boolean r1 = true;
        if (r2.getPackageManager().hasSystemFeature("android.hardware.type.iot") == false) goto L7;
    L10:
        zzh = Boolean.valueOf(r1);
        goto L12
    L7:
        if (r2.getPackageManager().hasSystemFeature("android.hardware.type.embedded") == true) goto L10;
        r1 = false;
    L12:
        return zzh.booleanValue();
    }

    public static boolean zzc(Resources r3) {
        boolean r02 = false;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (zzd != null) goto L14;
        Configuration r32 = r3.getConfiguration();
        if ((r32.screenLayout & 15) <= 3) goto L10;
    L12:
        zzd = Boolean.valueOf(r02);
        goto L14
    L10:
        if (r32.smallestScreenWidthDp < 600) goto L12;
        r02 = true;
    L14:
        return zzd.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean zzd(PackageManager r1) {
        if (zze != null) goto L6;
        zze = Boolean.valueOf(r1.hasSystemFeature("android.hardware.type.watch"));
    L6:
        return zze.booleanValue();
    }

    @KeepForSdk
    public static boolean isTablet(Resources r4) {
        boolean r02 = false;
        if (r4 != null) goto L6;
        return false;
    L6:
        if (zzb != null) goto L15;
        if ((r4.getConfiguration().screenLayout & 15) <= 3) goto L11;
    L9:
        r02 = true;
    L13:
        zzb = Boolean.valueOf(r02);
        goto L15
    L11:
        if (zzc(r4) == false) goto L13;
    L15:
        return zzb.booleanValue();
    }
}
