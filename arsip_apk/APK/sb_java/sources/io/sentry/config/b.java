package io.sentry.config;

import io.sentry.Q;
import io.sentry.SentryLevel;
import io.sentry.util.AbstractC11672a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f176188a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f176189b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f176190c;

    public b(String r1, ClassLoader r2, Q r3) {
        this.f176188a = r1;
        this.f176189b = AbstractC11672a.a(r2);
        this.f176190c = r3;
    }

    public Properties a() {
        InputStream r1 = this.f176189b.getResourceAsStream(this.f176188a);     // Catch: IOException -> L10
        if (r1 != null) goto L32;
        if (r1 == null) goto L27;
        r1.close();     // Catch: IOException -> L10
    L27:
        return null;
    L32:
        BufferedInputStream r2 = new BufferedInputStream(r1);     // Catch: Throwable -> L12
        Properties r3 = new Properties();     // Catch: Throwable -> L14
        r3.load(r2);     // Catch: Throwable -> L14
        r2.close();     // Catch: Throwable -> L12
        r1.close();     // Catch: IOException -> L10
        return r3;
    L14:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L17
    L19:
        throw th;     // Catch: Throwable -> L12
    L17:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L22
    L24:
        throw th;     // Catch: IOException -> L10
    L22:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L10
    L10:
        e = move-exception;
        this.f176190c.b(SentryLevel.ERROR, e, "Failed to load Sentry configuration from classpath resource: %s", new Object[]{this.f176188a});
        return null;
    }

    public b(Q r3) {
        this("sentry.properties", b.class.getClassLoader(), r3);
    }
}
