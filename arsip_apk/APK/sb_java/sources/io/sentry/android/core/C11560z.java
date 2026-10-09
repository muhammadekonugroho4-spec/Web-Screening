package io.sentry.android.core;

import android.util.Log;
import io.sentry.SentryLevel;

/* renamed from: io.sentry.android.core.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11560z implements io.sentry.Q {

    /* renamed from: a, reason: collision with root package name */
    public final String f175674a;

    /* renamed from: io.sentry.android.core.z$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175675a = null;

        static {
            int[] r02 = new int[SentryLevel.values().length];
            f175675a = r02;
            r02[SentryLevel.INFO.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L14:
            f175675a[SentryLevel.WARNING.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L18:
            f175675a[SentryLevel.ERROR.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L22:
            f175675a[SentryLevel.FATAL.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L16:
            f175675a[SentryLevel.DEBUG.ordinal()] = 5;     // Catch: NoSuchFieldError -> L13
            return;
        }
    }

    public C11560z() {
        this("Sentry");
    }

    private int e(SentryLevel r3) {
        int r32 = a.f175675a[r3.ordinal()];
        if (r32 != 1) goto L5;
        return 4;
    L5:
        if (r32 == 2) goto L11;
        if (r32 == 4) goto L9;
        return 3;
    L9:
        return 7;
    L11:
        return 5;
    }

    @Override // io.sentry.Q
    public void a(SentryLevel r2, String r3, Throwable r4) {
        int r22 = a.f175675a[r2.ordinal()];
        if (r22 != 1) goto L5;
        Log.i(this.f175674a, r3, r4);
        return;
    L5:
        if (r22 != 2) goto L7;
        Log.w(this.f175674a, r3, r4);
        return;
    L7:
        if (r22 != 3) goto L9;
        Log.e(this.f175674a, r3, r4);
        return;
    L9:
        if (r22 == 4) goto L12;
        Log.d(this.f175674a, r3, r4);
        return;
    L12:
        Log.wtf(this.f175674a, r3, r4);
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
        Log.println(e(r2), this.f175674a, r3);
        return;
    L4:
        if (r4.length == 0) goto L8;
        Log.println(e(r2), this.f175674a, String.format(r3, r4));
    }

    @Override // io.sentry.Q
    public boolean d(SentryLevel r1) {
        return true;
    }

    public C11560z(String r1) {
        this.f175674a = r1;
    }
}
