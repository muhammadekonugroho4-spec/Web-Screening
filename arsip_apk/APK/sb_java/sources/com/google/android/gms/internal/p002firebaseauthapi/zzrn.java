package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzrn {
    public static byte[] zza(byte[] r2) {
        if (r2.length >= 16) goto L7;
        byte[] r02 = Arrays.copyOf(r2, 16);
        r02[r2.length] = UnsignedBytes.MAX_POWER_OF_TWO;
        return r02;
    L7:
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static byte[] zzb(byte[] r6) {
        if (r6.length != 16) goto L14;
        byte[] r02 = new byte[16];
        int r3 = 0;
    L6:
        if (r3 >= 16) goto L11;
        byte r5 = (byte) ((r6[r3] << 1) & 254);
        r02[r3] = r5;
        if (r3 >= 15) goto L10;
        r02[r3] = (byte) (((byte) ((r6[r3 + 1] >> 7) & 1)) | r5);
    L10:
        r3 = r3 + 1;
        goto L6
    L11:
        r02[15] = (byte) (((byte) ((r6[0] >> 7) & 135)) ^ r02[15]);
        return r02;
    L14:
        throw new IllegalArgumentException("value must be a block.");
    }
}
