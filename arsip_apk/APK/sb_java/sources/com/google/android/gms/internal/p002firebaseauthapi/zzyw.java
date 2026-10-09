package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes5.dex */
public final class zzyw implements zzys<KeyPairGenerator> {
    public zzyw() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ KeyPairGenerator zza(String r1, Provider r2) throws GeneralSecurityException {
        if (r2 != null) goto L6;
        return KeyPairGenerator.getInstance(r1);
    L6:
        return KeyPairGenerator.getInstance(r1, r2);
    }
}
