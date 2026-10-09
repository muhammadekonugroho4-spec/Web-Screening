package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzep;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public class zzen extends zzcp {
    private final zzep zza;
    private final zzzn zzb;
    private final Integer zzc;

    private zzen(zzep r1, zzzn r2, Integer r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    public static zzen zza(zzep r2, Integer r3) throws GeneralSecurityException {
        if (r2.zzb() != zzep.zza.zza) goto L9;
        if (r3 == null) goto L7;
        zzzn r02 = zzzn.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(r3.intValue()).array());
    L13:
        return new zzen(r2, r02, r3);
    L7:
        throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
    L9:
        if (r2.zzb() != zzep.zza.zzb) goto L17;
        if (r3 != null) goto L15;
        r02 = zzzn.zza(new byte[0]);
        goto L13
    L15:
        throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    L17:
        throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(r2.zzb()));
    }

    public final zzep zzb() {
        return this.zza;
    }

    public final zzzn zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zzc;
    }
}
