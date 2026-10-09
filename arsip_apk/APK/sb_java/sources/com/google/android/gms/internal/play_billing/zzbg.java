package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes5.dex */
public final class zzbg {
    public static int zza(int r1, int r2, String r3) {
        if (r1 < 0) goto L7;
        if (r1 >= r2) goto L7;
        return r1;
    L7:
        if (r1 < 0) goto L12;
        if (r2 < 0) goto L10;
        String r12 = zzbj.zza("%s (%s) must be less than size (%s)", new Object[]{FirebaseAnalytics.Param.INDEX, Integer.valueOf(r1), Integer.valueOf(r2)});
    L14:
        throw new IndexOutOfBoundsException(r12);
    L10:
        throw new IllegalArgumentException("negative size: " + r2);
    L12:
        r12 = zzbj.zza("%s (%s) must not be negative", new Object[]{FirebaseAnalytics.Param.INDEX, Integer.valueOf(r1)});
        goto L14
    }

    public static int zzb(int r1, int r2, String r3) {
        if (r1 < 0) goto L6;
        if (r1 > r2) goto L6;
        return r1;
    L6:
        throw new IndexOutOfBoundsException(zzf(r1, r2, FirebaseAnalytics.Param.INDEX));
    }

    public static Object zzc(Object r02, Object r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException((String) r1);
    }

    public static void zzd(int r1, int r2, int r3) {
        if (r1 < 0) goto L8;
        if (r2 < r1) goto L8;
        if (r2 > r3) goto L8;
        return;
    L8:
        if (r1 < 0) goto L15;
        if (r1 > r3) goto L15;
        if (r2 < 0) goto L14;
        if (r2 > r3) goto L14;
        String r12 = zzbj.zza("end index (%s) must not be less than start index (%s)", new Object[]{Integer.valueOf(r2), Integer.valueOf(r1)});
    L17:
        throw new IndexOutOfBoundsException(r12);
    L14:
        r12 = zzf(r2, r3, "end index");
    L15:
        r12 = zzf(r1, r3, "start index");
        goto L17
    }

    public static void zze(boolean r02, Object r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException((String) r1);
    }

    private static String zzf(int r1, int r2, String r3) {
        if (r1 < 0) goto L4;
        if (r2 < 0) goto L9;
        return zzbj.zza("%s (%s) must not be greater than size (%s)", new Object[]{r3, Integer.valueOf(r1), Integer.valueOf(r2)});
    L9:
        throw new IllegalArgumentException("negative size: " + r2);
    L4:
        return zzbj.zza("%s (%s) must not be negative", new Object[]{r3, Integer.valueOf(r1)});
    }
}
