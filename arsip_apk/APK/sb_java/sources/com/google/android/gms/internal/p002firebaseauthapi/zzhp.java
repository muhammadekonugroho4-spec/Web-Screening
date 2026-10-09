package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes5.dex */
public final class zzhp extends zzho {
    public zzhp(byte[] r1) throws GeneralSecurityException {
        super(r1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzho
    public final zzhm zza(byte[] r2, int r3) throws InvalidKeyException {
        return new zzhq(r2, r3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzho
    public final /* bridge */ /* synthetic */ void zza(ByteBuffer r1, byte[] r2, byte[] r3, byte[] r4) throws GeneralSecurityException {
        super.zza(r1, r2, r3, r4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzho
    public final /* bridge */ /* synthetic */ byte[] zza(ByteBuffer r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        return super.zza(r1, r2, r3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzho
    public final /* bridge */ /* synthetic */ byte[] zza(byte[] r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        return super.zza(r1, r2, r3);
    }
}
