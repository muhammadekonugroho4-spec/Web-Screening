package com.google.android.material.color.utilities;

/* loaded from: classes5.dex */
public final class PointProviderLab implements PointProvider {
    public PointProviderLab() {
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double distance(double[] r8, double[] r9) {
        double r1 = r8[0] - r9[0];
        double r3 = r8[1] - r9[1];
        double r5 = r8[2] - r9[2];
        return ((r1 * r1) + (r3 * r3)) + (r5 * r5);
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double[] fromInt(int r10) {
        double[] r102 = ColorUtils.labFromArgb(r10);
        return new double[]{r102[0], r102[1], r102[2]};
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public int toInt(double[] r8) {
        return ColorUtils.argbFromLab(r8[0], r8[1], r8[2]);
    }
}
