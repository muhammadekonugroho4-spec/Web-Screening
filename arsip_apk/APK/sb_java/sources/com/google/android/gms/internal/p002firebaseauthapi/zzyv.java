package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes5.dex */
public final class zzyv implements zzys<Cipher> {
    public zzyv() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ Cipher zza(String r1, Provider r2) throws GeneralSecurityException {
        if (r2 != null) goto L6;
        return Cipher.getInstance(r1);
    L6:
        return Cipher.getInstance(r1, r2);
    }
}
