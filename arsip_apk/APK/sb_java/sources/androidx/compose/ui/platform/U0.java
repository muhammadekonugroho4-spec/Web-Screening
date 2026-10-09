package androidx.compose.ui.platform;

import android.graphics.RenderEffect;
import android.view.View;
import androidx.compose.ui.graphics.h1;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public static final U0 f19221a = null;

    static {
        f19221a = new U0();
    }

    public U0() {
    }

    public final void a(View r1, h1 r2) {
        if (r2 == null) goto L4;
        RenderEffect r22 = r2.a();
    L5:
        androidx.compose.ui.graphics.layer.U.a(r1, r22);
        return;
    L4:
        r22 = null;
        goto L5
    }
}
