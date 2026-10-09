package com.appmattus.certificatetransparency.internal.utils;

import java.io.EOFException;
import java.io.InputStream;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class k {
    public static final byte[] a(InputStream r2, int r3) {
        if (r3 < 1) goto L5;
        byte[] r02 = new byte[r3];
        if (r3 != r2.read(r02, 0, r3)) goto L10;
        return r02;
    L10:
        throw new EOFException();
    L5:
        return new byte[0];
    }

    public static final byte[] b(InputStream r1) {
        p.l(r1, "<this>");
        return a(r1, c(r1));
    }

    public static final int c(InputStream r1) {
        p.l(r1, "<this>");
        int r02 = r1.read();
        int r12 = r1.read();
        if (r12 < 0) goto L7;
        return r12 | (r02 << 8);
    L7:
        throw new EOFException();
    }
}
