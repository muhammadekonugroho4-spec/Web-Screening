package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.I;
import androidx.camera.core.impl.InterfaceC2267j0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class o0 implements InterfaceC2267j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5765a;

    /* renamed from: b, reason: collision with root package name */
    public int f5766b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5767c;
    public final InterfaceC2267j0 d;

    /* renamed from: e, reason: collision with root package name */
    public final Surface f5768e;

    /* renamed from: f, reason: collision with root package name */
    public I.a f5769f;

    /* renamed from: g, reason: collision with root package name */
    public final I.a f5770g;

    public o0(InterfaceC2267j0 r2) {
        this.f5765a = new Object();
        this.f5766b = 0;
        this.f5767c = false;
        this.f5770g = new n0(this);
        this.d = r2;
        this.f5768e = r2.a();
    }

    public static /* synthetic */ void e(o0 r02, InterfaceC2267j0.a r1, InterfaceC2267j0 r2) {
        r02.getClass();
        r1.a(r02);
    }

    public static /* synthetic */ void i(o0 r3, W r4) {
        Object r02 = r3.f5765a;
        monitor-enter(r02);
        int r1 = r3.f5766b - 1;
        r3.f5766b = r1;     // Catch: Throwable -> L8
        if (r3.f5767c == false) goto L10;
        if (r1 != 0) goto L10;
        r3.close();     // Catch: Throwable -> L8
    L10:
        I.a r32 = r3.f5769f;     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        if (r32 == null) goto L19;
        r32.e(r4);
        return;
    L19:
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public Surface a() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        Surface r1 = this.d.a();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public int b() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        int r1 = this.d.b();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public int c() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        int r1 = this.d.c();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public void close() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        Surface r1 = this.f5768e;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.release();     // Catch: Throwable -> L7
    L9:
        this.d.close();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public W d() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        W r1 = m(this.d.d());     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public W f() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        W r1 = m(this.d.f());     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public void g() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        this.d.g();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public int getHeight() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        int r1 = this.d.getHeight();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public int getWidth() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        int r1 = this.d.getWidth();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public void h(final InterfaceC2267j0.a r4, Executor r5) {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        this.d.h(new m0(this, r4), r5);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public int j() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        int r1 = this.d.c() - this.f5766b;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public void k() {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        this.f5767c = true;     // Catch: Throwable -> L8
        this.d.g();     // Catch: Throwable -> L8
        if (this.f5766b != 0) goto L10;
        close();     // Catch: Throwable -> L8
    L10:
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void l(I.a r2) {
        Object r02 = this.f5765a;
        monitor-enter(r02);
        this.f5769f = r2;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final W m(W r2) {
        if (r2 == null) goto L5;
        this.f5766b++;
        s0 r02 = new s0(r2);
        r02.c(this.f5770g);
        return r02;
    L5:
        return null;
    }
}
