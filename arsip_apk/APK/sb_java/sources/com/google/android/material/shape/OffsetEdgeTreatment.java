package com.google.android.material.shape;

/* loaded from: classes5.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {
    private final float offset;
    private final EdgeTreatment other;

    public OffsetEdgeTreatment(EdgeTreatment r1, float r2) {
        this.other = r1;
        this.offset = r2;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return this.other.forceIntersection();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float r3, float r4, float r5, ShapePath r6) {
        this.other.getEdgePath(r3, r4 - this.offset, r5, r6);
    }
}
