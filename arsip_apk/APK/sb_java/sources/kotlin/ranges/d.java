package kotlin.ranges;

/* loaded from: classes3.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f177543a;

    /* renamed from: b, reason: collision with root package name */
    public final float f177544b;

    public d(float r1, float r2) {
        this.f177543a = r1;
        this.f177544b = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.e
    public /* bridge */ /* synthetic */ boolean a(Comparable r1, Comparable r2) {
        return g(((Number) r1).floatValue(), ((Number) r2).floatValue());
    }

    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ Comparable b() {
        return e();
    }

    public boolean c(float r2) {
        if (r2 >= this.f177543a) goto L5;
        return false;
    L5:
        if (r2 > this.f177544b) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.e, kotlin.ranges.f, kotlin.ranges.o
    public /* bridge */ /* synthetic */ boolean contains(Comparable r1) {
        return c(((Number) r1).floatValue());
    }

    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ Comparable d() {
        return f();
    }

    public Float e() {
        return Float.valueOf(this.f177544b);
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof d) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        d r32 = (d) r3;
        if (this.f177543a == r32.f177543a) goto L11;
        return false;
    L11:
        if (this.f177544b != r32.f177544b) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((d) r3).isEmpty() == false) goto L8;
        return true;
    }

    public Float f() {
        return Float.valueOf(this.f177543a);
    }

    public boolean g(float r1, float r2) {
        if (r1 > r2) goto L6;
        return true;
    L6:
        return false;
    }

    public int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (Float.hashCode(this.f177543a) * 31) + Float.hashCode(this.f177544b);
    }

    @Override // kotlin.ranges.e, kotlin.ranges.f
    public boolean isEmpty() {
        if (this.f177543a <= this.f177544b) goto L6;
        return true;
    L6:
        return false;
    }

    public String toString() {
        return this.f177543a + ".." + this.f177544b;
    }
}
