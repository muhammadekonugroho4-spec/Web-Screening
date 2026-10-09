package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class zzaki {
    static final Charset zza = null;
    public static final byte[] zzb = null;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] r1 = new byte[0];
        zzb = r1;
        ByteBuffer.wrap(r1);
        zzaji.zza(r1, 0, r1.length, false);
    }

    public static int zza(long r2) {
        return (int) (r2 ^ (r2 >>> 32));
    }

    public static int zza(boolean r02) {
        if (r02 == false) goto L5;
        return 1231;
    L5:
        return 1237;
    }

    public static int zza(byte[] r2) {
        int r02 = r2.length;
        int r22 = zza(r02, r2, 0, r02);
        if (r22 != 0) goto L6;
        return 1;
    L6:
        return r22;
    }

    public static int zza(int r2, byte[] r3, int r4, int r5) {
        int r02 = r4;
    L4:
        if (r02 >= (r4 + r5)) goto L6;
        r2 = (r2 * 31) + r3[r02];
        r02 = r02 + 1;
        goto L4
    L6:
        return r2;
    }

    public static <T> T zza(T r02) {
        r02.getClass();
        return r02;
    }

    public static <T> T zza(T r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }

    public static boolean zza(zzaln r02) {
        boolean r03 = r02 instanceof zzaio;
        return false;
    }
}
