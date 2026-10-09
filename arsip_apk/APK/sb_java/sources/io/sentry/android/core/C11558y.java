package io.sentry.android.core;

import android.util.Log;
import io.sentry.SentryLevel;

/* renamed from: io.sentry.android.core.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11558y implements io.sentry.Q {

    /* renamed from: a, reason: collision with root package name */
    public final String f175673a;

    public C11558y() {
        this("Sentry");
    }

    @Override // io.sentry.Q
    public void a(SentryLevel r1, String r2, Throwable r3) {
        Log.wtf(this.f175673a, r2, r3);
    }

    @Override // io.sentry.Q
    public void b(SentryLevel r2, Throwable r3, String r4, Object... r5) {
        if (r5 != null) goto L4;
    L8:
        a(r2, r4, r3);
        return;
    L4:
        if (r5.length == 0) goto L8;
        a(r2, String.format(r4, r5), r3);
    }

    @Override // io.sentry.Q
    public void c(SentryLevel r2, String r3, Object... r4) {
        if (r4 != null) goto L4;
    L8:
        Log.println(e(r2), this.f175673a, r3);
        return;
    L4:
        if (r4.length == 0) goto L8;
        Log.println(e(r2), this.f175673a, String.format(r3, r4));
    }

    @Override // io.sentry.Q
    public boolean d(SentryLevel r1) {
        return true;
    }

    public final int e(SentryLevel r1) {
        return 7;
    }

    public C11558y(String r1) {
        this.f175673a = r1;
    }
}
