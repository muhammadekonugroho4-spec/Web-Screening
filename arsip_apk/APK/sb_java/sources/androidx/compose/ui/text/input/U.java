package androidx.compose.ui.text.input;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class U {

    /* renamed from: a, reason: collision with root package name */
    public final K f20037a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f20038b;

    static {
    }

    public U(K r2) {
        this.f20037a = r2;
        this.f20038b = new AtomicReference(null);
    }

    public final Z a() {
        return (Z) this.f20038b.get();
    }

    public final void b() {
        this.f20037a.e();
    }

    public final void c() {
        if (a() == null) goto L6;
        this.f20037a.f();
        return;
    }

    public Z d(S r2, C3796s r3, kotlin.jvm.functions.l r4, kotlin.jvm.functions.l r5) {
        this.f20037a.g(r2, r3, r4, r5);
        Z r22 = new Z(this, this.f20037a);
        this.f20038b.set(r22);
        return r22;
    }

    public final void e() {
        this.f20037a.d();
        Z r02 = new Z(this, this.f20037a);
        this.f20038b.set(r02);
    }

    public final void f() {
        this.f20038b.set(null);
        this.f20037a.a();
    }

    public void g(Z r3) {
        if (androidx.camera.view.i.a(this.f20038b, r3, null) == false) goto L6;
        this.f20037a.a();
        return;
    }
}
