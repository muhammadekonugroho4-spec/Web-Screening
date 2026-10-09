package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
public final class zzjf {
    public static void zza(boolean r02) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    public static void zzb(boolean r02, Object r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException((String) r1);
    }

    public static void zzc(boolean r02, String r1, char r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(zzji.zza(r1, new Object[]{Character.valueOf(r2)}));
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
        String r12 = zzji.zza("end index (%s) must not be less than start index (%s)", new Object[]{Integer.valueOf(r2), Integer.valueOf(r1)});
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

    private static String zzf(int r02, int r1, String r2) {
        if (r02 >= 0) goto L6;
        return zzji.zza("%s (%s) must not be negative", new Object[]{r2, Integer.valueOf(r02)});
    L6:
        return zzji.zza("%s (%s) must not be greater than size (%s)", new Object[]{r2, Integer.valueOf(r02), Integer.valueOf(r1)});
    }
}
