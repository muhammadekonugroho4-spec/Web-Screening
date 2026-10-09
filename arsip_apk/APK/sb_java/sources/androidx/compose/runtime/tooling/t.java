package androidx.compose.runtime.tooling;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f16662a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f16663b;

    static {
    }

    public t(int r1, Integer r2) {
        this.f16662a = r1;
        this.f16663b = r2;
    }

    public final int a() {
        return this.f16662a;
    }

    public final Integer b() {
        return this.f16663b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof t) == true) goto L8;
        return false;
    L8:
        t r52 = (t) r5;
        if (this.f16662a == r52.f16662a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f16663b, r52.f16663b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f16662a) * 31;
        Integer r1 = this.f16663b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ObjectLocation(group=" + this.f16662a + ", dataOffset=" + this.f16663b + ')';
    }
}
