package androidx.activity.compose;

/* renamed from: androidx.activity.compose.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2057a {

    /* renamed from: a, reason: collision with root package name */
    public androidx.activity.result.b f2143a;

    static {
    }

    public C2057a() {
    }

    public final void a(Object r2, androidx.core.app.c r3) {
        androidx.activity.result.b r02 = this.f2143a;
        if (r02 == null) goto L7;
        r02.c(r2, r3);
        return;
    L7:
        throw new IllegalStateException("Launcher has not been initialized");
    }

    public final void b(androidx.activity.result.b r1) {
        this.f2143a = r1;
    }

    public final void c() {
        androidx.activity.result.b r02 = this.f2143a;
        if (r02 == null) goto L7;
        r02.d();
        return;
    L7:
        throw new IllegalStateException("Launcher has not been initialized");
    }
}
