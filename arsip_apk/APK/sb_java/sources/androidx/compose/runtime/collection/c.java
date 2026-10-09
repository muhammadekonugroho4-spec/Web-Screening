package androidx.compose.runtime.collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.collections.AbstractC11772p;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c implements RandomAccess {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f16154a;

    /* renamed from: b, reason: collision with root package name */
    public List f16155b;

    /* renamed from: c, reason: collision with root package name */
    public int f16156c;

    public static final class a implements List, kotlin.jvm.internal.markers.d {

        /* renamed from: a, reason: collision with root package name */
        public final c f16157a;

        public a(c r1) {
            this.f16157a = r1;
        }

        public Object a(int r2) {
            d.a(this, r2);
            return this.f16157a.r(r2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object r2) {
            return this.f16157a.b(r2);
        }

        @Override // java.util.List
        public boolean addAll(int r2, Collection r3) {
            return this.f16157a.d(r2, r3);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f16157a.h();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object r2) {
            return this.f16157a.i(r2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection r2) {
            return this.f16157a.j(r2);
        }

        @Override // java.util.List
        public Object get(int r2) {
            d.a(this, r2);
            return this.f16157a.f16154a[r2];
        }

        public int getSize() {
            return this.f16157a.l();
        }

        @Override // java.util.List
        public int indexOf(Object r2) {
            return this.f16157a.m(r2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.f16157a.l() != 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C0111c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object r2) {
            return this.f16157a.o(r2);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C0111c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int r1) {
            return a(r1);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection r2) {
            return this.f16157a.q(r2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection r2) {
            return this.f16157a.u(r2);
        }

        @Override // java.util.List
        public Object set(int r2, Object r3) {
            d.a(this, r2);
            return this.f16157a.v(r2, r3);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List subList(int r2, int r3) {
            d.b(this, r2, r3);
            return new b(this, r2, r3);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return h.a(this);
        }

        @Override // java.util.List
        public void add(int r2, Object r3) {
            this.f16157a.a(r2, r3);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection r2) {
            return this.f16157a.f(r2);
        }

        @Override // java.util.List
        public ListIterator listIterator(int r2) {
            return new C0111c(this, r2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object r2) {
            return this.f16157a.p(r2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] r1) {
            return h.b(this, r1);
        }
    }

    public static final class b implements List, kotlin.jvm.internal.markers.d {

        /* renamed from: a, reason: collision with root package name */
        public final List f16158a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16159b;

        /* renamed from: c, reason: collision with root package name */
        public int f16160c;

        public b(List r1, int r2, int r3) {
            this.f16158a = r1;
            this.f16159b = r2;
            this.f16160c = r3;
        }

        public Object a(int r3) {
            d.a(this, r3);
            this.f16160c--;
            return this.f16158a.remove(r3 + this.f16159b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object r4) {
            List r02 = this.f16158a;
            int r1 = this.f16160c;
            this.f16160c = r1 + 1;
            r02.add(r1, r4);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int r3, Collection r4) {
            this.f16158a.addAll(r3 + this.f16159b, r4);
            int r32 = r4.size();
            this.f16160c += r32;
            if (r32 <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int r02 = this.f16160c - 1;
            int r1 = this.f16159b;
            if (r1 > r02) goto L7;
        L4:
            this.f16158a.remove(r02);
            if (r02 == r1) goto L7;
            r02 = r02 - 1;
        L7:
            this.f16160c = this.f16159b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object r4) {
            int r02 = this.f16159b;
            int r1 = this.f16160c;
        L3:
            if (r02 >= r1) goto L9;
            if (p.g(this.f16158a.get(r02), r4) == true) goto L6;
            r02 = r02 + 1;
            goto L3
        L6:
            return true;
        L9:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection r2) {
            Iterator r22 = r2.iterator();
        L4:
            if (r22.hasNext() == false) goto L9;
            if (contains(r22.next()) == true) goto L4;
            return false;
        L9:
            return true;
        }

        @Override // java.util.List
        public Object get(int r3) {
            d.a(this, r3);
            return this.f16158a.get(r3 + this.f16159b);
        }

        public int getSize() {
            return this.f16160c - this.f16159b;
        }

        @Override // java.util.List
        public int indexOf(Object r4) {
            int r02 = this.f16159b;
            int r1 = this.f16160c;
        L3:
            if (r02 >= r1) goto L9;
            if (p.g(this.f16158a.get(r02), r4) == true) goto L7;
            r02 = r02 + 1;
            goto L3
        L7:
            return r02 - this.f16159b;
        L9:
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.f16160c != this.f16159b) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C0111c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object r4) {
            int r02 = this.f16160c - 1;
            int r1 = this.f16159b;
            if (r1 <= r02) goto L5;
            return -1;
        L5:
            if (p.g(this.f16158a.get(r02), r4) == true) goto L7;
            if (r02 == r1) goto L14;
            r02 = r02 - 1;
            goto L5
        L14:
            return -1;
        L7:
            return r02 - this.f16159b;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C0111c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int r1) {
            return a(r1);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection r3) {
            int r02 = this.f16160c;
            Iterator r32 = r3.iterator();
        L4:
            if (r32.hasNext() == false) goto L7;
            remove(r32.next());
            goto L4
        L7:
            if (r02 == this.f16160c) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection r5) {
            int r02 = this.f16160c;
            int r1 = r02 - 1;
            int r2 = this.f16159b;
            if (r2 > r1) goto L10;
        L5:
            if (r5.contains(this.f16158a.get(r1)) == true) goto L7;
            this.f16158a.remove(r1);
            this.f16160c--;
        L7:
            if (r1 == r2) goto L10;
            r1 = r1 - 1;
        L10:
            if (r02 == this.f16160c) goto L13;
            return true;
        L13:
            return false;
        }

        @Override // java.util.List
        public Object set(int r3, Object r4) {
            d.a(this, r3);
            return this.f16158a.set(r3 + this.f16159b, r4);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List subList(int r2, int r3) {
            d.b(this, r2, r3);
            return new b(this, r2, r3);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return h.a(this);
        }

        @Override // java.util.List
        public void add(int r3, Object r4) {
            this.f16158a.add(r3 + this.f16159b, r4);
            this.f16160c++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int r2) {
            return new C0111c(this, r2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object r4) {
            int r02 = this.f16159b;
            int r1 = this.f16160c;
        L3:
            if (r02 >= r1) goto L9;
            if (p.g(this.f16158a.get(r02), r4) == true) goto L6;
            r02 = r02 + 1;
            goto L3
        L6:
            this.f16158a.remove(r02);
            this.f16160c--;
            return true;
        L9:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] r1) {
            return h.b(this, r1);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection r3) {
            this.f16158a.addAll(this.f16160c, r3);
            int r32 = r3.size();
            this.f16160c += r32;
            if (r32 <= 0) goto L6;
            return true;
        L6:
            return false;
        }
    }

    /* renamed from: androidx.compose.runtime.collection.c$c, reason: collision with other inner class name */
    public static final class C0111c implements ListIterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public final List f16161a;

        /* renamed from: b, reason: collision with root package name */
        public int f16162b;

        public C0111c(List r1, int r2) {
            this.f16161a = r1;
            this.f16162b = r2;
        }

        @Override // java.util.ListIterator
        public void add(Object r3) {
            this.f16161a.add(this.f16162b, r3);
            this.f16162b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f16162b >= this.f16161a.size()) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f16162b <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List r02 = this.f16161a;
            int r1 = this.f16162b;
            this.f16162b = r1 + 1;
            return r02.get(r1);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f16162b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int r02 = this.f16162b - 1;
            this.f16162b = r02;
            return this.f16161a.get(r02);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f16162b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int r02 = this.f16162b - 1;
            this.f16162b = r02;
            this.f16161a.remove(r02);
        }

        @Override // java.util.ListIterator
        public void set(Object r3) {
            this.f16161a.set(this.f16162b, r3);
        }
    }

    static {
    }

    public c(Object[] r1, int r2) {
        this.f16154a = r1;
        this.f16156c = r2;
    }

    public final void a(int r4, Object r5) {
        int r02 = this.f16156c + 1;
        if (this.f16154a.length >= r02) goto L5;
        t(r02);
    L5:
        Object[] r03 = this.f16154a;
        int r1 = this.f16156c;
        if (r4 == r1) goto L8;
        System.arraycopy(r03, r4, r03, r4 + 1, r1 - r4);
    L8:
        r03[r4] = r5;
        this.f16156c++;
    }

    public final boolean b(Object r4) {
        int r02 = this.f16156c + 1;
        if (this.f16154a.length >= r02) goto L5;
        t(r02);
    L5:
        Object[] r03 = this.f16154a;
        int r2 = this.f16156c;
        r03[r2] = r4;
        this.f16156c = r2 + 1;
        return true;
    }

    public final boolean c(int r6, c r7) {
        int r02 = r7.f16156c;
        if (r02 != 0) goto L5;
        return false;
    L5:
        int r2 = this.f16156c + r02;
        if (this.f16154a.length >= r2) goto L8;
        t(r2);
    L8:
        Object[] r22 = this.f16154a;
        int r3 = this.f16156c;
        if (r6 == r3) goto L11;
        System.arraycopy(r22, r6, r22, r6 + r02, r3 - r6);
    L11:
        System.arraycopy(r7.f16154a, 0, r22, r6, r02);
        this.f16156c += r02;
        return true;
    }

    public final boolean d(int r6, Collection r7) {
        int r1 = 0;
        if (r7.isEmpty() == false) goto L5;
        return false;
    L5:
        int r02 = r7.size();
        int r2 = this.f16156c + r02;
        if (this.f16154a.length >= r2) goto L8;
        t(r2);
    L8:
        Object[] r22 = this.f16154a;
        int r3 = this.f16156c;
        if (r6 == r3) goto L11;
        System.arraycopy(r22, r6, r22, r6 + r02, r3 - r6);
    L11:
        Iterator r72 = r7.iterator();
    L13:
        if (r72.hasNext() == false) goto L18;
        Object r32 = r72.next();
        int r4 = r1 + 1;
        if (r1 >= 0) goto L17;
        AbstractC11777v.y();
    L17:
        r22[r1 + r6] = r32;
        r1 = r4;
        goto L13
    L18:
        this.f16156c += r02;
        return true;
    }

    public final boolean e(int r7, List r8) {
        int r1 = 0;
        if (r8.isEmpty() == false) goto L5;
        return false;
    L5:
        int r02 = r8.size();
        int r2 = this.f16156c + r02;
        if (this.f16154a.length >= r2) goto L8;
        t(r2);
    L8:
        Object[] r22 = this.f16154a;
        int r3 = this.f16156c;
        if (r7 == r3) goto L11;
        System.arraycopy(r22, r7, r22, r7 + r02, r3 - r7);
    L11:
        int r32 = r8.size();
    L12:
        if (r1 >= r32) goto L14;
        r22[r7 + r1] = r8.get(r1);
        r1 = r1 + 1;
        goto L12
    L14:
        this.f16156c += r02;
        return true;
    }

    public final boolean f(Collection r2) {
        return d(this.f16156c, r2);
    }

    public final List g() {
        List r02 = this.f16155b;
        if (r02 != null) goto L6;
        a r03 = new a(this);
        this.f16155b = r03;
        return r03;
    L6:
        return r02;
    }

    public final void h() {
        Object[] r02 = this.f16154a;
        int r1 = this.f16156c;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r02[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.f16156c = 0;
    }

    public final boolean i(Object r6) {
        int r02 = l() - 1;
        if (r02 < 0) goto L10;
        int r3 = 0;
    L6:
        if (p.g(this.f16154a[r3], r6) == true) goto L7;
        if (r3 == r02) goto L10;
        r3 = r3 + 1;
        goto L6
    L7:
        return true;
    L10:
        return false;
    }

    public final boolean j(Collection r2) {
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        if (i(r22.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    public final Object k() {
        if (l() != 0) goto L5;
        y("MutableVector is empty.");
        throw new KotlinNothingValueException();
    L5:
        return this.f16154a[0];
    }

    public final int l() {
        return this.f16156c;
    }

    public final int m(Object r5) {
        Object[] r02 = this.f16154a;
        int r1 = this.f16156c;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        if (p.g(r5, r02[r2]) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r2;
    L8:
        return -1;
    }

    public final Object n() {
        if (l() != 0) goto L5;
        y("MutableVector is empty.");
        throw new KotlinNothingValueException();
    L5:
        return this.f16154a[l() - 1];
    }

    public final int o(Object r4) {
        int r02 = this.f16156c - 1;
        Object[] r1 = this.f16154a;
    L3:
        if (r02 < 0) goto L8;
        if (p.g(r4, r1[r02]) == true) goto L6;
        r02 = r02 - 1;
        goto L3
    L6:
        return r02;
    L8:
        return -1;
    }

    public final boolean p(Object r1) {
        int r12 = m(r1);
        if (r12 < 0) goto L6;
        r(r12);
        return true;
    L6:
        return false;
    }

    public final boolean q(Collection r4) {
        if (r4.isEmpty() == false) goto L5;
        return false;
    L5:
        int r02 = this.f16156c;
        Iterator r42 = r4.iterator();
    L7:
        if (r42.hasNext() == false) goto L10;
        p(r42.next());
        goto L7
    L10:
        if (r02 == this.f16156c) goto L13;
        return true;
    L13:
        return false;
    }

    public final Object r(int r5) {
        Object[] r02 = this.f16154a;
        Object r1 = r02[r5];
        if (r5 == (l() - 1)) goto L5;
        int r2 = r5 + 1;
        System.arraycopy(r02, r2, r02, r5, this.f16156c - r2);
    L5:
        int r52 = this.f16156c - 1;
        this.f16156c = r52;
        r02[r52] = null;
        return r1;
    }

    public final void s(int r4, int r5) {
        if (r5 <= r4) goto L15;
        int r02 = this.f16156c;
        if (r5 >= r02) goto L6;
        Object[] r1 = this.f16154a;
        System.arraycopy(r1, r5, r1, r4, r02 - r5);
    L6:
        int r03 = this.f16156c - (r5 - r4);
        int r42 = l() - 1;
        if (r03 > r42) goto L12;
        int r52 = r03;
    L9:
        this.f16154a[r52] = null;
        if (r52 == r42) goto L12;
        r52 = r52 + 1;
    L12:
        this.f16156c = r03;
        return;
    }

    public final void t(int r4) {
        Object[] r02 = this.f16154a;
        int r1 = r02.length;
        Object[] r42 = new Object[Math.max(r4, r1 * 2)];
        System.arraycopy(r02, 0, r42, 0, r1);
        this.f16154a = r42;
    }

    public final boolean u(Collection r5) {
        int r02 = this.f16156c;
        int r1 = l() - 1;
    L4:
        if ((-1) >= r1) goto L10;
        if (r5.contains(this.f16154a[r1]) == true) goto L8;
        r(r1);
    L8:
        r1 = r1 - 1;
        goto L4
    L10:
        if (r02 == this.f16156c) goto L12;
        return true;
    L12:
        return false;
    }

    public final Object v(int r3, Object r4) {
        Object[] r02 = this.f16154a;
        Object r1 = r02[r3];
        r02[r3] = r4;
        return r1;
    }

    public final void w(int r1) {
        this.f16156c = r1;
    }

    public final void x(Comparator r4) {
        AbstractC11772p.U(this.f16154a, r4, 0, this.f16156c);
    }

    public final Void y(String r2) {
        throw new NoSuchElementException(r2);
    }
}
