package com.airbnb.lottie.utils;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes4.dex */
public abstract class b {
    public static float a(float r4) {
        if (r4 > 0.04045f) goto L7;
        return r4 / 12.92f;
    L7:
        return (float) Math.pow((r4 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float r4) {
        if (r4 > 0.0031308f) goto L7;
        return r4 * 12.92f;
    L7:
        return (float) ((Math.pow(r4, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(float r7, int r8, int r9) {
        if (r8 != r9) goto L4;
        return r8;
    L4:
        float r02 = ((r8 >> 24) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r2 = ((r8 >> 16) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r3 = ((r8 >> 8) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r4 = ((r9 >> 24) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r5 = ((r9 >> 16) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r6 = ((r9 >> 8) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r22 = a(r2);
        float r32 = a(r3);
        float r82 = a((r8 & Constants.MAX_HOST_LENGTH) / 255.0f);
        float r52 = a(r5);
        float r03 = r02 + ((r4 - r02) * r7);
        float r33 = r32 + ((a(r6) - r32) * r7);
        float r83 = r82 + (r7 * (a((r9 & Constants.MAX_HOST_LENGTH) / 255.0f) - r82));
        float r72 = b(r22 + ((r52 - r22) * r7)) * 255.0f;
        float r92 = b(r33) * 255.0f;
        float r84 = b(r83) * 255.0f;
        return (((Math.round(r72) << 16) | (Math.round(r03 * 255.0f) << 24)) | (Math.round(r92) << 8)) | Math.round(r84);
    }
}
