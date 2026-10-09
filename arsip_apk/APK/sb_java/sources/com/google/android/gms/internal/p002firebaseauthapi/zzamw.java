package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public final class zzamw extends RuntimeException {
    public zzamw(zzaln r1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzakm zza() {
        return new zzakm(getMessage());
    }
}
