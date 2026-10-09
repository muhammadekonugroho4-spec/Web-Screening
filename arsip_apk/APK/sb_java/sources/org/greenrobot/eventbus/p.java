package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f182534a;

    /* renamed from: b, reason: collision with root package name */
    public final n f182535b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f182536c;

    public p(Object r1, n r2) {
        this.f182534a = r1;
        this.f182535b = r2;
        this.f182536c = true;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof p) == false) goto L10;
        p r42 = (p) r4;
        if (this.f182534a != r42.f182534a) goto L10;
        if (this.f182535b.equals(r42.f182535b) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        return this.f182534a.hashCode() + this.f182535b.f182523f.hashCode();
    }
}
