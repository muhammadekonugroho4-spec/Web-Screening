package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class zzde {
    static final Charset zza = null;
    static final Charset zzb = null;
    static final Charset zzc = null;
    public static final byte[] zzd = null;
    public static final ByteBuffer zze = null;
    public static final zzdd zzf = null;

    static {
        zza = Charset.forName("US-ASCII");
        zzb = Charset.forName("UTF-8");
        zzc = Charset.forName("ISO-8859-1");
        byte[] r2 = new byte[0];
        zzd = r2;
        zze = ByteBuffer.wrap(r2);
        int r1 = zzdd.zza;
        zzdb r12 = new zzdb(r2, 0, 0, false, null);
        r12.zza(0);     // Catch: zzdf -> L6
        zzf = r12;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }
}
