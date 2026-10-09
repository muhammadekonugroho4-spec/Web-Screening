package androidx.camera.core.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5258a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f5259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5260c;

    public Q0(Map r2, Map r3, int r4) {
        kotlin.jvm.internal.p.l(r2, "useCaseStreamSpecs");
        kotlin.jvm.internal.p.l(r3, "attachedSurfaceStreamSpecs");
        this.f5258a = r2;
        this.f5259b = r3;
        this.f5260c = r4;
    }

    public final Map a() {
        return this.f5258a;
    }

    public final Map b() {
        return this.f5259b;
    }

    public final int c() {
        return this.f5260c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Q0) == true) goto L8;
        return false;
    L8:
        Q0 r52 = (Q0) r5;
        if (kotlin.jvm.internal.p.g(this.f5258a, r52.f5258a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f5259b, r52.f5259b) == true) goto L15;
        return false;
    L15:
        if (this.f5260c == r52.f5260c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f5258a.hashCode() * 31) + this.f5259b.hashCode()) * 31) + Integer.hashCode(this.f5260c);
    }

    public String toString() {
        return "SurfaceStreamSpecQueryResult(useCaseStreamSpecs=" + this.f5258a + ", attachedSurfaceStreamSpecs=" + this.f5259b + ", maxSupportedFrameRate=" + this.f5260c + ')';
    }
}
