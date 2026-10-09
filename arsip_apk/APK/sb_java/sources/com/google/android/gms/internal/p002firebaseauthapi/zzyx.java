package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes5.dex */
public final class zzyx implements zzys<KeyFactory> {
    public zzyx() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ KeyFactory zza(String r1, Provider r2) throws GeneralSecurityException {
        if (r2 != null) goto L6;
        return KeyFactory.getInstance(r1);
    L6:
        return KeyFactory.getInstance(r1, r2);
    }
}
