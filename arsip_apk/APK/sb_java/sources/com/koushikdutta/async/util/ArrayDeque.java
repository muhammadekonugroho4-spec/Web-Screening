package com.koushikdutta.async.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes6.dex */
public class ArrayDeque<E> extends AbstractCollection<E> implements Queue, Cloneable, Serializable {
    private static final long serialVersionUID = 2340985798034038923L;

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f41638a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f41639b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f41640c;

    public static /* synthetic */ class a {
    }

    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f41641a;

        /* renamed from: b, reason: collision with root package name */
        public int f41642b;

        /* renamed from: c, reason: collision with root package name */
        public int f41643c;
        public final /* synthetic */ ArrayDeque d;

        public b(ArrayDeque r2) {
            this.d = r2;
            this.f41641a = ArrayDeque.a(r2);
            this.f41642b = ArrayDeque.b(r2);
            this.f41643c = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f41641a == this.f41642b) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f41641a == this.f41642b) goto L12;
            Object r02 = ArrayDeque.e(this.d)[this.f41641a];
            if (ArrayDeque.b(this.d) != this.f41642b) goto L10;
            if (r02 == null) goto L10;
            int r1 = this.f41641a;
            this.f41643c = r1;
            this.f41641a = (r1 + 1) & (ArrayDeque.e(this.d).length - 1);
            return r02;
        L10:
            throw new ConcurrentModificationException();
        L12:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            int r02 = this.f41643c;
            if (r02 < 0) goto L10;
            if (ArrayDeque.g(this.d, r02) == false) goto L7;
            this.f41641a = (this.f41641a - 1) & (ArrayDeque.e(this.d).length - 1);
            this.f41642b = ArrayDeque.b(this.d);
        L7:
            this.f41643c = -1;
            return;
        L10:
            throw new IllegalStateException();
        }

        public /* synthetic */ b(ArrayDeque r1, a r2) {
            this(r1);
        }
    }

    public ArrayDeque() {
        this.f41638a = new Object[16];
    }

    public static /* synthetic */ int a(ArrayDeque r02) {
        return r02.f41639b;
    }

    public static /* synthetic */ int b(ArrayDeque r02) {
        return r02.f41640c;
    }

    public static /* synthetic */ Object[] e(ArrayDeque r02) {
        return r02.f41638a;
    }

    public static /* synthetic */ boolean g(ArrayDeque r02, int r1) {
        return r02.o(r1);
    }

    private void readObject(ObjectInputStream r5) throws IOException, ClassNotFoundException {
        r5.defaultReadObject();
        int r02 = r5.readInt();
        h(r02);
        int r1 = 0;
        this.f41639b = 0;
        this.f41640c = r02;
    L3:
        if (r1 >= r02) goto L5;
        this.f41638a[r1] = r5.readObject();
        r1 = r1 + 1;
        goto L3
    }

    private void writeObject(ObjectOutputStream r4) throws IOException {
        r4.defaultWriteObject();
        r4.writeInt(size());
        int r02 = this.f41638a.length - 1;
        int r1 = this.f41639b;
    L4:
        if (r1 == this.f41640c) goto L6;
        r4.writeObject(this.f41638a[r1]);
        r1 = (r1 + 1) & r02;
        goto L4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object r1) {
        addLast(r1);
        return true;
    }

    public void addFirst(Object r4) {
        if (r4 == null) goto L8;
        Object[] r02 = this.f41638a;
        int r1 = (this.f41639b - 1) & (r02.length - 1);
        this.f41639b = r1;
        r02[r1] = r4;
        if (r1 != this.f41640c) goto L9;
        p();
        return;
    L9:
        return;
    L8:
        throw new NullPointerException("e == null");
    }

    public void addLast(Object r3) {
        if (r3 == null) goto L8;
        Object[] r02 = this.f41638a;
        int r1 = this.f41640c;
        r02[r1] = r3;
        int r32 = (r02.length - 1) & (r1 + 1);
        this.f41640c = r32;
        if (r32 != this.f41639b) goto L9;
        p();
        return;
    L9:
        return;
    L8:
        throw new NullPointerException("e == null");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int r02 = this.f41639b;
        int r1 = this.f41640c;
        if (r02 == r1) goto L7;
        this.f41640c = 0;
        this.f41639b = 0;
        int r2 = this.f41638a.length - 1;
    L5:
        this.f41638a[r02] = null;
        r02 = (r02 + 1) & r2;
        if (r02 != r1) goto L5;
        return;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object r6) {
        if (r6 != null) goto L5;
        return false;
    L5:
        int r1 = this.f41638a.length - 1;
        int r3 = this.f41639b;
    L6:
        Object r4 = this.f41638a[r3];
        if (r4 == null) goto L12;
        if (r6.equals(r4) == true) goto L10;
        r3 = (r3 + 1) & r1;
        goto L6
    L10:
        return true;
    L12:
        return false;
    }

    @Override // java.util.Queue
    public Object element() {
        return getFirst();
    }

    public Object getFirst() {
        Object r02 = this.f41638a[this.f41639b];
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new NoSuchElementException();
    }

    public Object getLast() {
        Object r02 = this.f41638a[(this.f41640c - 1) & (r0.length - 1)];
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new NoSuchElementException();
    }

    public final void h(int r2) {
        int r02 = 8;
        if (r2 < 8) goto L7;
        int r22 = r2 | (r2 >>> 1);
        int r23 = r22 | (r22 >>> 2);
        int r24 = r23 | (r23 >>> 4);
        int r25 = r24 | (r24 >>> 8);
        r02 = (r25 | (r25 >>> 16)) + 1;
        if (r02 >= 0) goto L7;
        r02 = r02 >>> 1;
    L7:
        this.f41638a = new Object[r02];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        if (this.f41639b != this.f41640c) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new b(this, null);
    }

    public final void j() {
    }

    public ArrayDeque k() {
        ArrayDeque r02 = (ArrayDeque) super.clone();     // Catch: CloneNotSupportedException -> L4
        Object[] r1 = this.f41638a;     // Catch: CloneNotSupportedException -> L4
        System.arraycopy(r1, 0, r02.f41638a, 0, r1.length);     // Catch: CloneNotSupportedException -> L4
        return r02;
    L5:
        throw new AssertionError();
    }

    public final Object[] m(Object[] r5) {
        int r02 = this.f41639b;
        int r1 = this.f41640c;
        if (r02 >= r1) goto L6;
        System.arraycopy(this.f41638a, r02, r5, 0, size());
        return r5;
    L6:
        if (r02 <= r1) goto L8;
        Object[] r12 = this.f41638a;
        int r3 = r12.length - r02;
        System.arraycopy(r12, r02, r5, 0, r3);
        System.arraycopy(this.f41638a, 0, r5, r3, this.f41640c);
    L8:
        return r5;
    }

    public final boolean o(int r9) {
        j();
        Object[] r02 = this.f41638a;
        int r1 = r02.length - 1;
        int r3 = this.f41639b;
        int r4 = this.f41640c;
        int r5 = (r9 - r3) & r1;
        int r6 = (r4 - r9) & r1;
        if (r5 >= ((r4 - r3) & r1)) goto L16;
        if (r5 >= r6) goto L11;
        if (r3 > r9) goto L8;
        System.arraycopy(r02, r3, r02, r3 + 1, r5);
    L9:
        r02[r3] = null;
        this.f41639b = (r3 + 1) & r1;
        return false;
    L8:
        System.arraycopy(r02, 0, r02, 1, r9);
        r02[0] = r02[r1];
        System.arraycopy(r02, r3, r02, r3 + 1, r1 - r3);
        goto L9
    L11:
        if (r9 >= r4) goto L13;
        System.arraycopy(r02, r9 + 1, r02, r9, r6);
        this.f41640c = r4 - 1;
    L14:
        return true;
    L13:
        System.arraycopy(r02, r9 + 1, r02, r9, r1 - r9);
        r02[r1] = r02[0];
        System.arraycopy(r02, 1, r02, 0, r4);
        this.f41640c = (r4 - 1) & r1;
        goto L14
    L16:
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Queue
    public boolean offer(Object r1) {
        return offerLast(r1);
    }

    public boolean offerLast(Object r1) {
        addLast(r1);
        return true;
    }

    public final void p() {
        int r02 = this.f41639b;
        Object[] r1 = this.f41638a;
        int r2 = r1.length;
        int r3 = r2 - r02;
        int r4 = r2 << 1;
        if (r4 < 0) goto L7;
        Object[] r42 = new Object[r4];
        System.arraycopy(r1, r02, r42, 0, r3);
        System.arraycopy(this.f41638a, 0, r42, r3, r02);
        this.f41638a = r42;
        this.f41639b = 0;
        this.f41640c = r2;
        return;
    L7:
        throw new IllegalStateException("Sorry, deque too big");
    }

    @Override // java.util.Queue
    public Object peek() {
        return peekFirst();
    }

    public Object peekFirst() {
        return this.f41638a[this.f41639b];
    }

    public Object peekLast() {
        return this.f41638a[(this.f41640c - 1) & (r0.length - 1)];
    }

    @Override // java.util.Queue
    public Object poll() {
        return pollFirst();
    }

    public Object pollFirst() {
        int r02 = this.f41639b;
        Object[] r1 = this.f41638a;
        Object r2 = r1[r02];
        if (r2 != null) goto L5;
        return null;
    L5:
        r1[r02] = null;
        this.f41639b = (r02 + 1) & (r1.length - 1);
        return r2;
    }

    public Object pop() {
        return removeFirst();
    }

    public void push(Object r1) {
        addFirst(r1);
    }

    @Override // java.util.Queue
    public Object remove() {
        return removeFirst();
    }

    public Object removeFirst() {
        Object r02 = pollFirst();
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new NoSuchElementException();
    }

    public boolean removeFirstOccurrence(Object r6) {
        if (r6 != null) goto L5;
        return false;
    L5:
        int r1 = this.f41638a.length - 1;
        int r3 = this.f41639b;
    L6:
        Object r4 = this.f41638a[r3];
        if (r4 == null) goto L13;
        if (r6.equals(r4) == true) goto L10;
        r3 = (r3 + 1) & r1;
        goto L6
    L10:
        o(r3);
        return true;
    L13:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return (this.f41640c - this.f41639b) & (this.f41638a.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return m(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object r1) {
        return removeFirstOccurrence(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] r3) {
        int r02 = size();
        if (r3.length >= r02) goto L5;
        r3 = (Object[]) Array.newInstance(r3.getClass().getComponentType(), r02);
    L5:
        m(r3);
        if (r3.length <= r02) goto L8;
        r3[r02] = null;
    L8:
        return r3;
    }
}
