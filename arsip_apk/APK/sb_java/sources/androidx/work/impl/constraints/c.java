package androidx.work.impl.constraints;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29352a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29353b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29354c;
    public final boolean d;

    public c(boolean r1, boolean r2, boolean r3, boolean r4) {
        this.f29352a = r1;
        this.f29353b = r2;
        this.f29354c = r3;
        this.d = r4;
    }

    public final boolean a() {
        return this.f29352a;
    }

    public final boolean b() {
        return this.f29354c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f29353b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f29352a == r52.f29352a) goto L12;
        return false;
    L12:
        if (this.f29353b == r52.f29353b) goto L15;
        return false;
    L15:
        if (this.f29354c == r52.f29354c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f29352a) * 31) + Boolean.hashCode(this.f29353b)) * 31) + Boolean.hashCode(this.f29354c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f29352a + ", isValidated=" + this.f29353b + ", isMetered=" + this.f29354c + ", isNotRoaming=" + this.d + ')';
    }
}
