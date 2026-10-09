package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public AbstractSetMultimap(Map<K, Collection<V>> r1) {
        super(r1);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public /* bridge */ /* synthetic */ Collection createCollection() {
        return createCollection();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public abstract Set<V> createCollection();

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public /* bridge */ /* synthetic */ Collection createUnmodifiableEmptyCollection() {
        return createUnmodifiableEmptyCollection();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection entries() {
        return entries();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(Object r1) {
        return super.equals(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection get(@ParametricNullness Object r1) {
        return get(r1);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K r1, @ParametricNullness V r2) {
        return super.put(r1, r2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection removeAll(Object r1) {
        return removeAll(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(@ParametricNullness Object r1, Iterable r2) {
        return replaceValues(r1, r2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> r1) {
        return Collections.unmodifiableSet((Set) r1);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> wrapCollection(@ParametricNullness K r2, Collection<V> r3) {
        return new AbstractMapBasedMultimap.WrappedSet(this, r2, (Set) r3);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set<V> get(@ParametricNullness K r1) {
        return (Set) super.get(r1);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Set<V> removeAll(Object r1) {
        return (Set) super.removeAll(r1);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Set<V> replaceValues(@ParametricNullness K r1, Iterable<? extends V> r2) {
        return (Set) super.replaceValues(r1, r2);
    }
}
