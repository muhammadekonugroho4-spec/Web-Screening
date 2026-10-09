package com.google.android.gms.internal.p002firebaseauthapi;

import javax.crypto.Cipher;

/* loaded from: classes5.dex */
final class zzgo extends ThreadLocal<Cipher> {
    public zzgo() {
    }

    private static Cipher zza() {
        return zzym.zza.zza("AES/GCM/NoPadding");
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
