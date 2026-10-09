package coil.util;

import android.os.SystemClock;
import java.io.File;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f30267a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final File f30268b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f30269c;
    public static long d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f30270e;

    static {
        f30267a = new l();
        f30268b = new File("/proc/self/fd");
        f30269c = 30;
        d = SystemClock.uptimeMillis();
        f30270e = true;
    }

    public l() {
    }

    public final boolean a() {
        int r02 = f30269c;
        f30269c = r02 + 1;
        if (r02 < 30) goto L5;
        return true;
    L5:
        if (SystemClock.uptimeMillis() > (d + 30000)) goto L11;
        return false;
    L11:
        return true;
    }

    public final synchronized boolean b(q r6) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (a() == false) goto L19;
        boolean r02 = false;
        f30269c = 0;     // Catch: Throwable -> L8
        d = SystemClock.uptimeMillis();     // Catch: Throwable -> L8
        String[] r1 = f30268b.list();     // Catch: Throwable -> L8
        if (r1 != null) goto L10;
        r1 = new String[0];     // Catch: Throwable -> L8
    L10:
        int r12 = r1.length;     // Catch: Throwable -> L8
        if (r12 >= 800) goto L13;
        r02 = true;
    L13:
        f30270e = r02;     // Catch: Throwable -> L8
        if (r02 == true) goto L19;
        if (r6 == null) goto L19;
        if (r6.b() > 5) goto L19;
        r6.c("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + r12, null);     // Catch: Throwable -> L8
    L19:
        boolean r62 = f30270e;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r62;
    }
}
