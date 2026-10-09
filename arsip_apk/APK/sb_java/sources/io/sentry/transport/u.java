package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* loaded from: classes3.dex */
public final class u extends Authenticator {

    /* renamed from: a, reason: collision with root package name */
    public final String f176817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f176818b;

    public u(String r2, String r3) {
        this.f176817a = (String) io.sentry.util.v.c(r2, "user is required");
        this.f176818b = (String) io.sentry.util.v.c(r3, "password is required");
    }

    @Override // java.net.Authenticator
    public PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) goto L5;
        return null;
    L5:
        return new PasswordAuthentication(this.f176817a, this.f176818b.toCharArray());
    }
}
