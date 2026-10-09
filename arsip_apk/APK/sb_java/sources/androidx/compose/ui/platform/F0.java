package androidx.compose.ui.platform;

import java.util.List;

/* loaded from: classes.dex */
public final class F0 implements androidx.compose.ui.node.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19156a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19157b;

    /* renamed from: c, reason: collision with root package name */
    public Float f19158c;
    public Float d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.compose.ui.semantics.l f19159e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.compose.ui.semantics.l f19160f;

    static {
    }

    public F0(int r1, List r2, Float r3, Float r4, androidx.compose.ui.semantics.l r5, androidx.compose.ui.semantics.l r6) {
        this.f19156a = r1;
        this.f19157b = r2;
        this.f19158c = r3;
        this.d = r4;
        this.f19159e = r5;
        this.f19160f = r6;
    }

    public final androidx.compose.ui.semantics.l a() {
        return this.f19159e;
    }

    public final Float b() {
        return this.f19158c;
    }

    public final Float c() {
        return this.d;
    }

    public final int d() {
        return this.f19156a;
    }

    public final androidx.compose.ui.semantics.l e() {
        return this.f19160f;
    }

    public final void f(androidx.compose.ui.semantics.l r1) {
        this.f19159e = r1;
    }

    public final void g(Float r1) {
        this.f19158c = r1;
    }

    public final void h(Float r1) {
        this.d = r1;
    }

    public final void i(androidx.compose.ui.semantics.l r1) {
        this.f19160f = r1;
    }

    @Override // androidx.compose.ui.node.e0
    public boolean y0() {
        return this.f19157b.contains(this);
    }
}
