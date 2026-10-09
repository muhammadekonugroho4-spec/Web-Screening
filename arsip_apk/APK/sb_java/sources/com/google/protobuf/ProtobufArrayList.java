package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST = null;
    private E[] array;
    private int size;

    static {
        EMPTY_LIST = new ProtobufArrayList(new Object[0], 0, false);
    }

    public ProtobufArrayList() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] createArray(int r02) {
        return (E[]) new Object[r02];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
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

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r5) {
        ensureIsMutable();
        int r02 = this.size;
        E[] r1 = this.array;
        if (r02 != r1.length) goto L5;
        this.array = (E[]) Arrays.copyOf(r1, ((r02 * 3) / 2) + 1);
    L5:
        E[] r03 = this.array;
        int r12 = this.size;
        this.size = r12 + 1;
        r03[r12] = r5;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r2) {
        ensureIndexInRange(r2);
        return this.array[r2];
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public /* bridge */ /* synthetic */ Internal.ProtobufList mutableCopyWithCapacity(int r1) {
        return mutableCopyWithCapacity(r1);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int r5) {
        ensureIsMutable();
        ensureIndexInRange(r5);
        E[] r02 = this.array;
        E r1 = r02[r5];
        if (r5 >= (this.size - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.size--;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
        ensureIsMutable();
        ensureIndexInRange(r3);
        E[] r02 = this.array;
        E r1 = r02[r3];
        r02[r3] = r4;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] r1, int r2, boolean r3) {
        super(r3);
        this.array = r1;
        this.size = r2;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public ProtobufArrayList<E> mutableCopyWithCapacity(int r4) {
        if (r4 < this.size) goto L7;
        return new ProtobufArrayList(Arrays.copyOf(this.array, r4), this.size, true);
    L7:
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int r5, E r6) {
        ensureIsMutable();
        if (r5 < 0) goto L13;
        int r02 = this.size;
        if (r5 > r02) goto L13;
        E[] r1 = this.array;
        if (r02 >= r1.length) goto L9;
        System.arraycopy(r1, r5, r1, r5 + 1, r02 - r5);
    L10:
        this.array[r5] = r6;
        this.size++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        E[] r03 = (E[]) createArray(((r02 * 3) / 2) + 1);
        System.arraycopy(this.array, 0, r03, 0, r5);
        System.arraycopy(this.array, r5, r03, r5 + 1, this.size - r5);
        this.array = r03;
    L13:
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(r5));
    }
}
