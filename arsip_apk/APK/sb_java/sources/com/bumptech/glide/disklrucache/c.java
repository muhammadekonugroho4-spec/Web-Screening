package com.bumptech.glide.disklrucache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f32457a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f32458b = null;

    static {
        f32457a = Charset.forName("US-ASCII");
        f32458b = Charset.forName("UTF-8");
    }

    public static void a(Closeable r02) {
        if (r02 != null) goto L9;
        return;
    L9:
        r02.close();     // Catch: RuntimeException -> L5 Exception -> L8
        return;
    L5:
        e = move-exception;
        throw e;
    }

    public static void b(File r4) {
        File[] r02 = r4.listFiles();
        if (r02 == null) goto L16;
        int r42 = r02.length;
        int r1 = 0;
    L5:
        if (r1 >= r42) goto L14;
        File r2 = r02[r1];
        if (r2.isDirectory() == false) goto L10;
        b(r2);
    L10:
        if (r2.delete() == false) goto L13;
        r1 = r1 + 1;
        goto L5
    L13:
        throw new IOException("failed to delete file: " + r2);
    L14:
        return;
    L16:
        throw new IOException("not a readable directory: " + r4);
    }
}
