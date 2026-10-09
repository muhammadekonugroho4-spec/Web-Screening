package androidx.glance.appwidget;

import androidx.glance.o;

/* renamed from: androidx.glance.appwidget.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3972k implements o.b {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.glance.unit.d f24920b;

    static {
    }

    public C3972k(androidx.glance.unit.d r1) {
        this.f24920b = r1;
    }

    public final androidx.glance.unit.d b() {
        return this.f24920b;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C3972k) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f24920b, ((C3972k) r4).f24920b) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f24920b.hashCode();
    }

    public String toString() {
        return "CornerRadiusModifier(radius=" + this.f24920b + ')';
    }
}
