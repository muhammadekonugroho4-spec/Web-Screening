package io.sentry.util;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class I {
    public static long a() {
        byte[] r2 = new byte[8];
        A.a().b(r2);
        byte r3 = (byte) (r2[6] & Ascii.SI);
        r2[6] = r3;
        r2[6] = (byte) (r3 | SignedBytes.MAX_POWER_OF_TWO);
        long r32 = 0;
        int r02 = 0;
    L3:
        if (r02 >= 8) goto L5;
        r32 = (r32 << 8) | (r2[r02] & UnsignedBytes.MAX_VALUE);
        r02 = r02 + 1;
        goto L3
    L5:
        return r32;
    }

    public static UUID b() {
        byte[] r2 = new byte[16];
        A.a().b(r2);
        byte r3 = (byte) (r2[6] & Ascii.SI);
        r2[6] = r3;
        r2[6] = (byte) (r3 | SignedBytes.MAX_POWER_OF_TWO);
        byte r32 = (byte) (r2[8] & 63);
        r2[8] = r32;
        r2[8] = (byte) (r32 | UnsignedBytes.MAX_POWER_OF_TWO);
        long r33 = 0;
        int r5 = 0;
        long r6 = 0;
    L3:
        if (r5 >= 8) goto L5;
        r6 = (r6 << 8) | (r2[r5] & UnsignedBytes.MAX_VALUE);
        r5 = r5 + 1;
        goto L3
    L5:
        int r52 = 8;
    L6:
        if (r52 >= 16) goto L9;
        r33 = (r33 << 8) | (r2[r52] & UnsignedBytes.MAX_VALUE);
        r52 = r52 + 1;
        goto L6
    L9:
        return new UUID(r6, r33);
    }
}
