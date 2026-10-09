package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;

/* loaded from: classes5.dex */
public final class zaaa extends Button {
    public zaaa(Context r2, AttributeSet r3) {
        super(r2, null, R.attr.buttonStyle);
    }

    private static final int zab(int r02, int r1, int r2, int r3) {
        if (r02 != 0) goto L4;
        return r1;
    L4:
        if (r02 != 1) goto L6;
        return r2;
    L6:
        if (r02 != 2) goto L9;
        return r3;
    L9:
        throw new IllegalStateException("Unknown color scheme: " + r02);
    }

    public final void zaa(Resources r6, int r7, int r8) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int r02 = (int) ((r6.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(r02);
        setMinWidth(r02);
        int r03 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int r1 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int r04 = zab(r8, r03, r1, r1);
        int r12 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int r2 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int r13 = zab(r8, r12, r2, r2);
        if (r7 == 0) goto L9;
        if (r7 == 1) goto L9;
        if (r7 != 2) goto L8;
    L10:
        Drawable r05 = androidx.core.graphics.drawable.a.r(r6.getDrawable(r04));
        androidx.core.graphics.drawable.a.o(r05, r6.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        androidx.core.graphics.drawable.a.p(r05, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r05);
        int r06 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int r14 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(r6.getColorStateList(zab(r8, r06, r14, r14))));
        if (r7 == 0) goto L18;
        if (r7 == 1) goto L17;
        if (r7 != 2) goto L16;
        setText(null);
    L19:
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext()) == false) goto L23;
        setGravity(19);
        return;
    L23:
        return;
    L16:
        throw new IllegalStateException("Unknown button size: " + r7);
    L17:
        setText(r6.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        goto L19
    L18:
        setText(r6.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        goto L19
    L8:
        throw new IllegalStateException("Unknown button size: " + r7);
    L9:
        r04 = r13;
        goto L10
    }
}
