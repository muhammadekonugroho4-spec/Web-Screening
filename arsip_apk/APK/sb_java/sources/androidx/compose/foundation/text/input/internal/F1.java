package androidx.compose.foundation.text.input.internal;

/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public final WedgeAffinity f10083a;

    /* renamed from: b, reason: collision with root package name */
    public final WedgeAffinity f10084b;

    static {
    }

    public F1(WedgeAffinity r1, WedgeAffinity r2) {
        this.f10083a = r1;
        this.f10084b = r2;
    }

    public static /* synthetic */ F1 b(F1 r02, WedgeAffinity r1, WedgeAffinity r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f10083a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f10084b;
    L9:
        return r02.a(r1, r2);
    }

    public final F1 a(WedgeAffinity r2, WedgeAffinity r3) {
        return new F1(r2, r3);
    }

    public final WedgeAffinity c() {
        return this.f10084b;
    }

    public final WedgeAffinity d() {
        return this.f10083a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof F1) == true) goto L8;
        return false;
    L8:
        F1 r52 = (F1) r5;
        if (this.f10083a == r52.f10083a) goto L12;
        return false;
    L12:
        if (this.f10084b == r52.f10084b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f10083a.hashCode() * 31) + this.f10084b.hashCode();
    }

    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f10083a + ", endAffinity=" + this.f10084b + ')';
    }

    public F1(WedgeAffinity r1) {
        this(r1, r1);
    }
}
