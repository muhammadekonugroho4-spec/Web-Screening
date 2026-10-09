package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes5.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    public static int compositeARGBWithAlpha(int r1, int r2) {
        return androidx.core.graphics.d.p(r1, (Color.alpha(r1) * r2) / Constants.MAX_HOST_LENGTH);
    }

    public static int getColor(View r1, int r2) {
        return resolveColor(r1.getContext(), MaterialAttributes.resolveTypedValueOrThrow(r1, r2));
    }

    public static Integer getColorOrNull(Context r02, int r1) {
        TypedValue r12 = MaterialAttributes.resolve(r02, r1);
        if (r12 != null) goto L5;
        return null;
    L5:
        return Integer.valueOf(resolveColor(r02, r12));
    }

    private static int getColorRole(int r2, int r3) {
        Hct r22 = Hct.fromInt(r2);
        r22.setTone(r3);
        return r22.toInt();
    }

    public static ColorRoles getColorRoles(Context r02, int r1) {
        return getColorRoles(r1, isLightTheme(r02));
    }

    public static ColorStateList getColorStateList(Context r02, int r1, ColorStateList r2) {
        TypedValue r12 = MaterialAttributes.resolve(r02, r1);
        if (r12 == null) goto L5;
        ColorStateList r03 = resolveColorStateList(r02, r12);
    L6:
        if (r03 != null) goto L8;
        return r2;
    L8:
        return r03;
    L5:
        r03 = null;
        goto L6
    }

    public static ColorStateList getColorStateListOrNull(Context r2, int r3) {
        TypedValue r32 = MaterialAttributes.resolve(r2, r3);
        if (r32 != null) goto L5;
        return null;
    L5:
        int r1 = r32.resourceId;
        if (r1 != 0) goto L8;
        int r22 = r32.data;
        if (r22 != 0) goto L12;
        return null;
    L12:
        return ColorStateList.valueOf(r22);
    L8:
        return androidx.core.content.b.getColorStateList(r2, r1);
    }

    public static int getSurfaceContainerFromSeed(Context r1, int r2) {
        if (isLightTheme(r1) == false) goto L5;
        int r12 = TONE_SURFACE_CONTAINER_LIGHT;
    L7:
        return getColorRole(r2, r12, 6);
    L5:
        r12 = 12;
        goto L7
    }

    public static int getSurfaceContainerHighFromSeed(Context r1, int r2) {
        if (isLightTheme(r1) == false) goto L5;
        int r12 = TONE_SURFACE_CONTAINER_HIGH_LIGHT;
    L7:
        return getColorRole(r2, r12, 6);
    L5:
        r12 = 17;
        goto L7
    }

    public static int harmonize(int r02, int r1) {
        return Blend.harmonize(r02, r1);
    }

    public static int harmonizeWithPrimary(Context r2, int r3) {
        return harmonize(r3, getColor(r2, androidx.appcompat.a.f2281B, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(int r4) {
        if (r4 != 0) goto L4;
        return false;
    L4:
        if (androidx.core.graphics.d.f(r4) <= 0.5d) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean isLightTheme(Context r2) {
        return MaterialAttributes.resolveBoolean(r2, androidx.appcompat.a.f2288I, true);
    }

    public static int layer(View r1, int r2, int r3) {
        return layer(r1, r2, r3, 1.0f);
    }

    private static int resolveColor(Context r1, TypedValue r2) {
        int r02 = r2.resourceId;
        if (r02 == 0) goto L7;
        return androidx.core.content.b.getColor(r1, r02);
    L7:
        return r2.data;
    }

    private static ColorStateList resolveColorStateList(Context r1, TypedValue r2) {
        int r02 = r2.resourceId;
        if (r02 == 0) goto L7;
        return androidx.core.content.b.getColorStateList(r1, r02);
    L7:
        return ColorStateList.valueOf(r2.data);
    }

    public static ColorRoles getColorRoles(int r4, boolean r5) {
        if (r5 == false) goto L7;
        return new ColorRoles(getColorRole(r4, 40), getColorRole(r4, 100), getColorRole(r4, 90), getColorRole(r4, 10));
    L7:
        return new ColorRoles(getColorRole(r4, 80), getColorRole(r4, 20), getColorRole(r4, 30), getColorRole(r4, 90));
    }

    public static int layer(View r02, int r1, int r2, float r3) {
        return layer(getColor(r02, r1), getColor(r02, r2), r3);
    }

    public static int getColor(Context r02, int r1, String r2) {
        return resolveColor(r02, MaterialAttributes.resolveTypedValueOrThrow(r02, r1, r2));
    }

    private static int getColorRole(int r02, int r1, int r2) {
        Hct r03 = Hct.fromInt(getColorRole(r02, r1));
        r03.setChroma(r2);
        return r03.toInt();
    }

    public static int layer(int r1, int r2, float r3) {
        return layer(r1, androidx.core.graphics.d.p(r2, Math.round(Color.alpha(r2) * r3)));
    }

    public static int getColor(View r02, int r1, int r2) {
        return getColor(r02.getContext(), r1, r2);
    }

    public static int getColor(Context r02, int r1, int r2) {
        Integer r03 = getColorOrNull(r02, r1);
        if (r03 != null) goto L5;
        return r2;
    L5:
        return r03.intValue();
    }

    public static int layer(int r02, int r1) {
        return androidx.core.graphics.d.k(r1, r02);
    }
}
