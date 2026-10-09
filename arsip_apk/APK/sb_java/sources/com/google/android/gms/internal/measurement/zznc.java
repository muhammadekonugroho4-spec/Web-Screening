package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;

/* loaded from: classes5.dex */
final class zznc {
    private static boolean zza(byte r1) {
        if (r1 <= (-65)) goto L6;
        return true;
    L6:
        return false;
    }

    public static /* synthetic */ void zza(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
        if (zza(r3) == true) goto L13;
        if ((((r2 << Ascii.FS) + (r3 + 112)) >> 30) != 0) goto L13;
        if (zza(r4) == true) goto L13;
        if (zza(r5) == true) goto L13;
        int r22 = ((((r2 & 7) << 18) | ((r3 & 63) << 12)) | ((r4 & 63) << 6)) | (r5 & 63);
        r6[r7] = (char) ((r22 >>> 10) + 55232);
        r6[r7 + 1] = (char) ((r22 & 1023) + 56320);
        return;
    L13:
        throw zzkp.zzd();
    }

    public static /* synthetic */ void zza(byte r02, char[] r1, int r2) {
        r1[r2] = (char) r02;
    }

    public static /* synthetic */ void zza(byte r2, byte r3, byte r4, char[] r5, int r6) {
        if (zza(r3) == true) goto L15;
        if (r2 != (-32)) goto L8;
        if (r3 < (-96)) goto L15;
    L8:
        if (r2 != (-19)) goto L11;
        if (r3 >= (-96)) goto L15;
    L11:
        if (zza(r4) == true) goto L15;
        r5[r6] = (char) ((((r2 & Ascii.SI) << 12) | ((r3 & 63) << 6)) | (r4 & 63));
        return;
    L15:
        throw zzkp.zzd();
    }

    public static /* synthetic */ void zza(byte r1, byte r2, char[] r3, int r4) {
        if (r1 < (-62)) goto L9;
        if (zza(r2) == true) goto L9;
        r3[r4] = (char) (((r1 & Ascii.US) << 6) | (r2 & 63));
        return;
    L9:
        throw zzkp.zzd();
    }
}
