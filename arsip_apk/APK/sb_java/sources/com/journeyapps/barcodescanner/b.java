package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
public class b {
    public b() {
    }

    public Bitmap a(BitMatrix r10) {
        int r3 = r10.getWidth();
        int r7 = r10.getHeight();
        int[] r1 = new int[r3 * r7];
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L12;
        int r4 = r2 * r3;
        int r5 = 0;
    L5:
        if (r5 >= r3) goto L11;
        int r6 = r4 + r5;
        if (r10.get(r5, r2) == false) goto L9;
        int r8 = -16777216;
    L10:
        r1[r6] = r8;
        r5 = r5 + 1;
        goto L5
    L9:
        r8 = -1;
        goto L10
    L11:
        r2 = r2 + 1;
        goto L3
    L12:
        Bitmap r02 = Bitmap.createBitmap(r3, r7, Bitmap.Config.ARGB_8888);
        r02.setPixels(r1, 0, r3, 0, 0, r3, r7);
        return r02;
    }
}
