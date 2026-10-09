package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class zzor {
    public static final zzzn zza = null;

    static {
        zza = zzzn.zza(new byte[0]);
    }

    public static final zzzn zza(int r2) {
        return zzzn.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(r2).array());
    }

    public static final zzzn zzb(int r2) {
        return zzzn.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(r2).array());
    }
}
