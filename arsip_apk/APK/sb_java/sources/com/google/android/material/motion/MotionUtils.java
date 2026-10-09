package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.g;
import androidx.dynamicanimation.animation.m;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: classes5.dex */
public class MotionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    private static float getLegacyControlPoint(String[] r2, int r3) {
        float r22 = Float.parseFloat(r2[r3]);
        if (r22 < 0.0f) goto L8;
        if (r22 > 1.0f) goto L8;
        return r22;
    L8:
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + r22);
    }

    private static String getLegacyEasingContent(String r1, String r2) {
        return r1.substring(r2.length() + 1, r1.length() - 1);
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String r4) {
        if (isLegacyEasingType(r4, EASING_TYPE_CUBIC_BEZIER) == false) goto L11;
        String[] r42 = getLegacyEasingContent(r4, EASING_TYPE_CUBIC_BEZIER).split(Constants.SEPARATOR_COMMA);
        if (r42.length != 4) goto L9;
        return new PathInterpolator(getLegacyControlPoint(r42, 0), getLegacyControlPoint(r42, 1), getLegacyControlPoint(r42, 2), getLegacyControlPoint(r42, 3));
    L9:
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + r42.length);
    L11:
        if (isLegacyEasingType(r4, EASING_TYPE_PATH) == false) goto L15;
        return new PathInterpolator(g.e(getLegacyEasingContent(r4, EASING_TYPE_PATH)));
    L15:
        throw new IllegalArgumentException("Invalid motion easing type: " + r4);
    }

    private static boolean isLegacyEasingAttribute(String r1) {
        if (isLegacyEasingType(r1, EASING_TYPE_CUBIC_BEZIER) == false) goto L5;
        return true;
    L5:
        if (isLegacyEasingType(r1, EASING_TYPE_PATH) == true) goto L11;
        return false;
    L11:
        return true;
    }

    private static boolean isLegacyEasingType(String r1, String r2) {
        if (r1.startsWith(r2 + EASING_TYPE_FORMAT_START) == true) goto L5;
        return false;
    L5:
        if (r1.endsWith(EASING_TYPE_FORMAT_END) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static int resolveThemeDuration(Context r02, int r1, int r2) {
        return MaterialAttributes.resolveInteger(r02, r1, r2);
    }

    public static TimeInterpolator resolveThemeInterpolator(Context r3, int r4, TimeInterpolator r5) {
        TypedValue r02 = new TypedValue();
        if (r3.getTheme().resolveAttribute(r4, r02, true) == true) goto L6;
        return r5;
    L6:
        if (r02.type != 3) goto L14;
        String r42 = String.valueOf(r02.string);
        if (isLegacyEasingAttribute(r42) == false) goto L12;
        return getLegacyThemeInterpolator(r42);
    L12:
        return AnimationUtils.loadInterpolator(r3, r02.resourceId);
    L14:
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static m resolveThemeSpringForce(Context r2, int r3, int r4) {
        TypedValue r32 = MaterialAttributes.resolve(r2, r3);
        if (r32 != null) goto L5;
        TypedArray r22 = r2.obtainStyledAttributes(null, R.styleable.MaterialSpring, 0, r4);
    L6:
        m r33 = new m();
        float r42 = r22.getFloat(R.styleable.MaterialSpring_stiffness, Float.MIN_VALUE);     // Catch: Throwable -> L14
        if (r42 == Float.MIN_VALUE) goto L19;
        float r1 = r22.getFloat(R.styleable.MaterialSpring_damping, Float.MIN_VALUE);     // Catch: Throwable -> L14
        if (r1 == Float.MIN_VALUE) goto L17;
        r33.h(r42);     // Catch: Throwable -> L14
        r33.f(r1);     // Catch: Throwable -> L14
        r22.recycle();
        return r33;
    L17:
        throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");     // Catch: Throwable -> L14
    L19:
        throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r22.recycle();
        throw th;
    L5:
        r22 = r2.obtainStyledAttributes(r32.resourceId, R.styleable.MaterialSpring);
        goto L6
    }
}
