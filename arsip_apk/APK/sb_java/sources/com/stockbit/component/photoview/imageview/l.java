package com.stockbit.component.photoview.imageview;

import android.widget.ImageView;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f73970a = null;

    static {
        f73970a = new l();
    }

    public l() {
    }

    public static final void a(float r02, float r1, float r2) {
        if (r02 >= r1) goto L10;
        if (r1 >= r2) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
    L10:
        throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
    }

    public static final int b(int r1) {
        return (r1 & 65280) >> 8;
    }

    public static final boolean c(ImageView r1) {
        p.l(r1, "imageView");
        if (r1.getDrawable() == null) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean d(ImageView.ScaleType r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        if (r1 == ImageView.ScaleType.MATRIX) goto L10;
        return true;
    L10:
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
