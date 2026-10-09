package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.c;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes4.dex */
public final class d implements c {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.window.core.b f28962a;

    /* renamed from: b, reason: collision with root package name */
    public final b f28963b;

    /* renamed from: c, reason: collision with root package name */
    public final c.b f28964c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final void a(androidx.window.core.b r2) {
            kotlin.jvm.internal.p.l(r2, "bounds");
            if (r2.d() != 0) goto L10;
            if (r2.a() != 0) goto L10;
            throw new IllegalArgumentException("Bounds must be non zero");
        L10:
            if (r2.b() != 0) goto L12;
            return;
        L12:
            if (r2.c() != 0) goto L15;
            return;
        L15:
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f28965b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final b f28966c = null;
        public static final b d = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f28967a;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i r1) {
                this();
            }

            public final b a() {
                return b.a();
            }

            public final b b() {
                return b.b();
            }

            public a() {
            }
        }

        static {
            f28965b = new a(null);
            f28966c = new b("FOLD");
            d = new b("HINGE");
        }

        public b(String r1) {
            this.f28967a = r1;
        }

        public static final /* synthetic */ b a() {
            return f28966c;
        }

        public static final /* synthetic */ b b() {
            return d;
        }

        public String toString() {
            return this.f28967a;
        }
    }

    static {
        d = new a(null);
    }

    public d(androidx.window.core.b r2, b r3, c.b r4) {
        kotlin.jvm.internal.p.l(r2, "featureBounds");
        kotlin.jvm.internal.p.l(r3, "type");
        kotlin.jvm.internal.p.l(r4, RemoteConfigConstants.ResponseFieldKey.STATE);
        this.f28962a = r2;
        this.f28963b = r3;
        this.f28964c = r4;
        d.a(r2);
    }

    @Override // androidx.window.layout.c
    public c.a a() {
        if (this.f28962a.d() <= this.f28962a.a()) goto L7;
        return c.a.d;
    L7:
        return c.a.f28957c;
    }

    @Override // androidx.window.layout.c
    public boolean b() {
        b r02 = this.f28963b;
        b.a r1 = b.f28965b;
        if (kotlin.jvm.internal.p.g(r02, r1.b()) == false) goto L6;
        return true;
    L6:
        if (kotlin.jvm.internal.p.g(this.f28963b, r1.a()) == true) goto L8;
        return false;
    L8:
        if (kotlin.jvm.internal.p.g(c(), c.b.d) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public c.b c() {
        return this.f28964c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if (r5 == null) goto L7;
        Class<?> r1 = r5.getClass();
    L9:
        if (kotlin.jvm.internal.p.g(d.class, r1) == true) goto L11;
        return false;
    L11:
        kotlin.jvm.internal.p.j(r5, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f28962a, r52.f28962a) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f28963b, r52.f28963b) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(c(), r52.c()) == true) goto L20;
        return false;
    L20:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    @Override // androidx.window.layout.a
    public Rect getBounds() {
        return this.f28962a.f();
    }

    public int hashCode() {
        return (((this.f28962a.hashCode() * 31) + this.f28963b.hashCode()) * 31) + c().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.f28962a + ", type=" + this.f28963b + ", state=" + c() + " }";
    }
}
