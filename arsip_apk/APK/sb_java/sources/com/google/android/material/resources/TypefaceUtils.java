package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.platform.AbstractC3672m;
import androidx.compose.ui.text.font.L;

/* loaded from: classes5.dex */
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    public static Typeface maybeCopyWithFontWeightAdjustment(Context r02, Typeface r1) {
        return maybeCopyWithFontWeightAdjustment(r02.getResources().getConfiguration(), r1);
    }

    public static Typeface maybeCopyWithFontWeightAdjustment(Configuration r2, Typeface r3) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return null;
    L5:
        if (AbstractC3672m.a(r2) != Integer.MAX_VALUE) goto L7;
        return null;
    L7:
        if (AbstractC3672m.a(r2) == 0) goto L14;
        if (r3 != null) goto L10;
        return null;
    L10:
        return L.a(r3, androidx.core.math.a.b(a.a(r3) + AbstractC3672m.a(r2), 1, 1000), r3.isItalic());
    L14:
        return null;
    }
}
