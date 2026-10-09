package androidx.compose.ui.platform;

/* renamed from: androidx.compose.ui.platform.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3653c0 implements J0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.text.input.U f19311a;

    static {
    }

    public C3653c0(androidx.compose.ui.text.input.U r1) {
        this.f19311a = r1;
    }

    @Override // androidx.compose.ui.platform.J0
    public void hide() {
        this.f19311a.b();
    }

    @Override // androidx.compose.ui.platform.J0
    public void show() {
        this.f19311a.c();
    }
}
