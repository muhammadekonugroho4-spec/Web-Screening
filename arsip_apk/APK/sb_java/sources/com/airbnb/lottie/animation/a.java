package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.airbnb.lottie.utils.g;
import com.google.android.flexbox.FlexItem;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes4.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int r5) {
        if (Build.VERSION.SDK_INT >= 30) goto L6;
        int r02 = getColor();
        setColor((g.d(r5, 0, Constants.MAX_HOST_LENGTH) << 24) | (r02 & FlexItem.MAX_SIZE));
        return;
    L6:
        super.setAlpha(g.d(r5, 0, Constants.MAX_HOST_LENGTH));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList r1) {
    }

    public a(int r1) {
        super(r1);
    }

    public a(PorterDuff.Mode r2) {
        setXfermode(new PorterDuffXfermode(r2));
    }

    public a(int r1, PorterDuff.Mode r2) {
        super(r1);
        setXfermode(new PorterDuffXfermode(r2));
    }
}
