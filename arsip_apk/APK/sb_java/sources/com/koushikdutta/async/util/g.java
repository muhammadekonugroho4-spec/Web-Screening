package com.koushikdutta.async.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.InputStream;

/* loaded from: classes6.dex */
public abstract class g {
    public static void a(Closeable... r3) {
        if (r3 == null) goto L10;
        int r02 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L17;
        Closeable r2 = r3[r1];
        if (r2 == null) goto L9;
        r2.close();     // Catch: Exception -> L11
    L9:
        r1 = r1 + 1;
        goto L5
    L17:
        return;
    }

    public static byte[] b(InputStream r4) {
        DataInputStream r02 = new DataInputStream(r4);
        byte[] r42 = new byte[1024];
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
    L3:
        int r2 = r02.read(r42);
        if (r2 == (-1)) goto L6;
        r1.write(r42, 0, r2);
        goto L3
    L6:
        r02.close();
        return r1.toByteArray();
    }
}
