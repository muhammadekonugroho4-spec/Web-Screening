package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public AtomicDouble(double r2) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(r2));
    }

    private void readObject(ObjectInputStream r3) throws IOException, ClassNotFoundException {
        r3.defaultReadObject();
        this.value = new AtomicLong();
        set(r3.readDouble());
    }

    private void writeObject(ObjectOutputStream r3) throws IOException {
        r3.defaultWriteObject();
        r3.writeDouble(get());
    }

    @CanIgnoreReturnValue
    public final double addAndGet(double r8) {
    L2:
        long r02 = this.value.get();
        double r2 = Double.longBitsToDouble(r02) + r8;
        long r4 = Double.doubleToRawLongBits(r2);
        if (this.value.compareAndSet(r02, r4) == false) goto L2;
        return r2;
    }

    public final boolean compareAndSet(double r2, double r4) {
        return this.value.compareAndSet(Double.doubleToRawLongBits(r2), Double.doubleToRawLongBits(r4));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.value.get());
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(double r8) {
    L2:
        long r02 = this.value.get();
        double r2 = Double.longBitsToDouble(r02);
        long r4 = Double.doubleToRawLongBits(r2 + r8);
        if (this.value.compareAndSet(r02, r4) == false) goto L2;
        return r2;
    }

    public final double getAndSet(double r2) {
        long r22 = Double.doubleToRawLongBits(r2);
        return Double.longBitsToDouble(this.value.getAndSet(r22));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double r2) {
        long r22 = Double.doubleToRawLongBits(r2);
        this.value.lazySet(r22);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    public final void set(double r2) {
        long r22 = Double.doubleToRawLongBits(r2);
        this.value.set(r22);
    }

    public String toString() {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double r2, double r4) {
        return this.value.weakCompareAndSet(Double.doubleToRawLongBits(r2), Double.doubleToRawLongBits(r4));
    }

    public AtomicDouble() {
        this(0.0d);
    }
}
