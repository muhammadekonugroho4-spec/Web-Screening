package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST = null;
    private double[] array;
    private int size;

    static {
        EMPTY_LIST = new DoubleArrayList(new double[0], 0, false);
    }

    public DoubleArrayList() {
        this(new double[10], 0, true);
    }

    public static DoubleArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.size) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(r2));
    }

    private String makeOutOfBoundsExceptionMessage(int r3) {
        return "Index:" + r3 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, Object r2) {
        add(r1, (Double) r2);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> r6) {
        ensureIsMutable();
        Internal.checkNotNull(r6);
        if ((r6 instanceof DoubleArrayList) == false) goto L5;
        DoubleArrayList r62 = (DoubleArrayList) r6;
        int r02 = r62.size;
        if (r02 != 0) goto L9;
        return false;
    L9:
        int r2 = this.size;
        if ((Integer.MAX_VALUE - r2) < r02) goto L17;
        int r22 = r2 + r02;
        double[] r03 = this.array;
        if (r22 <= r03.length) goto L14;
        this.array = Arrays.copyOf(r03, r22);
    L14:
        System.arraycopy(r62.array, 0, this.array, this.size, r62.size);
        this.size = r22;
        ((AbstractList) this).modCount++;
        return true;
    L17:
        throw new OutOfMemoryError();
    L5:
        return super.addAll(r6);
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public void addDouble(double r5) {
        ensureIsMutable();
        int r02 = this.size;
        double[] r1 = this.array;
        if (r02 != r1.length) goto L5;
        double[] r2 = new double[((r02 * 3) / 2) + 1];
        System.arraycopy(r1, 0, r2, 0, r02);
        this.array = r2;
    L5:
        double[] r03 = this.array;
        int r12 = this.size;
        this.size = r12 + 1;
        r03[r12] = r5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object r2) {
        if (indexOf(r2) == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object r9) {
        if (this != r9) goto L6;
        return true;
    L6:
        if ((r9 instanceof DoubleArrayList) == false) goto L8;
        DoubleArrayList r92 = (DoubleArrayList) r9;
        if (this.size == r92.size) goto L12;
        return false;
    L12:
        double[] r93 = r92.array;
        int r1 = 0;
    L14:
        if (r1 >= this.size) goto L19;
        if (Double.doubleToLongBits(this.array[r1]) != Double.doubleToLongBits(r93[r1])) goto L17;
        r1 = r1 + 1;
        goto L14
    L17:
        return false;
    L19:
        return true;
    L8:
        return super.equals(r9);
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int r1) {
        return get(r1);
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double getDouble(int r4) {
        ensureIndexInRange(r4);
        return this.array[r4];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int r02 = 1;
        int r1 = 0;
    L4:
        if (r1 >= this.size) goto L6;
        r02 = (r02 * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[r1]));
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object r8) {
        if ((r8 instanceof Double) == true) goto L5;
        return -1;
    L5:
        double r2 = ((Double) r8).doubleValue();
        int r82 = size();
        int r02 = 0;
    L6:
        if (r02 >= r82) goto L11;
        if (this.array[r02] == r2) goto L9;
        r02 = r02 + 1;
        goto L6
    L9:
        return r02;
    L11:
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Internal.ProtobufList<Double> mutableCopyWithCapacity2(int r1) {
        return mutableCopyWithCapacity(r1);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object remove(int r1) {
        return remove(r1);
    }

    @Override // java.util.AbstractList
    public void removeRange(int r3, int r4) {
        ensureIsMutable();
        if (r4 < r3) goto L7;
        double[] r02 = this.array;
        System.arraycopy(r02, r4, r02, r3, this.size - r4);
        this.size -= r4 - r3;
        ((AbstractList) this).modCount++;
        return;
    L7:
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
        return set(r1, (Double) r2);
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double setDouble(int r4, double r5) {
        ensureIsMutable();
        ensureIndexInRange(r4);
        double[] r02 = this.array;
        double r1 = r02[r4];
        r02[r4] = r5;
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private DoubleArrayList(double[] r1, int r2, boolean r3) {
        super(r3);
        this.array = r1;
        this.size = r2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object r1) {
        return add((Double) r1);
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int r3) {
        return Double.valueOf(getDouble(r3));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public Internal.ProtobufList<Double> mutableCopyWithCapacity(int r4) {
        if (r4 < this.size) goto L7;
        return new DoubleArrayList(Arrays.copyOf(this.array, r4), this.size, true);
    L7:
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double remove(int r6) {
        ensureIsMutable();
        ensureIndexInRange(r6);
        double[] r02 = this.array;
        double r1 = r02[r6];
        if (r6 >= (this.size - 1)) goto L5;
        System.arraycopy(r02, r6 + 1, r02, r6, (r3 - r6) - 1);
    L5:
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(r1);
    }

    public Double set(int r3, Double r4) {
        return Double.valueOf(setDouble(r3, r4.doubleValue()));
    }

    public boolean add(Double r3) {
        addDouble(r3.doubleValue());
        return true;
    }

    public void add(int r3, Double r4) {
        addDouble(r3, r4.doubleValue());
    }

    private void addDouble(int r5, double r6) {
        ensureIsMutable();
        if (r5 < 0) goto L13;
        int r02 = this.size;
        if (r5 > r02) goto L13;
        double[] r1 = this.array;
        if (r02 >= r1.length) goto L9;
        System.arraycopy(r1, r5, r1, r5 + 1, r02 - r5);
    L10:
        this.array[r5] = r6;
        this.size++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        double[] r03 = new double[((r02 * 3) / 2) + 1];
        System.arraycopy(r1, 0, r03, 0, r5);
        System.arraycopy(this.array, r5, r03, r5 + 1, this.size - r5);
        this.array = r03;
    L13:
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(r5));
    }
}
