package io.sentry;

import java.util.Collection;
import java.util.Queue;

/* loaded from: classes3.dex */
final class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
    private static final long serialVersionUID = 1;

    public SynchronizedQueue(Queue r1) {
        super(r1);
    }

    public static SynchronizedQueue d(Queue r1) {
        return new SynchronizedQueue(r1);
    }

    @Override // io.sentry.SynchronizedCollection
    public /* bridge */ /* synthetic */ Collection a() {
        return b();
    }

    public Queue b() {
        return (Queue) super.a();
    }

    @Override // java.util.Queue
    public Object element() {
        InterfaceC11576d0 r02 = this.lock.a();
        Object r1 = b().element();     // Catch: Throwable -> L7
        if (r02 == null) goto L6;
        r02.close();
    L6:
        return r1;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // java.util.Collection
    public boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r32 = b().equals(r3);     // Catch: Throwable -> L10
        if (r02 == null) goto L9;
        r02.close();
    L9:
        return r32;
    L10:
        th = move-exception;
        if (r02 != null) goto L19;
    L16:
        throw th;
    L19:
        r02.close();     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    }

    @Override // java.util.Collection
    public int hashCode() {
        InterfaceC11576d0 r02 = this.lock.a();
        int r1 = b().hashCode();     // Catch: Throwable -> L7
        if (r02 == null) goto L6;
        r02.close();
    L6:
        return r1;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // java.util.Queue
    public boolean offer(Object r3) {
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r32 = b().offer(r3);     // Catch: Throwable -> L7
        if (r02 == null) goto L6;
        r02.close();
    L6:
        return r32;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // java.util.Queue
    public Object peek() {
        InterfaceC11576d0 r02 = this.lock.a();
        Object r1 = b().peek();     // Catch: Throwable -> L7
        if (r02 == null) goto L6;
        r02.close();
    L6:
        return r1;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // java.util.Queue
    public Object poll() {
        InterfaceC11576d0 r02 = this.lock.a();
        Object r1 = b().poll();     // Catch: Throwable -> L7
        if (r02 == null) goto L6;
        r02.close();
    L6:
        return r1;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // java.util.Queue
    public Object remove() {
        InterfaceC11576d0 r02 = this.lock.a();
        Object r1 = b().remove();     // Catch: Throwable -> L7
        if (r02 == null) goto L6;
        r02.close();
    L6:
        return r1;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        InterfaceC11576d0 r02 = this.lock.a();
        Object[] r1 = b().toArray();     // Catch: Throwable -> L7
        if (r02 == null) goto L6;
        r02.close();
    L6:
        return r1;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] r3) {
        InterfaceC11576d0 r02 = this.lock.a();
        Object[] r32 = b().toArray(r3);     // Catch: Throwable -> L7
        if (r02 == null) goto L6;
        r02.close();
    L6:
        return r32;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }
}
