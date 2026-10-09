package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.compose.foundation.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2434f {

    /* renamed from: a, reason: collision with root package name */
    public static final C2434f f7383a = null;

    static {
        f7383a = new C2434f();
    }

    public C2434f() {
    }

    public final EdgeEffect a(Context r2, AttributeSet r3) {
        return new EdgeEffect(r2, r3);
    L5:
        return new EdgeEffect(r2);
    }

    public final float b(EdgeEffect r1) {
        return r1.getDistance();
    L4:
        return 0.0f;
    }

    public final float c(EdgeEffect r1, float r2, float r3) {
        return r1.onPullDistance(r2, r3);
    L4:
        r1.onPull(r2, r3);
        return 0.0f;
    }
}
