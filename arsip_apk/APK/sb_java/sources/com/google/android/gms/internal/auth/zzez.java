package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class zzez {
    static final Charset zza = null;
    static final Charset zzb = null;
    static final Charset zzc = null;
    public static final byte[] zzd = null;
    public static final ByteBuffer zze = null;
    public static final zzei zzf = null;

    static {
        zza = Charset.forName("US-ASCII");
        zzb = Charset.forName("UTF-8");
        zzc = Charset.forName("ISO-8859-1");
        byte[] r2 = new byte[0];
        zzd = r2;
        zze = ByteBuffer.wrap(r2);
        int r1 = zzei.zza;
        zzeg r12 = new zzeg(r2, 0, 0, false, null);
        r12.zza(0);     // Catch: zzfa -> L6
        zzf = r12;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static int zza(boolean r02) {
        if (r02 == false) goto L5;
        return 1231;
    L5:
        return 1237;
    }

    public static int zzb(byte[] r2) {
        int r02 = r2.length;
        int r22 = zzd(r02, r2, 0, r02);
        if (r22 != 0) goto L6;
        return 1;
    L6:
        return r22;
    }

    public static int zzc(long r2) {
        return (int) (r2 ^ (r2 >>> 32));
    }

    public static int zzd(int r1, byte[] r2, int r3, int r4) {
        int r32 = 0;
    L3:
        if (r32 >= r4) goto L5;
        r1 = (r1 * 31) + r2[r32];
        r32 = r32 + 1;
        goto L3
    L5:
        return r1;
    }

    public static Object zze(Object r02) {
        r02.getClass();
        return r02;
    }

    public static Object zzf(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }

    public static Object zzg(Object r02, Object r1) {
        return ((zzfw) r02).zzd().zzc((zzfw) r1).zzg();
    }

    public static String zzh(byte[] r2) {
        return new String(r2, zzb);
    }

    public static boolean zzi(byte[] r02) {
        return zzhm.zzc(r02);
    }
}
