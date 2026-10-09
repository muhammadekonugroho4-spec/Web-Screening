package dagger.hilt.android;

import android.content.Context;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f173941a = null;

    static {
        f173941a = new b();
    }

    public b() {
    }

    public static final Object a(Context r1, Class r2) {
        p.l(r1, "context");
        p.l(r2, "entryPoint");
        return dagger.hilt.a.a(dagger.hilt.android.internal.a.a(r1.getApplicationContext()), r2);
    }
}
