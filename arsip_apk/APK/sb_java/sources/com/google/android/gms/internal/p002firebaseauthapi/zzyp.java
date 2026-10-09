package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzyp<JcePrimitiveT> implements zzyq<JcePrimitiveT> {
    private final zzys<JcePrimitiveT> zza;

    public /* synthetic */ zzyp(zzys r1, zzyt r2) {
        this(r1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyq
    public final JcePrimitiveT zza(String r6) throws GeneralSecurityException {
        Iterator<Provider> r02 = zzym.zza(new String[]{ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"}).iterator();
        Exception r2 = null;
    L4:
        if (r02.hasNext() == false) goto L12;
        return this.zza.zza(r6, r02.next());
    L8:
        e = move-exception;
        if (r2 != null) goto L4;
        r2 = e;
        goto L4
    L12:
        return this.zza.zza(r6, null);
    }

    private zzyp(zzys<JcePrimitiveT> r1) {
        this.zza = r1;
    }
}
