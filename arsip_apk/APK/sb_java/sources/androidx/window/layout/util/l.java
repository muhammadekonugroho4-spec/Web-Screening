package androidx.window.layout.util;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public final class l implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final l f29004b = null;

    static {
        f29004b = new l();
    }

    public l() {
    }

    @Override // androidx.window.layout.util.k
    public float a(Context r2) {
        kotlin.jvm.internal.p.l(r2, "context");
        return ((WindowManager) r2.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
