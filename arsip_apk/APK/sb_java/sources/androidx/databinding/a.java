package androidx.databinding;

import androidx.databinding.h;

/* loaded from: classes4.dex */
public abstract class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public transient m f23586a;

    public a() {
    }

    @Override // androidx.databinding.h
    public void e(h.a r2) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.f23586a != null) goto L8;
        this.f23586a = new m();     // Catch: Throwable -> L6
    L8:
        monitor-exit(this);     // Catch: Throwable -> L6
        this.f23586a.a(r2);
    }

    @Override // androidx.databinding.h
    public void g(h.a r2) {
        monitor-enter(this);
        m r02 = this.f23586a;     // Catch: Throwable -> L7
        if (r02 != null) goto L9;
        monitor-exit(this);     // Catch: Throwable -> L7
        return;
    L9:
        monitor-exit(this);     // Catch: Throwable -> L7
        r02.k(r2);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void i(int r3) {
        monitor-enter(this);
        m r02 = this.f23586a;     // Catch: Throwable -> L7
        if (r02 != null) goto L9;
        monitor-exit(this);     // Catch: Throwable -> L7
        return;
    L9:
        monitor-exit(this);     // Catch: Throwable -> L7
        r02.e(this, r3, null);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
