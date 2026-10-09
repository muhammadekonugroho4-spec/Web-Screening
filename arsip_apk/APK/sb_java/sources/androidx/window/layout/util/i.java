package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class i {
    public static final /* synthetic */ DisplayCutout a(Display r02) {
        return d(r02);
    }

    public static final /* synthetic */ int b(Context r02) {
        return e(r02);
    }

    public static final /* synthetic */ void c(Activity r02, Rect r1) {
        f(r02, r1);
    }

    public static final DisplayCutout d(Display r6) {
        Constructor<?> r1 = Class.forName("android.view.DisplayInfo").getConstructor(null);     // Catch: Exception -> L7
        r1.setAccessible(true);     // Catch: Exception -> L7
        Object r12 = r1.newInstance(null);     // Catch: Exception -> L7
        Method r3 = r6.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{r12.getClass()});     // Catch: Exception -> L7
        r3.setAccessible(true);     // Catch: Exception -> L7
        r3.invoke(r6, new Object[]{r12});     // Catch: Exception -> L7
        Field r62 = r12.getClass().getDeclaredField("displayCutout");     // Catch: Exception -> L7
        r62.setAccessible(true);     // Catch: Exception -> L7
        Object r63 = r62.get(r12);     // Catch: Exception -> L7
        if (g.a(r63) == false) goto L23;
        return h.a(r63);
    L23:
        return null;
    L7:
        e = move-exception;
        if ((e instanceof ClassNotFoundException) == false) goto L11;
    L22:
        Log.w(b.f28994a.b(), e);
        goto L23
    L11:
        if ((e instanceof NoSuchMethodException) == true) goto L22;
        if ((e instanceof NoSuchFieldException) == true) goto L22;
        if ((e instanceof IllegalAccessException) == true) goto L22;
        if ((e instanceof InvocationTargetException) == true) goto L22;
        if ((e instanceof InstantiationException) == true) goto L22;
        throw e;
    }

    public static final int e(Context r3) {
        Resources r32 = r3.getResources();
        int r02 = r32.getIdentifier("navigation_bar_height", "dimen", Constants.KEY_ANDROID);
        if (r02 > 0) goto L5;
        return 0;
    L5:
        return r32.getDimensionPixelSize(r02);
    }

    public static final void f(Activity r02, Rect r1) {
        r02.getWindowManager().getDefaultDisplay().getRectSize(r1);
    }
}
