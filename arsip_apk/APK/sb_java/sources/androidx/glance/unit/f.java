package androidx.glance.unit;

import android.content.Context;
import androidx.compose.ui.graphics.AbstractC3571x0;

/* loaded from: classes4.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f25457a;

    static {
    }

    public f(int r1) {
        this.f25457a = r1;
    }

    @Override // androidx.glance.unit.a
    public long a(Context r3) {
        return AbstractC3571x0.b(b.f25451a.a(r3, this.f25457a));
    }

    public final int b() {
        return this.f25457a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (this.f25457a == ((f) r4).f25457a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f25457a);
    }

    public String toString() {
        return "ResourceColorProvider(resId=" + this.f25457a + ')';
    }
}
