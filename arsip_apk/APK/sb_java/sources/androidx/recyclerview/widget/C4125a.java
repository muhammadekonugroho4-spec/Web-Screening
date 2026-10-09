package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.clevertap.android.sdk.Constants;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4125a implements v.a {

    /* renamed from: a, reason: collision with root package name */
    public androidx.core.util.e f27369a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27370b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27371c;
    public final InterfaceC0239a d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f27372e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27373f;

    /* renamed from: g, reason: collision with root package name */
    public final v f27374g;

    /* renamed from: h, reason: collision with root package name */
    public int f27375h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0239a {
        void a(int r1, int r2);

        void b(b r1);

        void c(b r1);

        RecyclerView.D d(int r1);

        void e(int r1, int r2);

        void f(int r1, int r2);

        void g(int r1, int r2);

        void h(int r1, int r2, Object r3);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f27376a;

        /* renamed from: b, reason: collision with root package name */
        public int f27377b;

        /* renamed from: c, reason: collision with root package name */
        public Object f27378c;
        public int d;

        public b(int r1, int r2, int r3, Object r4) {
            this.f27376a = r1;
            this.f27377b = r2;
            this.d = r3;
            this.f27378c = r4;
        }

        public String a() {
            int r02 = this.f27376a;
            if (r02 != 1) goto L5;
            return "add";
        L5:
            if (r02 != 2) goto L7;
            return "rm";
        L7:
            if (r02 != 4) goto L9;
            return EnabledPayment.STATUS_UP;
        L9:
            if (r02 == 8) goto L12;
            return "??";
        L12:
            return "mv";
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            int r1 = this.f27376a;
            if (r1 == r52.f27376a) goto L12;
            return false;
        L12:
            if (r1 != 8) goto L21;
            if (Math.abs(this.d - this.f27377b) != 1) goto L21;
            if (this.d != r52.f27377b) goto L21;
            if (this.f27377b != r52.d) goto L21;
            return true;
        L21:
            if (this.d == r52.d) goto L24;
            return false;
        L24:
            if (this.f27377b == r52.f27377b) goto L26;
            return false;
        L26:
            Object r12 = this.f27378c;
            if (r12 == null) goto L32;
            if (r12.equals(r52.f27378c) == true) goto L34;
            return false;
        L34:
            return true;
        L32:
            if (r52.f27378c == null) goto L34;
            return false;
        }

        public int hashCode() {
            return (((this.f27376a * 31) + this.f27377b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + Constants.AES_PREFIX + a() + ",s:" + this.f27377b + "c:" + this.d + ",p:" + this.f27378c + Constants.AES_SUFFIX;
        }
    }

    public C4125a(InterfaceC0239a r2) {
        this(r2, false);
    }

    @Override // androidx.recyclerview.widget.v.a
    public b a(int r2, int r3, int r4, Object r5) {
        b r02 = (b) this.f27369a.acquire();
        if (r02 == null) goto L5;
        r02.f27376a = r2;
        r02.f27377b = r3;
        r02.d = r4;
        r02.f27378c = r5;
        return r02;
    L5:
        return new b(r2, r3, r4, r5);
    }

    @Override // androidx.recyclerview.widget.v.a
    public void b(b r2) {
        if (this.f27373f == true) goto L6;
        r2.f27378c = null;
        this.f27369a.a(r2);
        return;
    }

    public final void c(b r1) {
        v(r1);
    }

    public final void d(b r1) {
        v(r1);
    }

    public int e(int r6) {
        int r02 = this.f27370b.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L30;
        b r2 = (b) this.f27370b.get(r1);
        int r3 = r2.f27376a;
        if (r3 == 1) goto L27;
        if (r3 != 2) goto L9;
        int r32 = r2.f27377b;
        if (r32 > r6) goto L29;
        int r22 = r2.d;
        if ((r32 + r22) > r6) goto L23;
        r6 = r6 - r22;
        goto L29
    L23:
        return -1;
    L29:
        r1 = r1 + 1;
        goto L3
    L9:
        if (r3 != 8) goto L29;
        int r33 = r2.f27377b;
        if (r33 != r6) goto L14;
        r6 = r2.d;
        goto L29
    L14:
        if (r33 >= r6) goto L17;
        r6 = r6 - 1;
    L17:
        if (r2.d > r6) goto L29;
        r6 = r6 + 1;
        goto L29
    L27:
        if (r2.f27377b > r6) goto L29;
        r6 = r6 + r2.d;
        goto L29
    L30:
        return r6;
    }

    public final void f(b r11) {
        int r02 = r11.f27377b;
        int r1 = r11.d + r02;
        char r3 = 65535;
        int r4 = r02;
        int r5 = 0;
    L4:
        if (r4 >= r1) goto L23;
        if (this.d.d(r4) == null) goto L8;
    L14:
        if (r3 != 0) goto L16;
        k(a(2, r02, r5, null));
        boolean r32 = true;
    L17:
        char r6 = 1;
    L18:
        if (r32 == false) goto L20;
        r4 = r4 - r5;
        r1 = r1 - r5;
        r5 = 1;
    L21:
        r4 = r4 + 1;
        r3 = r6;
        goto L4
    L20:
        r5 = r5 + 1;
        goto L21
    L16:
        r32 = false;
        goto L17
    L8:
        if (h(r4) == true) goto L14;
        if (r3 != 1) goto L12;
        v(a(2, r02, r5, null));
        r32 = true;
    L13:
        r6 = 0;
        goto L18
    L12:
        r32 = false;
        goto L13
    L23:
        if (r5 == r11.d) goto L25;
        b(r11);
        r11 = a(2, r02, r5, null);
    L25:
        if (r3 != 0) goto L28;
        k(r11);
        return;
    L28:
        v(r11);
    }

    public final void g(b r10) {
        int r02 = r10.f27377b;
        int r1 = r10.d + r02;
        int r5 = 0;
        boolean r4 = -1;
        int r3 = r02;
    L4:
        if (r02 >= r1) goto L18;
        if (this.d.d(r02) == null) goto L8;
    L13:
        if (r4 == true) goto L15;
        k(a(4, r3, r5, r10.f27378c));
        r3 = r02;
        r5 = 0;
    L15:
        r4 = true;
    L16:
        r5 = r5 + 1;
        r02 = r02 + 1;
        goto L4
    L8:
        if (h(r02) == true) goto L13;
        if (r4 != true) goto L12;
        v(a(4, r3, r5, r10.f27378c));
        r3 = r02;
        r5 = 0;
    L12:
        r4 = false;
        goto L16
    L18:
        if (r5 == r10.d) goto L20;
        Object r03 = r10.f27378c;
        b(r10);
        r10 = a(4, r3, r5, r03);
    L20:
        if (r4 == true) goto L23;
        k(r10);
        return;
    L23:
        v(r10);
    }

    public final boolean h(int r8) {
        int r02 = this.f27371c.size();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L17;
        b r3 = (b) this.f27371c.get(r2);
        int r4 = r3.f27376a;
        if (r4 == 8) goto L7;
        if (r4 != 1) goto L16;
        int r42 = r3.f27377b;
        int r32 = r3.d + r42;
    L11:
        if (r42 >= r32) goto L16;
        if (n(r42, r2 + 1) == r8) goto L14;
        r42 = r42 + 1;
        goto L11
    L14:
        return true;
    L16:
        r2 = r2 + 1;
        goto L3
    L7:
        if (n(r3.d, r2 + 1) != r8) goto L16;
        return true;
    L17:
        return false;
    }

    public void i() {
        int r02 = this.f27371c.size();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        this.d.c((b) this.f27371c.get(r2));
        r2 = r2 + 1;
        goto L3
    L5:
        x(this.f27371c);
        this.f27375h = 0;
    }

    public void j() {
        i();
        int r02 = this.f27370b.size();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L21;
        b r3 = (b) this.f27370b.get(r2);
        int r4 = r3.f27376a;
        if (r4 != 1) goto L7;
        this.d.c(r3);
        this.d.e(r3.f27377b, r3.d);
    L17:
        Runnable r32 = this.f27372e;
        if (r32 == null) goto L20;
        r32.run();
    L20:
        r2 = r2 + 1;
        goto L3
    L7:
        if (r4 != 2) goto L9;
        this.d.c(r3);
        this.d.f(r3.f27377b, r3.d);
        goto L17
    L9:
        if (r4 != 4) goto L11;
        this.d.c(r3);
        this.d.h(r3.f27377b, r3.d, r3.f27378c);
        goto L17
    L11:
        if (r4 != 8) goto L17;
        this.d.c(r3);
        this.d.a(r3.f27377b, r3.d);
        goto L17
    L21:
        x(this.f27370b);
        this.f27375h = 0;
    }

    public final void k(b r12) {
        int r02 = r12.f27376a;
        if (r02 == 1) goto L35;
        if (r02 == 8) goto L35;
        int r03 = z(r12.f27377b, r02);
        int r2 = r12.f27377b;
        int r3 = r12.f27376a;
        if (r3 == 2) goto L12;
        if (r3 != 4) goto L11;
        int r32 = 1;
    L13:
        int r6 = 1;
        int r7 = 1;
    L15:
        if (r6 >= r12.d) goto L30;
        int r8 = z(r12.f27377b + (r32 * r6), r12.f27376a);
        int r9 = r12.f27376a;
        if (r9 == 2) goto L23;
        if (r9 == 4) goto L21;
    L25:
        b r04 = a(r9, r03, r7, r12.f27378c);
        l(r04, r2);
        b(r04);
        if (r12.f27376a != 4) goto L28;
        r2 = r2 + r7;
    L28:
        r7 = 1;
        r03 = r8;
    L29:
        r6 = r6 + 1;
        goto L15
    L21:
        if (r8 != (r03 + 1)) goto L25;
    L24:
        r7 = r7 + 1;
        goto L29
    L23:
        if (r8 != r03) goto L25;
    L30:
        Object r1 = r12.f27378c;
        b(r12);
        if (r7 <= 0) goto L39;
        b r122 = a(r12.f27376a, r03, r7, r1);
        l(r122, r2);
        b(r122);
        return;
    L39:
        return;
    L11:
        throw new IllegalArgumentException("op should be remove or update." + r12);
    L12:
        r32 = 0;
    L35:
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void l(b r3, int r4) {
        this.d.b(r3);
        int r02 = r3.f27376a;
        if (r02 != 2) goto L5;
        this.d.f(r4, r3.d);
        return;
    L5:
        if (r02 != 4) goto L9;
        this.d.h(r4, r3.d, r3.f27378c);
        return;
    L9:
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }

    public int m(int r2) {
        return n(r2, 0);
    }

    public int n(int r6, int r7) {
        int r02 = this.f27371c.size();
    L3:
        if (r7 >= r02) goto L27;
        b r1 = (b) this.f27371c.get(r7);
        int r2 = r1.f27376a;
        if (r2 != 8) goto L14;
        int r22 = r1.f27377b;
        if (r22 != r6) goto L9;
        r6 = r1.d;
    L26:
        r7 = r7 + 1;
        goto L3
    L9:
        if (r22 >= r6) goto L12;
        r6 = r6 - 1;
    L12:
        if (r1.d > r6) goto L26;
        r6 = r6 + 1;
        goto L26
    L14:
        int r3 = r1.f27377b;
        if (r3 > r6) goto L26;
        if (r2 != 2) goto L24;
        int r12 = r1.d;
        if (r6 < (r3 + r12)) goto L20;
        r6 = r6 - r12;
        goto L26
    L20:
        return -1;
    L24:
        if (r2 != 1) goto L26;
        r6 = r6 + r1.d;
        goto L26
    L27:
        return r6;
    }

    public boolean o(int r2) {
        if ((r2 & this.f27375h) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean p() {
        if (this.f27370b.size() <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean q() {
        if (this.f27371c.isEmpty() == false) goto L5;
        return false;
    L5:
        if (this.f27370b.isEmpty() == true) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean r(int r5, int r6, Object r7) {
        if (r6 >= 1) goto L5;
        return false;
    L5:
        this.f27370b.add(a(4, r5, r6, r7));
        this.f27375h |= 4;
        if (this.f27370b.size() != 1) goto L8;
        return true;
    L8:
        return false;
    }

    public boolean s(int r5, int r6) {
        if (r6 >= 1) goto L5;
        return false;
    L5:
        this.f27370b.add(a(1, r5, r6, null));
        this.f27375h |= 1;
        if (this.f27370b.size() != 1) goto L8;
        return true;
    L8:
        return false;
    }

    public boolean t(int r5, int r6, int r7) {
        if (r5 != r6) goto L6;
        return false;
    L6:
        if (r7 != 1) goto L12;
        this.f27370b.add(a(8, r5, r6, null));
        this.f27375h |= 8;
        if (this.f27370b.size() != 1) goto L10;
        return true;
    L10:
        return false;
    L12:
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public boolean u(int r6, int r7) {
        if (r7 >= 1) goto L5;
        return false;
    L5:
        this.f27370b.add(a(2, r6, r7, null));
        this.f27375h |= 2;
        if (this.f27370b.size() != 1) goto L8;
        return true;
    L8:
        return false;
    }

    public final void v(b r4) {
        this.f27371c.add(r4);
        int r02 = r4.f27376a;
        if (r02 != 1) goto L5;
        this.d.e(r4.f27377b, r4.d);
        return;
    L5:
        if (r02 != 2) goto L7;
        this.d.g(r4.f27377b, r4.d);
        return;
    L7:
        if (r02 != 4) goto L9;
        this.d.h(r4.f27377b, r4.d, r4.f27378c);
        return;
    L9:
        if (r02 != 8) goto L13;
        this.d.a(r4.f27377b, r4.d);
        return;
    L13:
        throw new IllegalArgumentException("Unknown update op type for " + r4);
    }

    public void w() {
        this.f27374g.b(this.f27370b);
        int r02 = this.f27370b.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L21;
        b r2 = (b) this.f27370b.get(r1);
        int r3 = r2.f27376a;
        if (r3 != 1) goto L7;
        c(r2);
    L17:
        Runnable r22 = this.f27372e;
        if (r22 == null) goto L20;
        r22.run();
    L20:
        r1 = r1 + 1;
        goto L3
    L7:
        if (r3 != 2) goto L9;
        f(r2);
        goto L17
    L9:
        if (r3 != 4) goto L11;
        g(r2);
        goto L17
    L11:
        if (r3 != 8) goto L17;
        d(r2);
        goto L17
    L21:
        this.f27370b.clear();
    }

    public void x(List r4) {
        int r02 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        b((b) r4.get(r1));
        r1 = r1 + 1;
        goto L3
    L5:
        r4.clear();
    }

    public void y() {
        x(this.f27370b);
        x(this.f27371c);
        this.f27375h = 0;
    }

    public final int z(int r9, int r10) {
        int r02 = this.f27371c.size() - 1;
    L4:
        if (r02 < 0) goto L40;
        b r3 = (b) this.f27371c.get(r02);
        int r4 = r3.f27376a;
        if (r4 != 8) goto L29;
        int r2 = r3.f27377b;
        int r42 = r3.d;
        if (r2 >= r42) goto L10;
        int r6 = r2;
        int r7 = r42;
    L11:
        if (r9 < r6) goto L24;
        if (r9 > r7) goto L24;
        if (r6 != r2) goto L19;
        if (r10 != 1) goto L16;
        r3.d = r42 + 1;
    L18:
        r9 = r9 + 1;
    L39:
        r02 = r02 - 1;
        goto L4
    L16:
        if (r10 != 2) goto L18;
        r3.d = r42 - 1;
        goto L18
    L19:
        if (r10 != 1) goto L21;
        r3.f27377b = r2 + 1;
    L23:
        r9 = r9 - 1;
        goto L39
    L21:
        if (r10 != 2) goto L23;
        r3.f27377b = r2 - 1;
    L24:
        if (r9 >= r2) goto L39;
        if (r10 != 1) goto L27;
        r3.f27377b = r2 + 1;
        r3.d = r42 + 1;
        goto L39
    L27:
        if (r10 != 2) goto L39;
        r3.f27377b = r2 - 1;
        r3.d = r42 - 1;
        goto L39
    L10:
        r7 = r2;
        r6 = r42;
        goto L11
    L29:
        int r22 = r3.f27377b;
        if (r22 > r9) goto L35;
        if (r4 != 1) goto L33;
        r9 = r9 - r3.d;
        goto L39
    L33:
        if (r4 != 2) goto L39;
        r9 = r9 + r3.d;
        goto L39
    L35:
        if (r10 != 1) goto L37;
        r3.f27377b = r22 + 1;
        goto L39
    L37:
        if (r10 != 2) goto L39;
        r3.f27377b = r22 - 1;
        goto L39
    L40:
        int r102 = this.f27371c.size() - 1;
    L41:
        if (r102 < 0) goto L52;
        b r03 = (b) this.f27371c.get(r102);
        if (r03.f27376a != 8) goto L49;
        int r1 = r03.d;
        if (r1 == r03.f27377b) goto L47;
        if (r1 < 0) goto L47;
    L51:
        r102 = r102 - 1;
    L47:
        this.f27371c.remove(r102);
        b(r03);
        goto L51
    L49:
        if (r03.d > 0) goto L51;
        this.f27371c.remove(r102);
        b(r03);
        goto L51
    L52:
        return r9;
    }

    public C4125a(InterfaceC0239a r3, boolean r4) {
        this.f27369a = new androidx.core.util.f(30);
        this.f27370b = new ArrayList();
        this.f27371c = new ArrayList();
        this.f27375h = 0;
        this.d = r3;
        this.f27373f = r4;
        this.f27374g = new v(this);
    }
}
