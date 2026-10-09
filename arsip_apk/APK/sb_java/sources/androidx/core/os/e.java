package androidx.core.os;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22963a;

    /* renamed from: b, reason: collision with root package name */
    public a f22964b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22965c;
    public boolean d;

    public interface a {
        void onCancel();
    }

    public e() {
    }

    public void a() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f22963a == false) goto L9;
        monitor-exit(this);     // Catch: Throwable -> L7
        return;
    L9:
        this.f22963a = true;     // Catch: Throwable -> L7
        this.d = true;     // Catch: Throwable -> L7
        a r02 = this.f22964b;     // Catch: Throwable -> L7
        Object r1 = this.f22965c;     // Catch: Throwable -> L7
        monitor-exit(this);     // Catch: Throwable -> L7
        if (r02 != null) goto L38;
    L16:
        if (r1 == null) goto L26;
        ((CancellationSignal) r1).cancel();     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        monitor-enter(this);
        this.d = false;     // Catch: Throwable -> L23
        notifyAll();     // Catch: Throwable -> L23
        throw th;
    L23:
        th = move-exception;
        throw th;
    L26:
        monitor-enter(this);
        this.d = false;     // Catch: Throwable -> L30
        notifyAll();     // Catch: Throwable -> L30
        monitor-exit(this);     // Catch: Throwable -> L30
        return;
    L30:
        th = move-exception;
        throw th;
    L38:
        r02.onCancel();     // Catch: Throwable -> L14
        goto L16
    }

    public Object b() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f22965c != null) goto L10;
        CancellationSignal r02 = new CancellationSignal();     // Catch: Throwable -> L8
        this.f22965c = r02;     // Catch: Throwable -> L8
        if (this.f22963a == false) goto L10;
        r02.cancel();     // Catch: Throwable -> L8
    L10:
        Object r03 = this.f22965c;     // Catch: Throwable -> L8
        monitor-exit(this);     // Catch: Throwable -> L8
        return r03;
    }

    public void c(a r2) {
        monitor-enter(this);
        d();     // Catch: Throwable -> L7
        if (this.f22964b != r2) goto L9;
        monitor-exit(this);     // Catch: Throwable -> L7
        return;
    L9:
        this.f22964b = r2;     // Catch: Throwable -> L7
        if (this.f22963a == false) goto L16;
        if (r2 == null) goto L16;
        monitor-exit(this);     // Catch: Throwable -> L7
        r2.onCancel();
        return;
    L16:
        monitor-exit(this);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void d() {
    L3:
        if (this.d == false) goto L6;
        wait();     // Catch: InterruptedException -> L7
        goto L3
    }
}
