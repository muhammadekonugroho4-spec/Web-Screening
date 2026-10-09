package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.security.ProviderInstaller;
import java.security.Provider;
import java.security.Security;

/* loaded from: classes5.dex */
public final class zzmr {
    private static final String[] zza = null;

    static {
        zza = new String[]{ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"};
    }

    public static Provider zza() {
        String[] r02 = zza;
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        Provider r3 = Security.getProvider(r02[r2]);
        if (r3 != null) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L8:
        return null;
    }

    public static Provider zzb() {
        return (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
    L5:
        return null;
    }
}
