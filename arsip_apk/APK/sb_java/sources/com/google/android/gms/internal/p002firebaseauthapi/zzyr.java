package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzyr<JcePrimitiveT> implements zzyq<JcePrimitiveT> {
    private final zzys<JcePrimitiveT> zza;

    public /* synthetic */ zzyr(zzys r1, zzyt r2) {
        this(r1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyq
    public final JcePrimitiveT zza(String r5) throws GeneralSecurityException {
        Iterator<Provider> r02 = zzym.zza(new String[]{ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"}).iterator();
        Exception r1 = null;
    L4:
        if (r02.hasNext() == false) goto L12;
        Provider r2 = r02.next();
        return this.zza.zza(r5, r2);
    L8:
        e = move-exception;
        if (r1 != null) goto L4;
        r1 = e;
        goto L4
    L12:
        throw new GeneralSecurityException("No good Provider found.", r1);
    }

    private zzyr(zzys<JcePrimitiveT> r1) {
        this.zza = r1;
    }
}
