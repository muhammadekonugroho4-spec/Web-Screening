package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: classes4.dex */
public abstract class f {

    public static class a {
        public static void a(EdgeEffect r02, float r1, float r2) {
            r02.onPull(r1, r2);
        }
    }

    public static class b {
        public static EdgeEffect a(Context r1, AttributeSet r2) {
            return new EdgeEffect(r1, r2);
        L5:
            return new EdgeEffect(r1);
        }

        public static float b(EdgeEffect r02) {
            return r02.getDistance();
        L4:
            return 0.0f;
        }

        public static float c(EdgeEffect r02, float r1, float r2) {
            return r02.onPullDistance(r1, r2);
        L4:
            r02.onPull(r1, r2);
            return 0.0f;
        }
    }

    public static EdgeEffect a(Context r2, AttributeSet r3) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return b.a(r2, r3);
    L7:
        return new EdgeEffect(r2);
    }

    public static float b(EdgeEffect r2) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return 0.0f;
    L5:
        return b.b(r2);
    }

    public static void c(EdgeEffect r02, float r1, float r2) {
        a.a(r02, r1, r2);
    }

    public static float d(EdgeEffect r2, float r3, float r4) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        c(r2, r3, r4);
        return r3;
    L5:
        return b.c(r2, r3, r4);
    }
}
