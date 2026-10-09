package com.journeyapps.barcodescanner;

/* loaded from: classes6.dex */
public class m implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f41187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41188b;

    public m(int r1, int r2) {
        this.f41187a = r1;
        this.f41188b = r2;
    }

    public int a(m r3) {
        int r02 = this.f41188b * this.f41187a;
        int r1 = r3.f41188b * r3.f41187a;
        if (r1 >= r02) goto L6;
        return 1;
    L6:
        if (r1 <= r02) goto L9;
        return -1;
    L9:
        return 0;
    }

    public m b() {
        return new m(this.f41188b, this.f41187a);
    }

    public m c(m r6) {
        int r02 = this.f41187a;
        int r1 = r6.f41188b;
        int r2 = r02 * r1;
        int r62 = r6.f41187a;
        int r3 = this.f41188b;
        if (r2 > (r62 * r3)) goto L7;
        return new m(r62, (r3 * r62) / r02);
    L7:
        return new m((r02 * r1) / r3, r1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((m) r1);
    }

    public m d(m r6) {
        int r02 = this.f41187a;
        int r1 = r6.f41188b;
        int r2 = r02 * r1;
        int r62 = r6.f41187a;
        int r3 = this.f41188b;
        if (r2 < (r62 * r3)) goto L7;
        return new m(r62, (r3 * r62) / r02);
    L7:
        return new m((r02 * r1) / r3, r1);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L15;
        m r52 = (m) r5;
        if (this.f41187a != r52.f41187a) goto L15;
        if (this.f41188b != r52.f41188b) goto L15;
        return true;
    }

    public int hashCode() {
        return (this.f41187a * 31) + this.f41188b;
    }

    public String toString() {
        return this.f41187a + "x" + this.f41188b;
    }
}
