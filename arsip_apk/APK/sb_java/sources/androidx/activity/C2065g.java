package androidx.activity;

import android.os.Build;
import android.window.BackEvent;

/* renamed from: androidx.activity.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2065g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f2200f = null;

    /* renamed from: a, reason: collision with root package name */
    public final float f2201a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2202b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2203c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2204e;

    /* renamed from: androidx.activity.g$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f2200f = new a(null);
    }

    public C2065g(float r1, float r2, float r3, int r4, long r5) {
        this.f2201a = r1;
        this.f2202b = r2;
        this.f2203c = r3;
        this.d = r4;
        this.f2204e = r5;
    }

    public final float a() {
        return this.f2203c;
    }

    public final int b() {
        return this.d;
    }

    public final float c() {
        return this.f2202b;
    }

    public String toString() {
        return "BackEventCompat(touchX=" + this.f2201a + ", touchY=" + this.f2202b + ", progress=" + this.f2203c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.f2204e + ')';
    }

    public C2065g(BackEvent r9) {
        kotlin.jvm.internal.p.l(r9, "backEvent");
        float r2 = AbstractC2055b.a(r9);
        float r3 = AbstractC2056c.a(r9);
        float r4 = AbstractC2062d.a(r9);
        int r5 = AbstractC2063e.a(r9);
        if (Build.VERSION.SDK_INT < 36) goto L6;
        long r02 = AbstractC2064f.a(r9);
    L7:
        this(r2, r3, r4, r5, r02);
        return;
    L6:
        r02 = 0;
        goto L7
    }

    public C2065g(androidx.navigationevent.b r9) {
        kotlin.jvm.internal.p.l(r9, "navigationEvent");
        this(r9.d(), r9.e(), r9.b(), r9.c(), r9.a());
    }
}
