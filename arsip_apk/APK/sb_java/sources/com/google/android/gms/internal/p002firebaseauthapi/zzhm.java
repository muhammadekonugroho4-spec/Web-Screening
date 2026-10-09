package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes5.dex */
abstract class zzhm {
    int[] zza;
    private final int zzb;

    public zzhm(byte[] r3, int r4) throws InvalidKeyException {
        if (r3.length != 32) goto L7;
        this.zza = zzhh.zza(r3);
        this.zzb = r4;
        return;
    L7:
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int zza();

    public final ByteBuffer zza(byte[] r5, int r6) {
        int[] r52 = zza(zzhh.zza(r5), r6);
        int[] r62 = (int[]) r52.clone();
        zzhh.zza(r62);
        int r1 = 0;
    L4:
        if (r1 >= r52.length) goto L6;
        r52[r1] = r52[r1] + r62[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        ByteBuffer r63 = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        r63.asIntBuffer().put(r52, 0, 16);
        return r63;
    }

    public abstract int[] zza(int[] r1, int r2);

    public void zza(ByteBuffer r3, byte[] r4, byte[] r5) throws GeneralSecurityException {
        if (r3.remaining() < r5.length) goto L7;
        zza(r4, r3, ByteBuffer.wrap(r5));
        return;
    L7:
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] r7, ByteBuffer r8, ByteBuffer r9) throws GeneralSecurityException {
        if (r7.length != zza()) goto L13;
        int r02 = r9.remaining();
        int r1 = r02 / 64;
        int r2 = r1 + 1;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L11;
        ByteBuffer r4 = zza(r7, this.zzb + r3);
        if (r3 != r1) goto L9;
        zzyc.zza(r8, r9, r4, r02 % 64);
    L10:
        r3 = r3 + 1;
        goto L5
    L9:
        zzyc.zza(r8, r9, r4, 64);
        goto L10
    L11:
        return;
    L13:
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
    }

    public byte[] zza(byte[] r2, ByteBuffer r3) throws GeneralSecurityException {
        ByteBuffer r02 = ByteBuffer.allocate(r3.remaining());
        zza(r2, r02, r3);
        return r02.array();
    }
}
