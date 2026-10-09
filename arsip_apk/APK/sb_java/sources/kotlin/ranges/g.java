package kotlin.ranges;

import kotlin.ranges.f;

/* loaded from: classes3.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f177545a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f177546b;

    public g(Comparable r2, Comparable r3) {
        kotlin.jvm.internal.p.l(r2, "start");
        kotlin.jvm.internal.p.l(r3, "endInclusive");
        this.f177545a = r2;
        this.f177546b = r3;
    }

    @Override // kotlin.ranges.f
    public Comparable b() {
        return this.f177546b;
    }

    @Override // kotlin.ranges.f, kotlin.ranges.o
    public /* bridge */ boolean contains(Comparable r1) {
        return f.a.a(this, r1);
    }

    @Override // kotlin.ranges.f
    public Comparable d() {
        return this.f177545a;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof g) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        g r32 = (g) r3;
        if (kotlin.jvm.internal.p.g(d(), r32.d()) == true) goto L11;
        return false;
    L11:
        if (kotlin.jvm.internal.p.g(b(), r32.b()) == false) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((g) r3).isEmpty() == false) goto L8;
        return true;
    }

    public int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (d().hashCode() * 31) + b().hashCode();
    }

    @Override // kotlin.ranges.f
    public /* bridge */ boolean isEmpty() {
        return f.a.b(this);
    }

    public String toString() {
        return d() + ".." + b();
    }
}
