package androidx.compose.runtime;

/* renamed from: androidx.compose.runtime.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3429q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16406a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16407b;

    static {
    }

    public C3429q0(Object r1, Object r2) {
        this.f16406a = r1;
        this.f16407b = r2;
    }

    public final int a(Object r2) {
        if ((r2 instanceof Enum) == true) goto L5;
        if (r2 != null) goto L8;
        return 0;
    L8:
        return r2.hashCode();
    L5:
        return ((Enum) r2).ordinal();
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3429q0) == true) goto L8;
        return false;
    L8:
        C3429q0 r52 = (C3429q0) r5;
        if (kotlin.jvm.internal.p.g(this.f16406a, r52.f16406a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f16407b, r52.f16407b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (a(this.f16406a) * 31) + a(this.f16407b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f16406a + ", right=" + this.f16407b + ')';
    }
}
