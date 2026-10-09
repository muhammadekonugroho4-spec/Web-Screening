package androidx.camera.core.processing;

/* renamed from: androidx.camera.core.processing.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2325u implements androidx.core.util.a {

    /* renamed from: a, reason: collision with root package name */
    public androidx.core.util.a f5937a;

    public C2325u() {
    }

    public void a(androidx.core.util.a r1) {
        this.f5937a = r1;
    }

    @Override // androidx.core.util.a
    public void accept(Object r3) {
        kotlin.jvm.internal.p.j(this.f5937a, "Listener is not set.");
        this.f5937a.accept(r3);
    }
}
