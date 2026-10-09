package androidx.compose.ui.graphics;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;

/* loaded from: classes.dex */
public abstract class U {
    public static final Z0 a(float[] r2, float r3) {
        return new T(new DashPathEffect(r2, r3));
    }

    public static final PathEffect b(Z0 r1) {
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((T) r1).a();
    }
}
