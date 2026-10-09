package androidx.activity.compose;

/* loaded from: classes.dex */
public final class f extends androidx.navigationevent.g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2150a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2151b;

    public f(Object r1, long r2) {
        this.f2150a = r1;
        this.f2151b = r2;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (kotlin.jvm.internal.p.g(this.f2150a, r82.f2150a) == true) goto L12;
        return false;
    L12:
        if (this.f2151b == r82.f2151b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f2150a.hashCode() * 31) + Long.hashCode(this.f2151b);
    }

    public String toString() {
        return "BackHandlerInfo(owner=" + this.f2150a + ", compositeKey=" + this.f2151b + ')';
    }
}
