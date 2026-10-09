package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3930u;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3913c extends AbstractList implements AbstractC3930u.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23803a;

    public AbstractC3913c() {
        this.f23803a = true;
    }

    public void a() {
        if (this.f23803a == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object r1) {
        a();
        return super.add(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection r1) {
        a();
        return super.addAll(r1);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof List) == true) goto L9;
        return false;
    L9:
        if ((r7 instanceof RandomAccess) == false) goto L11;
        List r72 = (List) r7;
        int r1 = size();
        if (r1 == r72.size()) goto L15;
        return false;
    L15:
        int r3 = 0;
    L16:
        if (r3 >= r1) goto L21;
        if (get(r3).equals(r72.get(r3)) == false) goto L19;
        r3 = r3 + 1;
        goto L16
    L19:
        return false;
    L21:
        return true;
    L11:
        return super.equals(r7);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int r02 = size();
        int r1 = 1;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1 = (r1 * 31) + get(r2).hashCode();
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3930u.b
    public boolean isModifiable() {
        return this.f23803a;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3930u.b
    public final void makeImmutable() {
        this.f23803a = false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object r1) {
        a();
        return super.remove(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection r1) {
        a();
        return super.removeAll(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection r1) {
        a();
        return super.retainAll(r1);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r1, Collection r2) {
        a();
        return super.addAll(r1, r2);
    }
}
