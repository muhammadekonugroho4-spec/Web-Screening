package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzdl extends IOException {
    public zzdl(String r1) {
        super(r1);
    }

    public zzdl(String r1, Throwable r2) {
        super("Error in decoding CborValue from bytes", r2);
    }
}
