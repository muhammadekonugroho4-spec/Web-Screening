package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11760d extends AbstractC11758b implements List, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f177382a = null;

    /* renamed from: kotlin.collections.d$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final void a(int r4, int r5, int r6) {
            if (r4 < 0) goto L10;
            if (r5 > r6) goto L10;
            if (r4 > r5) goto L8;
            return;
        L8:
            throw new IllegalArgumentException("startIndex: " + r4 + " > endIndex: " + r5);
        L10:
            throw new IndexOutOfBoundsException("startIndex: " + r4 + ", endIndex: " + r5 + ", size: " + r6);
        }

        public final void b(int r4, int r5) {
            if (r4 < 0) goto L6;
            if (r4 >= r5) goto L6;
            return;
        L6:
            throw new IndexOutOfBoundsException("index: " + r4 + ", size: " + r5);
        }

        public final void c(int r4, int r5) {
            if (r4 < 0) goto L6;
            if (r4 > r5) goto L6;
            return;
        L6:
            throw new IndexOutOfBoundsException("index: " + r4 + ", size: " + r5);
        }

        public final void d(int r4, int r5, int r6) {
            if (r4 < 0) goto L10;
            if (r5 > r6) goto L10;
            if (r4 > r5) goto L8;
            return;
        L8:
            throw new IllegalArgumentException("fromIndex: " + r4 + " > toIndex: " + r5);
        L10:
            throw new IndexOutOfBoundsException("fromIndex: " + r4 + ", toIndex: " + r5 + ", size: " + r6);
        }

        public final int e(int r3, int r4) {
            int r32 = r3 + (r3 >> 1);
            if ((r32 - r4) >= 0) goto L6;
            r32 = r4;
        L6:
            if ((r32 - 2147483639) <= 0) goto L11;
            if (r4 <= 2147483639) goto L10;
            return Integer.MAX_VALUE;
        L10:
            return 2147483639;
        L11:
            return r32;
        }

        public final boolean f(Collection r4, Collection r5) {
            kotlin.jvm.internal.p.l(r4, "c");
            kotlin.jvm.internal.p.l(r5, "other");
            if (r4.size() == r5.size()) goto L5;
            return false;
        L5:
            Iterator r52 = r5.iterator();
            Iterator r42 = r4.iterator();
        L7:
            if (r42.hasNext() == false) goto L11;
            if (kotlin.jvm.internal.p.g(r42.next(), r52.next()) == true) goto L7;
            return false;
        L11:
            return true;
        }

        public final int g(Collection r3) {
            kotlin.jvm.internal.p.l(r3, "c");
            Iterator r32 = r3.iterator();
            int r02 = 1;
        L4:
            if (r32.hasNext() == false) goto L10;
            Object r1 = r32.next();
            int r03 = r02 * 31;
            if (r1 == null) goto L8;
            int r12 = r1.hashCode();
        L9:
            r02 = r03 + r12;
            goto L4
        L8:
            r12 = 0;
            goto L9
        L10:
            return r02;
        }

        public a() {
        }
    }

    /* renamed from: kotlin.collections.d$b */
    public class b implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public int f177383a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC11760d f177384b;

        public b(AbstractC11760d r1) {
            this.f177384b = r1;
        }

        public final int a() {
            return this.f177383a;
        }

        public final void b(int r1) {
            this.f177383a = r1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f177383a >= this.f177384b.size()) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext() == false) goto L7;
            AbstractC11760d r02 = this.f177384b;
            int r1 = this.f177383a;
            this.f177383a = r1 + 1;
            return r02.get(r1);
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.d$c */
    public class c extends b implements ListIterator, kotlin.jvm.internal.markers.a {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC11760d f177385c;

        public c(AbstractC11760d r2, int r3) {
            this.f177385c = r2;
            super(r2);
            AbstractC11760d.f177382a.c(r3, r2.size());
            b(r3);
        }

        @Override // java.util.ListIterator
        public void add(Object r2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (a() <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (hasPrevious() == false) goto L7;
            AbstractC11760d r02 = this.f177385c;
            b(a() - 1);
            return r02.get(a());
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object r2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    public static final class C1861d extends AbstractC11760d implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC11760d f177386b;

        /* renamed from: c, reason: collision with root package name */
        public final int f177387c;
        public int d;

        public C1861d(AbstractC11760d r2, int r3, int r4) {
            kotlin.jvm.internal.p.l(r2, "list");
            this.f177386b = r2;
            this.f177387c = r3;
            AbstractC11760d.f177382a.d(r3, r4, r2.size());
            this.d = r4 - r3;
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List
        public Object get(int r3) {
            AbstractC11760d.f177382a.b(r3, this.d);
            return this.f177386b.get(this.f177387c + r3);
        }

        @Override // kotlin.collections.AbstractC11758b
        public int getSize() {
            return this.d;
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.c
        public List subList(int r4, int r5) {
            AbstractC11760d.f177382a.d(r4, r5, this.d);
            AbstractC11760d r1 = this.f177386b;
            int r2 = this.f177387c;
            return new C1861d(r1, r4 + r2, r2 + r5);
        }
    }

    static {
        f177382a = new a(null);
    }

    public AbstractC11760d() {
    }

    @Override // java.util.List
    public void add(int r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int r1, Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof List) == true) goto L10;
        return false;
    L10:
        return f177382a.f(this, (Collection) r2);
    }

    public abstract Object get(int r1);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f177382a.g(this);
    }

    public int indexOf(Object r4) {
        Iterator r02 = iterator();
        int r1 = 0;
    L4:
        if (r02.hasNext() == false) goto L9;
        if (kotlin.jvm.internal.p.g(r02.next(), r4) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return r1;
    L9:
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b(this);
    }

    public int lastIndexOf(Object r3) {
        ListIterator r02 = listIterator(size());
    L4:
        if (r02.hasPrevious() == false) goto L9;
        if (kotlin.jvm.internal.p.g(r02.previous(), r3) == false) goto L4;
        return r02.nextIndex();
    L9:
        return -1;
    }

    public ListIterator listIterator() {
        return new c(this, 0);
    }

    @Override // java.util.List
    public Object remove(int r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int r2, int r3) {
        return new C1861d(this, r2, r3);
    }

    public ListIterator listIterator(int r2) {
        return new c(this, r2);
    }
}
