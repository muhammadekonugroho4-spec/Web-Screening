package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC11576d0;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.x3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* renamed from: io.sentry.android.core.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11549t0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f175621a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f175622b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final AutoClosableReentrantLock f175623c = null;

    static {
        f175622b = Charset.forName("UTF-8");
        f175623c = new AutoClosableReentrantLock();
    }

    public static String a(Context r3) {
        InterfaceC11576d0 r02 = f175623c.a();
    L18:
        th = move-exception;
        if (r02 != null) goto L30;
    L29:
        throw th;
    L30:
        r02.close();     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        th.addSuppressed(th);
        goto L29
    L4:
        if (f175621a != null) goto L20;
        File r1 = new File(r3.getFilesDir(), "INSTALLATION");     // Catch: Throwable -> L18
    L12:
        th = move-exception;
        throw new RuntimeException(th);     // Catch: Throwable -> L18
    L7:
        if (r1.exists() == true) goto L14;
        String r32 = c(r1);     // Catch: Throwable -> L12
        f175621a = r32;     // Catch: Throwable -> L12
        if (r02 == null) goto L11;
        r02.close();
    L11:
        return r32;
    L14:
        f175621a = b(r1);     // Catch: Throwable -> L12
    L20:
        String r33 = f175621a;     // Catch: Throwable -> L18
        if (r02 == null) goto L23;
        r02.close();
    L23:
        return r33;
    }

    public static String b(File r3) {
        RandomAccessFile r02 = new RandomAccessFile(r3, "r");
        byte[] r32 = new byte[(int) r02.length()];     // Catch: Throwable -> L6
        r02.readFully(r32);     // Catch: Throwable -> L6
        String r1 = new String(r32, f175622b);     // Catch: Throwable -> L6
        r02.close();
        return r1;
    L6:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    public static String c(File r2) {
        FileOutputStream r02 = new FileOutputStream(r2);
        String r22 = x3.a();     // Catch: Throwable -> L6
        r02.write(r22.getBytes(f175622b));     // Catch: Throwable -> L6
        r02.flush();     // Catch: Throwable -> L6
        r02.close();
        return r22;
    L6:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }
}
