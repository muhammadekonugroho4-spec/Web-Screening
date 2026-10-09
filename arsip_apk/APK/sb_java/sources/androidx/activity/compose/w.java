package androidx.activity.compose;

import androidx.compose.runtime.o2;

/* loaded from: classes.dex */
public final class w extends androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final C2057a f2186a;

    /* renamed from: b, reason: collision with root package name */
    public final o2 f2187b;

    static {
    }

    public w(C2057a r1, o2 r2) {
        this.f2186a = r1;
        this.f2187b = r2;
    }

    @Override // androidx.activity.result.b
    public androidx.activity.result.contract.a a() {
        return (androidx.activity.result.contract.a) this.f2187b.getValue();
    }

    @Override // androidx.activity.result.b
    public void c(Object r2, androidx.core.app.c r3) {
        this.f2186a.a(r2, r3);
    }

    @Override // androidx.activity.result.b
    public void d() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
