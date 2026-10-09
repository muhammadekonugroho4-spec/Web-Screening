package io.sentry.transport;

import java.net.Authenticator;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f176808a = null;

    static {
        f176808a = new l();
    }

    public l() {
    }

    public static l a() {
        return f176808a;
    }

    public void b(Authenticator r1) {
        Authenticator.setDefault(r1);
    }
}
