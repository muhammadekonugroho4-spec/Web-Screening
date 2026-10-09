package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\t\bB¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0082\u0004J\n\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\n\u0010\u0014\u001a\u00020\nH\u0096\u0080\u0004J\u0012\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0082\u0004J\u0018\u0010\u0017\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096\u0080\u0004J\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0096\u0082\u0004J\n\u0010\u001c\u001a\u00020\fH\u0082\u0080\u0004R\u000f\u0010\u0007\u001a\u00020\bX\u0082Ô\b¢\u0006\u0002\n\u0000R\u0015\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lkotlin/collections/EmptySet;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "serialVersionUID", "", "equals", "", "other", "", "hashCode", "", "toString", "", "size", "getSize", "()I", "isEmpty", "contains", "element", "containsAll", "elements", "", "iterator", "", "readResolve", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptySet implements Set, Serializable, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptySet f177335a = null;
    private static final long serialVersionUID = 3406603774387020532L;

    static {
        f177335a = new EmptySet();
    }

    private EmptySet() {
    }

    private final Object readResolve() {
        return f177335a;
    }

    public boolean a(Void r2) {
        kotlin.jvm.internal.p.l(r2, "element");
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof Void) == true) goto L7;
        return false;
    L7:
        return a((Void) r2);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection r2) {
        kotlin.jvm.internal.p.l(r2, "elements");
        return r2.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object r2) {
        if ((r2 instanceof Set) == true) goto L5;
        return false;
    L5:
        if (((Set) r2).isEmpty() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public int getSize() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return G.f177337a;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    public String toString() {
        return "[]";
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] r2) {
        kotlin.jvm.internal.p.l(r2, "array");
        return kotlin.jvm.internal.h.b(this, r2);
    }
}
