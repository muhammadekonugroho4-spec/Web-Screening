package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16389b;

    public m2(Object r1, int r2) {
        this.f16388a = r1;
        this.f16389b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m2) == true) goto L8;
        return false;
    L8:
        m2 r52 = (m2) r5;
        if (kotlin.jvm.internal.p.g(this.f16388a, r52.f16388a) == true) goto L12;
        return false;
    L12:
        if (this.f16389b == r52.f16389b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f16388a.hashCode() * 31) + Integer.hashCode(this.f16389b);
    }

    public String toString() {
        return "SourceInformationSlotTableGroupIdentity(parentIdentity=" + this.f16388a + ", index=" + this.f16389b + ')';
    }
}
