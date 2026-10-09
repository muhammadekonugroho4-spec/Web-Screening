package com.github.mikephil.charting.model;

/* loaded from: classes4.dex */
public class GradientColor {
    private int endColor;
    private int startColor;

    public GradientColor(int r1, int r2) {
        this.startColor = r1;
        this.endColor = r2;
    }

    public int getEndColor() {
        return this.endColor;
    }

    public int getStartColor() {
        return this.startColor;
    }

    public void setEndColor(int r1) {
        this.endColor = r1;
    }

    public void setStartColor(int r1) {
        this.startColor = r1;
    }
}
