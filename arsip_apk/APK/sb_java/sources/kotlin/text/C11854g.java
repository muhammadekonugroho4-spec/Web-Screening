package kotlin.text;

/* renamed from: kotlin.text.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11854g {

    /* renamed from: a, reason: collision with root package name */
    public final String f180385a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.ranges.j f180386b;

    public C11854g(String r2, kotlin.ranges.j r3) {
        kotlin.jvm.internal.p.l(r2, "value");
        kotlin.jvm.internal.p.l(r3, "range");
        this.f180385a = r2;
        this.f180386b = r3;
    }

    public final String a() {
        return this.f180385a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C11854g) == true) goto L8;
        return false;
    L8:
        C11854g r52 = (C11854g) r5;
        if (kotlin.jvm.internal.p.g(this.f180385a, r52.f180385a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f180386b, r52.f180386b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f180385a.hashCode() * 31) + this.f180386b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f180385a + ", range=" + this.f180386b + ')';
    }
}
