package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* renamed from: io.sentry.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11689w1 {

    /* renamed from: a, reason: collision with root package name */
    public final URL f176945a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f176946b;

    public C11689w1(String r2, Map r3) {
        io.sentry.util.v.c(r2, "url is required");
        io.sentry.util.v.c(r3, "headers is required");
        this.f176945a = URI.create(r2).toURL();     // Catch: MalformedURLException -> L6
        this.f176946b = r3;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
    }

    public Map a() {
        return this.f176946b;
    }

    public URL b() {
        return this.f176945a;
    }
}
