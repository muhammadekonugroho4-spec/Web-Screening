package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public final class s implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f177503a;

    /* renamed from: b, reason: collision with root package name */
    public final String f177504b;

    public s(Class r2, String r3) {
        p.l(r2, "jClass");
        p.l(r3, "moduleName");
        this.f177503a = r2;
        this.f177504b = r3;
    }

    @Override // kotlin.jvm.internal.f
    public Class e() {
        return this.f177503a;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof s) == true) goto L5;
        return false;
    L5:
        if (p.g(e(), ((s) r2).e()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString() + " (Kotlin reflection is not available)";
    }
}
