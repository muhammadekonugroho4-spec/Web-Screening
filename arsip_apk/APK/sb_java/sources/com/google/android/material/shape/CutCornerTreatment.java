package com.google.android.material.shape;

/* loaded from: classes5.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(ShapePath r4, float r5, float r6, float r7) {
        float r72 = r7 * r6;
        r4.reset(0.0f, r72, 180.0f, 180.0f - r5);
        double r62 = r72;
        r4.lineTo((float) (Math.sin(Math.toRadians(r5)) * r62), (float) (Math.sin(Math.toRadians(90.0f - r5)) * r62));
    }

    @Deprecated
    public CutCornerTreatment(float r1) {
        this.size = r1;
    }
}
