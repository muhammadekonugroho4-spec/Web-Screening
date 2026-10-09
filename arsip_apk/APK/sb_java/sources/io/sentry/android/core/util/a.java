package io.sentry.android.core.util;

import android.content.Context;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f175627a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1842a f175628b;

    /* renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC1842a {
        Object a(Context r1);
    }

    public a(InterfaceC1842a r2) {
        this.f175627a = null;
        this.f175628b = r2;
    }

    public Object a(Context r2) {
        if (this.f175627a != null) goto L15;
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L6:
        if (this.f175627a != null) goto L10;
        this.f175627a = this.f175628b.a(r2);     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
    L15:
        return this.f175627a;
    }
}
