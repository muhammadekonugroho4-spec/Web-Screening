package androidx.window.layout;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.window.core.b f28987a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28988b;

    public s(androidx.window.core.b r2, float r3) {
        kotlin.jvm.internal.p.l(r2, "_bounds");
        this.f28987a = r2;
        this.f28988b = r3;
    }

    public final Rect a() {
        return this.f28987a.f();
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if (r5 == null) goto L7;
        Class<?> r1 = r5.getClass();
    L9:
        if (kotlin.jvm.internal.p.g(s.class, r1) == true) goto L11;
        return false;
    L11:
        kotlin.jvm.internal.p.j(r5, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f28987a, r52.f28987a) == true) goto L15;
        return false;
    L15:
        if (this.f28988b != r52.f28988b) goto L17;
        return true;
    L17:
        return false;
    L7:
        r1 = null;
        goto L9
    }

    public int hashCode() {
        return (this.f28987a.hashCode() * 31) + Float.hashCode(this.f28988b);
    }

    public String toString() {
        return "WindowMetrics(_bounds=" + this.f28987a + ", density=" + this.f28988b + ')';
    }

    public s(Rect r2, float r3) {
        kotlin.jvm.internal.p.l(r2, "bounds");
        this(new androidx.window.core.b(r2), r3);
    }
}
