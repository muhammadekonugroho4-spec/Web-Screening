package io.sentry.config;

import io.sentry.Q;
import io.sentry.SentryLevel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f176192a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f176193b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f176194c;

    public e(String r2, Q r3) {
        this(r2, r3, true);
    }

    public Properties a() {
        File r1 = new File(this.f176192a.trim());     // Catch: Throwable -> L11
        if (r1.isFile() == false) goto L20;
        if (r1.canRead() == false) goto L20;
        BufferedInputStream r2 = new BufferedInputStream(new FileInputStream(r1));     // Catch: Throwable -> L11
        Properties r12 = new Properties();     // Catch: Throwable -> L13
        r12.load(r2);     // Catch: Throwable -> L13
        r2.close();     // Catch: Throwable -> L11
        return r12;
    L13:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L16
    L18:
        throw th;     // Catch: Throwable -> L11
    L16:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L11
    L20:
        if (r1.isFile() == true) goto L25;
        if (this.f176194c == false) goto L27;
        this.f176193b.c(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", new Object[]{this.f176192a});     // Catch: Throwable -> L11
    L27:
        return null;
    L25:
        if (r1.canRead() == true) goto L27;
        this.f176193b.c(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not readable: %s", new Object[]{this.f176192a});     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        this.f176193b.b(SentryLevel.ERROR, th, "Failed to load Sentry configuration from file: %s", new Object[]{this.f176192a});
        return null;
    }

    public e(String r1, Q r2, boolean r3) {
        this.f176192a = r1;
        this.f176193b = r2;
        this.f176194c = r3;
    }
}
