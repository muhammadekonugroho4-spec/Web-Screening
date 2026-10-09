package com.koushikdutta.ion.bitmap;

import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes6.dex */
public abstract class b {
    public static int a(byte[] r10, int r11, int r12) {
        if (r10 != null) goto L5;
        return 0;
    L5:
        int r122 = r12 + r11;
    L7:
        if ((r11 + 3) >= r122) goto L38;
        int r1 = r11 + 1;
        if ((r10[r11] & UnsignedBytes.MAX_VALUE) != 255) goto L37;
        int r7 = r10[r1] & UnsignedBytes.MAX_VALUE;
        if (r7 == 255) goto L12;
        r1 = r11 + 2;
        if (r7 == 216) goto L12;
        if (r7 == 1) goto L12;
        if (r7 == 217) goto L37;
        if (r7 == 218) goto L37;
        int r8 = b(r10, r1, 2, false);
        if (r8 < 2) goto L35;
        r1 = r1 + r8;
        if (r1 > r122) goto L35;
        if (r7 != 225) goto L12;
        if (r8 < 8) goto L12;
        if (b(r10, r11 + 4, 4, false) != 1165519206) goto L12;
        if (b(r10, r11 + 8, 2, false) != 0) goto L12;
        r11 = r11 + 10;
        int r82 = r8 - 8;
    L39:
        if (r82 <= 8) goto L78;
        int r123 = b(r10, r11, 4, false);
        if (r123 != 1229531648) goto L43;
    L46:
        if (r123 != 1229531648) goto L48;
        boolean r124 = true;
    L49:
        int r13 = b(r10, r11 + 4, 4, r124) + 2;
        if (r13 < 10) goto L77;
        if (r13 > r82) goto L77;
        int r112 = r11 + r13;
        int r83 = r82 - r13;
        int r14 = b(r10, r112 - 2, 2, r124);
    L54:
        int r4 = r14 - 1;
        if (r14 <= 0) goto L78;
        if (r83 < 12) goto L78;
        if (b(r10, r112, 2, r124) == 274) goto L60;
        r112 = r112 + 12;
        r83 = r83 - 12;
        r14 = r4;
        goto L54
    L60:
        int r102 = b(r10, r112 + 8, 2, r124);
        if (r102 != 1) goto L63;
        return 0;
    L63:
        if (r102 != 3) goto L65;
        return SubsamplingScaleImageView.ORIENTATION_180;
    L65:
        if (r102 == 6) goto L71;
        if (r102 == 8) goto L69;
        Log.i("CameraExif", "Unsupported orientation");
        return 0;
    L69:
        return SubsamplingScaleImageView.ORIENTATION_270;
    L71:
        return 90;
    L77:
        Log.e("CameraExif", "Invalid offset");
        goto L78
    L48:
        r124 = false;
        goto L49
    L43:
        if (r123 == 1296891946) goto L46;
        Log.e("CameraExif", "Invalid byte order");
        return 0;
    L78:
        return 0;
    L35:
        Log.e("CameraExif", "Invalid length");
        return 0;
    L12:
        r11 = r1;
    L37:
        r82 = 0;
        r11 = r1;
        goto L39
    L38:
        r82 = 0;
        goto L39
    }

    public static int b(byte[] r2, int r3, int r4, boolean r5) {
        if (r5 == false) goto L4;
        r3 = r3 + (r4 - 1);
        int r52 = -1;
    L5:
        int r02 = 0;
    L6:
        int r1 = r4 - 1;
        if (r4 <= 0) goto L9;
        r02 = (r2[r3] & UnsignedBytes.MAX_VALUE) | (r02 << 8);
        r3 = r3 + r52;
        r4 = r1;
        goto L6
    L9:
        return r02;
    L4:
        r52 = 1;
        goto L5
    }
}
