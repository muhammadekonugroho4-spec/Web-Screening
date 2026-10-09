package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class zzfo {
    static final Charset zza = null;
    public static final byte[] zzb = null;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] r2 = new byte[0];
        zzb = r2;
        ByteBuffer.wrap(r2);
        int r1 = zzel.zza;
        new zzej(r2, 0, 0, false, null).zza(0);     // Catch: zzfq -> L5
        return;
    L5:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static int zza(boolean r02) {
        if (r02 == false) goto L5;
        return 1231;
    L5:
        return 1237;
    }

    public static int zzb(int r1, byte[] r2, int r3, int r4) {
        int r32 = 0;
    L3:
        if (r32 >= r4) goto L5;
        r1 = (r1 * 31) + r2[r32];
        r32 = r32 + 1;
        goto L3
    L5:
        return r1;
    }

    public static Object zzc(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException("messageType");
    }

    public static boolean zzd(zzgl r02) {
        if ((r02 instanceof zzdt) == true) goto L7;
        return false;
    L7:
        throw null;
    }
}
