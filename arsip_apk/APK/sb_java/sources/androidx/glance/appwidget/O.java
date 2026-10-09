package androidx.glance.appwidget;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public static final O f24862a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f24863b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f24864c = 0;

    static {
        f24862a = new O();
        f24863b = new AtomicBoolean(false);
        f24864c = 8;
    }

    public O() {
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return;
    L5:
        if (f24863b.get() == false) goto L9;
        P.f24865a.a("GlanceAppWidget::update", 0);
        return;
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return;
    L5:
        if (f24863b.get() == false) goto L9;
        P.f24865a.b("GlanceAppWidget::update", 0);
        return;
    }
}
