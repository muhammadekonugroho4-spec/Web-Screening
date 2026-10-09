package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
public final class zzpk extends RuntimeException {
    public zzpk(zzoi r1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zznn zza() {
        return new zznn(getMessage());
    }
}
