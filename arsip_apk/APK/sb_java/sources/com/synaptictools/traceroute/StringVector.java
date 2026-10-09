package com.synaptictools.traceroute;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class StringVector extends AbstractList<String> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public StringVector(long r1, boolean r3) {
        this.swigCMemOwn = r3;
        this.swigCPtr = r1;
    }

    private void doAdd(String r3) {
        traceroutelibJNI.StringVector_doAdd__SWIG_0(this.swigCPtr, this, r3);
    }

    private String doGet(int r3) {
        return traceroutelibJNI.StringVector_doGet(this.swigCPtr, this, r3);
    }

    private String doRemove(int r3) {
        return traceroutelibJNI.StringVector_doRemove(this.swigCPtr, this, r3);
    }

    private void doRemoveRange(int r3, int r4) {
        traceroutelibJNI.StringVector_doRemoveRange(this.swigCPtr, this, r3, r4);
    }

    private String doSet(int r3, String r4) {
        return traceroutelibJNI.StringVector_doSet(this.swigCPtr, this, r3, r4);
    }

    private int doSize() {
        return traceroutelibJNI.StringVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(StringVector r2) {
        if (r2 != null) goto L6;
        return 0;
    L6:
        return r2.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, Object r2) {
        add(r1, (String) r2);
    }

    public long capacity() {
        return traceroutelibJNI.StringVector_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        traceroutelibJNI.StringVector_clear(this.swigCPtr, this);
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
        traceroutelibJNI.delete_StringVector(r02);     // Catch: Throwable -> L8
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
        return traceroutelibJNI.StringVector_isEmpty(this.swigCPtr, this);
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
        traceroutelibJNI.StringVector_reserve(this.swigCPtr, this, r3);
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
        return set(r1, (String) r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    private void doAdd(int r3, String r4) {
        traceroutelibJNI.StringVector_doAdd__SWIG_1(this.swigCPtr, this, r3, r4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object r1) {
        return add((String) r1);
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int r1) {
        return doGet(r1);
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int r2) {
        ((AbstractList) this).modCount++;
        return doRemove(r2);
    }

    public String set(int r1, String r2) {
        return doSet(r1, r2);
    }

    public boolean add(String r3) {
        ((AbstractList) this).modCount++;
        doAdd(r3);
        return true;
    }

    public StringVector(String[] r4) {
        this();
        reserve(r4.length);
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        add(r4[r1]);
        r1 = r1 + 1;
        goto L3
    }

    public void add(int r2, String r3) {
        ((AbstractList) this).modCount++;
        doAdd(r2, r3);
    }

    public StringVector(Iterable<String> r2) {
        this();
        Iterator<String> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        add(r22.next());
        goto L4
    }

    public StringVector() {
        this(traceroutelibJNI.new_StringVector__SWIG_0(), true);
    }

    public StringVector(StringVector r3) {
        this(traceroutelibJNI.new_StringVector__SWIG_1(getCPtr(r3), r3), true);
    }

    public StringVector(int r2, String r3) {
        this(traceroutelibJNI.new_StringVector__SWIG_2(r2, r3), true);
    }
}
