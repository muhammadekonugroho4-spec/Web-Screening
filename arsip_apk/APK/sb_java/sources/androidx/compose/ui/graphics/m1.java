package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f17544a = null;

    static {
        f17544a = new m1();
    }

    public m1() {
    }

    public final RenderEffect a(h1 r3, float r4, float r5, int r6) {
        if (r4 == 0.0f) goto L5;
    L8:
        if (r3 != null) goto L12;
        return k1.a(r4, r5, AbstractC3495b0.a(r6));
    L12:
        return l1.a(r4, r5, r3.a(), AbstractC3495b0.a(r6));
    L5:
        if (r5 != 0.0f) goto L8;
        return j1.a(0.0f, 0.0f);
    }
}
