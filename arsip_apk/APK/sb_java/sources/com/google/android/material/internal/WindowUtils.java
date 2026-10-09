package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.clevertap.android.sdk.AbstractC4373a0;
import com.clevertap.android.sdk.AbstractC4377c0;

/* loaded from: classes5.dex */
public class WindowUtils {

    public static class Api17Impl {
        private Api17Impl() {
        }

        public static Rect getCurrentWindowBounds(WindowManager r2) {
            Display r22 = r2.getDefaultDisplay();
            Point r02 = new Point();
            r22.getRealSize(r02);
            Rect r23 = new Rect();
            r23.right = r02.x;
            r23.bottom = r02.y;
            return r23;
        }
    }

    public static class Api30Impl {
        private Api30Impl() {
        }

        public static Rect getCurrentWindowBounds(WindowManager r02) {
            return AbstractC4377c0.a(AbstractC4373a0.a(r02));
        }
    }

    private WindowUtils() {
    }

    public static Rect getCurrentWindowBounds(Context r2) {
        WindowManager r22 = (WindowManager) r2.getSystemService("window");
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return Api30Impl.getCurrentWindowBounds(r22);
    L7:
        return Api17Impl.getCurrentWindowBounds(r22);
    }
}
