package androidx.collection;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: androidx.collection.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2337a extends g0 implements Map {
    public C0058a d;

    /* renamed from: e, reason: collision with root package name */
    public c f6410e;

    /* renamed from: f, reason: collision with root package name */
    public e f6411f;

    /* renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    public final class C0058a extends AbstractSet {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2337a f6412a;

        public C0058a(C2337a r1) {
            this.f6412a = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(this.f6412a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f6412a.size();
        }
    }

    /* renamed from: androidx.collection.a$b */
    public final class b extends AbstractC2347k {
        public final /* synthetic */ C2337a d;

        public b(C2337a r1) {
            this.d = r1;
            super(r1.size());
        }

        @Override // androidx.collection.AbstractC2347k
        public Object a(int r2) {
            return this.d.g(r2);
        }

        @Override // androidx.collection.AbstractC2347k
        public void b(int r2) {
            this.d.i(r2);
        }
    }

    /* renamed from: androidx.collection.a$c */
    public final class c implements Set {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2337a f6413a;

        public c(C2337a r1) {
            this.f6413a = r1;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object r1) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection r1) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f6413a.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object r2) {
            return this.f6413a.containsKey(r2);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection r2) {
            return this.f6413a.m(r2);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object r1) {
            return C2337a.n(this, r1);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int r02 = this.f6413a.size() - 1;
            int r2 = 0;
        L3:
            if (r02 < 0) goto L9;
            Object r3 = this.f6413a.g(r02);
            if (r3 != null) goto L7;
            int r32 = 0;
        L8:
            r2 = r2 + r32;
            r02 = r02 - 1;
            goto L3
        L7:
            r32 = r3.hashCode();
            goto L8
        L9:
            return r2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f6413a.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f6413a);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object r2) {
            int r22 = this.f6413a.e(r2);
            if (r22 < 0) goto L6;
            this.f6413a.i(r22);
            return true;
        L6:
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection r2) {
            return this.f6413a.o(r2);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection r2) {
            return this.f6413a.p(r2);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f6413a.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int r02 = this.f6413a.size();
            Object[] r1 = new Object[r02];
            int r2 = 0;
        L3:
            if (r2 >= r02) goto L5;
            r1[r2] = this.f6413a.g(r2);
            r2 = r2 + 1;
            goto L3
        L5:
            return r1;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] r4) {
            int r02 = size();
            if (r4.length >= r02) goto L5;
            r4 = (Object[]) Array.newInstance(r4.getClass().getComponentType(), r02);
        L5:
            int r1 = 0;
        L6:
            if (r1 >= r02) goto L9;
            r4[r1] = this.f6413a.g(r1);
            r1 = r1 + 1;
            goto L6
        L9:
            if (r4.length <= r02) goto L11;
            r4[r02] = null;
        L11:
            return r4;
        }
    }

    /* renamed from: androidx.collection.a$d */
    public final class d implements Iterator, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public int f6414a;

        /* renamed from: b, reason: collision with root package name */
        public int f6415b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6416c;
        public final /* synthetic */ C2337a d;

        public d(C2337a r1) {
            this.d = r1;
            this.f6414a = r1.size() - 1;
            this.f6415b = -1;
        }

        public Map.Entry a() {
            if (hasNext() == false) goto L7;
            this.f6415b++;
            this.f6416c = true;
            return this;
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object r5) {
            if (this.f6416c == false) goto L15;
            if ((r5 instanceof Map.Entry) == true) goto L7;
            return false;
        L7:
            Map.Entry r52 = (Map.Entry) r5;
            if (androidx.collection.internal.a.c(r52.getKey(), this.d.g(this.f6415b)) == true) goto L10;
        L13:
            return false;
        L10:
            if (androidx.collection.internal.a.c(r52.getValue(), this.d.l(this.f6415b)) == false) goto L13;
            return true;
        L15:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f6416c == false) goto L7;
            return this.d.g(this.f6415b);
        L7:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f6416c == false) goto L7;
            return this.d.l(this.f6415b);
        L7:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6415b >= this.f6414a) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f6416c == false) goto L14;
            Object r02 = this.d.g(this.f6415b);
            Object r1 = this.d.l(this.f6415b);
            int r2 = 0;
            if (r02 != null) goto L7;
            int r03 = 0;
        L8:
            if (r1 == null) goto L12;
            r2 = r1.hashCode();
        L12:
            return r03 ^ r2;
        L7:
            r03 = r02.hashCode();
            goto L8
        L14:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f6416c == false) goto L7;
            this.d.i(this.f6415b);
            this.f6415b--;
            this.f6414a--;
            this.f6416c = false;
            return;
        L7:
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object r3) {
            if (this.f6416c == false) goto L7;
            return this.d.j(this.f6415b, r3);
        L7:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
        }
    }

    /* renamed from: androidx.collection.a$e */
    public final class e implements Collection {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2337a f6417a;

        public e(C2337a r1) {
            this.f6417a = r1;
        }

        @Override // java.util.Collection
        public boolean add(Object r1) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection r1) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            this.f6417a.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object r2) {
            if (this.f6417a.a(r2) < 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection r2) {
            Iterator r22 = r2.iterator();
        L4:
            if (r22.hasNext() == false) goto L9;
            if (contains(r22.next()) == true) goto L4;
            return false;
        L9:
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f6417a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new f(this.f6417a);
        }

        @Override // java.util.Collection
        public boolean remove(Object r2) {
            int r22 = this.f6417a.a(r2);
            if (r22 < 0) goto L6;
            this.f6417a.i(r22);
            return true;
        L6:
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection r6) {
            int r02 = this.f6417a.size();
            int r1 = 0;
            boolean r2 = false;
        L3:
            if (r1 >= r02) goto L8;
            if (r6.contains(this.f6417a.l(r1)) == false) goto L7;
            this.f6417a.i(r1);
            r1 = r1 - 1;
            r02 = r02 - 1;
            r2 = true;
        L7:
            r1 = r1 + 1;
            goto L3
        L8:
            return r2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection r6) {
            int r02 = this.f6417a.size();
            int r1 = 0;
            boolean r2 = false;
        L3:
            if (r1 >= r02) goto L8;
            if (r6.contains(this.f6417a.l(r1)) == true) goto L7;
            this.f6417a.i(r1);
            r1 = r1 - 1;
            r02 = r02 - 1;
            r2 = true;
        L7:
            r1 = r1 + 1;
            goto L3
        L8:
            return r2;
        }

        @Override // java.util.Collection
        public int size() {
            return this.f6417a.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int r02 = this.f6417a.size();
            Object[] r1 = new Object[r02];
            int r2 = 0;
        L3:
            if (r2 >= r02) goto L5;
            r1[r2] = this.f6417a.l(r2);
            r2 = r2 + 1;
            goto L3
        L5:
            return r1;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] r4) {
            int r02 = size();
            if (r4.length >= r02) goto L5;
            r4 = (Object[]) Array.newInstance(r4.getClass().getComponentType(), r02);
        L5:
            int r1 = 0;
        L6:
            if (r1 >= r02) goto L9;
            r4[r1] = this.f6417a.l(r1);
            r1 = r1 + 1;
            goto L6
        L9:
            if (r4.length <= r02) goto L11;
            r4[r02] = null;
        L11:
            return r4;
        }
    }

    /* renamed from: androidx.collection.a$f */
    public final class f extends AbstractC2347k {
        public final /* synthetic */ C2337a d;

        public f(C2337a r1) {
            this.d = r1;
            super(r1.size());
        }

        @Override // androidx.collection.AbstractC2347k
        public Object a(int r2) {
            return this.d.l(r2);
        }

        @Override // androidx.collection.AbstractC2347k
        public void b(int r2) {
            this.d.i(r2);
        }
    }

    public C2337a() {
    }

    public static boolean n(Set r4, Object r5) {
        if (r4 != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Set) == false) goto L13;
        Set r52 = (Set) r5;
        if (r4.size() != r52.size()) goto L13;
        if (r4.containsAll(r52) == false) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // androidx.collection.g0, java.util.Map
    public boolean containsKey(Object r1) {
        return super.containsKey(r1);
    }

    @Override // androidx.collection.g0, java.util.Map
    public boolean containsValue(Object r1) {
        return super.containsValue(r1);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0058a r02 = this.d;
        if (r02 != null) goto L6;
        C0058a r03 = new C0058a(this);
        this.d = r03;
        return r03;
    L6:
        return r02;
    }

    @Override // androidx.collection.g0, java.util.Map
    public Object get(Object r1) {
        return super.get(r1);
    }

    @Override // java.util.Map
    public Set keySet() {
        c r02 = this.f6410e;
        if (r02 != null) goto L6;
        c r03 = new c(this);
        this.f6410e = r03;
        return r03;
    L6:
        return r02;
    }

    public boolean m(Collection r2) {
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        if (containsKey(r22.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    public boolean o(Collection r3) {
        int r02 = size();
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L7;
        remove(r32.next());
        goto L4
    L7:
        if (r02 == size()) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean p(Collection r5) {
        int r02 = size();
        int r1 = size() - 1;
    L3:
        if (r1 < 0) goto L9;
        if (r5.contains(g(r1)) == true) goto L7;
        i(r1);
    L7:
        r1 = r1 - 1;
        goto L3
    L9:
        if (r02 == size()) goto L11;
        return true;
    L11:
        return false;
    }

    @Override // java.util.Map
    public void putAll(Map r3) {
        b(size() + r3.size());
        Iterator r32 = r3.entrySet().iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        Map.Entry r02 = (Map.Entry) r32.next();
        put(r02.getKey(), r02.getValue());
        goto L4
    }

    @Override // androidx.collection.g0, java.util.Map
    public Object remove(Object r1) {
        return super.remove(r1);
    }

    @Override // java.util.Map
    public Collection values() {
        e r02 = this.f6411f;
        if (r02 != null) goto L6;
        e r03 = new e(this);
        this.f6411f = r03;
        return r03;
    L6:
        return r02;
    }

    public C2337a(int r1) {
        super(r1);
    }

    public C2337a(g0 r1) {
        super(r1);
    }
}
