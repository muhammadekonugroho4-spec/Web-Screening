package androidx.compose.ui.input.pointer;

import java.util.List;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final long f18044a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18045b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18046c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18047e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18048f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18049g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18050h;

    /* renamed from: i, reason: collision with root package name */
    public final List f18051i;

    /* renamed from: j, reason: collision with root package name */
    public final long f18052j;

    /* renamed from: k, reason: collision with root package name */
    public final long f18053k;

    static {
    }

    public /* synthetic */ B(long r1, long r3, long r5, long r7, boolean r9, float r10, int r11, boolean r12, List r13, long r14, long r16, kotlin.jvm.internal.i r18) {
        this(r1, r3, r5, r7, r9, r10, r11, r12, r13, r14, r16);
    }

    public final boolean a() {
        return this.f18050h;
    }

    public final boolean b() {
        return this.f18047e;
    }

    public final List c() {
        return this.f18051i;
    }

    public final long d() {
        return this.f18044a;
    }

    public final long e() {
        return this.f18053k;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof B) == true) goto L8;
        return false;
    L8:
        B r82 = (B) r8;
        if (x.b(this.f18044a, r82.f18044a) == true) goto L12;
        return false;
    L12:
        if (this.f18045b == r82.f18045b) goto L15;
        return false;
    L15:
        if (androidx.compose.ui.geometry.e.j(this.f18046c, r82.f18046c) == true) goto L18;
        return false;
    L18:
        if (androidx.compose.ui.geometry.e.j(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f18047e == r82.f18047e) goto L24;
        return false;
    L24:
        if (Float.compare(this.f18048f, r82.f18048f) == 0) goto L27;
        return false;
    L27:
        if (J.i(this.f18049g, r82.f18049g) == true) goto L30;
        return false;
    L30:
        if (this.f18050h == r82.f18050h) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f18051i, r82.f18051i) == true) goto L36;
        return false;
    L36:
        if (androidx.compose.ui.geometry.e.j(this.f18052j, r82.f18052j) == true) goto L39;
        return false;
    L39:
        if (androidx.compose.ui.geometry.e.j(this.f18053k, r82.f18053k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final long f() {
        return this.d;
    }

    public final long g() {
        return this.f18046c;
    }

    public final float h() {
        return this.f18048f;
    }

    public int hashCode() {
        return (((((((((((((((((((x.c(this.f18044a) * 31) + Long.hashCode(this.f18045b)) * 31) + androidx.compose.ui.geometry.e.o(this.f18046c)) * 31) + androidx.compose.ui.geometry.e.o(this.d)) * 31) + Boolean.hashCode(this.f18047e)) * 31) + Float.hashCode(this.f18048f)) * 31) + J.j(this.f18049g)) * 31) + Boolean.hashCode(this.f18050h)) * 31) + this.f18051i.hashCode()) * 31) + androidx.compose.ui.geometry.e.o(this.f18052j)) * 31) + androidx.compose.ui.geometry.e.o(this.f18053k);
    }

    public final long i() {
        return this.f18052j;
    }

    public final int j() {
        return this.f18049g;
    }

    public final long k() {
        return this.f18045b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + x.d(this.f18044a) + ", uptime=" + this.f18045b + ", positionOnScreen=" + androidx.compose.ui.geometry.e.s(this.f18046c) + ", position=" + androidx.compose.ui.geometry.e.s(this.d) + ", down=" + this.f18047e + ", pressure=" + this.f18048f + ", type=" + J.k(this.f18049g) + ", activeHover=" + this.f18050h + ", historical=" + this.f18051i + ", scrollDelta=" + androidx.compose.ui.geometry.e.s(this.f18052j) + ", originalEventPosition=" + androidx.compose.ui.geometry.e.s(this.f18053k) + ')';
    }

    public B(long r1, long r3, long r5, long r7, boolean r9, float r10, int r11, boolean r12, List r13, long r14, long r16) {
        this.f18044a = r1;
        this.f18045b = r3;
        this.f18046c = r5;
        this.d = r7;
        this.f18047e = r9;
        this.f18048f = r10;
        this.f18049g = r11;
        this.f18050h = r12;
        this.f18051i = r13;
        this.f18052j = r14;
        this.f18053k = r16;
    }
}
