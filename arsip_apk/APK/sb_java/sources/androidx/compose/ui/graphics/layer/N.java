package androidx.compose.ui.graphics.layer;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import androidx.compose.ui.graphics.h1;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final N f17484a = null;

    static {
        f17484a = new N();
    }

    public N() {
    }

    public final void a(RenderNode r1, h1 r2) {
        if (r2 == null) goto L4;
        RenderEffect r22 = r2.a();
    L5:
        K.a(r1, r22);
        return;
    L4:
        r22 = null;
        goto L5
    }
}
