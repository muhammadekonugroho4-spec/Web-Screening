package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST = null;
    private int[] array;
    private int size;

    static {
        IntArrayList r02 = new IntArrayList(new int[0], 0);
        EMPTY_LIST = r02;
        r02.makeImmutable();
    }

    public IntArrayList() {
        this(new int[10], 0);
    }

    public static IntArrayList emptyList() {
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, Object r2) {
        add(r1, (Integer) r2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> r6) {
        ensureIsMutable();
        Internal.checkNotNull(r6);
        if ((r6 instanceof IntArrayList) == false) goto L5;
        IntArrayList r62 = (IntArrayList) r6;
        int r02 = r62.size;
        if (r02 != 0) goto L9;
        return false;
    L9:
        int r2 = this.size;
        if ((Integer.MAX_VALUE - r2) < r02) goto L17;
        int r22 = r2 + r02;
        int[] r03 = this.array;
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

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public void addInt(int r5) {
        ensureIsMutable();
        int r02 = this.size;
        int[] r1 = this.array;
        if (r02 != r1.length) goto L5;
        int[] r2 = new int[((r02 * 3) / 2) + 1];
        System.arraycopy(r1, 0, r2, 0, r02);
        this.array = r2;
    L5:
        int[] r03 = this.array;
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof IntArrayList) == false) goto L8;
        IntArrayList r62 = (IntArrayList) r6;
        if (this.size == r62.size) goto L12;
        return false;
    L12:
        int[] r63 = r62.array;
        int r1 = 0;
    L14:
        if (r1 >= this.size) goto L19;
        if (this.array[r1] != r63[r1]) goto L17;
        r1 = r1 + 1;
        goto L14
    L17:
        return false;
    L19:
        return true;
    L8:
        return super.equals(r6);
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int r1) {
        return get(r1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public int getInt(int r2) {
        ensureIndexInRange(r2);
        return this.array[r2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int r02 = 1;
        int r1 = 0;
    L4:
        if (r1 >= this.size) goto L6;
        r02 = (r02 * 31) + this.array[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object r5) {
        if ((r5 instanceof Integer) == true) goto L5;
        return -1;
    L5:
        int r52 = ((Integer) r5).intValue();
        int r02 = size();
        int r2 = 0;
    L6:
        if (r2 >= r02) goto L11;
        if (this.array[r2] == r52) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r2;
    L11:
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int r1) {
        return mutableCopyWithCapacity(r1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object remove(int r1) {
        return remove(r1);
    }

    @Override // java.util.AbstractList
    public void removeRange(int r3, int r4) {
        ensureIsMutable();
        if (r4 < r3) goto L7;
        int[] r02 = this.array;
        System.arraycopy(r02, r4, r02, r3, this.size - r4);
        this.size -= r4 - r3;
        ((AbstractList) this).modCount++;
        return;
    L7:
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
        return set(r1, (Integer) r2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public int setInt(int r3, int r4) {
        ensureIsMutable();
        ensureIndexInRange(r3);
        int[] r02 = this.array;
        int r1 = r02[r3];
        r02[r3] = r4;
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] r1, int r2) {
        this.array = r1;
        this.size = r2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object r1) {
        return add((Integer) r1);
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int r1) {
        return Integer.valueOf(getInt(r1));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity(int r3) {
        if (r3 < this.size) goto L7;
        return new IntArrayList(Arrays.copyOf(this.array, r3), this.size);
    L7:
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int r5) {
        ensureIsMutable();
        ensureIndexInRange(r5);
        int[] r02 = this.array;
        int r1 = r02[r5];
        if (r5 >= (this.size - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(r1);
    }

    public Integer set(int r1, Integer r2) {
        return Integer.valueOf(setInt(r1, r2.intValue()));
    }

    public boolean add(Integer r1) {
        addInt(r1.intValue());
        return true;
    }

    public void add(int r1, Integer r2) {
        addInt(r1, r2.intValue());
    }

    private void addInt(int r5, int r6) {
        ensureIsMutable();
        if (r5 < 0) goto L13;
        int r02 = this.size;
        if (r5 > r02) goto L13;
        int[] r1 = this.array;
        if (r02 >= r1.length) goto L9;
        System.arraycopy(r1, r5, r1, r5 + 1, r02 - r5);
    L10:
        this.array[r5] = r6;
        this.size++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        int[] r03 = new int[((r02 * 3) / 2) + 1];
        System.arraycopy(r1, 0, r03, 0, r5);
        System.arraycopy(this.array, r5, r03, r5 + 1, this.size - r5);
        this.array = r03;
    L13:
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(r5));
    }
}
