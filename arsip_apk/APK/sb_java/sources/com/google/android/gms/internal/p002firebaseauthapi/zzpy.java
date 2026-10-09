package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzpy {
    public static final Charset zza = null;

    static {
        zza = Charset.forName("UTF-8");
    }

    public static int zza() {
        SecureRandom r02 = new SecureRandom();
        byte[] r1 = new byte[4];
        int r3 = 0;
    L3:
        if (r3 != 0) goto L5;
        r02.nextBytes(r1);
        r3 = ((((r1[0] & UnsignedBytes.MAX_VALUE) << 24) | ((r1[1] & UnsignedBytes.MAX_VALUE) << 16)) | ((r1[2] & UnsignedBytes.MAX_VALUE) << 8)) | (r1[3] & UnsignedBytes.MAX_VALUE);
        goto L3
    L5:
        return r3;
    }

    public static final zzzn zzb(String r4) {
        byte[] r02 = new byte[r4.length()];
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L13;
        char r2 = r4.charAt(r1);
        if (r2 < '!') goto L11;
        if (r2 > '~') goto L11;
        r02[r1] = (byte) r2;
        r1 = r1 + 1;
    L11:
        throw new zzpw("Not a printable ASCII character: " + r2);
    L13:
        return zzzn.zza(r02);
    }

    public static final zzzn zza(String r4) throws GeneralSecurityException {
        byte[] r02 = new byte[r4.length()];
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L13;
        char r2 = r4.charAt(r1);
        if (r2 < '!') goto L11;
        if (r2 > '~') goto L11;
        r02[r1] = (byte) r2;
        r1 = r1 + 1;
    L11:
        throw new GeneralSecurityException("Not a printable ASCII character: " + r2);
    L13:
        return zzzn.zza(r02);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project") == true) goto L7;
        return null;
    L7:
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }

    public static boolean zza(byte[] r4, byte[] r5) {
        if (r5.length >= r4.length) goto L5;
        return false;
    L5:
        int r02 = 0;
    L7:
        if (r02 >= r4.length) goto L12;
        if (r5[r02] != r4[r02]) goto L10;
        r02 = r02 + 1;
        goto L7
    L10:
        return false;
    L12:
        return true;
    }
}
