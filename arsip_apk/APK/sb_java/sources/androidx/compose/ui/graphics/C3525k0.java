package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;

/* renamed from: androidx.compose.ui.graphics.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3525k0 extends h1 {

    /* renamed from: b, reason: collision with root package name */
    public final h1 f17373b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17374c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17375e;

    static {
    }

    public /* synthetic */ C3525k0(h1 r1, float r2, float r3, int r4, kotlin.jvm.internal.i r5) {
        this(r1, r2, r3, r4);
    }

    @Override // androidx.compose.ui.graphics.h1
    public RenderEffect b() {
        return m1.f17544a.a(this.f17373b, this.f17374c, this.d, this.f17375e);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3525k0) == true) goto L8;
        return false;
    L8:
        C3525k0 r52 = (C3525k0) r5;
        if (this.f17374c == r52.f17374c) goto L11;
    L19:
        return false;
    L11:
        if (this.d != r52.d) goto L19;
        if (w1.f(this.f17375e, r52.f17375e) == true) goto L16;
        return false;
    L16:
        if (kotlin.jvm.internal.p.g(this.f17373b, r52.f17373b) == true) goto L18;
        return false;
    L18:
        return true;
    }

    public int hashCode() {
        h1 r02 = this.f17373b;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (((((r03 * 31) + Float.hashCode(this.f17374c)) * 31) + Float.hashCode(this.d)) * 31) + w1.g(this.f17375e);
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.f17373b + ", radiusX=" + this.f17374c + ", radiusY=" + this.d + ", edgeTreatment=" + w1.h(this.f17375e) + ')';
    }

    public C3525k0(h1 r2, float r3, float r4, int r5) {
        super(null);
        this.f17373b = r2;
        this.f17374c = r3;
        this.d = r4;
        this.f17375e = r5;
    }
}
