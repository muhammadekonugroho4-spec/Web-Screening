package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes5.dex */
public class zznn extends IOException {
    private boolean zza;

    public zznn(IOException r2) {
        super(r2.getMessage(), r2);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zznn(String r1) {
        super(r1);
    }
}
