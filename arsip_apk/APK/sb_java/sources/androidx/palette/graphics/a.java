package androidx.palette.graphics;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.core.graphics.d;
import androidx.palette.graphics.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator f27061g = null;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f27062a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f27063b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27064c;
    public final TimingLogger d;

    /* renamed from: e, reason: collision with root package name */
    public final b.c[] f27065e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f27066f;

    /* renamed from: androidx.palette.graphics.a$a, reason: collision with other inner class name */
    public static class C0233a implements Comparator {
        public C0233a() {
        }

        public int a(b r1, b r2) {
            return r2.g() - r1.g();
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((b) r1, (b) r2);
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f27067a;

        /* renamed from: b, reason: collision with root package name */
        public int f27068b;

        /* renamed from: c, reason: collision with root package name */
        public int f27069c;
        public int d;

        /* renamed from: e, reason: collision with root package name */
        public int f27070e;

        /* renamed from: f, reason: collision with root package name */
        public int f27071f;

        /* renamed from: g, reason: collision with root package name */
        public int f27072g;

        /* renamed from: h, reason: collision with root package name */
        public int f27073h;

        /* renamed from: i, reason: collision with root package name */
        public int f27074i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ a f27075j;

        public b(a r1, int r2, int r3) {
            this.f27075j = r1;
            this.f27067a = r2;
            this.f27068b = r3;
            c();
        }

        public final boolean a() {
            if (e() <= 1) goto L5;
            return true;
        L5:
            return false;
        }

        public final int b() {
            int r02 = f();
            a r1 = this.f27075j;
            int[] r2 = r1.f27062a;
            int[] r12 = r1.f27063b;
            a.e(r2, r02, this.f27067a, this.f27068b);
            Arrays.sort(r2, this.f27067a, this.f27068b + 1);
            a.e(r2, r02, this.f27067a, this.f27068b);
            int r03 = this.f27069c / 2;
            int r3 = this.f27067a;
            int r4 = 0;
        L3:
            int r5 = this.f27068b;
            if (r3 > r5) goto L11;
            r4 = r4 + r12[r2[r3]];
            if (r4 >= r03) goto L8;
            r3 = r3 + 1;
            goto L3
        L8:
            return Math.min(r5 - 1, r3);
        L11:
            return this.f27067a;
        }

        public final void c() {
            a r02 = this.f27075j;
            int[] r1 = r02.f27062a;
            int[] r03 = r02.f27063b;
            int r2 = this.f27067a;
            int r3 = Integer.MAX_VALUE;
            int r6 = Integer.MIN_VALUE;
            int r7 = Integer.MIN_VALUE;
            int r8 = Integer.MIN_VALUE;
            int r9 = 0;
            int r4 = Integer.MAX_VALUE;
            int r5 = Integer.MAX_VALUE;
        L4:
            if (r2 > this.f27068b) goto L19;
            int r10 = r1[r2];
            r9 = r9 + r03[r10];
            int r11 = a.k(r10);
            int r12 = a.j(r10);
            int r102 = a.i(r10);
            if (r11 <= r6) goto L8;
            r6 = r11;
        L8:
            if (r11 >= r3) goto L10;
            r3 = r11;
        L10:
            if (r12 <= r7) goto L12;
            r7 = r12;
        L12:
            if (r12 >= r4) goto L14;
            r4 = r12;
        L14:
            if (r102 <= r8) goto L16;
            r8 = r102;
        L16:
            if (r102 >= r5) goto L18;
            r5 = r102;
        L18:
            r2 = r2 + 1;
            goto L4
        L19:
            this.d = r3;
            this.f27070e = r6;
            this.f27071f = r4;
            this.f27072g = r7;
            this.f27073h = r5;
            this.f27074i = r8;
            this.f27069c = r9;
        }

        public final b.d d() {
            a r02 = this.f27075j;
            int[] r1 = r02.f27062a;
            int[] r03 = r02.f27063b;
            int r2 = this.f27067a;
            int r3 = 0;
            int r4 = 0;
            int r5 = 0;
            int r6 = 0;
        L4:
            if (r2 > this.f27068b) goto L6;
            int r7 = r1[r2];
            int r8 = r03[r7];
            r4 = r4 + r8;
            r3 = r3 + (a.k(r7) * r8);
            r5 = r5 + (a.j(r7) * r8);
            r6 = r6 + (r8 * a.i(r7));
            r2 = r2 + 1;
            goto L4
        L6:
            float r12 = r4;
            return new b.d(a.b(Math.round(r3 / r12), Math.round(r5 / r12), Math.round(r6 / r12)), r4);
        }

        public final int e() {
            return (this.f27068b + 1) - this.f27067a;
        }

        public final int f() {
            int r02 = this.f27070e - this.d;
            int r1 = this.f27072g - this.f27071f;
            int r2 = this.f27074i - this.f27073h;
            if (r02 < r1) goto L7;
            if (r02 < r2) goto L7;
            return -3;
        L7:
            if (r1 < r02) goto L11;
            if (r1 < r2) goto L13;
            return -2;
        L13:
            return -1;
        L11:
            return -1;
        }

        public final int g() {
            return (((this.f27070e - this.d) + 1) * ((this.f27072g - this.f27071f) + 1)) * ((this.f27074i - this.f27073h) + 1);
        }

        public final b h() {
            if (a() == false) goto L7;
            int r02 = b();
            b r1 = new b(this.f27075j, r02 + 1, this.f27068b);
            this.f27068b = r02;
            c();
            return r1;
        L7:
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    static {
        f27061g = new C0233a();
    }

    public a(int[] r7, int r8, b.c[] r9) {
        this.f27066f = new float[3];
        this.d = null;
        this.f27065e = r9;
        int[] r02 = new int[32768];
        this.f27063b = r02;
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= r7.length) goto L6;
        int r3 = g(r7[r2]);
        r7[r2] = r3;
        r02[r3] = r02[r3] + 1;
        r2 = r2 + 1;
        goto L4
    L6:
        int r72 = 0;
        int r22 = 0;
    L7:
        if (r72 >= 32768) goto L17;
        if (r02[r72] <= 0) goto L14;
        if (l(r72) == false) goto L14;
        r02[r72] = 0;
    L14:
        if (r02[r72] <= 0) goto L16;
        r22 = r22 + 1;
    L16:
        r72 = r72 + 1;
        goto L7
    L17:
        int[] r73 = new int[r22];
        this.f27062a = r73;
        int r32 = 0;
        int r4 = 0;
    L18:
        if (r32 >= 32768) goto L23;
        if (r02[r32] <= 0) goto L22;
        r73[r4] = r32;
        r4 = r4 + 1;
    L22:
        r32 = r32 + 1;
        goto L18
    L23:
        if (r22 > r8) goto L28;
        this.f27064c = new ArrayList();
    L25:
        if (r1 >= r22) goto L27;
        int r82 = r73[r1];
        this.f27064c.add(new b.d(a(r82), r02[r82]));
        r1 = r1 + 1;
        goto L25
    L27:
        return;
    L28:
        this.f27064c = h(r8);
    }

    public static int a(int r2) {
        return b(k(r2), j(r2), i(r2));
    }

    public static int b(int r2, int r3, int r4) {
        return Color.rgb(f(r2, 5, 8), f(r3, 5, 8), f(r4, 5, 8));
    }

    public static void e(int[] r2, int r3, int r4, int r5) {
        if (r3 != (-2)) goto L5;
    L9:
        if (r4 > r5) goto L15;
        int r32 = r2[r4];
        int r02 = (j(r32) << 10) | (k(r32) << 5);
        r2[r4] = i(r32) | r02;
        r4 = r4 + 1;
        goto L9
    L15:
        return;
    L5:
        if (r3 != (-1)) goto L11;
    L7:
        if (r4 > r5) goto L14;
        int r33 = r2[r4];
        int r03 = (i(r33) << 10) | (j(r33) << 5);
        r2[r4] = k(r33) | r03;
        r4 = r4 + 1;
        goto L7
    L14:
        return;
    }

    public static int f(int r02, int r1, int r2) {
        if (r2 <= r1) goto L4;
        int r03 = r02 << (r2 - r1);
    L6:
        return r03 & ((1 << r2) - 1);
    L4:
        r03 = r02 >> (r1 - r2);
        goto L6
    }

    public static int g(int r4) {
        int r02 = f(Color.red(r4), 8, 5);
        int r3 = f(Color.green(r4), 8, 5);
        return f(Color.blue(r4), 8, 5) | ((r02 << 10) | (r3 << 5));
    }

    public static int i(int r02) {
        return r02 & 31;
    }

    public static int j(int r02) {
        return (r02 >> 5) & 31;
    }

    public static int k(int r02) {
        return (r02 >> 10) & 31;
    }

    public final List c(Collection r4) {
        ArrayList r02 = new ArrayList(r4.size());
        Iterator r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L8;
        b.d r1 = ((b) r42.next()).d();
        if (n(r1) == true) goto L4;
        r02.add(r1);
        goto L4
    L8:
        return r02;
    }

    public List d() {
        return this.f27064c;
    }

    public final List h(int r5) {
        PriorityQueue r02 = new PriorityQueue(r5, f27061g);
        r02.offer(new b(this, 0, this.f27062a.length - 1));
        o(r02, r5);
        return c(r02);
    }

    public final boolean l(int r2) {
        int r22 = a(r2);
        d.h(r22, this.f27066f);
        return m(r22, this.f27066f);
    }

    public final boolean m(int r5, float[] r6) {
        b.c[] r02 = this.f27065e;
        if (r02 != null) goto L5;
    L13:
        return false;
    L5:
        if (r02.length <= 0) goto L13;
        int r03 = r02.length;
        int r2 = 0;
    L7:
        if (r2 >= r03) goto L13;
        if (this.f27065e[r2].a(r5, r6) == false) goto L10;
        r2 = r2 + 1;
        goto L7
    L10:
        return true;
    }

    public final boolean n(b.d r2) {
        return m(r2.e(), r2.c());
    }

    public final void o(PriorityQueue r3, int r4) {
    L3:
        if (r3.size() >= r4) goto L9;
        b r02 = (b) r3.poll();
        if (r02 == null) goto L13;
        if (r02.a() == false) goto L14;
        r3.offer(r02.h());
        r3.offer(r02);
        goto L3
    L14:
        return;
    L13:
        return;
    }
}
