package com.koushikdutta.async;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;

/* loaded from: classes6.dex */
class ThreadQueue extends LinkedList<Runnable> {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f41244a = null;
    Semaphore queueSemaphore;
    e waiter;

    static {
        f41244a = new WeakHashMap();
    }

    public ThreadQueue() {
        this.queueSemaphore = new Semaphore(0);
    }

    public static ThreadQueue b(Thread r2) {
        WeakHashMap r02 = f41244a;
        monitor-enter(r02);
        ThreadQueue r1 = (ThreadQueue) r02.get(r2);     // Catch: Throwable -> L7
        if (r1 != null) goto L9;
        r1 = new ThreadQueue();     // Catch: Throwable -> L7
        r02.put(r2, r1);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public static void e(e r4) {
        WeakHashMap r02 = f41244a;
        monitor-enter(r02);
        Iterator r1 = r02.values().iterator();     // Catch: Throwable -> L10
    L6:
        if (r1.hasNext() == false) goto L12;
        ThreadQueue r2 = (ThreadQueue) r1.next();     // Catch: Throwable -> L10
        if (r2.waiter != r4) goto L6;
        r2.queueSemaphore.release();     // Catch: Throwable -> L10
        goto L6
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public boolean a(Runnable r1) {
        monitor-enter(this);
        boolean r12 = super.add(r1);     // Catch: Throwable -> L6
        monitor-exit(this);     // Catch: Throwable -> L6
        return r12;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public /* bridge */ /* synthetic */ boolean add(Object r1) {
        return a((Runnable) r1);
    }

    public Runnable g() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (isEmpty() == true) goto L6;
        Runnable r02 = (Runnable) super.remove();     // Catch: Throwable -> L8
        monitor-exit(this);     // Catch: Throwable -> L8
        return r02;
    L6:
        monitor-exit(this);     // Catch: Throwable -> L8
        return null;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    public /* bridge */ /* synthetic */ Object remove() {
        return g();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean remove(Object r1) {
        monitor-enter(this);
        boolean r12 = super.remove(r1);     // Catch: Throwable -> L6
        monitor-exit(this);     // Catch: Throwable -> L6
        return r12;
    L6:
        th = move-exception;
        throw th;
    }
}
