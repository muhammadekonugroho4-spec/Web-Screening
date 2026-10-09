package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes5.dex */
public final class zzhq extends zzhm {
    public zzhq(byte[] r1, int r2) throws InvalidKeyException {
        super(r1, r2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final int zza() {
        return 24;
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
        if (r4.length != 6) goto L7;
        int[] r02 = new int[16];
        zzhh.zza(r02, zzhh.zzb(this.zza, r4));
        r02[12] = r5;
        r02[13] = 0;
        r02[14] = r4[4];
        r02[15] = r4[5];
        return r02;
    L7:
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(r4.length << 5)}));
    }
}
