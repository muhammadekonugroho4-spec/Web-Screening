package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import com.clevertap.android.sdk.Constants;
import java.util.Objects;

/* renamed from: androidx.core.view.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3875h0 {

    /* renamed from: androidx.core.view.h0$a */
    public static class a {
        public static float a(ViewConfiguration r02) {
            return r02.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration r02) {
            return r02.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: androidx.core.view.h0$b */
    public static class b {
        public static boolean a(ViewConfiguration r02) {
            return r02.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* renamed from: androidx.core.view.h0$c */
    public static class c {
        public static int a(ViewConfiguration r02, int r1, int r2, int r3) {
            return r02.getScaledMaximumFlingVelocity(r1, r2, r3);
        }

        public static int b(ViewConfiguration r02, int r1, int r2, int r3) {
            return r02.getScaledMinimumFlingVelocity(r1, r2, r3);
        }
    }

    static {
    }

    public static int a(Resources r1, int r2, androidx.core.util.i r3, int r4) {
        if (r2 == (-1)) goto L11;
        if (r2 == 0) goto L9;
        int r12 = r1.getDimensionPixelSize(r2);
        if (r12 < 0) goto L9;
        return r12;
    L9:
        return r4;
    L11:
        return ((Integer) r3.get()).intValue();
    }

    public static int b(Resources r1, String r2, String r3) {
        return r1.getIdentifier(r2, r3, Constants.KEY_ANDROID);
    }

    public static int c(Resources r1, int r2, int r3) {
        if (r2 == 4194304) goto L5;
        return -1;
    L5:
        if (r3 == 26) goto L7;
        return -1;
    L7:
        return b(r1, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
    }

    public static int d(Resources r1, int r2, int r3) {
        if (r2 == 4194304) goto L5;
        return -1;
    L5:
        if (r3 == 26) goto L7;
        return -1;
    L7:
        return b(r1, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
    }

    public static float e(ViewConfiguration r02, Context r1) {
        return a.a(r02);
    }

    public static int f(Context r2, final ViewConfiguration r3, int r4, int r5, int r6) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return c.a(r3, r4, r5, r6);
    L7:
        if (i(r4, r5, r6) == true) goto L9;
        return Integer.MIN_VALUE;
    L9:
        Resources r22 = r2.getResources();
        int r42 = c(r22, r6, r5);
        Objects.requireNonNull(r3);
        return a(r22, r42, new C3871f0(r3), Integer.MIN_VALUE);
    }

    public static int g(Context r2, final ViewConfiguration r3, int r4, int r5, int r6) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return c.b(r3, r4, r5, r6);
    L7:
        if (i(r4, r5, r6) == true) goto L9;
        return Integer.MAX_VALUE;
    L9:
        Resources r22 = r2.getResources();
        int r42 = d(r22, r6, r5);
        Objects.requireNonNull(r3);
        return a(r22, r42, new C3873g0(r3), Integer.MAX_VALUE);
    }

    public static float h(ViewConfiguration r02, Context r1) {
        return a.b(r02);
    }

    public static boolean i(int r02, int r1, int r2) {
        InputDevice r03 = InputDevice.getDevice(r02);
        if (r03 != null) goto L5;
        return false;
    L5:
        if (r03.getMotionRange(r1, r2) == null) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean j(ViewConfiguration r2, Context r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        Resources r22 = r3.getResources();
        int r32 = b(r22, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        if (r32 != 0) goto L9;
        return false;
    L9:
        if (r22.getBoolean(r32) == false) goto L14;
        return true;
    L14:
        return false;
    L5:
        return b.a(r2);
    }
}
