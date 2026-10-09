package com.github.piasy.biv.utils;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class b {
    public static void a(InputStream r02) {
        if (r02 == null) goto L8;
        r02.close();     // Catch: Exception -> L5
        return;
    L9:
        return;
    }

    public static void b(OutputStream r02) {
        if (r02 == null) goto L8;
        r02.close();     // Catch: Exception -> L5
        return;
    L9:
        return;
    }

    public static int c(InputStream r2, OutputStream r3) {
        long r22 = e(r2, r3);
        if (r22 <= 2147483647L) goto L7;
        return -1;
    L7:
        return (int) r22;
    }

    public static long d(InputStream r02, OutputStream r1, int r2) {
        return f(r02, r1, new byte[r2]);
    }

    public static long e(InputStream r1, OutputStream r2) {
        return d(r1, r2, 4096);
    }

    public static long f(InputStream r4, OutputStream r5, byte[] r6) {
        long r02 = 0;
    L3:
        int r2 = r4.read(r6);
        if ((-1) == r2) goto L6;
        r5.write(r6, 0, r2);
        r02 = r02 + r2;
        goto L3
    L6:
        return r02;
    }
}
