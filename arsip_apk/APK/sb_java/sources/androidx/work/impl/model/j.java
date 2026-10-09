package androidx.work.impl.model;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f29478a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29479b;

    public j(String r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "workSpecId");
        this.f29478a = r2;
        this.f29479b = r3;
    }

    public final int a() {
        return this.f29479b;
    }

    public final String b() {
        return this.f29478a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f29478a, r52.f29478a) == true) goto L12;
        return false;
    L12:
        if (this.f29479b == r52.f29479b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f29478a.hashCode() * 31) + Integer.hashCode(this.f29479b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f29478a + ", generation=" + this.f29479b + ')';
    }
}
