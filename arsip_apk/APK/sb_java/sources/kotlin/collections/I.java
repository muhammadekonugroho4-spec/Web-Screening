package kotlin.collections;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final int f177338a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f177339b;

    public I(int r1, Object r2) {
        this.f177338a = r1;
        this.f177339b = r2;
    }

    public final int a() {
        return this.f177338a;
    }

    public final Object b() {
        return this.f177339b;
    }

    public final int c() {
        return this.f177338a;
    }

    public final Object d() {
        return this.f177339b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof I) == true) goto L8;
        return false;
    L8:
        I r52 = (I) r5;
        if (this.f177338a == r52.f177338a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f177339b, r52.f177339b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f177338a) * 31;
        Object r1 = this.f177339b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "IndexedValue(index=" + this.f177338a + ", value=" + this.f177339b + ')';
    }
}
