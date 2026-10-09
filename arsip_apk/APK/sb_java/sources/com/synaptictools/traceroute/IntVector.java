package com.synaptictools.traceroute;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class IntVector extends AbstractList<Integer> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IntVector(long r1, boolean r3) {
        this.swigCMemOwn = r3;
        this.swigCPtr = r1;
    }

    private void doAdd(int r3) {
        traceroutelibJNI.IntVector_doAdd__SWIG_0(this.swigCPtr, this, r3);
    }

    private int doGet(int r3) {
        return traceroutelibJNI.IntVector_doGet(this.swigCPtr, this, r3);
    }

    private int doRemove(int r3) {
        return traceroutelibJNI.IntVector_doRemove(this.swigCPtr, this, r3);
    }

    private void doRemoveRange(int r3, int r4) {
        traceroutelibJNI.IntVector_doRemoveRange(this.swigCPtr, this, r3, r4);
    }

    private int doSet(int r3, int r4) {
        return traceroutelibJNI.IntVector_doSet(this.swigCPtr, this, r3, r4);
    }

    private int doSize() {
        return traceroutelibJNI.IntVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(IntVector r2) {
        if (r2 != null) goto L6;
        return 0;
    L6:
        return r2.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, Object r2) {
        add(r1, (Integer) r2);
    }

    public long capacity() {
        return traceroutelibJNI.IntVector_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        traceroutelibJNI.IntVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        monitor-enter(this);
        long r02 = this.swigCPtr;     // Catch: Throwable -> L8
        if (r02 != 0) goto L6;
    L11:
        monitor-exit(this);
        return;
    L6:
        if (this.swigCMemOwn == false) goto L10;
        this.swigCMemOwn = false;     // Catch: Throwable -> L8
        traceroutelibJNI.delete_IntVector(r02);     // Catch: Throwable -> L8
    L10:
        this.swigCPtr = 0;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public void finalize() {
        delete();
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int r1) {
        return get(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return traceroutelibJNI.IntVector_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object remove(int r1) {
        return remove(r1);
    }

    @Override // java.util.AbstractList
    public void removeRange(int r2, int r3) {
        ((AbstractList) this).modCount++;
        doRemoveRange(r2, r3);
    }

    public void reserve(long r3) {
        traceroutelibJNI.IntVector_reserve(this.swigCPtr, this, r3);
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
        return set(r1, (Integer) r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    private void doAdd(int r3, int r4) {
        traceroutelibJNI.IntVector_doAdd__SWIG_1(this.swigCPtr, this, r3, r4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object r1) {
        return add((Integer) r1);
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int r1) {
        return Integer.valueOf(doGet(r1));
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer remove(int r2) {
        ((AbstractList) this).modCount++;
        return Integer.valueOf(doRemove(r2));
    }

    public Integer set(int r1, Integer r2) {
        return Integer.valueOf(doSet(r1, r2.intValue()));
    }

    public boolean add(Integer r3) {
        ((AbstractList) this).modCount++;
        doAdd(r3.intValue());
        return true;
    }

    public IntVector(int[] r4) {
        this();
        reserve(r4.length);
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        add(Integer.valueOf(r4[r1]));
        r1 = r1 + 1;
        goto L3
    }

    public void add(int r2, Integer r3) {
        ((AbstractList) this).modCount++;
        doAdd(r2, r3.intValue());
    }

    public IntVector(Iterable<Integer> r2) {
        this();
        Iterator<Integer> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        Integer r02 = r22.next();
        r02.intValue();
        add(r02);
        goto L4
    }

    public IntVector() {
        this(traceroutelibJNI.new_IntVector__SWIG_0(), true);
    }

    public IntVector(IntVector r3) {
        this(traceroutelibJNI.new_IntVector__SWIG_1(getCPtr(r3), r3), true);
    }

    public IntVector(int r2, int r3) {
        this(traceroutelibJNI.new_IntVector__SWIG_2(r2, r3), true);
    }
}
