package io.sentry;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URI;

/* renamed from: io.sentry.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11662t {

    /* renamed from: a, reason: collision with root package name */
    public final String f176770a;

    /* renamed from: b, reason: collision with root package name */
    public final String f176771b;

    /* renamed from: c, reason: collision with root package name */
    public final String f176772c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final URI f176773e;

    public C11662t(String r10) {
        String r102 = ((String) io.sentry.util.v.c(r10, "The DSN is required.")).trim();     // Catch: Throwable -> L12
        if (r102.isEmpty() == true) goto L44;
        URI r103 = new URI(r102).normalize();     // Catch: Throwable -> L12
        String r2 = r103.getScheme();     // Catch: Throwable -> L12
        if ("http".equalsIgnoreCase(r2) == false) goto L8;
    L14:
        String r1 = r103.getUserInfo();     // Catch: Throwable -> L12
        if (r1 == null) goto L42;
        if (r1.isEmpty() == true) goto L42;
        String[] r12 = r1.split(":", -1);     // Catch: Throwable -> L12
        String r5 = r12[0];     // Catch: Throwable -> L12
        this.d = r5;     // Catch: Throwable -> L12
        if (r5 == null) goto L40;
        if (r5.isEmpty() == true) goto L40;
        if (r12.length <= 1) goto L26;
        String r13 = r12[1];     // Catch: Throwable -> L12
    L27:
        this.f176772c = r13;     // Catch: Throwable -> L12
        String r14 = r103.getPath();     // Catch: Throwable -> L12
        if (r14.endsWith(RemoteSettings.FORWARD_SLASH_STRING) == false) goto L30;
        r14 = r14.substring(0, r14.length() - 1);     // Catch: Throwable -> L12
    L30:
        int r3 = r14.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1;     // Catch: Throwable -> L12
        String r4 = r14.substring(0, r3);     // Catch: Throwable -> L12
        if (r4.endsWith(RemoteSettings.FORWARD_SLASH_STRING) == true) goto L33;
        r4 = r4 + RemoteSettings.FORWARD_SLASH_STRING;     // Catch: Throwable -> L12
    L33:
        this.f176771b = r4;     // Catch: Throwable -> L12
        String r02 = r14.substring(r3);     // Catch: Throwable -> L12
        this.f176770a = r02;     // Catch: Throwable -> L12
        if (r02.isEmpty() == true) goto L38;
        String r32 = r4;
        this.f176773e = new URI(r2, null, r103.getHost(), r103.getPort(), r32 + "api/" + r02, null, null);     // Catch: Throwable -> L12
        return;
    L38:
        throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");     // Catch: Throwable -> L12
    L26:
        r13 = null;
    L40:
        throw new IllegalArgumentException("Invalid DSN: No public key provided.");     // Catch: Throwable -> L12
    L42:
        throw new IllegalArgumentException("Invalid DSN: No public key provided.");     // Catch: Throwable -> L12
    L8:
        if ("https".equalsIgnoreCase(r2) == true) goto L14;
        throw new IllegalArgumentException("Invalid DSN scheme: " + r2);     // Catch: Throwable -> L12
    L44:
        throw new IllegalArgumentException("The DSN is empty.");     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw new IllegalArgumentException(th);
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f176772c;
    }

    public URI c() {
        return this.f176773e;
    }
}
