package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes6.dex */
public class LimitQueue<E> extends ConcurrentLinkedQueue<E> {
    private static final String TAG = "LimitQueue";
    private static final long serialVersionUID = -4636313759149307798L;
    private boolean deduplication;
    private int limit;

    public LimitQueue(int r2) {
        this.deduplication = false;
        this.limit = r2;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E r3) {
        if (this.deduplication == false) goto L6;
        super.remove(r3);
    L6:
        if (super.size() < this.limit) goto L9;
        super.poll();
    L9:
        return super.add(r3);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends E> r3) {
        if (r3.size() <= this.limit) goto L7;
        return false;
    L7:
        if (this.deduplication == false) goto L9;
        super.removeAll(r3);
    L9:
        int r02 = (r3.size() + super.size()) - this.limit;
    L10:
        if (r02 <= 0) goto L13;
        super.poll();
        r02 = r02 - 1;
        goto L10
    L13:
        return super.addAll(r3);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        super.clear();
    }

    public E get(int r5) {
        Iterator<E> r02 = iterator();
        E r1 = null;
        int r2 = 0;
    L3:
        if (r2 > r5) goto L7;
        if (r02.hasNext() == false) goto L7;
        r1 = r02.next();
        r2 = r2 + 1;
    L7:
        return r1;
    }

    public int getLimit() {
        return this.limit;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public boolean offer(E r3) {
        if (this.deduplication == false) goto L6;
        super.remove(r3);
    L6:
        if (super.size() < this.limit) goto L9;
        super.poll();
    L9:
        return super.offer(r3);
    }

    public E peekLast() {
        Iterator<E> r02 = iterator();
        E r1 = null;
    L4:
        if (r02.hasNext() == false) goto L6;
        r1 = r02.next();
        goto L4
    L6:
        return r1;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public E poll() {
        return (E) super.poll();
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E remove() {
        return (E) super.remove();
    L4:
        Logger.w(TAG, "remove failed, limitQueue is empty");
        return null;
    }

    public LimitQueue(int r1, boolean r2) {
        this.limit = r1;
        this.deduplication = r2;
    }

    public LimitQueue(Collection<? extends E> r2, boolean r3) {
        this(r2.size(), r3);
        addAll(r2);
    }
}
