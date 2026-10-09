package androidx.compose.ui.graphics.layer;

import android.graphics.RenderEffect;
import android.view.View;
import androidx.compose.ui.graphics.h1;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f17488a = null;

    static {
        f17488a = new V();
    }

    public V() {
    }

    public final void a(View r1, h1 r2) {
        if (r2 == null) goto L4;
        RenderEffect r22 = r2.a();
    L5:
        U.a(r1, r22);
        return;
    L4:
        r22 = null;
        goto L5
    }
}
