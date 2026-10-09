package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
public final class zzgx extends RuntimeException {
    public zzgx(zzfw r1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzfa zza() {
        return new zzfa(getMessage());
    }
}
