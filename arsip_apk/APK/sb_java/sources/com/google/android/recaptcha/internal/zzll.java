package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzll extends IOException {
    public zzll() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzll(String r2, Throwable r3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(r2)), r3);
    }

    public zzll(Throwable r2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", r2);
    }
}
