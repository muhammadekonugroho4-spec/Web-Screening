package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class s extends AbstractList implements RandomAccess, k {

    /* renamed from: a, reason: collision with root package name */
    public final k f179470a;

    public class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        public ListIterator f179471a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f179472b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f179473c;

        public a(s r1, int r2) {
            this.f179473c = r1;
            this.f179472b = r2;
            this.f179471a = s.a(r1).listIterator(r2);
        }

        public void a(String r1) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object r1) {
            a((String) r1);
        }

        public String b() {
            return (String) this.f179471a.next();
        }

        public String c() {
            return (String) this.f179471a.previous();
        }

        public void d(String r1) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f179471a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f179471a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return b();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f179471a.nextIndex();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ Object previous() {
            return c();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f179471a.previousIndex();
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
        public Iterator f179474a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f179475b;

        public b(s r1) {
            this.f179475b = r1;
            this.f179474a = s.a(r1).iterator();
        }

        public String a() {
            return (String) this.f179474a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f179474a.hasNext();
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

    public s(k r1) {
        this.f179470a = r1;
    }

    public static /* synthetic */ k a(s r02) {
        return r02.f179470a;
    }

    public String b(int r2) {
        return (String) this.f179470a.get(r2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.k
    public void d1(d r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int r1) {
        return b(r1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.k
    public d getByteString(int r2) {
        return this.f179470a.getByteString(r2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.k
    public List getUnderlyingElements() {
        return this.f179470a.getUnderlyingElements();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.k
    public k getUnmodifiableView() {
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
        return this.f179470a.size();
    }
}
