package androidx.navigationevent;

import androidx.core.app.NotificationCompat;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public c f26531a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26532b;

    public h() {
    }

    public final void a() {
        c r02 = this.f26531a;
        if (r02 == null) goto L10;
        if (this.f26532b == true) goto L7;
        r02.i(this, -1, null);
    L7:
        r02.f(this, -1);
        this.f26532b = false;
        return;
    L10:
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void b() {
        c r02 = this.f26531a;
        if (r02 == null) goto L10;
        if (this.f26532b == true) goto L7;
        r02.i(this, -1, null);
    L7:
        r02.g(this, -1);
        this.f26532b = false;
        return;
    L10:
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void c(b r3) {
        kotlin.jvm.internal.p.l(r3, NotificationCompat.CATEGORY_EVENT);
        c r02 = this.f26531a;
        if (r02 == null) goto L9;
        if (this.f26532b == false) goto L10;
        r02.h(this, -1, r3);
        return;
    L10:
        return;
    L9:
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void d(b r3) {
        kotlin.jvm.internal.p.l(r3, NotificationCompat.CATEGORY_EVENT);
        c r02 = this.f26531a;
        if (r02 == null) goto L9;
        if (this.f26532b == true) goto L10;
        r02.i(this, -1, r3);
        this.f26532b = true;
        return;
    L10:
        return;
    L9:
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void e(c r2) {
        kotlin.jvm.internal.p.l(r2, "dispatcher");
        i(r2);
    }

    public final void f(boolean r1) {
        j(r1);
    }

    public final void g(f r2) {
        kotlin.jvm.internal.p.l(r2, "history");
        k(r2);
    }

    public final c h() {
        return this.f26531a;
    }

    public void i(c r2) {
        kotlin.jvm.internal.p.l(r2, "dispatcher");
    }

    public void j(boolean r1) {
    }

    public void k(f r2) {
        kotlin.jvm.internal.p.l(r2, "history");
    }

    public final void l(c r1) {
        this.f26531a = r1;
    }
}
