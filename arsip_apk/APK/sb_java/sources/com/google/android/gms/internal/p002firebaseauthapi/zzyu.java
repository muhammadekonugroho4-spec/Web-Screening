package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes5.dex */
public final class zzyu implements zzys<KeyAgreement> {
    public zzyu() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ KeyAgreement zza(String r1, Provider r2) throws GeneralSecurityException {
        if (r2 != null) goto L6;
        return KeyAgreement.getInstance(r1);
    L6:
        return KeyAgreement.getInstance(r1, r2);
    }
}
