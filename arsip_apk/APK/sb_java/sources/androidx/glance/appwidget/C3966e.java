package androidx.glance.appwidget;

import androidx.glance.layout.a;

/* renamed from: androidx.glance.appwidget.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3966e {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutType f24910a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24912c;

    static {
    }

    public /* synthetic */ C3966e(LayoutType r1, int r2, int r3, kotlin.jvm.internal.i r4) {
        this(r1, r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3966e) == true) goto L8;
        return false;
    L8:
        C3966e r52 = (C3966e) r5;
        if (this.f24910a == r52.f24910a) goto L12;
        return false;
    L12:
        if (a.b.g(this.f24911b, r52.f24911b) == true) goto L15;
        return false;
    L15:
        if (a.c.g(this.f24912c, r52.f24912c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f24910a.hashCode() * 31) + a.b.h(this.f24911b)) * 31) + a.c.h(this.f24912c);
    }

    public String toString() {
        return "BoxChildSelector(type=" + this.f24910a + ", horizontalAlignment=" + a.b.i(this.f24911b) + ", verticalAlignment=" + a.c.i(this.f24912c) + ')';
    }

    public C3966e(LayoutType r1, int r2, int r3) {
        this.f24910a = r1;
        this.f24911b = r2;
        this.f24912c = r3;
    }
}
