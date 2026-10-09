package androidx.compose.ui.semantics;

import android.graphics.Region;
import androidx.compose.ui.graphics.f1;

/* loaded from: classes.dex */
public final class m implements z {

    /* renamed from: a, reason: collision with root package name */
    public final Region f19566a;

    public m() {
        this.f19566a = new Region();
    }

    @Override // androidx.compose.ui.semantics.z
    public boolean a(z r3) {
        Region r02 = this.f19566a;
        kotlin.jvm.internal.p.j(r3, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticRegionImpl");
        return r02.op(((m) r3).f19566a, Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.semantics.z
    public boolean b(androidx.compose.ui.unit.q r7) {
        return this.f19566a.op(r7.f(), r7.i(), r7.g(), r7.d(), Region.Op.DIFFERENCE);
    }

    @Override // androidx.compose.ui.semantics.z
    public void c(androidx.compose.ui.unit.q r5) {
        this.f19566a.set(r5.f(), r5.i(), r5.g(), r5.d());
    }

    @Override // androidx.compose.ui.semantics.z
    public androidx.compose.ui.unit.q getBounds() {
        return f1.d(this.f19566a.getBounds());
    }

    @Override // androidx.compose.ui.semantics.z
    public boolean isEmpty() {
        return this.f19566a.isEmpty();
    }
}
