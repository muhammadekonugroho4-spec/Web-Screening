package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool.Poolable;
import java.util.List;

/* loaded from: classes4.dex */
public class ObjectPool<T extends Poolable> {
    private static int ids;
    private int desiredCapacity;
    private T modelObject;
    private Object[] objects;
    private int objectsPointer;
    private int poolId;
    private float replenishPercentage;

    public static abstract class Poolable {
        public static int NO_OWNER = -1;
        int currentOwnerId;

        static {
        }

        public Poolable() {
            this.currentOwnerId = NO_OWNER;
        }

        public abstract Poolable instantiate();
    }

    static {
    }

    private ObjectPool(int r1, T r2) {
        if (r1 <= 0) goto L7;
        this.desiredCapacity = r1;
        this.objects = new Object[r1];
        this.objectsPointer = 0;
        this.modelObject = r2;
        this.replenishPercentage = 1.0f;
        refillPool();
        return;
    L7:
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    public static synchronized ObjectPool create(int r2, Poolable r3) {
        monitor-enter(ObjectPool.class);
        ObjectPool r1 = new ObjectPool(r2, r3);     // Catch: Throwable -> L7
        int r22 = ids;     // Catch: Throwable -> L7
        r1.poolId = r22;     // Catch: Throwable -> L7
        ids = r22 + 1;     // Catch: Throwable -> L7
        monitor-exit(ObjectPool.class);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    private void refillPool() {
        refillPool(this.replenishPercentage);
    }

    private void resizePool() {
        int r02 = this.desiredCapacity;
        int r1 = r02 * 2;
        this.desiredCapacity = r1;
        Object[] r12 = new Object[r1];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r12[r2] = this.objects[r2];
        r2 = r2 + 1;
        goto L3
    L5:
        this.objects = r12;
    }

    public synchronized T get() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.objectsPointer == (-1)) goto L6;
    L10:
        Object[] r02 = this.objects;     // Catch: Throwable -> L8
        int r1 = this.objectsPointer;     // Catch: Throwable -> L8
        T r03 = (T) r02[r1];     // Catch: Throwable -> L8
        r03.currentOwnerId = Poolable.NO_OWNER;     // Catch: Throwable -> L8
        this.objectsPointer = r1 - 1;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r03;
    L6:
        if (this.replenishPercentage <= 0.0f) goto L10;
        refillPool();     // Catch: Throwable -> L8
        goto L10
    }

    public int getPoolCapacity() {
        return this.objects.length;
    }

    public int getPoolCount() {
        return this.objectsPointer + 1;
    }

    public int getPoolId() {
        return this.poolId;
    }

    public float getReplenishPercentage() {
        return this.replenishPercentage;
    }

    public synchronized void recycle(T r4) {
        monitor-enter(this);
        int r02 = r4.currentOwnerId;     // Catch: Throwable -> L9
        if (r02 != Poolable.NO_OWNER) goto L6;
        int r03 = this.objectsPointer + 1;     // Catch: Throwable -> L9
        this.objectsPointer = r03;     // Catch: Throwable -> L9
        if (r03 < this.objects.length) goto L16;
        resizePool();     // Catch: Throwable -> L9
    L16:
        r4.currentOwnerId = this.poolId;     // Catch: Throwable -> L9
        this.objects[this.objectsPointer] = r4;     // Catch: Throwable -> L9
        monitor-exit(this);
        return;
    L6:
        if (r02 != this.poolId) goto L12;
        throw new IllegalArgumentException("The object passed is already stored in this pool!");     // Catch: Throwable -> L9
    L12:
        throw new IllegalArgumentException("The object to recycle already belongs to poolId " + r4.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public void setReplenishPercentage(float r3) {
        float r02 = 1.0f;
        if (r3 <= 1.0f) goto L5;
    L4:
        r3 = r02;
    L8:
        this.replenishPercentage = r3;
        return;
    L5:
        r02 = 0.0f;
        if (r3 >= 0.0f) goto L8;
        goto L8
    }

    private void refillPool(float r5) {
        int r02 = this.desiredCapacity;
        int r52 = (int) (r02 * r5);
        if (r52 >= 1) goto L5;
        r02 = 1;
    L8:
        int r53 = 0;
    L9:
        if (r53 >= r02) goto L11;
        this.objects[r53] = this.modelObject.instantiate();
        r53 = r53 + 1;
        goto L9
    L11:
        this.objectsPointer = r02 - 1;
        return;
    L5:
        if (r52 > r02) goto L8;
        r02 = r52;
        goto L8
    }

    public synchronized void recycle(List<T> r6) {
        monitor-enter(this);
    L24:
    L6:
        th = move-exception;
        throw th;
    L4:
        if (((r6.size() + this.objectsPointer) + 1) <= this.desiredCapacity) goto L8;
        resizePool();     // Catch: Throwable -> L6
        goto L24
    L8:
        int r02 = r6.size();     // Catch: Throwable -> L6
        int r1 = 0;
    L9:
        if (r1 >= r02) goto L19;
        T r2 = r6.get(r1);     // Catch: Throwable -> L6
        int r3 = r2.currentOwnerId;     // Catch: Throwable -> L6
        if (r3 != Poolable.NO_OWNER) goto L13;
        r2.currentOwnerId = this.poolId;     // Catch: Throwable -> L6
        this.objects[(this.objectsPointer + 1) + r1] = r2;     // Catch: Throwable -> L6
        r1 = r1 + 1;     // Catch: Throwable -> L6
        goto L9
    L13:
        if (r3 != this.poolId) goto L17;
        throw new IllegalArgumentException("The object passed is already stored in this pool!");     // Catch: Throwable -> L6
    L17:
        throw new IllegalArgumentException("The object to recycle already belongs to poolId " + r2.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");     // Catch: Throwable -> L6
    L19:
        this.objectsPointer += r02;
        monitor-exit(this);
    }
}
