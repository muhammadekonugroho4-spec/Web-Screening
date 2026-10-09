package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* loaded from: classes3.dex */
public class q extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f179445h = null;

    /* renamed from: b, reason: collision with root package name */
    public final int f179446b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.protobuf.d f179447c;
    public final kotlin.reflect.jvm.internal.impl.protobuf.d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f179448e;

    /* renamed from: f, reason: collision with root package name */
    public final int f179449f;

    /* renamed from: g, reason: collision with root package name */
    public int f179450g;

    public static /* synthetic */ class a {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Stack f179451a;

        public b() {
            this.f179451a = new Stack();
        }

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.d a(b r02, kotlin.reflect.jvm.internal.impl.protobuf.d r1, kotlin.reflect.jvm.internal.impl.protobuf.d r2) {
            return r02.b(r1, r2);
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d r3, kotlin.reflect.jvm.internal.impl.protobuf.d r4) {
            c(r3);
            c(r4);
            kotlin.reflect.jvm.internal.impl.protobuf.d r32 = (kotlin.reflect.jvm.internal.impl.protobuf.d) this.f179451a.pop();
        L4:
            if (this.f179451a.isEmpty() == true) goto L6;
            r32 = new q((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f179451a.pop(), r32, null);
            goto L4
        L6:
            return r32;
        }

        public final void c(kotlin.reflect.jvm.internal.impl.protobuf.d r4) {
            if (r4.l() == false) goto L7;
            e(r4);
            return;
        L7:
            if ((r4 instanceof q) == false) goto L10;
            q r42 = (q) r4;
            c(q.w(r42));
            c(q.y(r42));
            return;
        L10:
            String r43 = String.valueOf(r4.getClass());
            StringBuilder r1 = new StringBuilder(r43.length() + 49);
            r1.append("Has a new type of ByteString been created? Found ");
            r1.append(r43);
            throw new IllegalArgumentException(r1.toString());
        }

        public final int d(int r2) {
            int r22 = Arrays.binarySearch(q.z(), r2);
            if (r22 < 0) goto L5;
            return r22;
        L5:
            return (-(r22 + 1)) - 1;
        }

        public final void e(kotlin.reflect.jvm.internal.impl.protobuf.d r6) {
            int r02 = d(r6.size());
            int r1 = q.z()[r02 + 1];
            if (this.f179451a.isEmpty() == false) goto L5;
        L21:
            this.f179451a.push(r6);
            return;
        L5:
            if (((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f179451a.peek()).size() >= r1) goto L21;
            int r03 = q.z()[r02];
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = (kotlin.reflect.jvm.internal.impl.protobuf.d) this.f179451a.pop();
        L8:
            a r3 = null;
            if (this.f179451a.isEmpty() == true) goto L13;
            if (((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f179451a.peek()).size() >= r03) goto L13;
            r12 = new q((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f179451a.pop(), r12, r3);
        L13:
            q r04 = new q(r12, r6, r3);
        L15:
            if (this.f179451a.isEmpty() == true) goto L19;
            int r62 = d(r04.size());
            int r63 = q.z()[r62 + 1];
            if (((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f179451a.peek()).size() >= r63) goto L19;
            r04 = new q((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f179451a.pop(), r04, r3);
        L19:
            this.f179451a.push(r04);
        }

        public /* synthetic */ b(a r1) {
            this();
        }
    }

    public static class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final Stack f179452a;

        /* renamed from: b, reason: collision with root package name */
        public l f179453b;

        public /* synthetic */ c(kotlin.reflect.jvm.internal.impl.protobuf.d r1, a r2) {
            this(r1);
        }

        public final l a(kotlin.reflect.jvm.internal.impl.protobuf.d r2) {
        L3:
            if ((r2 instanceof q) == false) goto L6;
            q r22 = (q) r2;
            this.f179452a.push(r22);
            r2 = q.w(r22);
            goto L3
        L6:
            return (l) r2;
        }

        public final l b() {
        L3:
            if (this.f179452a.isEmpty() == true) goto L4;
            l r02 = a(q.y((q) this.f179452a.pop()));
            if (r02.isEmpty() == true) goto L3;
            return r02;
        L4:
            return null;
        }

        public l c() {
            l r02 = this.f179453b;
            if (r02 == null) goto L7;
            this.f179453b = b();
            return r02;
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f179453b == null) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(kotlin.reflect.jvm.internal.impl.protobuf.d r2) {
            this.f179452a = new Stack();
            this.f179453b = a(r2);
        }
    }

    public class d implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final c f179454a;

        /* renamed from: b, reason: collision with root package name */
        public d.a f179455b;

        /* renamed from: c, reason: collision with root package name */
        public int f179456c;
        public final /* synthetic */ q d;

        public /* synthetic */ d(q r1, a r2) {
            this(r1);
        }

        public Byte a() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f179456c <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte nextByte() {
            if (this.f179455b.hasNext() == true) goto L5;
            this.f179455b = this.f179454a.c().A();
        L5:
            this.f179456c--;
            return this.f179455b.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public d(q r3) {
            this.d = r3;
            c r02 = new c(r3, null);
            this.f179454a = r02;
            this.f179455b = r02.c().A();
            this.f179456c = r3.size();
        }
    }

    static {
        ArrayList r02 = new ArrayList();
        int r1 = 1;
        int r2 = 1;
    L3:
        if (r1 <= 0) goto L5;
        r02.add(Integer.valueOf(r1));
        int r22 = r2 + r1;
        r2 = r1;
        r1 = r22;
        goto L3
    L5:
        r02.add(Integer.MAX_VALUE);
        f179445h = new int[r02.size()];
        int r12 = 0;
    L6:
        int[] r23 = f179445h;
        if (r12 >= r23.length) goto L9;
        r23[r12] = ((Integer) r02.get(r12)).intValue();
        r12 = r12 + 1;
        goto L6
    }

    public /* synthetic */ q(kotlin.reflect.jvm.internal.impl.protobuf.d r1, kotlin.reflect.jvm.internal.impl.protobuf.d r2, a r3) {
        this(r1, r2);
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.d A(kotlin.reflect.jvm.internal.impl.protobuf.d r6, kotlin.reflect.jvm.internal.impl.protobuf.d r7) {
        a r1 = null;
        if ((r6 instanceof q) == false) goto L5;
        q r02 = (q) r6;
    L7:
        if (r7.size() != 0) goto L10;
        return r6;
    L10:
        if (r6.size() != 0) goto L12;
        return r7;
    L12:
        int r2 = r6.size() + r7.size();
        if (r2 < 128) goto L15;
        if (r02 != null) goto L18;
    L21:
        if (r02 == null) goto L29;
        if (r02.f179447c.k() <= r02.d.k()) goto L29;
        if (r02.k() <= r7.k()) goto L29;
        return new q(r02.f179447c, new q(r02.d, r7));
    L29:
        if (r2 < f179445h[Math.max(r6.k(), r7.k()) + 1]) goto L33;
        return new q(r6, r7);
    L33:
        return b.a(new b(r1), r6, r7);
    L18:
        if ((r02.d.size() + r7.size()) >= 128) goto L21;
        return new q(r02.f179447c, B(r02.d, r7));
    L15:
        return B(r6, r7);
    L5:
        r02 = null;
        goto L7
    }

    public static l B(kotlin.reflect.jvm.internal.impl.protobuf.d r4, kotlin.reflect.jvm.internal.impl.protobuf.d r5) {
        int r02 = r4.size();
        int r1 = r5.size();
        byte[] r2 = new byte[r02 + r1];
        r4.h(r2, 0, 0, r02);
        r5.h(r2, 0, r02, r1);
        return new l(r2);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.d w(q r02) {
        return r02.f179447c;
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.d y(q r02) {
        return r02.d;
    }

    public static /* synthetic */ int[] z() {
        return f179445h;
    }

    public final boolean C(kotlin.reflect.jvm.internal.impl.protobuf.d r12) {
        a r1 = null;
        c r02 = new c(this, r1);
        l r2 = (l) r02.next();
        c r3 = new c(r12, r1);
        l r122 = (l) r3.next();
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
    L3:
        int r7 = r2.size() - r4;
        int r8 = r122.size() - r5;
        int r9 = Math.min(r7, r8);
        if (r4 != 0) goto L6;
        boolean r10 = r2.w(r122, r5, r9);
    L7:
        if (r10 == false) goto L8;
        r6 = r6 + r9;
        int r102 = this.f179446b;
        if (r6 >= r102) goto L11;
        if (r9 != r7) goto L18;
        r2 = (l) r02.next();
        r4 = 0;
    L19:
        if (r9 == r8) goto L20;
        r5 = r5 + r9;
        goto L3
    L20:
        r122 = (l) r3.next();
        r5 = 0;
        goto L3
    L18:
        r4 = r4 + r9;
        goto L19
    L11:
        if (r6 != r102) goto L15;
        return true;
    L15:
        throw new IllegalStateException();
    L8:
        return false;
    L6:
        r10 = r122.w(r2, r4, r9);
        goto L7
    }

    public d.a D() {
        return new d(this, null);
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d) == true) goto L8;
        return false;
    L8:
        kotlin.reflect.jvm.internal.impl.protobuf.d r52 = (kotlin.reflect.jvm.internal.impl.protobuf.d) r5;
        if (this.f179446b == r52.size()) goto L12;
        return false;
    L12:
        if (this.f179446b != 0) goto L15;
        return true;
    L15:
        if (this.f179450g == 0) goto L22;
        int r02 = r52.q();
        if (r02 == 0) goto L22;
        if (this.f179450g == r02) goto L22;
        return false;
    L22:
        return C(r52);
    }

    public int hashCode() {
        int r02 = this.f179450g;
        if (r02 != 0) goto L8;
        int r03 = this.f179446b;
        r02 = o(r03, 0, r03);
        if (r02 != 0) goto L7;
        r02 = 1;
    L7:
        this.f179450g = r02;
    L8:
        return r02;
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void j(byte[] r3, int r4, int r5, int r6) {
        int r02 = r4 + r6;
        int r1 = this.f179448e;
        if (r02 > r1) goto L6;
        this.f179447c.j(r3, r4, r5, r6);
        return;
    L6:
        if (r4 < r1) goto L9;
        this.d.j(r3, r4 - r1, r5, r6);
        return;
    L9:
        int r12 = r1 - r4;
        this.f179447c.j(r3, r4, r5, r12);
        this.d.j(r3, 0, r5 + r12, r6 - r12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int k() {
        return this.f179449f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean l() {
        if (this.f179446b < f179445h[this.f179449f]) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean m() {
        int r02 = this.f179447c.p(0, 0, this.f179448e);
        kotlin.reflect.jvm.internal.impl.protobuf.d r1 = this.d;
        if (r1.p(r02, 0, r1.size()) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int o(int r3, int r4, int r5) {
        int r02 = r4 + r5;
        int r1 = this.f179448e;
        if (r02 <= r1) goto L5;
        if (r4 >= r1) goto L8;
        int r12 = r1 - r4;
        int r32 = this.f179447c.o(r3, r4, r12);
        return this.d.o(r32, 0, r5 - r12);
    L8:
        return this.d.o(r3, r4 - r1, r5);
    L5:
        return this.f179447c.o(r3, r4, r5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int p(int r3, int r4, int r5) {
        int r02 = r4 + r5;
        int r1 = this.f179448e;
        if (r02 <= r1) goto L5;
        if (r4 >= r1) goto L8;
        int r12 = r1 - r4;
        int r32 = this.f179447c.p(r3, r4, r12);
        return this.d.p(r32, 0, r5 - r12);
    L8:
        return this.d.p(r3, r4 - r1, r5);
    L5:
        return this.f179447c.p(r3, r4, r5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int q() {
        return this.f179450g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String s(String r3) {
        return new String(r(), r3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f179446b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void v(OutputStream r3, int r4, int r5) {
        int r02 = r4 + r5;
        int r1 = this.f179448e;
        if (r02 > r1) goto L6;
        this.f179447c.v(r3, r4, r5);
        return;
    L6:
        if (r4 < r1) goto L9;
        this.d.v(r3, r4 - r1, r5);
        return;
    L9:
        int r12 = r1 - r4;
        this.f179447c.v(r3, r4, r12);
        this.d.v(r3, 0, r5 - r12);
    }

    public q(kotlin.reflect.jvm.internal.impl.protobuf.d r3, kotlin.reflect.jvm.internal.impl.protobuf.d r4) {
        this.f179450g = 0;
        this.f179447c = r3;
        this.d = r4;
        int r02 = r3.size();
        this.f179448e = r02;
        this.f179446b = r02 + r4.size();
        this.f179449f = Math.max(r3.k(), r4.k()) + 1;
    }
}
