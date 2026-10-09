package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.core.view.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3863b0 {

    /* renamed from: a, reason: collision with root package name */
    public static Map f23209a;

    /* renamed from: androidx.core.view.b0$a */
    public static class a {
        public static float a(VelocityTracker r02, int r1) {
            return r02.getAxisVelocity(r1);
        }
    }

    static {
        f23209a = Collections.synchronizedMap(new WeakHashMap());
    }

    public static void a(VelocityTracker r2, MotionEvent r3) {
        r2.addMovement(r3);
        if (Build.VERSION.SDK_INT < 34) goto L6;
        return;
    L6:
        if (r3.getSource() == 4194304) goto L8;
        return;
    L8:
        if (f23209a.containsKey(r2) == true) goto L10;
        f23209a.put(r2, new C3865c0());
    L10:
        ((C3865c0) f23209a.get(r2)).a(r3);
    }

    public static void b(VelocityTracker r1, int r2) {
        c(r1, r2, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker r02, int r1, float r2) {
        r02.computeCurrentVelocity(r1, r2);
        C3865c0 r03 = e(r02);
        if (r03 == null) goto L6;
        r03.c(r1, r2);
        return;
    }

    public static float d(VelocityTracker r2, int r3) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        if (r3 != 0) goto L10;
        return r2.getXVelocity();
    L10:
        if (r3 == 1) goto L12;
        C3865c0 r22 = e(r2);
        if (r22 != null) goto L16;
        return 0.0f;
    L16:
        return r22.d(r3);
    L12:
        return r2.getYVelocity();
    L5:
        return a.a(r2, r3);
    }

    public static C3865c0 e(VelocityTracker r1) {
        return (C3865c0) f23209a.get(r1);
    }
}
