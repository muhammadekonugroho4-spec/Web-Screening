package androidx.datastore.preferences.protobuf;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public abstract class Z extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public final int f23782a;

    /* renamed from: b, reason: collision with root package name */
    public List f23783b;

    /* renamed from: c, reason: collision with root package name */
    public Map f23784c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile g f23785e;

    /* renamed from: f, reason: collision with root package name */
    public Map f23786f;

    /* renamed from: g, reason: collision with root package name */
    public volatile c f23787g;

    public static class a extends Z {
        public a(int r2) {
            super(r2, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object r1, Object r2) {
            a.a.a.a.c.f.a(r1);
            return super.t(null, r2);
        }

        @Override // androidx.datastore.preferences.protobuf.Z
        public void r() {
            if (q() == false) goto L5;
        L13:
            super.r();
            return;
        L5:
            if (m() > 0) goto L11;
            Iterator r02 = o().iterator();
            if (r02.hasNext() == false) goto L13;
            a.a.a.a.c.f.a(((Map.Entry) r02.next()).getKey());
            throw null;
        L11:
            a.a.a.a.c.f.a(l(0).getKey());
            throw null;
        }
    }

    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f23788a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator f23789b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Z f23790c;

        public b(Z r1) {
            this.f23790c = r1;
            this.f23788a = Z.b(r1).size();
        }

        public final Iterator a() {
            if (this.f23789b != null) goto L6;
            this.f23789b = Z.f(this.f23790c).entrySet().iterator();
        L6:
            return this.f23789b;
        }

        public Map.Entry b() {
            if (a().hasNext() == true) goto L5;
            List r02 = Z.b(this.f23790c);
            int r1 = this.f23788a - 1;
            this.f23788a = r1;
            return (Map.Entry) r02.get(r1);
        L5:
            return (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int r02 = this.f23788a;
            if (r02 <= 0) goto L7;
            if (r02 > Z.b(this.f23790c).size()) goto L7;
            return true;
        L7:
            if (a().hasNext() == true) goto L12;
            return false;
        L12:
            return true;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return b();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(Z r1, a r2) {
            this(r1);
        }
    }

    public class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Z f23791b;

        public c(Z r2) {
            this.f23791b = r2;
            super(r2, null);
        }

        @Override // androidx.datastore.preferences.protobuf.Z.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(this.f23791b, null);
        }

        public /* synthetic */ c(Z r1, a r2) {
            this(r1);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator f23792a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f23793b = null;

        public static class a implements Iterator {
            public a() {
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
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable {
            public b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.a();
            }
        }

        static {
            f23792a = new a();
            f23793b = new b();
        }

        public static /* synthetic */ Iterator a() {
            return f23792a;
        }

        public static Iterable b() {
            return f23793b;
        }
    }

    public class e implements Map.Entry, Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final Comparable f23794a;

        /* renamed from: b, reason: collision with root package name */
        public Object f23795b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Z f23796c;

        public e(Z r2, Map.Entry r3) {
            this(r2, (Comparable) r3.getKey(), r3.getValue());
        }

        public int a(e r2) {
            return c().compareTo(r2.c());
        }

        public final boolean b(Object r1, Object r2) {
            if (r1 != null) goto L9;
            if (r2 != null) goto L6;
            return true;
        L6:
            return false;
        L9:
            return r1.equals(r2);
        }

        public Comparable c() {
            return this.f23794a;
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object r1) {
            return a((e) r1);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object r5) {
            if (r5 != this) goto L6;
            return true;
        L6:
            if ((r5 instanceof Map.Entry) == true) goto L8;
            return false;
        L8:
            Map.Entry r52 = (Map.Entry) r5;
            if (b(this.f23794a, r52.getKey()) == true) goto L11;
        L13:
            return false;
        L11:
            if (b(this.f23795b, r52.getValue()) == false) goto L13;
            return true;
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object getKey() {
            return c();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f23795b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable r02 = this.f23794a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            Object r2 = this.f23795b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r03 ^ r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object r2) {
            Z.a(this.f23796c);
            Object r02 = this.f23795b;
            this.f23795b = r2;
            return r02;
        }

        public String toString() {
            return this.f23794a + ContainerUtils.KEY_VALUE_DELIMITER + this.f23795b;
        }

        public e(Z r1, Comparable r2, Object r3) {
            this.f23796c = r1;
            this.f23794a = r2;
            this.f23795b = r3;
        }
    }

    public class f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f23797a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f23798b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator f23799c;
        public final /* synthetic */ Z d;

        public f(Z r1) {
            this.d = r1;
            this.f23797a = -1;
        }

        public final Iterator a() {
            if (this.f23799c != null) goto L6;
            this.f23799c = Z.d(this.d).entrySet().iterator();
        L6:
            return this.f23799c;
        }

        public Map.Entry b() {
            this.f23798b = true;
            int r1 = this.f23797a + 1;
            this.f23797a = r1;
            if (r1 >= Z.b(this.d).size()) goto L7;
            return (Map.Entry) Z.b(this.d).get(this.f23797a);
        L7:
            return (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if ((this.f23797a + 1) >= Z.b(this.d).size()) goto L5;
        L11:
            return true;
        L5:
            if (Z.d(this.d).isEmpty() == false) goto L7;
            return false;
        L7:
            if (a().hasNext() == true) goto L11;
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return b();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f23798b == false) goto L11;
            this.f23798b = false;
            Z.a(this.d);
            if (this.f23797a >= Z.b(this.d).size()) goto L8;
            Z r02 = this.d;
            int r1 = this.f23797a;
            this.f23797a = r1 - 1;
            Z.e(r02, r1);
            return;
        L8:
            a().remove();
            return;
        L11:
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ f(Z r1, a r2) {
            this(r1);
        }
    }

    public class g extends AbstractSet {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z f23800a;

        public g(Z r1) {
            this.f23800a = r1;
        }

        public boolean a(Map.Entry r3) {
            if (contains(r3) == true) goto L6;
            this.f23800a.t((Comparable) r3.getKey(), r3.getValue());
            return true;
        L6:
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(Object r1) {
            return a((Map.Entry) r1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f23800a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object r3) {
            Map.Entry r32 = (Map.Entry) r3;
            Object r02 = this.f23800a.get(r32.getKey());
            Object r33 = r32.getValue();
            if (r02 == r33) goto L10;
            if (r02 != null) goto L6;
            return false;
        L6:
            if (r02.equals(r33) == true) goto L13;
            return false;
        L13:
            return true;
        L10:
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(this.f23800a, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object r2) {
            Map.Entry r22 = (Map.Entry) r2;
            if (contains(r22) == false) goto L6;
            this.f23800a.remove(r22.getKey());
            return true;
        L6:
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f23800a.size();
        }

        public /* synthetic */ g(Z r1, a r2) {
            this(r1);
        }
    }

    public /* synthetic */ Z(int r1, a r2) {
        this(r1);
    }

    public static /* synthetic */ void a(Z r02) {
        r02.h();
    }

    public static /* synthetic */ List b(Z r02) {
        return r02.f23783b;
    }

    public static /* synthetic */ Map d(Z r02) {
        return r02.f23784c;
    }

    public static /* synthetic */ Object e(Z r02, int r1) {
        return r02.v(r1);
    }

    public static /* synthetic */ Map f(Z r02) {
        return r02.f23786f;
    }

    public static Z s(int r1) {
        return new a(r1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (this.f23783b.isEmpty() == true) goto L6;
        this.f23783b.clear();
    L6:
        if (this.f23784c.isEmpty() == true) goto L9;
        this.f23784c.clear();
        return;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object r2) {
        Comparable r22 = (Comparable) r2;
        if (g(r22) < 0) goto L5;
        return true;
    L5:
        if (this.f23784c.containsKey(r22) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f23785e != null) goto L6;
        this.f23785e = new g(this, null);
    L6:
        return this.f23785e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Z) == false) goto L8;
        Z r82 = (Z) r8;
        int r1 = size();
        if (r1 == r82.size()) goto L12;
        return false;
    L12:
        int r2 = m();
        if (r2 != r82.m()) goto L15;
        int r4 = 0;
    L17:
        if (r4 >= r2) goto L22;
        if (l(r4).equals(r82.l(r4)) == false) goto L20;
        r4 = r4 + 1;
        goto L17
    L20:
        return false;
    L22:
        if (r2 != r1) goto L24;
        return true;
    L24:
        return this.f23784c.equals(r82.f23784c);
    L15:
        return entrySet().equals(r82.entrySet());
    L8:
        return super.equals(r8);
    }

    public final int g(Comparable r5) {
        int r02 = this.f23783b.size();
        int r1 = r02 - 1;
        if (r1 < 0) goto L11;
        int r2 = r5.compareTo(((e) this.f23783b.get(r1)).c());
        if (r2 <= 0) goto L9;
        int r03 = r02 + 1;
    L8:
        return -r03;
    L9:
        if (r2 != 0) goto L11;
        return r1;
    L11:
        int r04 = 0;
    L12:
        if (r04 > r1) goto L19;
        int r22 = (r04 + r1) / 2;
        int r3 = r5.compareTo(((e) this.f23783b.get(r22)).c());
        if (r3 < 0) goto L15;
        if (r3 <= 0) goto L18;
        r04 = r22 + 1;
        goto L12
    L18:
        return r22;
    L15:
        r1 = r22 - 1;
        goto L12
    L19:
        r03 = r04 + 1;
        goto L8
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object r2) {
        Comparable r22 = (Comparable) r2;
        int r02 = g(r22);
        if (r02 < 0) goto L7;
        return ((e) this.f23783b.get(r02)).getValue();
    L7:
        return this.f23784c.get(r22);
    }

    public final void h() {
        if (this.d == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int r02 = m();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r02) goto L6;
        r2 = r2 + ((e) this.f23783b.get(r1)).hashCode();
        r1 = r1 + 1;
        goto L3
    L6:
        if (n() > 0) goto L8;
        return r2;
    L8:
        return r2 + this.f23784c.hashCode();
    }

    public Set i() {
        if (this.f23787g != null) goto L6;
        this.f23787g = new c(this, null);
    L6:
        return this.f23787g;
    }

    public final void j() {
        h();
        if (this.f23783b.isEmpty() == true) goto L5;
        return;
    L5:
        if ((this.f23783b instanceof ArrayList) == true) goto L9;
        this.f23783b = new ArrayList(this.f23782a);
        return;
    }

    public Map.Entry l(int r2) {
        return (Map.Entry) this.f23783b.get(r2);
    }

    public int m() {
        return this.f23783b.size();
    }

    public int n() {
        return this.f23784c.size();
    }

    public Iterable o() {
        if (this.f23784c.isEmpty() == false) goto L7;
        return d.b();
    L7:
        return this.f23784c.entrySet();
    }

    public final SortedMap p() {
        h();
        if (this.f23784c.isEmpty() == false) goto L8;
        if ((this.f23784c instanceof TreeMap) == true) goto L8;
        TreeMap r02 = new TreeMap();
        this.f23784c = r02;
        this.f23786f = r02.descendingMap();
    L8:
        return (SortedMap) this.f23784c;
    }

    public boolean q() {
        return this.d;
    }

    public void r() {
        if (this.d == false) goto L5;
        return;
    L5:
        if (this.f23784c.isEmpty() == false) goto L7;
        Map r02 = Collections.EMPTY_MAP;
    L8:
        this.f23784c = r02;
        if (this.f23786f.isEmpty() == false) goto L11;
        Map r03 = Collections.EMPTY_MAP;
    L12:
        this.f23786f = r03;
        this.d = true;
        return;
    L11:
        r03 = Collections.unmodifiableMap(this.f23786f);
        goto L12
    L7:
        r02 = Collections.unmodifiableMap(this.f23784c);
        goto L8
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object r2) {
        h();
        Comparable r22 = (Comparable) r2;
        int r02 = g(r22);
        if (r02 < 0) goto L7;
        return v(r02);
    L7:
        if (this.f23784c.isEmpty() == false) goto L11;
        return null;
    L11:
        return this.f23784c.remove(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f23783b.size() + this.f23784c.size();
    }

    public Object t(Comparable r5, Object r6) {
        h();
        int r02 = g(r5);
        if (r02 >= 0) goto L5;
        j();
        int r03 = -(r02 + 1);
        if (r03 >= this.f23782a) goto L9;
        int r1 = this.f23783b.size();
        int r2 = this.f23782a;
        if (r1 != r2) goto L13;
        e r12 = (e) this.f23783b.remove(r2 - 1);
        p().put(r12.c(), r12.getValue());
    L13:
        this.f23783b.add(r03, new e(this, r5, r6));
        return null;
    L9:
        return p().put(r5, r6);
    L5:
        return ((e) this.f23783b.get(r02)).setValue(r6);
    }

    public final Object v(int r5) {
        h();
        Object r52 = ((e) this.f23783b.remove(r5)).getValue();
        if (this.f23784c.isEmpty() == true) goto L5;
        Iterator r02 = p().entrySet().iterator();
        this.f23783b.add(new e(this, (Map.Entry) r02.next()));
        r02.remove();
    L5:
        return r52;
    }

    public Z(int r1) {
        this.f23782a = r1;
        this.f23783b = Collections.EMPTY_LIST;
        Map r12 = Collections.EMPTY_MAP;
        this.f23784c = r12;
        this.f23786f = r12;
    }
}
