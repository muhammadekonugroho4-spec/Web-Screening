package androidx.window.layout.util;

import android.content.Context;

/* loaded from: classes4.dex */
public final class m implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final m f29005b = null;

    static {
        f29005b = new m();
    }

    public m() {
    }

    @Override // androidx.window.layout.util.k
    public float a(Context r2) {
        kotlin.jvm.internal.p.l(r2, "context");
        return r2.getResources().getDisplayMetrics().density;
    }
}
