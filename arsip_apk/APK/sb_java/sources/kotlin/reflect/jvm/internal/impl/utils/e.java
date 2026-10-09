package kotlin.reflect.jvm.internal.impl.utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class e extends AbstractList implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public int f180252a;

    /* renamed from: b, reason: collision with root package name */
    public Object f180253b;

    public static /* synthetic */ class a {
    }

    public static class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public static final b f180254a = null;

        static {
            f180254a = new b();
        }

        public b() {
        }

        public static b a() {
            return f180254a;
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
            throw new IllegalStateException();
        }
    }

    public class c extends d {

        /* renamed from: b, reason: collision with root package name */
        public final int f180255b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f180256c;

        public c(e r2) {
            this.f180256c = r2;
            super(null);
            this.f180255b = e.b(r2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.e.d
        public void a() {
            if (e.e(this.f180256c) != this.f180255b) goto L6;
            return;
        L6:
            throw new ConcurrentModificationException("ModCount: " + e.f(this.f180256c) + "; expected: " + this.f180255b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.e.d
        public Object b() {
            return e.d(this.f180256c);
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            this.f180256c.clear();
        }
    }

    public static abstract class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public boolean f180257a;

        public d() {
        }

        public abstract void a();

        public abstract Object b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f180257a;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f180257a == true) goto L7;
            this.f180257a = true;
            a();
            return b();
        L7:
            throw new NoSuchElementException();
        }

        public /* synthetic */ d(a r1) {
            this();
        }
    }

    public e() {
    }

    public static /* synthetic */ void a(int r10) {
        if (r10 == 2) goto L9;
        if (r10 == 3) goto L9;
        if (r10 == 5) goto L9;
        if (r10 == 6) goto L9;
        if (r10 == 7) goto L9;
        String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
    L10:
        if (r10 == 2) goto L16;
        if (r10 == 3) goto L16;
        if (r10 == 5) goto L16;
        if (r10 == 6) goto L16;
        if (r10 == 7) goto L16;
        int r6 = 3;
    L17:
        Object[] r62 = new Object[r6];
        switch(r10) {
            case 2: goto L21;
            case 3: goto L21;
            case 4: goto L20;
            case 5: goto L21;
            case 6: goto L21;
            case 7: goto L21;
            default: goto L19;
        };
    L19:
        r62[0] = "elements";
    L23:
        if (r10 == 2) goto L30;
        if (r10 == 3) goto L30;
        if (r10 == 5) goto L29;
        if (r10 == 6) goto L29;
        if (r10 == 7) goto L29;
        r62[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
    L31:
        switch(r10) {
            case 2: goto L34;
            case 3: goto L34;
            case 4: goto L33;
            case 5: goto L34;
            case 6: goto L34;
            case 7: goto L34;
            default: goto L32;
        };
    L32:
        r62[2] = "<init>";
        goto L34
    L33:
        r62[2] = "toArray";
    L34:
        String r52 = String.format(r5, r62);
        if (r10 == 2) goto L42;
        if (r10 == 3) goto L42;
        if (r10 == 5) goto L42;
        if (r10 == 6) goto L42;
        if (r10 == 7) goto L42;
        throw new IllegalArgumentException(r52);
    L42:
        throw new IllegalStateException(r52);
    L29:
        r62[1] = "toArray";
    L30:
        r62[1] = "iterator";
        goto L31
    L20:
        r62[0] = "a";
        goto L23
    L21:
        r62[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
    L16:
        r6 = 2;
    L9:
        r5 = "@NotNull method %s.%s must not return null";
        goto L10
    }

    public static /* synthetic */ int b(e r02) {
        return ((AbstractList) r02).modCount;
    }

    public static /* synthetic */ Object d(e r02) {
        return r02.f180253b;
    }

    public static /* synthetic */ int e(e r02) {
        return ((AbstractList) r02).modCount;
    }

    public static /* synthetic */ int f(e r02) {
        return ((AbstractList) r02).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object r6) {
        int r02 = this.f180252a;
        if (r02 != 0) goto L5;
        this.f180253b = r6;
    L14:
        this.f180252a++;
        ((AbstractList) this).modCount++;
        return true;
    L5:
        if (r02 != 1) goto L7;
        this.f180253b = new Object[]{this.f180253b, r6};
        goto L14
    L7:
        Object[] r2 = (Object[]) this.f180253b;
        int r3 = r2.length;
        if (r02 < r3) goto L13;
        int r4 = ((r3 * 3) / 2) + 1;
        int r03 = r02 + 1;
        if (r4 >= r03) goto L12;
        r4 = r03;
    L12:
        Object[] r04 = new Object[r4];
        this.f180253b = r04;
        System.arraycopy(r2, 0, r04, 0, r3);
        r2 = r04;
    L13:
        r2[this.f180252a] = r6;
        goto L14
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f180253b = null;
        this.f180252a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int r4) {
        if (r4 < 0) goto L12;
        int r02 = this.f180252a;
        if (r4 >= r02) goto L12;
        if (r02 != 1) goto L10;
        return this.f180253b;
    L10:
        return ((Object[]) this.f180253b)[r4];
    L12:
        throw new IndexOutOfBoundsException("Index: " + r4 + ", Size: " + this.f180252a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        int r02 = this.f180252a;
        if (r02 != 0) goto L9;
        b r03 = b.a();
        if (r03 != null) goto L7;
        a(2);
    L7:
        return r03;
    L9:
        if (r02 == 1) goto L11;
        Iterator r04 = super.iterator();
        if (r04 != null) goto L15;
        a(3);
    L15:
        return r04;
    L11:
        return new c(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int r7) {
        if (r7 < 0) goto L19;
        int r02 = this.f180252a;
        if (r7 >= r02) goto L19;
        if (r02 != 1) goto L8;
        Object r72 = this.f180253b;
        this.f180253b = null;
    L16:
        this.f180252a--;
        ((AbstractList) this).modCount++;
        return r72;
    L8:
        Object[] r3 = (Object[]) this.f180253b;
        Object r4 = r3[r7];
        if (r02 != 2) goto L11;
        this.f180253b = r3[1 - r7];
    L15:
        r72 = r4;
        goto L16
    L11:
        int r03 = (r02 - r7) - 1;
        if (r03 <= 0) goto L14;
        System.arraycopy(r3, r7 + 1, r3, r7, r03);
    L14:
        r3[this.f180252a - 1] = null;
    L19:
        throw new IndexOutOfBoundsException("Index: " + r7 + ", Size: " + this.f180252a);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int r3, Object r4) {
        if (r3 < 0) goto L12;
        int r02 = this.f180252a;
        if (r3 >= r02) goto L12;
        if (r02 != 1) goto L9;
        Object r32 = this.f180253b;
        this.f180253b = r4;
        return r32;
    L9:
        Object[] r03 = (Object[]) this.f180253b;
        Object r1 = r03[r3];
        r03[r3] = r4;
        return r1;
    L12:
        throw new IndexOutOfBoundsException("Index: " + r3 + ", Size: " + this.f180252a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f180252a;
    }

    @Override // java.util.List
    public void sort(Comparator r4) {
        int r02 = this.f180252a;
        if (r02 < 2) goto L6;
        Arrays.sort((Object[]) this.f180253b, 0, r02, r4);
        return;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] r5) {
        if (r5 != null) goto L4;
        a(4);
    L4:
        int r02 = r5.length;
        int r1 = this.f180252a;
        if (r1 != 1) goto L10;
        if (r02 == 0) goto L8;
        r5[0] = this.f180253b;
    L17:
        int r12 = this.f180252a;
        if (r02 <= r12) goto L20;
        r5[r12] = null;
    L20:
        return r5;
    L8:
        Object[] r52 = (Object[]) Array.newInstance(r5.getClass().getComponentType(), 1);
        r52[0] = this.f180253b;
        return r52;
    L10:
        if (r02 >= r1) goto L15;
        Object[] r53 = Arrays.copyOf((Object[]) this.f180253b, r1, r5.getClass());
        if (r53 != null) goto L14;
        a(6);
    L14:
        return r53;
    L15:
        if (r1 == 0) goto L17;
        System.arraycopy(this.f180253b, 0, r5, 0, r1);
        goto L17
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r6, Object r7) {
        if (r6 < 0) goto L19;
        int r02 = this.f180252a;
        if (r6 > r02) goto L19;
        if (r02 != 0) goto L8;
        this.f180253b = r7;
    L16:
        this.f180252a++;
        ((AbstractList) this).modCount++;
        return;
    L8:
        if (r02 != 1) goto L11;
        if (r6 != 0) goto L11;
        this.f180253b = new Object[]{r7, this.f180253b};
    L11:
        Object[] r2 = new Object[r02 + 1];
        if (r02 != 1) goto L14;
        r2[0] = this.f180253b;
    L15:
        r2[r6] = r7;
        this.f180253b = r2;
        goto L16
    L14:
        Object[] r03 = (Object[]) this.f180253b;
        System.arraycopy(r03, 0, r2, 0, r6);
        System.arraycopy(r03, r6, r2, r6 + 1, this.f180252a - r6);
    L19:
        throw new IndexOutOfBoundsException("Index: " + r6 + ", Size: " + this.f180252a);
    }
}
