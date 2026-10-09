package androidx.compose.ui.graphics;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class V implements InterfaceC3496b1 {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f17176a;

    static {
    }

    public V(PathMeasure r1) {
        this.f17176a = r1;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC3496b1
    public boolean a(float r3, float r4, Path r5, boolean r6) {
        PathMeasure r02 = this.f17176a;
        if ((r5 instanceof S) == false) goto L7;
        return r02.getSegment(r3, r4, ((S) r5).y(), r6);
    L7:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.InterfaceC3496b1
    public void b(Path r3, boolean r4) {
        PathMeasure r02 = this.f17176a;
        if (r3 != null) goto L5;
        android.graphics.Path r32 = null;
    L10:
        r02.setPath(r32, r4);
        return;
    L5:
        if ((r3 instanceof S) == false) goto L8;
        r32 = ((S) r3).y();
        goto L10
    L8:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.InterfaceC3496b1
    public float c() {
        return this.f17176a.getLength();
    }
}
