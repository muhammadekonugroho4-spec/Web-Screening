package androidx.window.layout.util;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public final class f implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final f f29000b = null;

    static {
        f29000b = new f();
    }

    public f() {
    }

    @Override // androidx.window.layout.util.b
    public Rect a(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "activity");
        Rect r22 = ((WindowManager) r2.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        kotlin.jvm.internal.p.k(r22, "getBounds(...)");
        return r22;
    }
}
