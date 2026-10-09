package com.github.mikephil.charting.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.ObjectPool;
import java.util.List;

/* loaded from: classes4.dex */
public class MPPointF extends ObjectPool.Poolable {
    public static final Parcelable.Creator<MPPointF> CREATOR = null;
    private static ObjectPool<MPPointF> pool;

    /* renamed from: x, reason: collision with root package name */
    public float f37851x;

    /* renamed from: y, reason: collision with root package name */
    public float f37852y;

    static {
        ObjectPool<MPPointF> r02 = ObjectPool.create(32, new MPPointF(0.0f, 0.0f));
        pool = r02;
        r02.setReplenishPercentage(0.5f);
        CREATOR = new AnonymousClass1();
    }

    public MPPointF() {
    }

    public static MPPointF getInstance(float r1, float r2) {
        MPPointF r02 = (MPPointF) pool.get();
        r02.f37851x = r1;
        r02.f37852y = r2;
        return r02;
    }

    public static void recycleInstance(MPPointF r1) {
        pool.recycle(r1);
    }

    public static void recycleInstances(List<MPPointF> r1) {
        pool.recycle(r1);
    }

    public float getX() {
        return this.f37851x;
    }

    public float getY() {
        return this.f37852y;
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new MPPointF(0.0f, 0.0f);
    }

    public void my_readFromParcel(Parcel r2) {
        this.f37851x = r2.readFloat();
        this.f37852y = r2.readFloat();
    }

    public MPPointF(float r1, float r2) {
        this.f37851x = r1;
        this.f37852y = r2;
    }

    public static MPPointF getInstance() {
        return (MPPointF) pool.get();
    }

    public static MPPointF getInstance(MPPointF r2) {
        MPPointF r02 = (MPPointF) pool.get();
        r02.f37851x = r2.f37851x;
        r02.f37852y = r2.f37852y;
        return r02;
    }
}
