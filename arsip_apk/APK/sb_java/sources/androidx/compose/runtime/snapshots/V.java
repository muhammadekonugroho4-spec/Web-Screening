package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;

/* loaded from: classes.dex */
public abstract class V implements U {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInt f16551a;

    static {
    }

    public V() {
        this.f16551a = new AtomicInt(0);
    }

    public final boolean u(int r2) {
        if ((r2 & AbstractC3445h.a(this.f16551a.get())) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void x(int r4) {
    L2:
        int r02 = AbstractC3445h.a(this.f16551a.get());
        if ((r02 & r4) != 0) goto L4;
        int r1 = AbstractC3445h.a(r02 | r4);
        if (this.f16551a.compareAndSet(r02, r1) == false) goto L2;
        return;
    }
}
