package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2254d extends AbstractC2257e0 {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2297z f5377b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5378c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2285t f5379e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.A f5380f;

    public C2254d(InterfaceC2297z r2, InterfaceC2285t r3) {
        super(r2);
        this.f5378c = false;
        this.d = false;
        this.f5380f = null;
        this.f5377b = r2;
        this.f5379e = r3;
        r3.J(null);
        x(r3.D());
        w(r3.b0());
    }

    public static float u(float r3, float r4, float r5) {
        if (r5 != r4) goto L6;
        return 0.0f;
    L6:
        if (r3 != r5) goto L9;
        return 1.0f;
    L9:
        if (r3 != r4) goto L11;
        return 0.0f;
    L11:
        float r2 = 1.0f / r4;
        return ((1.0f / r3) - r2) / ((1.0f / r5) - r2);
    }

    @Override // androidx.camera.core.impl.AbstractC2257e0, androidx.camera.core.impl.InterfaceC2297z
    public InterfaceC2297z r() {
        return this.f5377b;
    }

    public InterfaceC2285t t() {
        return this.f5379e;
    }

    public L0 v() {
        return null;
    }

    public void w(boolean r1) {
        this.d = r1;
    }

    public void x(boolean r1) {
        this.f5378c = r1;
    }
}
