package com.huawei.secure.android.common.ssl.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public abstract class e {
    public static void a(Closeable r1) {
        if (r1 == null) goto L9;
        r1.close();     // Catch: IOException -> L5
        return;
    L5:
        f.d("IOUtil", "closeSecure IOException");
        return;
    }

    public static void b(InputStream r02) {
        a(r02);
    }

    public static void c(OutputStream r02) {
        a(r02);
    }
}
