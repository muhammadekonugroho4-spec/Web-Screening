package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c f19280a;

    /* renamed from: b, reason: collision with root package name */
    public final ReferenceQueue f19281b;

    static {
    }

    public X0() {
        this.f19280a = new androidx.compose.runtime.collection.c(new Reference[16], 0);
        this.f19281b = new ReferenceQueue();
    }

    public final void a() {
    L2:
        Reference r02 = this.f19281b.poll();
        if (r02 == null) goto L5;
        this.f19280a.p(r02);
    L5:
        if (r02 != null) goto L2;
    }

    public final Object b() {
        a();
    L4:
        if (this.f19280a.l() == 0) goto L8;
        Object r02 = ((Reference) this.f19280a.r(r0.l() - 1)).get();
        if (r02 == null) goto L4;
        return r02;
    L8:
        return null;
    }

    public final void c(Object r4) {
        a();
        this.f19280a.b(new WeakReference(r4, this.f19281b));
    }
}
