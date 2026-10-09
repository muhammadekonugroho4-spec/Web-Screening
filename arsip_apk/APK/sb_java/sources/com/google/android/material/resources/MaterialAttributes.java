package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R;

/* loaded from: classes5.dex */
public class MaterialAttributes {
    public MaterialAttributes() {
    }

    public static TypedValue resolve(Context r2, int r3) {
        TypedValue r02 = new TypedValue();
        if (r2.getTheme().resolveAttribute(r3, r02, true) == false) goto L5;
        return r02;
    L5:
        return null;
    }

    public static boolean resolveBoolean(Context r1, int r2, boolean r3) {
        TypedValue r12 = resolve(r1, r2);
        if (r12 != null) goto L5;
    L12:
        return r3;
    L5:
        if (r12.type != 18) goto L12;
        if (r12.data == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean resolveBooleanOrThrow(Context r02, int r1, String r2) {
        if (resolveOrThrow(r02, r1, r2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static int resolveDimension(Context r2, int r3, int r4) {
        TypedValue r32 = resolve(r2, r3);
        if (r32 != null) goto L5;
    L10:
        float r22 = r2.getResources().getDimension(r4);
    L9:
        return (int) r22;
    L5:
        if (r32.type != 5) goto L10;
        r22 = r32.getDimension(r2.getResources().getDisplayMetrics());
        goto L9
    }

    public static int resolveInteger(Context r1, int r2, int r3) {
        TypedValue r12 = resolve(r1, r2);
        if (r12 != null) goto L5;
    L8:
        return r3;
    L5:
        if (r12.type != 16) goto L8;
        return r12.data;
    }

    public static int resolveMinimumAccessibleTouchTarget(Context r2) {
        return resolveDimension(r2, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(Context r02, int r1, String r2) {
        return resolveTypedValueOrThrow(r02, r1, r2).data;
    }

    public static TypedValue resolveTypedValueOrThrow(View r1, int r2) {
        return resolveTypedValueOrThrow(r1.getContext(), r2, r1.getClass().getCanonicalName());
    }

    public static int resolveOrThrow(View r02, int r1) {
        return resolveTypedValueOrThrow(r02, r1).data;
    }

    public static TypedValue resolveTypedValueOrThrow(Context r1, int r2, String r3) {
        TypedValue r02 = resolve(r1, r2);
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{r3, r1.getResources().getResourceName(r2)}));
    }
}
