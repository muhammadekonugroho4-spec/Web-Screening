package kotlin.ranges;

/* loaded from: classes3.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final double f177563a;

    /* renamed from: b, reason: collision with root package name */
    public final double f177564b;

    public n(double r1, double r3) {
        this.f177563a = r1;
        this.f177564b = r3;
    }

    public boolean a(double r3) {
        if (r3 >= this.f177563a) goto L5;
        return false;
    L5:
        if (r3 >= this.f177564b) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean b() {
        if (this.f177563a < this.f177564b) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.o
    public /* bridge */ /* synthetic */ boolean contains(Comparable r3) {
        return a(((Number) r3).doubleValue());
    }

    public boolean equals(Object r5) {
        if ((r5 instanceof n) == true) goto L5;
        return false;
    L5:
        if (b() == true) goto L7;
    L8:
        n r52 = (n) r5;
        if (this.f177563a == r52.f177563a) goto L11;
        return false;
    L11:
        if (this.f177564b != r52.f177564b) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((n) r5).b() == false) goto L8;
        return true;
    }

    public int hashCode() {
        if (b() == false) goto L7;
        return -1;
    L7:
        return (Double.hashCode(this.f177563a) * 31) + Double.hashCode(this.f177564b);
    }

    public String toString() {
        return this.f177563a + "..<" + this.f177564b;
    }
}
