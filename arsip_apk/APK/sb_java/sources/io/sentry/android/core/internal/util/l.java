package io.sentry.android.core.internal.util;

import io.sentry.InterfaceC11576d0;
import io.sentry.util.AbstractC11679h;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f175500c = null;

    /* renamed from: a, reason: collision with root package name */
    public final AutoClosableReentrantLock f175501a;

    /* renamed from: b, reason: collision with root package name */
    public final List f175502b;

    static {
        f175500c = new l();
    }

    public l() {
        this.f175501a = new AutoClosableReentrantLock();
        this.f175502b = new ArrayList();
    }

    public static l a() {
        return f175500c;
    }

    public String b() {
        return "/sys/devices/system/cpu";
    }

    public List c() {
        InterfaceC11576d0 r02 = this.f175501a.a();
    L9:
        th = move-exception;
        if (r02 != null) goto L43;
    L38:
        throw th;
    L43:
        r02.close();     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        th.addSuppressed(th);
        goto L38
    L4:
        if (this.f175502b.isEmpty() == true) goto L11;
        List r1 = this.f175502b;     // Catch: Throwable -> L9
        if (r02 == null) goto L8;
        r02.close();
    L8:
        return r1;
    L11:
        File[] r12 = new File(b()).listFiles();     // Catch: Throwable -> L9
        if (r12 != null) goto L17;
        ArrayList r13 = new ArrayList();     // Catch: Throwable -> L9
        if (r02 == null) goto L16;
        r02.close();
    L16:
        return r13;
    L17:
        int r2 = r12.length;     // Catch: Throwable -> L9
        int r3 = 0;
    L18:
        if (r3 >= r2) goto L29;
        File r4 = r12[r3];     // Catch: Throwable -> L9
        if (r4.getName().matches("cpu[0-9]+") == true) goto L41;
    L28:
        r3 = r3 + 1;     // Catch: Throwable -> L9
        goto L18
    L41:
        String r42 = AbstractC11679h.c(new File(r4, "cpufreq/cpuinfo_max_freq"));     // Catch: Throwable -> L9 Throwable -> L39
        if (r42 == null) goto L28;
        long r43 = Long.parseLong(r42.trim());     // Catch: Throwable -> L9 Throwable -> L39
        this.f175502b.add(Integer.valueOf((int) (r43 / 1000)));     // Catch: Throwable -> L9
        goto L28
    L29:
        List r14 = this.f175502b;     // Catch: Throwable -> L9
        if (r02 == null) goto L32;
        r02.close();
    L32:
        return r14;
    }
}
