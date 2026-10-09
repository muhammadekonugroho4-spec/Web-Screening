package com.google.android.gms.internal.p000authapi;

import android.util.Base64;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public final class zbbj {
    private static final SecureRandom zba = null;

    static {
        zba = new SecureRandom();
    }

    public static String zba() {
        byte[] r02 = new byte[16];
        zba.nextBytes(r02);
        return Base64.encodeToString(r02, 11);
    }
}
