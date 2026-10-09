package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes5.dex */
public final class zzw {
    public static int zza(int r2, int r3) {
        if (r2 < 0) goto L7;
        if (r2 >= r3) goto L7;
        return r2;
    L7:
        if (r2 < 0) goto L12;
        if (r3 < 0) goto L10;
        String r22 = zzae.zza("%s (%s) must be less than size (%s)", new Object[]{FirebaseAnalytics.Param.INDEX, Integer.valueOf(r2), Integer.valueOf(r3)});
    L14:
        throw new IndexOutOfBoundsException(r22);
    L10:
        throw new IllegalArgumentException("negative size: " + r3);
    L12:
        r22 = zzae.zza("%s (%s) must not be negative", new Object[]{FirebaseAnalytics.Param.INDEX, Integer.valueOf(r2)});
        goto L14
    }

    public static int zzb(int r2, int r3) {
        if (r2 < 0) goto L6;
        if (r2 > r3) goto L6;
        return r2;
    L6:
        throw new IndexOutOfBoundsException(zzb(r2, r3, FirebaseAnalytics.Param.INDEX));
    }

    private static String zzb(int r1, int r2, String r3) {
        if (r1 < 0) goto L4;
        if (r2 < 0) goto L9;
        return zzae.zza("%s (%s) must not be greater than size (%s)", new Object[]{r3, Integer.valueOf(r1), Integer.valueOf(r2)});
    L9:
        throw new IllegalArgumentException("negative size: " + r2);
    L4:
        return zzae.zza("%s (%s) must not be negative", new Object[]{r3, Integer.valueOf(r1)});
    }

    public static int zza(int r1, int r2, String r3) {
        if (r1 < 0) goto L6;
        if (r1 > r2) goto L6;
        return r1;
    L6:
        throw new IndexOutOfBoundsException(zzb(r1, r2, r3));
    }

    public static <T> T zza(T r02) {
        r02.getClass();
        return r02;
    }

    public static void zza(int r1, int r2, int r3) {
        if (r1 < 0) goto L8;
        if (r2 < r1) goto L8;
        if (r2 > r3) goto L8;
        return;
    L8:
        if (r1 < 0) goto L15;
        if (r1 > r3) goto L15;
        if (r2 < 0) goto L14;
        if (r2 > r3) goto L14;
        String r12 = zzae.zza("end index (%s) must not be less than start index (%s)", new Object[]{Integer.valueOf(r2), Integer.valueOf(r1)});
    L17:
        throw new IndexOutOfBoundsException(r12);
    L14:
        r12 = zzb(r2, r3, "end index");
    L15:
        r12 = zzb(r1, r3, "start index");
        goto L17
    }
}
