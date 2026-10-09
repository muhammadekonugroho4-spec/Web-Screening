package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;

/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    public final SecureFlagPolicy f12571a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12572b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12573c;
    public final Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f12574e;

    static {
    }

    public J1(boolean r2, boolean r3) {
        this.f12571a = SecureFlagPolicy.Inherit;
        this.f12572b = r2;
        this.f12573c = r3;
        this.f12574e = null;
        this.d = null;
    }

    public final SecureFlagPolicy a() {
        return this.f12571a;
    }

    public final boolean b() {
        return this.f12572b;
    }

    public final Boolean c() {
        return this.f12574e;
    }

    public final Boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.f12573c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof J1) == true) goto L8;
        return false;
    L8:
        J1 r52 = (J1) r5;
        if (this.f12571a == r52.f12571a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f12574e, r52.f12574e) == true) goto L18;
        return false;
    L18:
        if (this.f12573c == r52.f12573c) goto L21;
        return false;
    L21:
        if (this.f12572b == r52.f12572b) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f12571a.hashCode() * 31) + Boolean.hashCode(this.f12572b)) * 31;
        Boolean r1 = this.d;
        int r2 = 0;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L6:
        int r03 = (r02 + r12) * 31;
        Boolean r13 = this.f12574e;
        if (r13 == null) goto L10;
        r2 = r13.hashCode();
    L10:
        return ((r03 + r2) * 31) + Boolean.hashCode(this.f12573c);
    L5:
        r12 = 0;
        goto L6
    }

    public /* synthetic */ J1(boolean r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = true;
    L8:
        this(r2, r3);
    }
}
