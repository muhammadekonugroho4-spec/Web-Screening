package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes5.dex */
public final class zzyz implements zzys<Mac> {
    public zzyz() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final /* synthetic */ Mac zza(String r1, Provider r2) throws GeneralSecurityException {
        if (r2 != null) goto L6;
        return Mac.getInstance(r1);
    L6:
        return Mac.getInstance(r1, r2);
    }
}
