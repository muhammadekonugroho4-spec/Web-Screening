package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    public ForwardingDeque() {
    }

    @Override // java.util.Deque
    public void addFirst(@ParametricNullness E r2) {
        delegate().addFirst(r2);
    }

    @Override // java.util.Deque
    public void addLast(@ParametricNullness E r2) {
        delegate().addLast(r2);
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
        return delegate();
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract Deque<E> delegate();

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.Deque
    @ParametricNullness
    public E getFirst() {
        return delegate().getFirst();
    }

    @Override // java.util.Deque
    @ParametricNullness
    public E getLast() {
        return delegate().getLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerFirst(@ParametricNullness E r2) {
        return delegate().offerFirst(r2);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerLast(@ParametricNullness E r2) {
        return delegate().offerLast(r2);
    }

    @Override // java.util.Deque
    public E peekFirst() {
        return delegate().peekFirst();
    }

    @Override // java.util.Deque
    public E peekLast() {
        return delegate().peekLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollLast() {
        return delegate().pollLast();
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E pop() {
        return delegate().pop();
    }

    @Override // java.util.Deque
    public void push(@ParametricNullness E r2) {
        delegate().push(r2);
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeFirst() {
        return delegate().removeFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeFirstOccurrence(Object r2) {
        return delegate().removeFirstOccurrence(r2);
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeLast() {
        return delegate().removeLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeLastOccurrence(Object r2) {
        return delegate().removeLastOccurrence(r2);
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Collection delegate() {
        return delegate();
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Queue delegate() {
        return delegate();
    }
}
