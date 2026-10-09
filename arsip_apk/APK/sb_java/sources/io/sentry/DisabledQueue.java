package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes3.dex */
final class DisabledQueue<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610417L;

    public class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DisabledQueue f174766a;

        public a(DisabledQueue r1) {
            this.f174766a = r1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    public DisabledQueue() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object r1) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // java.util.Queue
    public Object element() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Queue
    public boolean offer(Object r1) {
        return false;
    }

    @Override // java.util.Queue
    public Object peek() {
        return null;
    }

    @Override // java.util.Queue
    public Object poll() {
        return null;
    }

    @Override // java.util.Queue
    public Object remove() {
        throw new NoSuchElementException("queue is disabled");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return 0;
    }
}
