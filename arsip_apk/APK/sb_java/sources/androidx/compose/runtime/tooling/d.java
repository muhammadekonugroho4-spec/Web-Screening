package androidx.compose.runtime.tooling;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f16646a;

    /* renamed from: b, reason: collision with root package name */
    public final y f16647b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f16648c;

    static {
    }

    public d(int r1, y r2, Integer r3) {
        this.f16646a = r1;
        this.f16647b = r2;
        this.f16648c = r3;
    }

    public static /* synthetic */ d b(d r02, int r1, y r2, Integer r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f16646a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f16647b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f16648c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final d a(int r2, y r3, Integer r4) {
        return new d(r2, r3, r4);
    }

    public final int c() {
        return this.f16646a;
    }

    public final Integer d() {
        return this.f16648c;
    }

    public final y e() {
        return this.f16647b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f16646a == r52.f16646a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f16647b, r52.f16647b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f16648c, r52.f16648c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f16646a) * 31;
        y r1 = this.f16647b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Integer r13 = this.f16648c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f16646a + ", sourceInfo=" + this.f16647b + ", groupOffset=" + this.f16648c + ')';
    }
}
