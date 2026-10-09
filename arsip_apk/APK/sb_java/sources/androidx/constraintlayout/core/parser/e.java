package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: f, reason: collision with root package name */
    public float f21197f;

    public e(float r2) {
        super(null);
        this.f21197f = r2;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public float e() {
        if (Float.isNaN(this.f21197f) == false) goto L8;
        if (k() == false) goto L8;
        this.f21197f = Float.parseFloat(b());
    L8:
        return this.f21197f;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == false) goto L15;
        float r1 = e();
        float r52 = ((e) r5).e();
        if (Float.isNaN(r1) == false) goto L13;
        if (Float.isNaN(r52) == false) goto L13;
        return true;
    L13:
        if (r1 != r52) goto L15;
        return true;
    L15:
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int g() {
        if (Float.isNaN(this.f21197f) == false) goto L8;
        if (k() == false) goto L8;
        this.f21197f = Integer.parseInt(b());
    L8:
        return (int) this.f21197f;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int hashCode() {
        int r02 = super.hashCode() * 31;
        float r1 = this.f21197f;
        if (r1 == 0.0f) goto L5;
        int r12 = Float.floatToIntBits(r1);
    L7:
        return r02 + r12;
    L5:
        r12 = 0;
        goto L7
    }
}
