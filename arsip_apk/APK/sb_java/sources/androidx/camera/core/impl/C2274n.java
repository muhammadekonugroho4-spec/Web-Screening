package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2274n extends P0 {

    /* renamed from: a, reason: collision with root package name */
    public final Size f5452a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f5453b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f5454c;
    public final Map d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f5455e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f5456f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f5457g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f5458h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f5459i;

    public C2274n(Size r1, Map r2, Size r3, Map r4, Size r5, Map r6, Map r7, Map r8, Map r9) {
        if (r1 == null) goto L39;
        this.f5452a = r1;
        if (r2 == null) goto L37;
        this.f5453b = r2;
        if (r3 == null) goto L35;
        this.f5454c = r3;
        if (r4 == null) goto L33;
        this.d = r4;
        if (r5 == null) goto L31;
        this.f5455e = r5;
        if (r6 == null) goto L29;
        this.f5456f = r6;
        if (r7 == null) goto L27;
        this.f5457g = r7;
        if (r8 == null) goto L25;
        this.f5458h = r8;
        if (r9 == null) goto L23;
        this.f5459i = r9;
        return;
    L23:
        throw new NullPointerException("Null ultraMaximumSizeMap");
    L25:
        throw new NullPointerException("Null maximum16x9SizeMap");
    L27:
        throw new NullPointerException("Null maximum4x3SizeMap");
    L29:
        throw new NullPointerException("Null maximumSizeMap");
    L31:
        throw new NullPointerException("Null recordSize");
    L33:
        throw new NullPointerException("Null s1440pSizeMap");
    L35:
        throw new NullPointerException("Null previewSize");
    L37:
        throw new NullPointerException("Null s720pSizeMap");
    L39:
        throw new NullPointerException("Null analysisSize");
    }

    @Override // androidx.camera.core.impl.P0
    public Size b() {
        return this.f5452a;
    }

    @Override // androidx.camera.core.impl.P0
    public Map d() {
        return this.f5458h;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof P0) == false) goto L26;
        P0 r52 = (P0) r5;
        if (this.f5452a.equals(r52.b()) == false) goto L26;
        if (this.f5453b.equals(r52.n()) == false) goto L26;
        if (this.f5454c.equals(r52.i()) == false) goto L26;
        if (this.d.equals(r52.l()) == false) goto L26;
        if (this.f5455e.equals(r52.j()) == false) goto L26;
        if (this.f5456f.equals(r52.h()) == false) goto L26;
        if (this.f5457g.equals(r52.f()) == false) goto L26;
        if (this.f5458h.equals(r52.d()) == false) goto L26;
        if (this.f5459i.equals(r52.p()) == false) goto L26;
        return true;
    L26:
        return false;
    }

    @Override // androidx.camera.core.impl.P0
    public Map f() {
        return this.f5457g;
    }

    @Override // androidx.camera.core.impl.P0
    public Map h() {
        return this.f5456f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f5452a.hashCode() ^ 1000003) * 1000003) ^ this.f5453b.hashCode()) * 1000003) ^ this.f5454c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f5455e.hashCode()) * 1000003) ^ this.f5456f.hashCode()) * 1000003) ^ this.f5457g.hashCode()) * 1000003) ^ this.f5458h.hashCode()) * 1000003) ^ this.f5459i.hashCode();
    }

    @Override // androidx.camera.core.impl.P0
    public Size i() {
        return this.f5454c;
    }

    @Override // androidx.camera.core.impl.P0
    public Size j() {
        return this.f5455e;
    }

    @Override // androidx.camera.core.impl.P0
    public Map l() {
        return this.d;
    }

    @Override // androidx.camera.core.impl.P0
    public Map n() {
        return this.f5453b;
    }

    @Override // androidx.camera.core.impl.P0
    public Map p() {
        return this.f5459i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f5452a + ", s720pSizeMap=" + this.f5453b + ", previewSize=" + this.f5454c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.f5455e + ", maximumSizeMap=" + this.f5456f + ", maximum4x3SizeMap=" + this.f5457g + ", maximum16x9SizeMap=" + this.f5458h + ", ultraMaximumSizeMap=" + this.f5459i + "}";
    }
}
