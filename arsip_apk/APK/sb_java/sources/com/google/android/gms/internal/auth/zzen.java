package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
final class zzen {
    private static final zzel zza = null;
    private static final zzel zzb = null;

    static {
        zza = new zzem();
        zzel r02 = null;
        r02 = (zzel) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);     // Catch: Exception -> L7
    L5:
        zzb = r02;
    }

    public static zzel zza() {
        zzel r02 = zzb;
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzel zzb() {
        return zza;
    }
}
