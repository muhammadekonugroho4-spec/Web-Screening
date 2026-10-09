package com.google.android.gms.internal.fido;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;

/* loaded from: classes5.dex */
enum zzcm extends Enum implements Comparator {
    public static final zzcm zza = null;
    private static final /* synthetic */ zzcm[] zzb = null;

    static {
        zzcm r02 = new zzcm("INSTANCE", 0);
        zza = r02;
        zzb = new zzcm[]{r02};
    }

    zzcm(String r1, int r2) {
    }

    public static zzcm[] values() {
        return (zzcm[]) zzb.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object r5, Object r6) {
        byte[] r52 = (byte[]) r5;
        byte[] r62 = (byte[]) r6;
        int r02 = Math.min(r52.length, r62.length);
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L9;
        byte r2 = r52[r1];
        byte r3 = r62[r1];
        int r22 = (r2 & UnsignedBytes.MAX_VALUE) - (r3 & UnsignedBytes.MAX_VALUE);
        if (r22 != 0) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r22;
    L9:
        return r52.length - r62.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
