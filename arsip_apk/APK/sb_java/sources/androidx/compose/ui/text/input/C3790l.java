package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C3740e;
import androidx.compose.ui.text.E1;
import androidx.compose.ui.text.F1;

/* renamed from: androidx.compose.ui.text.input.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3790l {

    /* renamed from: f, reason: collision with root package name */
    public static final a f20061f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20062g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final H f20063a;

    /* renamed from: b, reason: collision with root package name */
    public int f20064b;

    /* renamed from: c, reason: collision with root package name */
    public int f20065c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f20066e;

    /* renamed from: androidx.compose.ui.text.input.l$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f20061f = new a(null);
        f20062g = 8;
    }

    public /* synthetic */ C3790l(C3740e r1, long r2, kotlin.jvm.internal.i r4) {
        this(r1, r2);
    }

    public final void a() {
        this.d = -1;
        this.f20066e = -1;
    }

    public final void b(int r5, int r6) {
        long r02 = F1.b(r5, r6);
        this.f20063a.c(r5, r6, "");
        long r52 = AbstractC3791m.a(F1.b(this.f20064b, this.f20065c), r02);
        r(E1.l(r52));
        q(E1.k(r52));
        if (l() == false) goto L10;
        long r53 = AbstractC3791m.a(F1.b(this.d, this.f20066e), r02);
        if (E1.h(r53) == false) goto L8;
        a();
        return;
    L8:
        this.d = E1.l(r53);
        this.f20066e = E1.k(r53);
        return;
    }

    public final char c(int r2) {
        return this.f20063a.a(r2);
    }

    public final E1 d() {
        if (l() == true) goto L5;
        return null;
    L5:
        return E1.b(F1.b(this.d, this.f20066e));
    }

    public final int e() {
        return this.f20066e;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        int r02 = this.f20064b;
        int r1 = this.f20065c;
        if (r02 != r1) goto L5;
        return r1;
    L5:
        return -1;
    }

    public final int h() {
        return this.f20063a.b();
    }

    public final long i() {
        return F1.b(this.f20064b, this.f20065c);
    }

    public final int j() {
        return this.f20065c;
    }

    public final int k() {
        return this.f20064b;
    }

    public final boolean l() {
        if (this.d == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    public final void m(int r3, int r4, String r5) {
        if (r3 < 0) goto L17;
        if (r3 > this.f20063a.b()) goto L17;
        if (r4 < 0) goto L15;
        if (r4 > this.f20063a.b()) goto L15;
        if (r3 > r4) goto L13;
        this.f20063a.c(r3, r4, r5);
        r(r5.length() + r3);
        q(r3 + r5.length());
        this.d = -1;
        this.f20066e = -1;
        return;
    L13:
        throw new IllegalArgumentException("Do not set reversed range: " + r3 + " > " + r4);
    L15:
        throw new IndexOutOfBoundsException("end (" + r4 + ") offset is outside of text region " + this.f20063a.b());
    L17:
        throw new IndexOutOfBoundsException("start (" + r3 + ") offset is outside of text region " + this.f20063a.b());
    }

    public final void n(int r4, int r5) {
        if (r4 < 0) goto L17;
        if (r4 > this.f20063a.b()) goto L17;
        if (r5 < 0) goto L15;
        if (r5 > this.f20063a.b()) goto L15;
        if (r4 >= r5) goto L13;
        this.d = r4;
        this.f20066e = r5;
        return;
    L13:
        throw new IllegalArgumentException("Do not set reversed or empty range: " + r4 + " > " + r5);
    L15:
        throw new IndexOutOfBoundsException("end (" + r5 + ") offset is outside of text region " + this.f20063a.b());
    L17:
        throw new IndexOutOfBoundsException("start (" + r4 + ") offset is outside of text region " + this.f20063a.b());
    }

    public final void o(int r1) {
        p(r1, r1);
    }

    public final void p(int r4, int r5) {
        if (r4 < 0) goto L17;
        if (r4 > this.f20063a.b()) goto L17;
        if (r5 < 0) goto L15;
        if (r5 > this.f20063a.b()) goto L15;
        if (r4 > r5) goto L13;
        r(r4);
        q(r5);
        return;
    L13:
        throw new IllegalArgumentException("Do not set reversed range: " + r4 + " > " + r5);
    L15:
        throw new IndexOutOfBoundsException("end (" + r5 + ") offset is outside of text region " + this.f20063a.b());
    L17:
        throw new IndexOutOfBoundsException("start (" + r4 + ") offset is outside of text region " + this.f20063a.b());
    }

    public final void q(int r3) {
        if (r3 < 0) goto L4;
        boolean r02 = true;
    L5:
        if (r02 == true) goto L7;
        androidx.compose.ui.text.internal.a.a("Cannot set selectionEnd to a negative value: " + r3);
    L7:
        this.f20065c = r3;
        return;
    L4:
        r02 = false;
        goto L5
    }

    public final void r(int r3) {
        if (r3 < 0) goto L4;
        boolean r02 = true;
    L5:
        if (r02 == true) goto L7;
        androidx.compose.ui.text.internal.a.a("Cannot set selectionStart to a negative value: " + r3);
    L7:
        this.f20064b = r3;
        return;
    L4:
        r02 = false;
        goto L5
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3740e s() {
        return new C3740e(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return this.f20063a.toString();
    }

    public C3790l(C3740e r4, long r5) {
        this.f20063a = new H(r4.k());
        this.f20064b = E1.l(r5);
        this.f20065c = E1.k(r5);
        this.d = -1;
        this.f20066e = -1;
        int r02 = E1.l(r5);
        int r52 = E1.k(r5);
        if (r02 < 0) goto L16;
        if (r02 > r4.length()) goto L16;
        if (r52 < 0) goto L14;
        if (r52 > r4.length()) goto L14;
        if (r02 > r52) goto L12;
        return;
    L12:
        throw new IllegalArgumentException("Do not set reversed range: " + r02 + " > " + r52);
    L14:
        throw new IndexOutOfBoundsException("end (" + r52 + ") offset is outside of text region " + r4.length());
    L16:
        throw new IndexOutOfBoundsException("start (" + r02 + ") offset is outside of text region " + r4.length());
    }
}
