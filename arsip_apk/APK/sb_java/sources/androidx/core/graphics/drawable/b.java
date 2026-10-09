package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b {
    public static final Bitmap a(Drawable r5, int r6, int r7, Bitmap.Config r8) {
        if ((r5 instanceof BitmapDrawable) == false) goto L19;
        BitmapDrawable r02 = (BitmapDrawable) r5;
        if (r02.getBitmap() == null) goto L18;
        if (r8 == null) goto L10;
        if (r02.getBitmap().getConfig() != r8) goto L19;
    L10:
        if (r6 != r02.getBitmap().getWidth()) goto L16;
        if (r7 != r02.getBitmap().getHeight()) goto L16;
        return r02.getBitmap();
    L16:
        return Bitmap.createScaledBitmap(r02.getBitmap(), r6, r7, true);
    L18:
        throw new IllegalArgumentException("bitmap is null");
    L19:
        Rect r03 = r5.getBounds();
        int r1 = r03.left;
        int r2 = r03.top;
        int r3 = r03.right;
        int r04 = r03.bottom;
        if (r8 != null) goto L22;
        r8 = Bitmap.Config.ARGB_8888;
    L22:
        Bitmap r82 = Bitmap.createBitmap(r6, r7, r8);
        r5.setBounds(0, 0, r6, r7);
        r5.draw(new Canvas(r82));
        r5.setBounds(r1, r2, r3, r04);
        return r82;
    }

    public static /* synthetic */ Bitmap b(Drawable r02, int r1, int r2, Bitmap.Config r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.getIntrinsicWidth();
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.getIntrinsicHeight();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = null;
    L12:
        return a(r02, r1, r2, r3);
    }
}
