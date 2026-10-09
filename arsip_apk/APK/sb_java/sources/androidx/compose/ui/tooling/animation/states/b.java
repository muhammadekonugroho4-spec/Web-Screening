package androidx.compose.ui.tooling.animation.states;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20507a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20508b;

    static {
    }

    public b(Object r1, Object r2) {
        this.f20507a = r1;
        this.f20508b = r2;
    }

    public final Object a() {
        return this.f20507a;
    }

    public final Object b() {
        return this.f20508b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f20507a, r52.f20507a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f20508b, r52.f20508b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f20507a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Object r2 = this.f20508b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TargetState(initial=" + this.f20507a + ", target=" + this.f20508b + ')';
    }
}
