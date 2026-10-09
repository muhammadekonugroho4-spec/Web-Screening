package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.constraintlayout.motion.utils.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0148a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21670a = null;

        static {
            int[] r02 = new int[ConstraintAttribute.AttributeType.values().length];
            f21670a = r02;
            r02[ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
        L18:
            f21670a[ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
        L22:
            f21670a[ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
        L30:
            f21670a[ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L20:
            f21670a[ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
        L24:
            f21670a[ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
        L26:
            f21670a[ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;     // Catch: NoSuchFieldError -> L17
            return;
        }
    }

    public static int a(int r1) {
        int r12 = (r1 & (~(r1 >> 31))) - 255;
        return (r12 & (r12 >> 31)) + Constants.MAX_HOST_LENGTH;
    }

    public static void b(ConstraintAttribute r16, View r17, float[] r18) {
        Class<?> r02 = r17.getClass();
        String r5 = "set" + r16.b();
        int r6 = C0148a.f21670a[r16.c().ordinal()];     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        Class r9 = Integer.TYPE;
        Class r10 = Float.TYPE;
        boolean r11 = true;
        switch(r6) {
            case 1: goto L27;
            case 2: goto L25;
            case 3: goto L23;
            case 4: goto L21;
            case 5: goto L20;
            case 6: goto L13;
            case 7: goto L7;
            default: goto L37;
        };
    L7:
        r02.getMethod(r5, new Class[]{r10}).invoke(r17, new Object[]{Float.valueOf(r18[0])});     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        return;
    L13:
        Method r03 = r02.getMethod(r5, new Class[]{Boolean.TYPE});     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        if (r18[0] > 0.5f) goto L17;
        r11 = false;
    L17:
        r03.invoke(r17, new Object[]{Boolean.valueOf(r11)});     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        return;
    L21:
        Method r04 = r02.getMethod(r5, new Class[]{r9});     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        int r62 = a((int) (((float) Math.pow(r18[0], 0.45454545454545453d)) * 255.0f));     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        int r92 = a((int) (((float) Math.pow(r18[1], 0.45454545454545453d)) * 255.0f));     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        r04.invoke(r17, new Object[]{Integer.valueOf((((r62 << 16) | (a((int) (r18[3] * 255.0f)) << 24)) | (r92 << 8)) | a((int) (((float) Math.pow(r18[2], 0.45454545454545453d)) * 255.0f)))});     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        return;
    L23:
        Method r05 = r02.getMethod(r5, new Class[]{Drawable.class});     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        int r63 = a((int) (((float) Math.pow(r18[0], 0.45454545454545453d)) * 255.0f));     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        int r93 = a((int) (((float) Math.pow(r18[1], 0.45454545454545453d)) * 255.0f));     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        int r64 = (((r63 << 16) | (a((int) (r18[3] * 255.0f)) << 24)) | (r93 << 8)) | a((int) (((float) Math.pow(r18[2], 0.45454545454545453d)) * 255.0f));     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        ColorDrawable r7 = new ColorDrawable();     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        r7.setColor(r64);     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        r05.invoke(r17, new Object[]{r7});     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        return;
    L25:
        r02.getMethod(r5, new Class[]{r10}).invoke(r17, new Object[]{Float.valueOf(r18[0])});     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        return;
    L27:
        r02.getMethod(r5, new Class[]{r9}).invoke(r17, new Object[]{Integer.valueOf((int) r18[0])});     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
        return;
    L37:
        return;
    L20:
        throw new RuntimeException("unable to interpolate strings " + r16.b());     // Catch: IllegalAccessException -> L9 NoSuchMethodException -> L11 InvocationTargetException -> L29
    L9:
        e = move-exception;
        Log.e("CustomSupport", "cannot access method " + r5 + " on View \"" + androidx.constraintlayout.motion.widget.a.d(r17) + "\"");
        e.printStackTrace();
        return;
    L11:
        e = move-exception;
        Log.e("CustomSupport", "no method " + r5 + " on View \"" + androidx.constraintlayout.motion.widget.a.d(r17) + "\"");
        e.printStackTrace();
        return;
    L29:
        e = move-exception;
        e.printStackTrace();
    }
}
