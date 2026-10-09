package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: io.sentry.android.core.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11530j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C11530j0 f175533b = null;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f175534a;

    static {
        f175533b = new C11530j0();
    }

    public C11530j0() {
    }

    public static C11530j0 c() {
        return f175533b;
    }

    public void a(Activity r2) {
        WeakReference r02 = this.f175534a;
        if (r02 != null) goto L5;
    L7:
        this.f175534a = null;
        return;
    L5:
        if (r02.get() == r2) goto L7;
    }

    public Activity b() {
        WeakReference r02 = this.f175534a;
        if (r02 != null) goto L5;
        return null;
    L5:
        return (Activity) r02.get();
    }

    public void d(Activity r2) {
        WeakReference r02 = this.f175534a;
        if (r02 != null) goto L5;
    L7:
        this.f175534a = new WeakReference(r2);
        return;
    L5:
        if (r02.get() != r2) goto L7;
    }
}
