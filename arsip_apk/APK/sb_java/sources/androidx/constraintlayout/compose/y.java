package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;

/* loaded from: classes.dex */
public final class y extends State {

    /* renamed from: l, reason: collision with root package name */
    public final androidx.compose.ui.unit.e f20970l;

    /* renamed from: m, reason: collision with root package name */
    public long f20971m;

    /* renamed from: n, reason: collision with root package name */
    public LayoutDirection f20972n;

    static {
    }

    public y(androidx.compose.ui.unit.e r7) {
        this.f20970l = r7;
        this.f20971m = androidx.compose.ui.unit.d.b(0, 0, 0, 0, 15, null);
        this.f20972n = LayoutDirection.Ltr;
        v(new x(this));
    }

    public static /* synthetic */ float D(y r02, float r1) {
        return E(r02, r1);
    }

    public static final float E(y r02, float r1) {
        return r02.f20970l.getDensity() * r1;
    }

    public final long F() {
        return this.f20971m;
    }

    public final void G(long r1) {
        this.f20971m = r1;
    }

    @Override // androidx.constraintlayout.core.state.State
    public int e(Object r2) {
        if ((r2 instanceof androidx.compose.ui.unit.i) == false) goto L7;
        return this.f20970l.B1(((androidx.compose.ui.unit.i) r2).m());
    L7:
        return super.e(r2);
    }
}
