package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f27466a = null;

    public class a implements Comparator {
        public a() {
        }

        public int a(d r1, d r2) {
            return r1.f27469a - r2.f27469a;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((d) r1, (d) r2);
        }
    }

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(int r1, int r2);

        public abstract boolean b(int r1, int r2);

        public Object c(int r1, int r2) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f27467a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27468b;

        public c(int r1) {
            int[] r12 = new int[r1];
            this.f27467a = r12;
            this.f27468b = r12.length / 2;
        }

        public int[] a() {
            return this.f27467a;
        }

        public int b(int r3) {
            return this.f27467a[r3 + this.f27468b];
        }

        public void c(int r3, int r4) {
            this.f27467a[r3 + this.f27468b] = r4;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f27469a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27470b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27471c;

        public d(int r1, int r2, int r3) {
            this.f27469a = r1;
            this.f27470b = r2;
            this.f27471c = r3;
        }

        public int a() {
            return this.f27469a + this.f27471c;
        }

        public int b() {
            return this.f27470b + this.f27471c;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final List f27472a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f27473b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f27474c;
        public final b d;

        /* renamed from: e, reason: collision with root package name */
        public final int f27475e;

        /* renamed from: f, reason: collision with root package name */
        public final int f27476f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f27477g;

        public e(b r1, List r2, int[] r3, int[] r4, boolean r5) {
            this.f27472a = r2;
            this.f27473b = r3;
            this.f27474c = r4;
            Arrays.fill(r3, 0);
            Arrays.fill(r4, 0);
            this.d = r1;
            this.f27475e = r1.e();
            this.f27476f = r1.d();
            this.f27477g = r5;
            a();
            f();
        }

        public static g h(Collection r2, int r3, boolean r4) {
            Iterator r22 = r2.iterator();
        L4:
            if (r22.hasNext() == false) goto L10;
            g r02 = (g) r22.next();
            if (r02.f27478a != r3) goto L4;
            if (r02.f27480c != r4) goto L4;
            r22.remove();
        L12:
            if (r22.hasNext() == false) goto L17;
            g r32 = (g) r22.next();
            if (r4 == true) goto L15;
            r32.f27479b++;
            goto L12
        L15:
            r32.f27479b--;
            goto L12
        L17:
            return r02;
        L10:
            r02 = null;
            goto L12
        }

        public final void a() {
            if (this.f27472a.isEmpty() == false) goto L5;
            d r02 = null;
        L6:
            if (r02 != null) goto L8;
        L11:
            this.f27472a.add(0, new d(0, 0, 0));
        L12:
            this.f27472a.add(new d(this.f27475e, this.f27476f, 0));
            return;
        L8:
            if (r02.f27469a != 0) goto L11;
            if (r02.f27470b == 0) goto L12;
        L5:
            r02 = (d) this.f27472a.get(0);
            goto L6
        }

        public int b(int r4) {
            if (r4 < 0) goto L12;
            if (r4 >= this.f27475e) goto L12;
            int r42 = this.f27473b[r4];
            if ((r42 & 15) != 0) goto L10;
            return -1;
        L10:
            return r42 >> 4;
        L12:
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + r4 + ", old list size = " + this.f27475e);
        }

        public void c(t r13) {
            if ((r13 instanceof C4129e) == false) goto L5;
            C4129e r132 = (C4129e) r13;
        L6:
            int r02 = this.f27475e;
            ArrayDeque r1 = new ArrayDeque();
            int r2 = this.f27475e;
            int r3 = this.f27476f;
            int r4 = this.f27472a.size() - 1;
        L7:
            if (r4 < 0) goto L38;
            d r6 = (d) this.f27472a.get(r4);
            int r7 = r6.a();
            int r8 = r6.b();
        L9:
            int r9 = 0;
            if (r2 <= r7) goto L20;
            r2 = r2 - 1;
            int r10 = this.f27473b[r2];
            if ((r10 & 12) != 0) goto L13;
            r132.c(r2, 1);
            r02 = r02 - 1;
            goto L9
        L13:
            int r11 = r10 >> 4;
            g r92 = h(r1, r11, false);
            if (r92 != null) goto L15;
            r1.add(new g(r2, (r02 - r2) - 1, true));
            goto L9
        L15:
            int r93 = (r02 - r92.f27479b) - 1;
            r132.d(r2, r93);
            if ((r10 & 4) == 0) goto L9;
            r132.a(r93, 1, this.d.c(r2, r11));
        L20:
            if (r3 <= r8) goto L30;
            r3 = r3 - 1;
            int r72 = this.f27474c[r3];
            if ((r72 & 12) != 0) goto L23;
            r132.b(r2, 1);
            r02 = r02 + 1;
            goto L20
        L23:
            int r102 = r72 >> 4;
            g r112 = h(r1, r102, true);
            if (r112 == null) goto L25;
            r132.d((r02 - r112.f27479b) - 1, r2);
            if ((r72 & 4) == 0) goto L20;
            r132.a(r2, 1, this.d.c(r102, r3));
            goto L20
        L25:
            r1.add(new g(r3, r02 - r2, false));
            goto L20
        L30:
            int r22 = r6.f27469a;
            int r32 = r6.f27470b;
        L32:
            if (r9 >= r6.f27471c) goto L37;
            if ((this.f27473b[r22] & 15) != 2) goto L36;
            r132.a(r22, 1, this.d.c(r22, r32));
        L36:
            r22 = r22 + 1;
            r32 = r32 + 1;
            r9 = r9 + 1;
            goto L32
        L37:
            r2 = r6.f27469a;
            r3 = r6.f27470b;
            r4 = r4 - 1;
            goto L7
        L38:
            r132.e();
            return;
        L5:
            r132 = new C4129e(r13);
            goto L6
        }

        public void d(RecyclerView.Adapter r2) {
            c(new C4126b(r2));
        }

        public final void e(int r6) {
            int r02 = this.f27472a.size();
            int r1 = 0;
            int r2 = 0;
        L3:
            if (r1 >= r02) goto L19;
            d r3 = (d) this.f27472a.get(r1);
        L6:
            if (r2 >= r3.f27470b) goto L18;
            if (this.f27474c[r2] != 0) goto L17;
            if (this.d.b(r6, r2) == false) goto L17;
            if (this.d.a(r6, r2) == false) goto L14;
            int r03 = 8;
        L15:
            this.f27473b[r6] = (r2 << 4) | r03;
            this.f27474c[r2] = (r6 << 4) | r03;
            return;
        L14:
            r03 = 4;
        L17:
            r2 = r2 + 1;
            goto L6
        L18:
            r2 = r3.b();
            r1 = r1 + 1;
            goto L3
        }

        public final void f() {
            Iterator r02 = this.f27472a.iterator();
        L4:
            if (r02.hasNext() == false) goto L14;
            d r1 = (d) r02.next();
            int r2 = 0;
        L7:
            if (r2 >= r1.f27471c) goto L4;
            int r3 = r1.f27469a + r2;
            int r4 = r1.f27470b + r2;
            if (this.d.a(r3, r4) == false) goto L11;
            int r5 = 1;
        L12:
            this.f27473b[r3] = (r4 << 4) | r5;
            this.f27474c[r4] = (r3 << 4) | r5;
            r2 = r2 + 1;
            goto L7
        L11:
            r5 = 2;
            goto L12
        L14:
            if (this.f27477g == false) goto L21;
            g();
            return;
        }

        public final void g() {
            Iterator r02 = this.f27472a.iterator();
            int r1 = 0;
        L4:
            if (r02.hasNext() == false) goto L13;
            d r2 = (d) r02.next();
        L7:
            if (r1 >= r2.f27469a) goto L12;
            if (this.f27473b[r1] != 0) goto L11;
            e(r1);
        L11:
            r1 = r1 + 1;
            goto L7
        L12:
            r1 = r2.a();
            goto L4
        }
    }

    public static abstract class f {
        public f() {
        }

        public abstract boolean a(Object r1, Object r2);

        public abstract boolean b(Object r1, Object r2);

        public Object c(Object r1, Object r2) {
            return null;
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public int f27478a;

        /* renamed from: b, reason: collision with root package name */
        public int f27479b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f27480c;

        public g(int r1, int r2, boolean r3) {
            this.f27478a = r1;
            this.f27479b = r2;
            this.f27480c = r3;
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f27481a;

        /* renamed from: b, reason: collision with root package name */
        public int f27482b;

        /* renamed from: c, reason: collision with root package name */
        public int f27483c;
        public int d;

        public h() {
        }

        public int a() {
            return this.d - this.f27483c;
        }

        public int b() {
            return this.f27482b - this.f27481a;
        }

        public h(int r1, int r2, int r3, int r4) {
            this.f27481a = r1;
            this.f27482b = r2;
            this.f27483c = r3;
            this.d = r4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$i, reason: collision with other inner class name */
    public static class C0242i {

        /* renamed from: a, reason: collision with root package name */
        public int f27484a;

        /* renamed from: b, reason: collision with root package name */
        public int f27485b;

        /* renamed from: c, reason: collision with root package name */
        public int f27486c;
        public int d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f27487e;

        public C0242i() {
        }

        public int a() {
            return Math.min(this.f27486c - this.f27484a, this.d - this.f27485b);
        }

        public boolean b() {
            if ((this.d - this.f27485b) == (this.f27486c - this.f27484a)) goto L6;
            return true;
        L6:
            return false;
        }

        public boolean c() {
            if ((this.d - this.f27485b) <= (this.f27486c - this.f27484a)) goto L6;
            return true;
        L6:
            return false;
        }

        public d d() {
            if (b() == true) goto L5;
            int r1 = this.f27484a;
            return new d(r1, this.f27485b, this.f27486c - r1);
        L5:
            if (this.f27487e == false) goto L9;
            return new d(this.f27484a, this.f27485b, a());
        L9:
            if (c() == false) goto L13;
            return new d(this.f27484a, this.f27485b + 1, a());
        L13:
            return new d(this.f27484a + 1, this.f27485b, a());
        }
    }

    static {
        f27466a = new a();
    }

    public static C0242i a(h r11, b r12, c r13, c r14, int r15) {
        if (((r11.b() - r11.a()) % 2) != 0) goto L5;
        boolean r02 = true;
    L6:
        int r2 = r11.b() - r11.a();
        int r3 = -r15;
        int r4 = r3;
    L7:
        if (r4 > r15) goto L38;
        if (r4 == r3) goto L14;
        if (r4 != r15) goto L11;
    L13:
        int r5 = r14.b(r4 - 1);
        int r6 = r5 - 1;
    L15:
        int r7 = r11.d - ((r11.f27482b - r6) - r4);
        if (r15 == 0) goto L20;
        if (r6 != r5) goto L20;
        int r8 = r7 + 1;
    L22:
        if (r6 <= r11.f27481a) goto L28;
        if (r7 <= r11.f27483c) goto L28;
        if (r12.b(r6 - 1, r7 - 1) == false) goto L28;
        r6 = r6 - 1;
        r7 = r7 - 1;
    L28:
        r14.c(r4, r6);
        if (r02 == false) goto L37;
        int r9 = r2 - r4;
        if (r9 < r3) goto L37;
        if (r9 > r15) goto L37;
        if (r13.b(r9) < r6) goto L37;
        C0242i r112 = new C0242i();
        r112.f27484a = r6;
        r112.f27485b = r7;
        r112.f27486c = r5;
        r112.d = r8;
        r112.f27487e = true;
        return r112;
    L37:
        r4 = r4 + 2;
    L20:
        r8 = r7;
        goto L22
    L11:
        if (r14.b(r4 + 1) >= r14.b(r4 - 1)) goto L13;
    L14:
        r5 = r14.b(r4 + 1);
        r6 = r5;
        goto L15
    L38:
        return null;
    L5:
        r02 = false;
        goto L6
    }

    public static e b(b r1) {
        return c(r1, true);
    }

    public static e c(b r9, boolean r10) {
        int r02 = r9.e();
        int r1 = r9.d();
        ArrayList r4 = new ArrayList();
        ArrayList r2 = new ArrayList();
        r2.add(new h(0, r02, 0, r1));
        int r03 = ((((r02 + r1) + 1) / 2) * 2) + 1;
        c r12 = new c(r03);
        c r3 = new c(r03);
        ArrayList r04 = new ArrayList();
    L4:
        if (r2.isEmpty() == true) goto L16;
        h r5 = (h) r2.remove(r2.size() - 1);
        C0242i r6 = e(r5, r9, r12, r3);
        if (r6 != null) goto L8;
        r04.add(r5);
        goto L4
    L8:
        if (r6.a() <= 0) goto L11;
        r4.add(r6.d());
    L11:
        if (r04.isEmpty() == false) goto L13;
        h r7 = new h();
    L14:
        r7.f27481a = r5.f27481a;
        r7.f27483c = r5.f27483c;
        r7.f27482b = r6.f27484a;
        r7.d = r6.f27485b;
        r2.add(r7);
        r5.f27482b = r5.f27482b;
        r5.d = r5.d;
        r5.f27481a = r6.f27486c;
        r5.f27483c = r6.d;
        r2.add(r5);
        goto L4
    L13:
        r7 = (h) r04.remove(r04.size() - 1);
        goto L14
    L16:
        Collections.sort(r4, f27466a);
        return new e(r9, r4, r12.a(), r3.a(), r10);
    }

    public static C0242i d(h r11, b r12, c r13, c r14, int r15) {
        boolean r2 = true;
        if ((Math.abs(r11.b() - r11.a()) % 2) == 1) goto L6;
        r2 = false;
    L6:
        int r02 = r11.b() - r11.a();
        int r3 = -r15;
        int r4 = r3;
    L7:
        if (r4 > r15) goto L39;
        if (r4 == r3) goto L14;
        if (r4 != r15) goto L11;
    L13:
        int r5 = r13.b(r4 - 1);
        int r6 = r5 + 1;
    L15:
        int r7 = (r11.f27483c + (r6 - r11.f27481a)) - r4;
        if (r15 == 0) goto L20;
        if (r6 != r5) goto L20;
        int r8 = r7 - 1;
    L22:
        if (r6 >= r11.f27482b) goto L28;
        if (r7 >= r11.d) goto L28;
        if (r12.b(r6, r7) == false) goto L28;
        r6 = r6 + 1;
        r7 = r7 + 1;
    L28:
        r13.c(r4, r6);
        if (r2 == false) goto L38;
        int r9 = r02 - r4;
        if (r9 < (r3 + 1)) goto L38;
        if (r9 > (r15 - 1)) goto L38;
        if (r14.b(r9) > r6) goto L38;
        C0242i r112 = new C0242i();
        r112.f27484a = r5;
        r112.f27485b = r8;
        r112.f27486c = r6;
        r112.d = r7;
        r112.f27487e = false;
        return r112;
    L38:
        r4 = r4 + 2;
    L20:
        r8 = r7;
        goto L22
    L11:
        if (r13.b(r4 + 1) <= r13.b(r4 - 1)) goto L13;
    L14:
        r5 = r13.b(r4 + 1);
        r6 = r5;
        goto L15
    L39:
        return null;
    }

    public static C0242i e(h r4, b r5, c r6, c r7) {
        if (r4.b() >= 1) goto L5;
    L16:
        return null;
    L5:
        if (r4.a() < 1) goto L16;
        int r02 = ((r4.b() + r4.a()) + 1) / 2;
        r6.c(1, r4.f27481a);
        r7.c(1, r4.f27482b);
        int r2 = 0;
    L8:
        if (r2 >= r02) goto L16;
        C0242i r3 = d(r4, r5, r6, r7, r2);
        if (r3 != null) goto L11;
        C0242i r32 = a(r4, r5, r6, r7, r2);
        if (r32 != null) goto L14;
        r2 = r2 + 1;
        goto L8
    L14:
        return r32;
    L11:
        return r3;
    }
}
