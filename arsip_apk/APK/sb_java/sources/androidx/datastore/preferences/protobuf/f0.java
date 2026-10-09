package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class f0 extends AbstractList implements InterfaceC3933x, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3933x f23811a;

    public class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        public ListIterator f23812a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23813b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f0 f23814c;

        public a(f0 r1, int r2) {
            this.f23814c = r1;
            this.f23813b = r2;
            this.f23812a = f0.a(r1).listIterator(r2);
        }

        public void a(String r1) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object r1) {
            a((String) r1);
        }

        public String b() {
            return (String) this.f23812a.next();
        }

        public String c() {
            return (String) this.f23812a.previous();
        }

        public void d(String r1) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23812a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23812a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return b();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23812a.nextIndex();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ Object previous() {
            return c();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f23812a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object r1) {
            d((String) r1);
        }
    }

    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public Iterator f23815a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f23816b;

        public b(f0 r1) {
            this.f23816b = r1;
            this.f23815a = f0.a(r1).iterator();
        }

        public String a() {
            return (String) this.f23815a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23815a.hasNext();
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public f0(InterfaceC3933x r1) {
        this.f23811a = r1;
    }

    public static /* synthetic */ InterfaceC3933x a(f0 r02) {
        return r02.f23811a;
    }

    public String b(int r2) {
        return (String) this.f23811a.get(r2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3933x
    public void c0(ByteString r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int r1) {
        return b(r1);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3933x
    public Object getRaw(int r2) {
        return this.f23811a.getRaw(r2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3933x
    public List getUnderlyingElements() {
        return this.f23811a.getUnderlyingElements();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3933x
    public InterfaceC3933x getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int r2) {
        return new a(this, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23811a.size();
    }
}
