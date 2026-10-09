package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f17483a = null;

    static {
        f17483a = new M();
    }

    public M() {
    }

    public final int a(RenderNode r1) {
        return r1.getAmbientShadowColor();
    }

    public final int b(RenderNode r1) {
        return r1.getSpotShadowColor();
    }

    public final void c(RenderNode r1, int r2) {
        r1.setAmbientShadowColor(r2);
    }

    public final void d(RenderNode r1, int r2) {
        r1.setSpotShadowColor(r2);
    }
}
