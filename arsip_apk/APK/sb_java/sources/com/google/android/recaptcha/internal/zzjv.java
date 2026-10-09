package com.google.android.recaptcha.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes5.dex */
public abstract class zzjv {
    private static final char[] zza = null;
    public static final /* synthetic */ int zzb = 0;

    static {
        zza = "0123456789abcdef".toCharArray();
    }

    public zzjv() {
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzjv) == false) goto L10;
        zzjv r42 = (zzjv) r4;
        if (zzb() != r42.zzb()) goto L10;
        if (zzc(r42) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) goto L5;
        byte[] r02 = zze();
        int r1 = r02[0] & UnsignedBytes.MAX_VALUE;
        int r2 = 1;
    L8:
        if (r2 >= r02.length) goto L10;
        r1 = r1 | ((r02[r2] & UnsignedBytes.MAX_VALUE) << (r2 * 8));
        r2 = r2 + 1;
        goto L8
    L10:
        return r1;
    L5:
        return zza();
    }

    public final String toString() {
        byte[] r02 = zze();
        int r1 = r02.length;
        StringBuilder r2 = new StringBuilder(r1 + r1);
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L6;
        byte r4 = r02[r3];
        char[] r6 = zza;
        r2.append(r6[(r4 >> 4) & 15]);
        r2.append(r6[r4 & Ascii.SI]);
        r3 = r3 + 1;
        goto L3
    L6:
        return r2.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzjv r1);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
