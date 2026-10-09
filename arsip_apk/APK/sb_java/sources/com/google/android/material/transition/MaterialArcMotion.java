package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.transition.PathMotion;

/* loaded from: classes5.dex */
public final class MaterialArcMotion extends PathMotion {
    public MaterialArcMotion() {
    }

    private static PointF getControlPoint(float r1, float r2, float r3, float r4) {
        if (r2 <= r4) goto L7;
        return new PointF(r3, r2);
    L7:
        return new PointF(r1, r4);
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float r2, float r3, float r4, float r5) {
        Path r02 = new Path();
        r02.moveTo(r2, r3);
        PointF r22 = getControlPoint(r2, r3, r4, r5);
        r02.quadTo(r22.x, r22.y, r4, r5);
        return r02;
    }
}
