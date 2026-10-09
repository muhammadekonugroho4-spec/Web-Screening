package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4007b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f25612a;

    public C4007b(Object r2) {
        this.f25612a = new AtomicReference(r2);
    }

    public final boolean a(Object r2, Object r3) {
        return androidx.camera.view.i.a(this.f25612a, r2, r3);
    }

    public final Object b() {
        return this.f25612a.get();
    }
}
