package com.google.common.hash;

import com.google.common.hash.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
final class LongAdder extends Striped64 implements Serializable, LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    public LongAdder() {
    }

    private void readObject(ObjectInputStream r3) throws IOException, ClassNotFoundException {
        r3.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = r3.readLong();
    }

    private void writeObject(ObjectOutputStream r3) throws IOException {
        r3.defaultWriteObject();
        r3.writeLong(sum());
    }

    @Override // com.google.common.hash.LongAddable
    public void add(long r7) {
        Striped64.Cell[] r02 = this.cells;
        if (r02 != null) goto L6;
        long r1 = this.base;
        if (casBase(r1, r1 + r7) == false) goto L6;
        return;
    L6:
        int[] r12 = Striped64.threadHashCode.get();
        boolean r2 = true;
        if (r12 == null) goto L17;
        if (r02 == null) goto L17;
        int r3 = r02.length;
        if (r3 < 1) goto L17;
        Striped64.Cell r03 = r02[(r3 - 1) & r12[0]];
        if (r03 == null) goto L17;
        long r22 = r03.value;
        r2 = r03.cas(r22, r22 + r7);
        if (r2 == false) goto L17;
        return;
    L17:
        retryUpdate(r7, r12, r2);
    }

    public void decrement() {
        add(-1);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    @Override // com.google.common.hash.Striped64
    public final long fn(long r1, long r3) {
        return r1 + r3;
    }

    @Override // com.google.common.hash.LongAddable
    public void increment() {
        add(1);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    public void reset() {
        internalReset(0);
    }

    @Override // com.google.common.hash.LongAddable
    public long sum() {
        long r02 = this.base;
        Striped64.Cell[] r2 = this.cells;
        if (r2 == null) goto L10;
        int r3 = r2.length;
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L10;
        Striped64.Cell r5 = r2[r4];
        if (r5 == null) goto L9;
        r02 = r02 + r5.value;
    L9:
        r4 = r4 + 1;
    L10:
        return r02;
    }

    public long sumThenReset() {
        long r02 = this.base;
        Striped64.Cell[] r2 = this.cells;
        this.base = 0;
        if (r2 == null) goto L10;
        int r5 = r2.length;
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L10;
        Striped64.Cell r7 = r2[r6];
        if (r7 == null) goto L9;
        r02 = r02 + r7.value;
        r7.value = 0;
    L9:
        r6 = r6 + 1;
    L10:
        return r02;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
