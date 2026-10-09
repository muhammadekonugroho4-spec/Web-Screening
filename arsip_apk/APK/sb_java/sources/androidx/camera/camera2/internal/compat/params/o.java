package androidx.camera.camera2.internal.compat.params;

import androidx.camera.camera2.internal.compat.params.j;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class o implements j.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4333a;

    public o(Object r1) {
        this.f4333a = r1;
    }

    @Override // androidx.camera.camera2.internal.compat.params.j.a
    public void e(long r1) {
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof o) == true) goto L7;
        return false;
    L7:
        return Objects.equals(this.f4333a, ((o) r2).f4333a);
    }

    @Override // androidx.camera.camera2.internal.compat.params.j.a
    public void h(int r1) {
    }

    public int hashCode() {
        return this.f4333a.hashCode();
    }
}
