package com.synaptictools.traceroute;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class VecDouble extends AbstractList<Double> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public VecDouble(long r1, boolean r3) {
        this.swigCMemOwn = r3;
        this.swigCPtr = r1;
    }

    private void doAdd(double r3) {
        traceroutelibJNI.VecDouble_doAdd__SWIG_0(this.swigCPtr, this, r3);
    }

    private double doGet(int r3) {
        return traceroutelibJNI.VecDouble_doGet(this.swigCPtr, this, r3);
    }

    private double doRemove(int r3) {
        return traceroutelibJNI.VecDouble_doRemove(this.swigCPtr, this, r3);
    }

    private void doRemoveRange(int r3, int r4) {
        traceroutelibJNI.VecDouble_doRemoveRange(this.swigCPtr, this, r3, r4);
    }

    private double doSet(int r7, double r8) {
        return traceroutelibJNI.VecDouble_doSet(this.swigCPtr, this, r7, r8);
    }

    private int doSize() {
        return traceroutelibJNI.VecDouble_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(VecDouble r2) {
        if (r2 != null) goto L6;
        return 0;
    L6:
        return r2.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, Object r2) {
        add(r1, (Double) r2);
    }

    public long capacity() {
        return traceroutelibJNI.VecDouble_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        traceroutelibJNI.VecDouble_clear(this.swigCPtr, this);
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
        traceroutelibJNI.delete_VecDouble(r02);     // Catch: Throwable -> L8
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
        return traceroutelibJNI.VecDouble_isEmpty(this.swigCPtr, this);
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
        traceroutelibJNI.VecDouble_reserve(this.swigCPtr, this, r3);
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
        return set(r1, (Double) r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    private void doAdd(int r7, double r8) {
        traceroutelibJNI.VecDouble_doAdd__SWIG_1(this.swigCPtr, this, r7, r8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object r1) {
        return add((Double) r1);
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int r3) {
        return Double.valueOf(doGet(r3));
    }

    @Override // java.util.AbstractList, java.util.List
    public Double remove(int r3) {
        ((AbstractList) this).modCount++;
        return Double.valueOf(doRemove(r3));
    }

    public Double set(int r3, Double r4) {
        return Double.valueOf(doSet(r3, r4.doubleValue()));
    }

    public boolean add(Double r5) {
        ((AbstractList) this).modCount++;
        doAdd(r5.doubleValue());
        return true;
    }

    public VecDouble(double[] r5) {
        this();
        reserve(r5.length);
        int r02 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        add(Double.valueOf(r5[r1]));
        r1 = r1 + 1;
        goto L3
    }

    public void add(int r3, Double r4) {
        ((AbstractList) this).modCount++;
        doAdd(r3, r4.doubleValue());
    }

    public VecDouble(Iterable<Double> r2) {
        this();
        Iterator<Double> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        Double r02 = r22.next();
        r02.doubleValue();
        add(r02);
        goto L4
    }

    public VecDouble() {
        this(traceroutelibJNI.new_VecDouble__SWIG_0(), true);
    }

    public VecDouble(VecDouble r3) {
        this(traceroutelibJNI.new_VecDouble__SWIG_1(getCPtr(r3), r3), true);
    }

    public VecDouble(int r1, double r2) {
        this(traceroutelibJNI.new_VecDouble__SWIG_2(r1, r2), true);
    }
}
