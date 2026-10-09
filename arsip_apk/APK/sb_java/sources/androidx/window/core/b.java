package androidx.window.core;

import android.graphics.Rect;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f28867e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final b f28868f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f28869a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28871c;
    public final int d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f28867e = new a(null);
        f28868f = new b(0, 0, 0, 0);
    }

    public b(int r1, int r2, int r3, int r4) {
        this.f28869a = r1;
        this.f28870b = r2;
        this.f28871c = r3;
        this.d = r4;
        if (r1 > r3) goto L9;
        if (r2 > r4) goto L7;
        return;
    L7:
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + r2 + ", bottom: " + r4).toString());
    L9:
        throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + r1 + ", right: " + r3).toString());
    }

    public final int a() {
        return this.d - this.f28870b;
    }

    public final int b() {
        return this.f28869a;
    }

    public final int c() {
        return this.f28870b;
    }

    public final int d() {
        return this.f28871c - this.f28869a;
    }

    public final boolean e() {
        if (a() == 0) goto L5;
        return false;
    L5:
        if (d() != 0) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if (r5 == null) goto L7;
        Class<?> r1 = r5.getClass();
    L9:
        if (p.g(b.class, r1) == true) goto L11;
        return false;
    L11:
        p.j(r5, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b r52 = (b) r5;
        if (this.f28869a == r52.f28869a) goto L15;
        return false;
    L15:
        if (this.f28870b == r52.f28870b) goto L18;
        return false;
    L18:
        if (this.f28871c == r52.f28871c) goto L21;
        return false;
    L21:
        if (this.d == r52.d) goto L23;
        return false;
    L23:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public final Rect f() {
        return new Rect(this.f28869a, this.f28870b, this.f28871c, this.d);
    }

    public int hashCode() {
        return (((((this.f28869a * 31) + this.f28870b) * 31) + this.f28871c) * 31) + this.d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f28869a + ',' + this.f28870b + ',' + this.f28871c + ',' + this.d + "] }";
    }

    public b(Rect r4) {
        p.l(r4, "rect");
        this(r4.left, r4.top, r4.right, r4.bottom);
    }
}
