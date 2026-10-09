package io.sentry.internal.modules;

import io.sentry.InterfaceC11576d0;
import io.sentry.Q;
import io.sentry.SentryLevel;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class d implements b {
    public static final Charset d = null;

    /* renamed from: a, reason: collision with root package name */
    public final Q f176276a;

    /* renamed from: b, reason: collision with root package name */
    public final AutoClosableReentrantLock f176277b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f176278c;

    static {
        d = Charset.forName("UTF-8");
    }

    public d(Q r2) {
        this.f176277b = new AutoClosableReentrantLock();
        this.f176278c = null;
        this.f176276a = r2;
    }

    @Override // io.sentry.internal.modules.b
    public Map a() {
        if (this.f176278c != null) goto L20;
        InterfaceC11576d0 r02 = this.f176277b.a();
    L9:
        th = move-exception;
        if (r02 != null) goto L21;
    L18:
        throw th;
    L21:
        r02.close();     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        th.addSuppressed(th);
        goto L18
    L6:
        if (this.f176278c != null) goto L11;
        this.f176278c = b();     // Catch: Throwable -> L9
    L11:
        if (r02 == null) goto L20;
        r02.close();
    L20:
        return this.f176278c;
    }

    public abstract Map b();

    public Map c(InputStream r6) {
        TreeMap r02 = new TreeMap();
        BufferedReader r1 = new BufferedReader(new InputStreamReader(r6, d));     // Catch: RuntimeException -> L12 IOException -> L14
        String r62 = r1.readLine();     // Catch: Throwable -> L7
    L5:
        if (r62 == null) goto L9;
        int r2 = r62.lastIndexOf(58);     // Catch: Throwable -> L7
        r02.put(r62.substring(0, r2), r62.substring(r2 + 1));     // Catch: Throwable -> L7
        r62 = r1.readLine();     // Catch: Throwable -> L7
        goto L5
    L9:
        this.f176276a.c(SentryLevel.DEBUG, "Extracted %d modules from resources.", new Object[]{Integer.valueOf(r02.size())});     // Catch: Throwable -> L7
        r1.close();     // Catch: RuntimeException -> L12 IOException -> L14
        return r02;
    L7:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L18
    L20:
        throw th;     // Catch: RuntimeException -> L12 IOException -> L14
    L18:
        th = move-exception;
        th.addSuppressed(th);     // Catch: RuntimeException -> L12 IOException -> L14
    L14:
        e = move-exception;
        this.f176276a.a(SentryLevel.ERROR, "Error extracting modules.", e);
    L23:
        return r02;
    L12:
        e = move-exception;
        this.f176276a.b(SentryLevel.ERROR, e, "%s file is malformed.", new Object[]{"sentry-external-modules.txt"});
        goto L23
    }
}
