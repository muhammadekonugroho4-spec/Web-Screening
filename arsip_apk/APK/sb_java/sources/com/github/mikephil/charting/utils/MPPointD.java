package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool;
import java.util.List;

/* loaded from: classes4.dex */
public class MPPointD extends ObjectPool.Poolable {
    private static ObjectPool<MPPointD> pool;

    /* renamed from: x, reason: collision with root package name */
    public double f37849x;

    /* renamed from: y, reason: collision with root package name */
    public double f37850y;

    static {
        ObjectPool<MPPointD> r02 = ObjectPool.create(64, new MPPointD(0.0d, 0.0d));
        pool = r02;
        r02.setReplenishPercentage(0.5f);
    }

    private MPPointD(double r1, double r3) {
        this.f37849x = r1;
        this.f37850y = r3;
    }

    public static MPPointD getInstance(double r1, double r3) {
        MPPointD r02 = (MPPointD) pool.get();
        r02.f37849x = r1;
        r02.f37850y = r3;
        return r02;
    }

    public static void recycleInstance(MPPointD r1) {
        pool.recycle(r1);
    }

    public static void recycleInstances(List<MPPointD> r1) {
        pool.recycle(r1);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new MPPointD(0.0d, 0.0d);
    }

    public String toString() {
        return "MPPointD, x: " + this.f37849x + ", y: " + this.f37850y;
    }
}
