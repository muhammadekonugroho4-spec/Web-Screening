package io.sentry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes3.dex */
final class CircularFifoQueue<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f174740a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f174741b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f174742c;
    public transient boolean d;
    private final int maxElements;

    public class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f174743a;

        /* renamed from: b, reason: collision with root package name */
        public int f174744b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f174745c;
        public final /* synthetic */ CircularFifoQueue d;

        public a(CircularFifoQueue r2) {
            this.d = r2;
            this.f174743a = CircularFifoQueue.a(r2);
            this.f174744b = -1;
            this.f174745c = CircularFifoQueue.b(r2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f174745c == false) goto L5;
            return true;
        L5:
            if (this.f174743a != CircularFifoQueue.e(this.d)) goto L11;
            return false;
        L11:
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext() == false) goto L7;
            this.f174745c = false;
            int r02 = this.f174743a;
            this.f174744b = r02;
            this.f174743a = CircularFifoQueue.g(this.d, r02);
            return CircularFifoQueue.h(this.d)[this.f174744b];
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            int r02 = this.f174744b;
            if (r02 == (-1)) goto L22;
            if (r02 != CircularFifoQueue.a(this.d)) goto L8;
            this.d.remove();
            this.f174744b = -1;
            return;
        L8:
            int r03 = this.f174744b + 1;
            if (CircularFifoQueue.a(this.d) >= this.f174744b) goto L14;
            if (r03 >= CircularFifoQueue.e(this.d)) goto L14;
            System.arraycopy(CircularFifoQueue.h(this.d), r03, CircularFifoQueue.h(this.d), this.f174744b, CircularFifoQueue.e(this.d) - r03);
        L19:
            this.f174744b = -1;
            CircularFifoQueue r04 = this.d;
            CircularFifoQueue.f(r04, CircularFifoQueue.k(r04, CircularFifoQueue.e(r04)));
            CircularFifoQueue.h(this.d)[CircularFifoQueue.e(this.d)] = null;
            CircularFifoQueue.d(this.d, false);
            this.f174743a = CircularFifoQueue.k(this.d, this.f174743a);
            return;
        L14:
            if (r03 == CircularFifoQueue.e(this.d)) goto L19;
            if (r03 >= CircularFifoQueue.j(this.d)) goto L17;
            CircularFifoQueue.h(this.d)[CircularFifoQueue.k(this.d, r03)] = CircularFifoQueue.h(this.d)[r03];
            r03 = CircularFifoQueue.g(this.d, r03);
            goto L14
        L17:
            CircularFifoQueue.h(this.d)[r03 - 1] = CircularFifoQueue.h(this.d)[0];
            r03 = 0;
            goto L14
        L22:
            throw new IllegalStateException();
        }
    }

    public CircularFifoQueue(int r2) {
        this.f174741b = 0;
        this.f174742c = 0;
        this.d = false;
        if (r2 <= 0) goto L7;
        Object[] r22 = new Object[r2];
        this.f174740a = r22;
        this.maxElements = r22.length;
        return;
    L7:
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    public static /* synthetic */ int a(CircularFifoQueue r02) {
        return r02.f174741b;
    }

    public static /* synthetic */ boolean b(CircularFifoQueue r02) {
        return r02.d;
    }

    public static /* synthetic */ boolean d(CircularFifoQueue r02, boolean r1) {
        r02.d = r1;
        return r1;
    }

    public static /* synthetic */ int e(CircularFifoQueue r02) {
        return r02.f174742c;
    }

    public static /* synthetic */ int f(CircularFifoQueue r02, int r1) {
        r02.f174742c = r1;
        return r1;
    }

    public static /* synthetic */ int g(CircularFifoQueue r02, int r1) {
        return r02.o(r1);
    }

    public static /* synthetic */ Object[] h(CircularFifoQueue r02) {
        return r02.f174740a;
    }

    public static /* synthetic */ int j(CircularFifoQueue r02) {
        return r02.maxElements;
    }

    public static /* synthetic */ int k(CircularFifoQueue r02, int r1) {
        return r02.m(r1);
    }

    private void readObject(ObjectInputStream r6) throws IOException, ClassNotFoundException {
        r6.defaultReadObject();
        this.f174740a = new Object[this.maxElements];
        int r02 = r6.readInt();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        this.f174740a[r2] = r6.readObject();
        r2 = r2 + 1;
        goto L3
    L5:
        this.f174741b = 0;
        if (r02 != this.maxElements) goto L8;
        boolean r62 = true;
    L9:
        this.d = r62;
        if (r62 == false) goto L13;
        this.f174742c = 0;
        return;
    L13:
        this.f174742c = r02;
        return;
    L8:
        r62 = false;
        goto L9
    }

    private void writeObject(ObjectOutputStream r3) throws IOException {
        r3.defaultWriteObject();
        r3.writeInt(size());
        Iterator r02 = iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        r3.writeObject(r02.next());
        goto L4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object r4) {
        if (r4 == null) goto L14;
        if (p() == false) goto L6;
        remove();
    L6:
        Object[] r02 = this.f174740a;
        int r1 = this.f174742c;
        int r2 = r1 + 1;
        this.f174742c = r2;
        r02[r1] = r4;
        if (r2 < this.maxElements) goto L10;
        this.f174742c = 0;
    L10:
        if (this.f174742c != this.f174741b) goto L12;
        this.d = true;
    L12:
        return true;
    L14:
        throw new NullPointerException("Attempted to add null object to queue");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.d = false;
        this.f174741b = 0;
        this.f174742c = 0;
        Arrays.fill(this.f174740a, null);
    }

    @Override // java.util.Queue
    public Object element() {
        if (isEmpty() == true) goto L7;
        return peek();
    L7:
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    public final int m(int r1) {
        int r12 = r1 - 1;
        if (r12 < 0) goto L5;
        return r12;
    L5:
        return this.maxElements - 1;
    }

    public final int o(int r2) {
        int r22 = r2 + 1;
        if (r22 < this.maxElements) goto L6;
        return 0;
    L6:
        return r22;
    }

    @Override // java.util.Queue
    public boolean offer(Object r1) {
        return add(r1);
    }

    public boolean p() {
        if (size() != this.maxElements) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Queue
    public Object peek() {
        if (isEmpty() == false) goto L7;
        return null;
    L7:
        return this.f174740a[this.f174741b];
    }

    @Override // java.util.Queue
    public Object poll() {
        if (isEmpty() == false) goto L7;
        return null;
    L7:
        return remove();
    }

    @Override // java.util.Queue
    public Object remove() {
        if (isEmpty() == true) goto L12;
        Object[] r02 = this.f174740a;
        int r1 = this.f174741b;
        Object r2 = r02[r1];
        if (r2 == null) goto L10;
        int r3 = r1 + 1;
        this.f174741b = r3;
        r02[r1] = null;
        if (r3 < this.maxElements) goto L9;
        this.f174741b = 0;
    L9:
        this.d = false;
    L10:
        return r2;
    L12:
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int r02 = this.f174742c;
        int r1 = this.f174741b;
        if (r02 < r1) goto L5;
        if (r02 != r1) goto L14;
        if (this.d == true) goto L10;
        return 0;
    L10:
        return this.maxElements;
    L14:
        return r02 - r1;
    L5:
        return (this.maxElements - r1) + r02;
    }
}
