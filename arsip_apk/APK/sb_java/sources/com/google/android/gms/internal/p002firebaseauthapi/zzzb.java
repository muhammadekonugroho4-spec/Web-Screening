package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* loaded from: classes5.dex */
public final class zzzb implements zzys<Signature> {
    public zzzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ Signature zza(String r1, Provider r2) throws GeneralSecurityException {
        if (r2 != null) goto L6;
        return Signature.getInstance(r1);
    L6:
        return Signature.getInstance(r1, r2);
    }
}
