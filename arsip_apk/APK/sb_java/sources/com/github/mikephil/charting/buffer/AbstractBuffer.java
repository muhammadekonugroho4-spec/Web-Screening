package com.github.mikephil.charting.buffer;

/* loaded from: classes4.dex */
public abstract class AbstractBuffer<T> {
    public final float[] buffer;
    protected int index;
    protected int mFrom;
    protected int mTo;
    protected float phaseX;
    protected float phaseY;

    public AbstractBuffer(int r2) {
        this.phaseX = 1.0f;
        this.phaseY = 1.0f;
        this.mFrom = 0;
        this.mTo = 0;
        this.index = 0;
        this.buffer = new float[r2];
    }

    public abstract void feed(T r1);

    public void limitFrom(int r1) {
        if (r1 >= 0) goto L4;
        r1 = 0;
    L4:
        this.mFrom = r1;
    }

    public void limitTo(int r1) {
        if (r1 >= 0) goto L4;
        r1 = 0;
    L4:
        this.mTo = r1;
    }

    public void reset() {
        this.index = 0;
    }

    public void setPhases(float r1, float r2) {
        this.phaseX = r1;
        this.phaseY = r2;
    }

    public int size() {
        return this.buffer.length;
    }
}
