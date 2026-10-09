package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes5.dex */
public final class zzyy implements zzys<MessageDigest> {
    public zzyy() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ MessageDigest zza(String r1, Provider r2) throws GeneralSecurityException {
        if (r2 != null) goto L6;
        return MessageDigest.getInstance(r1);
    L6:
        return MessageDigest.getInstance(r1, r2);
    }
}
