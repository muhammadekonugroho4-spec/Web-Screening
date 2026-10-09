package com.google.android.gms.internal.auth;

import com.google.common.base.Ascii;

/* loaded from: classes5.dex */
final class zzhj {
    public static /* bridge */ /* synthetic */ void zza(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
        if (zze(r3) == true) goto L13;
        if ((((r2 << Ascii.FS) + (r3 + 112)) >> 30) != 0) goto L13;
        if (zze(r4) == true) goto L13;
        if (zze(r5) == true) goto L13;
        int r22 = ((((r2 & 7) << 18) | ((r3 & 63) << 12)) | ((r4 & 63) << 6)) | (r5 & 63);
        r6[r7] = (char) ((r22 >>> 10) + 55232);
        r6[r7 + 1] = (char) ((r22 & 1023) + 56320);
        return;
    L13:
        throw zzfa.zzb();
    }

    public static /* bridge */ /* synthetic */ void zzb(byte r2, byte r3, byte r4, char[] r5, int r6) {
        if (zze(r3) == true) goto L17;
        if (r2 != (-32)) goto L9;
        if (r3 < (-96)) goto L17;
        r2 = -32;
    L9:
        if (r2 != (-19)) goto L13;
        if (r3 >= (-96)) goto L17;
        r2 = -19;
    L13:
        if (zze(r4) == true) goto L17;
        r5[r6] = (char) ((((r2 & Ascii.SI) << 12) | ((r3 & 63) << 6)) | (r4 & 63));
        return;
    L17:
        throw zzfa.zzb();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte r1, byte r2, char[] r3, int r4) {
        if (r1 < (-62)) goto L9;
        if (zze(r2) == true) goto L9;
        r3[r4] = (char) (((r1 & Ascii.US) << 6) | (r2 & 63));
        return;
    L9:
        throw zzfa.zzb();
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte r02) {
        if (r02 < 0) goto L5;
        return true;
    L5:
        return false;
    }

    private static boolean zze(byte r1) {
        if (r1 <= (-65)) goto L6;
        return true;
    L6:
        return false;
    }
}
