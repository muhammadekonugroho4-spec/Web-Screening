package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.name.b f179613a;

    /* renamed from: b, reason: collision with root package name */
    public final int f179614b;

    public f(kotlin.reflect.jvm.internal.impl.name.b r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "classId");
        this.f179613a = r2;
        this.f179614b = r3;
    }

    public final kotlin.reflect.jvm.internal.impl.name.b a() {
        return this.f179613a;
    }

    public final int b() {
        return this.f179614b;
    }

    public final int c() {
        return this.f179614b;
    }

    public final kotlin.reflect.jvm.internal.impl.name.b d() {
        return this.f179613a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f179613a, r52.f179613a) == true) goto L12;
        return false;
    L12:
        if (this.f179614b == r52.f179614b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f179613a.hashCode() * 31) + Integer.hashCode(this.f179614b);
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        int r1 = this.f179614b;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r02.append("kotlin/Array<");
        r3 = r3 + 1;
        goto L3
    L5:
        r02.append(this.f179613a);
        int r12 = this.f179614b;
    L6:
        if (r2 >= r12) goto L8;
        r02.append(">");
        r2 = r2 + 1;
        goto L6
    L8:
        String r03 = r02.toString();
        kotlin.jvm.internal.p.k(r03, "StringBuilder().apply(builderAction).toString()");
        return r03;
    }
}
