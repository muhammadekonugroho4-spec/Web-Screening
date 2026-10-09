package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
abstract class SynchronizedCollection<E> implements Collection<E>, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;
    private final Collection<E> collection;
    final AutoClosableReentrantLock lock;

    public SynchronizedCollection(Collection r2) {
        if (r2 == null) goto L7;
        this.collection = r2;
        this.lock = new AutoClosableReentrantLock();
        return;
    L7:
        throw new NullPointerException("Collection must not be null.");
    }

    public Collection a() {
        return this.collection;
    }

    @Override // java.util.Collection
    public boolean add(Object r3) {
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r32 = a().add(r3);     // Catch: Throwable -> L7
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

    @Override // java.util.Collection
    public boolean addAll(Collection r3) {
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r32 = a().addAll(r3);     // Catch: Throwable -> L7
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

    @Override // java.util.Collection
    public void clear() {
        InterfaceC11576d0 r02 = this.lock.a();
        a().clear();     // Catch: Throwable -> L7
        if (r02 == null) goto L18;
        r02.close();
        return;
    L18:
        return;
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
    public boolean contains(Object r3) {
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r32 = a().contains(r3);     // Catch: Throwable -> L7
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

    @Override // java.util.Collection
    public boolean containsAll(Collection r3) {
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r32 = a().containsAll(r3);     // Catch: Throwable -> L7
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

    @Override // java.util.Collection
    public boolean isEmpty() {
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r1 = a().isEmpty();     // Catch: Throwable -> L7
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

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object r3) {
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r32 = a().remove(r3);     // Catch: Throwable -> L7
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

    @Override // java.util.Collection
    public boolean removeAll(Collection r3) {
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r32 = a().removeAll(r3);     // Catch: Throwable -> L7
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

    @Override // java.util.Collection
    public boolean retainAll(Collection r3) {
        InterfaceC11576d0 r02 = this.lock.a();
        boolean r32 = a().retainAll(r3);     // Catch: Throwable -> L7
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

    @Override // java.util.Collection
    public int size() {
        InterfaceC11576d0 r02 = this.lock.a();
        int r1 = a().size();     // Catch: Throwable -> L7
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

    public String toString() {
        InterfaceC11576d0 r02 = this.lock.a();
        String r1 = a().toString();     // Catch: Throwable -> L7
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
}
