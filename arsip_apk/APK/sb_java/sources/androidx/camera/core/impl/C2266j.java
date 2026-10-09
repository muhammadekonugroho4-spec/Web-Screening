package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2266j extends AbstractC2259f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5426a;

    public C2266j(Object r2) {
        if (r2 == null) goto L7;
        this.f5426a = r2;
        return;
    L7:
        throw new NullPointerException("Null value");
    }

    @Override // androidx.camera.core.impl.AbstractC2259f0
    public Object b() {
        return this.f5426a;
    }

    public boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof AbstractC2259f0) == true) goto L8;
        return false;
    L8:
        return this.f5426a.equals(((AbstractC2259f0) r2).b());
    }

    public int hashCode() {
        return this.f5426a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f5426a + "}";
    }
}
