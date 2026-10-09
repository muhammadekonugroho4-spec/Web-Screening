package androidx.activity.compose;

/* loaded from: classes.dex */
public final class x extends androidx.navigationevent.g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2188a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2189b;

    public x(Object r1, long r2) {
        this.f2188a = r1;
        this.f2189b = r2;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof x) == true) goto L8;
        return false;
    L8:
        x r82 = (x) r8;
        if (kotlin.jvm.internal.p.g(this.f2188a, r82.f2188a) == true) goto L12;
        return false;
    L12:
        if (this.f2189b == r82.f2189b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f2188a.hashCode() * 31) + Long.hashCode(this.f2189b);
    }

    public String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.f2188a + ", compositeKey=" + this.f2189b + ')';
    }
}
