package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes5.dex */
public final class zzhj extends zzhm {
    public zzhj(byte[] r1, int r2) throws InvalidKeyException {
        super(r1, r2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final /* bridge */ /* synthetic */ void zza(ByteBuffer r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        super.zza(r1, r2, r3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final /* bridge */ /* synthetic */ byte[] zza(byte[] r1, ByteBuffer r2) throws GeneralSecurityException {
        return super.zza(r1, r2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final int[] zza(int[] r4, int r5) {
        if (r4.length != 3) goto L7;
        int[] r02 = new int[16];
        zzhh.zza(r02, this.zza);
        r02[12] = r5;
        System.arraycopy(r4, 0, r02, 13, r4.length);
        return r02;
    L7:
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(r4.length << 5)}));
    }
}
