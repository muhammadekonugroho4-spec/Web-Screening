package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.m;

/* loaded from: classes6.dex */
public class i extends k {
    static {
    }

    public i() {
    }

    public static float e(float r2) {
        if (r2 < 1.0f) goto L5;
        return r2;
    L5:
        return 1.0f / r2;
    }

    @Override // com.journeyapps.barcodescanner.camera.k
    public float c(m r5, m r6) {
        int r02 = r5.f41187a;
        if (r02 > 0) goto L5;
        return 0.0f;
    L5:
        if (r5.f41188b <= 0) goto L11;
        float r03 = (1.0f / e((r02 * 1.0f) / r6.f41187a)) / e((r5.f41188b * 1.0f) / r6.f41188b);
        float r52 = e(((r5.f41187a * 1.0f) / r5.f41188b) / ((r6.f41187a * 1.0f) / r6.f41188b));
        return r03 * (((1.0f / r52) / r52) / r52);
    L11:
        return 0.0f;
    }

    @Override // com.journeyapps.barcodescanner.camera.k
    public Rect d(m r3, m r4) {
        return new Rect(0, 0, r4.f41187a, r4.f41188b);
    }
}
