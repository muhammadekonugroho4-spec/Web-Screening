package androidx.paging;

/* renamed from: androidx.paging.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4107l {

    /* renamed from: a, reason: collision with root package name */
    public final int f27020a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f27021b;

    public C4107l(int r2, Y r3) {
        kotlin.jvm.internal.p.l(r3, "hint");
        this.f27020a = r2;
        this.f27021b = r3;
    }

    public final int a() {
        return this.f27020a;
    }

    public final Y b() {
        return this.f27021b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4107l) == true) goto L8;
        return false;
    L8:
        C4107l r52 = (C4107l) r5;
        if (this.f27020a == r52.f27020a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f27021b, r52.f27021b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f27020a) * 31) + this.f27021b.hashCode();
    }

    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.f27020a + ", hint=" + this.f27021b + ')';
    }
}
