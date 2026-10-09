package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
abstract class zzhk {
    public zzhk() {
    }

    public abstract int zza(int r1, byte[] r2, int r3, int r4);

    public final boolean zzb(byte[] r2, int r3, int r4) {
        if (zza(0, r2, r3, r4) != 0) goto L6;
        return true;
    L6:
        return false;
    }
}
