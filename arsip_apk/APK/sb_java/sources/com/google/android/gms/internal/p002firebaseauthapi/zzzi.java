package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzzi {
    static {
        String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"});
        String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"});
    }

    public static String zza(String r1, String r2) {
        if (r2.toLowerCase(Locale.US).startsWith(r1) == false) goto L7;
        return r2.substring(r1.length());
    L7:
        throw new IllegalArgumentException(String.format("key URI must start with %s", new Object[]{r1}));
    }

    public static void zza(int r2) throws InvalidAlgorithmParameterException {
        if (r2 != 16) goto L5;
        return;
    L5:
        if (r2 != 32) goto L8;
        return;
    L8:
        throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(r2 << 3)}));
    }
}
