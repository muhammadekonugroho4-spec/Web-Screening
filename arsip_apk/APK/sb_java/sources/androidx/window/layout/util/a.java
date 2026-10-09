package androidx.window.layout.util;

import android.app.Activity;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28993a = null;

    static {
        f28993a = new a();
    }

    public a() {
    }

    public final boolean a(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "activity");
        return r2.isInMultiWindowMode();
    }
}
