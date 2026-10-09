package androidx.glance.appwidget;

import androidx.glance.layout.a;

/* renamed from: androidx.glance.appwidget.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3969h {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutType f24915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24916b;

    /* renamed from: c, reason: collision with root package name */
    public final a.b f24917c;
    public final a.c d;

    static {
    }

    public /* synthetic */ C3969h(LayoutType r1, int r2, a.b r3, a.c r4, kotlin.jvm.internal.i r5) {
        this(r1, r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3969h) == true) goto L8;
        return false;
    L8:
        C3969h r52 = (C3969h) r5;
        if (this.f24915a == r52.f24915a) goto L12;
        return false;
    L12:
        if (this.f24916b == r52.f24916b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f24917c, r52.f24917c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f24915a.hashCode() * 31) + Integer.hashCode(this.f24916b)) * 31;
        a.b r1 = this.f24917c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        a.c r13 = this.d;
        if (r13 == null) goto L11;
        r2 = a.c.h(r13.j());
    L11:
        return r03 + r2;
    L5:
        r12 = a.b.h(r1.j());
        goto L6
    }

    public String toString() {
        return "ContainerSelector(type=" + this.f24915a + ", numChildren=" + this.f24916b + ", horizontalAlignment=" + this.f24917c + ", verticalAlignment=" + this.d + ')';
    }

    public C3969h(LayoutType r1, int r2, a.b r3, a.c r4) {
        this.f24915a = r1;
        this.f24916b = r2;
        this.f24917c = r3;
        this.d = r4;
    }

    public /* synthetic */ C3969h(LayoutType r8, int r9, a.b r10, a.c r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 4) == 0) goto L5;
        a.b r4 = null;
    L7:
        if ((r12 & 8) == 0) goto L9;
        a.c r5 = null;
    L10:
        this(r8, r9, r4, r5, null);
        return;
    L9:
        r5 = r11;
        goto L10
    L5:
        r4 = r10;
        goto L7
    }
}
