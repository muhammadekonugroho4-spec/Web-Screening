package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f180276a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180277b;

    /* renamed from: c, reason: collision with root package name */
    public ClassLoader f180278c;

    public s(ClassLoader r2) {
        kotlin.jvm.internal.p.l(r2, "classLoader");
        this.f180276a = new WeakReference(r2);
        this.f180277b = System.identityHashCode(r2);
        this.f180278c = r2;
    }

    public final void a(ClassLoader r1) {
        this.f180278c = r1;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof s) == true) goto L5;
        return false;
    L5:
        if (this.f180276a.get() != ((s) r2).f180276a.get()) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        return this.f180277b;
    }

    public String toString() {
        ClassLoader r02 = (ClassLoader) this.f180276a.get();
        if (r02 == null) goto L8;
        String r03 = r02.toString();
        if (r03 == null) goto L10;
        return r03;
    L10:
        return "<null>";
    L8:
        return "<null>";
    }
}
