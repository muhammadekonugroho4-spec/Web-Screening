package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f180125a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f180126b;

    public a(Object r1, Object r2) {
        this.f180125a = r1;
        this.f180126b = r2;
    }

    public final Object a() {
        return this.f180125a;
    }

    public final Object b() {
        return this.f180126b;
    }

    public final Object c() {
        return this.f180125a;
    }

    public final Object d() {
        return this.f180126b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f180125a, r52.f180125a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f180126b, r52.f180126b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f180125a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Object r2 = this.f180126b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f180125a + ", upper=" + this.f180126b + ')';
    }
}
