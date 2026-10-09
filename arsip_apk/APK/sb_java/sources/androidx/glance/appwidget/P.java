package androidx.glance.appwidget;

import android.os.Trace;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public static final P f24865a = null;

    static {
        f24865a = new P();
    }

    public P() {
    }

    public final void a(String r1, int r2) {
        Trace.beginAsyncSection(r1, r2);
    }

    public final void b(String r1, int r2) {
        Trace.endAsyncSection(r1, r2);
    }
}
