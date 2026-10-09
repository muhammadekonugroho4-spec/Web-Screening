package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.m;

/* loaded from: classes6.dex */
public class f extends k {

    /* renamed from: b, reason: collision with root package name */
    public static final String f41136b = "f";

    static {
    }

    public f() {
    }

    @Override // com.journeyapps.barcodescanner.camera.k
    public float c(m r8, m r9) {
        if (r8.f41187a > 0) goto L5;
        return 0.0f;
    L5:
        if (r8.f41188b <= 0) goto L14;
        m r02 = r8.c(r9);
        float r1 = (r02.f41187a * 1.0f) / r8.f41187a;
        if (r1 <= 1.0f) goto L10;
        r1 = (float) Math.pow(1.0f / r1, 1.1d);
    L10:
        float r82 = ((r02.f41187a * 1.0f) / r9.f41187a) + ((r02.f41188b * 1.0f) / r9.f41188b);
        return r1 * ((1.0f / r82) / r82);
    L14:
        return 0.0f;
    }

    @Override // com.journeyapps.barcodescanner.camera.k
    public Rect d(m r6, m r7) {
        m r02 = r6.c(r7);
        Log.i(f41136b, "Preview: " + r6 + "; Scaled: " + r02 + "; Want: " + r7);
        int r62 = (r02.f41187a - r7.f41187a) / 2;
        int r1 = (r02.f41188b - r7.f41188b) / 2;
        return new Rect(-r62, -r1, r02.f41187a - r62, r02.f41188b - r1);
    }
}
