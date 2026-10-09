package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.g;

/* loaded from: classes3.dex */
public abstract class r extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public final int f179457a;

    /* renamed from: b, reason: collision with root package name */
    public List f179458b;

    /* renamed from: c, reason: collision with root package name */
    public Map f179459c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile e f179460e;

    public static class a extends r {
        public a(int r2) {
            super(r2, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        public void o() {
            if (n() == true) goto L17;
            int r02 = 0;
        L6:
            if (r02 >= j()) goto L11;
            Map.Entry r1 = i(r02);
            if (((g.b) r1.getKey()).isRepeated() == false) goto L10;
            r1.setValue(Collections.unmodifiableList((List) r1.getValue()));
        L10:
            r02 = r02 + 1;
            goto L6
        L11:
            Iterator r03 = l().iterator();
        L13:
            if (r03.hasNext() == false) goto L17;
            Map.Entry r12 = (Map.Entry) r03.next();
            if (((g.b) r12.getKey()).isRepeated() == false) goto L13;
            r12.setValue(Collections.unmodifiableList((List) r12.getValue()));
        L17:
            super.o();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object r1, Object r2) {
            return super.q((g.b) r1, r2);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator f179461a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f179462b = null;

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

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.r$b$b, reason: collision with other inner class name */
        public static class C1908b implements Iterable {
            public C1908b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.a();
            }
        }

        static {
            f179461a = new a();
            f179462b = new C1908b();
        }

        public static /* synthetic */ Iterator a() {
            return f179461a;
        }

        public static Iterable b() {
            return f179462b;
        }
    }

    public class c implements Comparable, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public final Comparable f179463a;

        /* renamed from: b, reason: collision with root package name */
        public Object f179464b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f179465c;

        public c(r r2, Map.Entry r3) {
            this(r2, (Comparable) r3.getKey(), r3.getValue());
        }

        public int a(c r2) {
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
            return this.f179463a;
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object r1) {
            return a((c) r1);
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
            if (b(this.f179463a, r52.getKey()) == true) goto L11;
        L13:
            return false;
        L11:
            if (b(this.f179464b, r52.getValue()) == false) goto L13;
            return true;
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object getKey() {
            return c();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f179464b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable r02 = this.f179463a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            Object r2 = this.f179464b;
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
            r.a(this.f179465c);
            Object r02 = this.f179464b;
            this.f179464b = r2;
            return r02;
        }

        public String toString() {
            String r02 = String.valueOf(this.f179463a);
            String r1 = String.valueOf(this.f179464b);
            StringBuilder r2 = new StringBuilder((r02.length() + 1) + r1.length());
            r2.append(r02);
            r2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            r2.append(r1);
            return r2.toString();
        }

        public c(r r1, Comparable r2, Object r3) {
            this.f179465c = r1;
            this.f179463a = r2;
            this.f179464b = r3;
        }
    }

    public class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f179466a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f179467b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator f179468c;
        public final /* synthetic */ r d;

        public d(r r1) {
            this.d = r1;
            this.f179466a = -1;
        }

        public final Iterator a() {
            if (this.f179468c != null) goto L6;
            this.f179468c = r.e(this.d).entrySet().iterator();
        L6:
            return this.f179468c;
        }

        public Map.Entry b() {
            this.f179467b = true;
            int r1 = this.f179466a + 1;
            this.f179466a = r1;
            if (r1 >= r.b(this.d).size()) goto L7;
            return (Map.Entry) r.b(this.d).get(this.f179466a);
        L7:
            return (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if ((this.f179466a + 1) >= r.b(this.d).size()) goto L5;
        L9:
            return true;
        L5:
            if (a().hasNext() == true) goto L9;
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return b();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f179467b == false) goto L11;
            this.f179467b = false;
            r.a(this.d);
            if (this.f179466a >= r.b(this.d).size()) goto L8;
            r r02 = this.d;
            int r1 = this.f179466a;
            this.f179466a = r1 - 1;
            r.d(r02, r1);
            return;
        L8:
            a().remove();
            return;
        L11:
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ d(r r1, a r2) {
            this(r1);
        }
    }

    public class e extends AbstractSet {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f179469a;

        public e(r r1) {
            this.f179469a = r1;
        }

        public boolean a(Map.Entry r3) {
            if (contains(r3) == true) goto L6;
            this.f179469a.q((Comparable) r3.getKey(), r3.getValue());
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
            this.f179469a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object r3) {
            Map.Entry r32 = (Map.Entry) r3;
            Object r02 = this.f179469a.get(r32.getKey());
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
            return new d(this.f179469a, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object r2) {
            Map.Entry r22 = (Map.Entry) r2;
            if (contains(r22) == false) goto L6;
            this.f179469a.remove(r22.getKey());
            return true;
        L6:
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f179469a.size();
        }

        public /* synthetic */ e(r r1, a r2) {
            this(r1);
        }
    }

    public /* synthetic */ r(int r1, a r2) {
        this(r1);
    }

    public static /* synthetic */ void a(r r02) {
        r02.g();
    }

    public static /* synthetic */ List b(r r02) {
        return r02.f179458b;
    }

    public static /* synthetic */ Object d(r r02, int r1) {
        return r02.r(r1);
    }

    public static /* synthetic */ Map e(r r02) {
        return r02.f179459c;
    }

    public static r p(int r1) {
        return new a(r1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (this.f179458b.isEmpty() == true) goto L6;
        this.f179458b.clear();
    L6:
        if (this.f179459c.isEmpty() == true) goto L9;
        this.f179459c.clear();
        return;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object r2) {
        Comparable r22 = (Comparable) r2;
        if (f(r22) < 0) goto L5;
        return true;
    L5:
        if (this.f179459c.containsKey(r22) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f179460e != null) goto L6;
        this.f179460e = new e(this, null);
    L6:
        return this.f179460e;
    }

    public final int f(Comparable r5) {
        int r02 = this.f179458b.size();
        int r1 = r02 - 1;
        if (r1 < 0) goto L11;
        int r2 = r5.compareTo(((c) this.f179458b.get(r1)).c());
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
        int r3 = r5.compareTo(((c) this.f179458b.get(r22)).c());
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

    public final void g() {
        if (this.d == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object r2) {
        Comparable r22 = (Comparable) r2;
        int r02 = f(r22);
        if (r02 < 0) goto L7;
        return ((c) this.f179458b.get(r02)).getValue();
    L7:
        return this.f179459c.get(r22);
    }

    public final void h() {
        g();
        if (this.f179458b.isEmpty() == true) goto L5;
        return;
    L5:
        if ((this.f179458b instanceof ArrayList) == true) goto L9;
        this.f179458b = new ArrayList(this.f179457a);
        return;
    }

    public Map.Entry i(int r2) {
        return (Map.Entry) this.f179458b.get(r2);
    }

    public int j() {
        return this.f179458b.size();
    }

    public Iterable l() {
        if (this.f179459c.isEmpty() == false) goto L7;
        return b.b();
    L7:
        return this.f179459c.entrySet();
    }

    public final SortedMap m() {
        g();
        if (this.f179459c.isEmpty() == false) goto L8;
        if ((this.f179459c instanceof TreeMap) == true) goto L8;
        this.f179459c = new TreeMap();
    L8:
        return (SortedMap) this.f179459c;
    }

    public boolean n() {
        return this.d;
    }

    public void o() {
        if (this.d == false) goto L5;
        return;
    L5:
        if (this.f179459c.isEmpty() == false) goto L7;
        Map r02 = Collections.EMPTY_MAP;
    L8:
        this.f179459c = r02;
        this.d = true;
        return;
    L7:
        r02 = Collections.unmodifiableMap(this.f179459c);
        goto L8
    }

    public Object q(Comparable r5, Object r6) {
        g();
        int r02 = f(r5);
        if (r02 >= 0) goto L5;
        h();
        int r03 = -(r02 + 1);
        if (r03 >= this.f179457a) goto L9;
        int r1 = this.f179458b.size();
        int r2 = this.f179457a;
        if (r1 != r2) goto L13;
        c r12 = (c) this.f179458b.remove(r2 - 1);
        m().put(r12.c(), r12.getValue());
    L13:
        this.f179458b.add(r03, new c(this, r5, r6));
        return null;
    L9:
        return m().put(r5, r6);
    L5:
        return ((c) this.f179458b.get(r02)).setValue(r6);
    }

    public final Object r(int r5) {
        g();
        Object r52 = ((c) this.f179458b.remove(r5)).getValue();
        if (this.f179459c.isEmpty() == true) goto L5;
        Iterator r02 = m().entrySet().iterator();
        this.f179458b.add(new c(this, (Map.Entry) r02.next()));
        r02.remove();
    L5:
        return r52;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object r2) {
        g();
        Comparable r22 = (Comparable) r2;
        int r02 = f(r22);
        if (r02 < 0) goto L7;
        return r(r02);
    L7:
        if (this.f179459c.isEmpty() == false) goto L11;
        return null;
    L11:
        return this.f179459c.remove(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f179458b.size() + this.f179459c.size();
    }

    public r(int r1) {
        this.f179457a = r1;
        this.f179458b = Collections.EMPTY_LIST;
        this.f179459c = Collections.EMPTY_MAP;
    }
}
