package androidx.camera.core.processing.concurrent;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.processing.util.e f5853a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.processing.util.e f5854b;

    public a(androidx.camera.core.processing.util.e r1, androidx.camera.core.processing.util.e r2) {
        if (r1 == null) goto L11;
        this.f5853a = r1;
        if (r2 == null) goto L9;
        this.f5854b = r2;
        return;
    L9:
        throw new NullPointerException("Null secondaryOutConfig");
    L11:
        throw new NullPointerException("Null primaryOutConfig");
    }

    @Override // androidx.camera.core.processing.concurrent.d
    public androidx.camera.core.processing.util.e a() {
        return this.f5853a;
    }

    @Override // androidx.camera.core.processing.concurrent.d
    public androidx.camera.core.processing.util.e b() {
        return this.f5854b;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == false) goto L12;
        d r52 = (d) r5;
        if (this.f5853a.equals(r52.a()) == false) goto L12;
        if (this.f5854b.equals(r52.b()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        return ((this.f5853a.hashCode() ^ 1000003) * 1000003) ^ this.f5854b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f5853a + ", secondaryOutConfig=" + this.f5854b + "}";
    }
}
