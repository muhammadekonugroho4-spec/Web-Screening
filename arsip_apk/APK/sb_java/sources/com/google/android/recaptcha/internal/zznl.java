package com.google.android.recaptcha.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class zznl {
    static final Charset zza = null;
    public static final byte[] zzb = null;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] r1 = new byte[0];
        zzb = r1;
        ByteBuffer.wrap(r1);
        zzli.zzH(r1, 0, 0, false);
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
}
