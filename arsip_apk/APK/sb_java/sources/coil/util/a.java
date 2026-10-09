package coil.util;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public abstract class a {
    public static final int a(Bitmap r2) {
        if (r2.isRecycled() == true) goto L9;
        return r2.getAllocationByteCount();
    L7:
        return (r2.getWidth() * r2.getHeight()) * b(r2.getConfig());
    L9:
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + r2 + " [" + r2.getWidth() + " x " + r2.getHeight() + "] + " + r2.getConfig()).toString());
    }

    public static final int b(Bitmap.Config r2) {
        if (r2 != Bitmap.Config.ALPHA_8) goto L7;
        return 1;
    L7:
        if (r2 != Bitmap.Config.RGB_565) goto L10;
        return 2;
    L10:
        if (r2 != Bitmap.Config.ARGB_4444) goto L13;
        return 2;
    L13:
        if (r2 != Bitmap.Config.RGBA_F16) goto L16;
        return 8;
    L16:
        return 4;
    }

    public static final Bitmap.Config c(Bitmap r02) {
        Bitmap.Config r03 = r02.getConfig();
        if (r03 == null) goto L5;
        return r03;
    L5:
        return Bitmap.Config.ARGB_8888;
    }

    public static final boolean d(Bitmap.Config r1) {
        if (r1 != Bitmap.Config.HARDWARE) goto L6;
        return true;
    L6:
        return false;
    }

    public static final Bitmap.Config e(Bitmap.Config r1) {
        if (r1 == null) goto L8;
        if (d(r1) == true) goto L8;
        return r1;
    L8:
        return Bitmap.Config.ARGB_8888;
    }
}
