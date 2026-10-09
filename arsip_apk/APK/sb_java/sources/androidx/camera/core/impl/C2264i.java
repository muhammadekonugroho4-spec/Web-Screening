package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.core.impl.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2264i extends Config.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5413a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f5414b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5415c;

    public C2264i(String r1, Class r2, Object r3) {
        if (r1 == null) goto L11;
        this.f5413a = r1;
        if (r2 == null) goto L9;
        this.f5414b = r2;
        this.f5415c = r3;
        return;
    L9:
        throw new NullPointerException("Null valueClass");
    L11:
        throw new NullPointerException("Null id");
    }

    @Override // androidx.camera.core.impl.Config.a
    public String c() {
        return this.f5413a;
    }

    @Override // androidx.camera.core.impl.Config.a
    public Object d() {
        return this.f5415c;
    }

    @Override // androidx.camera.core.impl.Config.a
    public Class e() {
        return this.f5414b;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof Config.a) == false) goto L19;
        Config.a r52 = (Config.a) r5;
        if (this.f5413a.equals(r52.c()) == false) goto L19;
        if (this.f5414b.equals(r52.e()) == false) goto L19;
        Object r1 = this.f5415c;
        if (r1 != null) goto L17;
        if (r52.d() != null) goto L19;
    L18:
        return true;
    L17:
        if (r1.equals(r52.d()) == true) goto L18;
    L19:
        return false;
    }

    public int hashCode() {
        int r02 = (((this.f5413a.hashCode() ^ 1000003) * 1000003) ^ this.f5414b.hashCode()) * 1000003;
        Object r1 = this.f5415c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 ^ r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "Option{id=" + this.f5413a + ", valueClass=" + this.f5414b + ", token=" + this.f5415c + "}";
    }
}
