package com.google.crypto.tink.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.util.Bytes;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Util {
    public static final Charset UTF_8 = null;

    static {
        UTF_8 = Charset.forName("UTF-8");
    }

    private Util() {
    }

    public static Integer getAndroidApiLevel() {
        if (isAndroid() == true) goto L7;
        return null;
    L7:
        return BuildDispatchedCode.getApiLevel();
    }

    public static boolean isAndroid() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int randKeyId() {
        SecureRandom r02 = new SecureRandom();
        byte[] r1 = new byte[4];
        int r3 = 0;
    L3:
        if (r3 != 0) goto L5;
        r02.nextBytes(r1);
        r3 = ((((r1[0] & Ascii.DEL) << 24) | ((r1[1] & UnsignedBytes.MAX_VALUE) << 16)) | ((r1[2] & UnsignedBytes.MAX_VALUE) << 8)) | (r1[3] & UnsignedBytes.MAX_VALUE);
        goto L3
    L5:
        return r3;
    }

    private static final byte toByteFromPrintableAscii(char r3) {
        if (r3 < '!') goto L9;
        if (r3 > '~') goto L9;
        return (byte) r3;
    L9:
        throw new TinkBugException("Not a printable ASCII character: " + r3);
    }

    public static final Bytes toBytesFromPrintableAscii(String r3) {
        byte[] r02 = new byte[r3.length()];
        int r1 = 0;
    L4:
        if (r1 >= r3.length()) goto L7;
        r02[r1] = toByteFromPrintableAscii(r3.charAt(r1));
        r1 = r1 + 1;
        goto L4
    L7:
        return Bytes.copyFrom(r02);
    }
}
