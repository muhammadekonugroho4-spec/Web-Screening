package androidx.compose.material_custom;

import androidx.compose.ui.window.SecureFlagPolicy;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final SecureFlagPolicy f15534a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15535b;

    static {
    }

    public X(SecureFlagPolicy r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "securePolicy");
        this.f15534a = r2;
        this.f15535b = r3;
    }

    public final SecureFlagPolicy a() {
        return this.f15534a;
    }

    public final boolean b() {
        return this.f15535b;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof X) == true) goto L9;
        return false;
    L9:
        if (this.f15534a == ((X) r4).f15534a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return (this.f15534a.hashCode() * 31) + Boolean.hashCode(this.f15535b);
    }

    public /* synthetic */ X(SecureFlagPolicy r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = SecureFlagPolicy.Inherit;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = true;
    L8:
        this(r1, r2);
    }
}
