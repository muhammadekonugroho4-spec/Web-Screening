package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool;
import java.util.List;

/* loaded from: classes4.dex */
public final class FSize extends ObjectPool.Poolable {
    private static ObjectPool<FSize> pool;
    public float height;
    public float width;

    static {
        ObjectPool<FSize> r02 = ObjectPool.create(256, new FSize(0.0f, 0.0f));
        pool = r02;
        r02.setReplenishPercentage(0.5f);
    }

    public FSize() {
    }

    public static FSize getInstance(float r1, float r2) {
        FSize r02 = (FSize) pool.get();
        r02.width = r1;
        r02.height = r2;
        return r02;
    }

    public static void recycleInstance(FSize r1) {
        pool.recycle(r1);
    }

    public static void recycleInstances(List<FSize> r1) {
        pool.recycle(r1);
    }

    public boolean equals(Object r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (this != r5) goto L9;
        return true;
    L9:
        if ((r5 instanceof FSize) == false) goto L15;
        FSize r52 = (FSize) r5;
        if (this.width != r52.width) goto L15;
        if (this.height != r52.height) goto L15;
        return true;
    L15:
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.width) ^ Float.floatToIntBits(this.height);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new FSize(0.0f, 0.0f);
    }

    public String toString() {
        return this.width + "x" + this.height;
    }

    public FSize(float r1, float r2) {
        this.width = r1;
        this.height = r2;
    }
}
