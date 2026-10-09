package androidx.camera.core.impl;

import androidx.camera.core.impl.M0;

/* renamed from: androidx.camera.core.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2270l extends M0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5438a;

    public C2270l(Throwable r2) {
        if (r2 == null) goto L7;
        this.f5438a = r2;
        return;
    L7:
        throw new NullPointerException("Null error");
    }

    @Override // androidx.camera.core.impl.M0.a
    public Throwable a() {
        return this.f5438a;
    }

    public boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof M0.a) == true) goto L8;
        return false;
    L8:
        return this.f5438a.equals(((M0.a) r2).a());
    }

    public int hashCode() {
        return this.f5438a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f5438a + "}";
    }
}
