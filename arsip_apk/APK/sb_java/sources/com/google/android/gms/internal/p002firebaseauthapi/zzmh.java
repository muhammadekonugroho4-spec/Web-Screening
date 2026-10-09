package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
final class zzmh implements zzmd {
    private zzmh() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmd
    public final zzmc zza() throws GeneralSecurityException {
        byte[] r02 = zzzl.zza();
        return new zzmc(r02, zzzl.zza(r02));
    }

    public /* synthetic */ zzmh(zzmg r1) {
        this();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmd
    public final byte[] zza(byte[] r1, byte[] r2) throws GeneralSecurityException {
        return zzzl.zza(r1, r2);
    }
}
