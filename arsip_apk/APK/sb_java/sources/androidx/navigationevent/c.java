package androidx.navigationevent;

import androidx.core.app.NotificationCompat;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final a f26512i = null;

    /* renamed from: a, reason: collision with root package name */
    public c f26513a;

    /* renamed from: b, reason: collision with root package name */
    public final l f26514b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26515c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final i f26516e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f26517f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f26518g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f26519h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f26512i = new a(null);
    }

    public c(c r1, l r2) {
        this.f26513a = r1;
        this.f26514b = r2;
        this.d = true;
        if (r1 == null) goto L6;
        i r12 = r1.f26516e;
        if (r12 == null) goto L6;
    L7:
        this.f26516e = r12;
        this.f26517f = new LinkedHashSet();
        this.f26518g = new LinkedHashSet();
        this.f26519h = new LinkedHashSet();
        c r13 = this.f26513a;
        if (r13 == null) goto L11;
        r13.f26517f.add(this);
        return;
    L11:
        return;
    L6:
        r12 = new i();
        goto L7
    }

    public static /* synthetic */ void b(c r02, e r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 1;
    L5:
        r02.a(r1, r2);
    }

    public final void a(e r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "handler");
        e();
        if (this.f26518g.add(r2) == false) goto L6;
        this.f26516e.a(this, r2, r3);
        return;
    }

    public final void c(h r3) {
        kotlin.jvm.internal.p.l(r3, "input");
        e();
        if (this.f26519h.add(r3) == false) goto L6;
        this.f26516e.b(this, r3, -1);
        return;
    }

    public final void d(h r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "input");
        e();
        if (r3 == 1) goto L9;
        if (r3 == 0) goto L9;
        throw new IllegalArgumentException(("Unsupported priority value: " + r3).toString());
    L9:
        if (this.f26519h.add(r2) == false) goto L12;
        this.f26516e.b(this, r2, r3);
        return;
    }

    public final void e() {
        if (k() == true) goto L6;
        return;
    L6:
        throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
    }

    public final void f(h r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "input");
        e();
        if (l() == true) goto L5;
        return;
    L5:
        this.f26516e.c(r2, r3);
    }

    public final void g(h r3, int r4) {
        kotlin.jvm.internal.p.l(r3, "input");
        e();
        if (l() == true) goto L5;
        return;
    L5:
        this.f26516e.d(r3, r4, this.f26514b);
    }

    public final void h(h r2, int r3, b r4) {
        kotlin.jvm.internal.p.l(r2, "input");
        kotlin.jvm.internal.p.l(r4, NotificationCompat.CATEGORY_EVENT);
        e();
        if (l() == true) goto L5;
        return;
    L5:
        this.f26516e.e(r2, r3, r4);
    }

    public final void i(h r2, int r3, b r4) {
        kotlin.jvm.internal.p.l(r2, "input");
        e();
        if (l() == true) goto L5;
        return;
    L5:
        this.f26516e.f(r2, r3, r4);
    }

    public final i j() {
        return this.f26516e;
    }

    public final boolean k() {
        c r02 = this.f26513a;
        if (r02 == null) goto L8;
        if (r02.k() != true) goto L8;
        return true;
    L8:
        return this.f26515c;
    }

    public final boolean l() {
        c r02 = this.f26513a;
        if (r02 == null) goto L9;
        if (r02.l() == true) goto L9;
        return false;
    L9:
        return this.d;
    }

    public final void m(e r2) {
        kotlin.jvm.internal.p.l(r2, "handler");
        if (this.f26518g.remove(r2) == false) goto L6;
        this.f26516e.h(r2);
        return;
    }

    public c(l r2) {
        kotlin.jvm.internal.p.l(r2, "onBackCompletedFallback");
        this(null, r2);
    }
}
