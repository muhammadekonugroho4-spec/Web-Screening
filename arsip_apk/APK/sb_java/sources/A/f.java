package A;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f89b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f90c;

    public f(boolean r1, boolean r2, boolean r3) {
        this.f88a = r1;
        this.f89b = r2;
        this.f90c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f88a == r52.f88a) goto L12;
        return false;
    L12:
        if (this.f89b == r52.f89b) goto L15;
        return false;
    L15:
        if (this.f90c == r52.f90c) goto L17;
        return false;
    L17:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean r02 = this.f88a;
        int r1 = 1;
        ?? r03 = r02;
        if (r02 == false) goto L5;
        r03 = 1;
    L5:
        int r04 = r03 * 31;
        ?? r2 = this.f89b;
        int r22 = r2;
        if (r2 == 0) goto L8;
        r22 = 1;
    L8:
        int r05 = (r04 + r22) * 31;
        boolean r23 = this.f90c;
        if (r23 == true) goto L13;
        r1 = r23 ? 1 : 0;
    L13:
        return r05 + r1;
    }

    public final String toString() {
        return "OneKycCSRemoteConfig(csIgnoreBatteryLvlOnFlush=" + this.f88a + ", isForegroundEventFlushEnabled=" + this.f89b + ", enableOkHttpSocket=" + this.f90c + ")";
    }
}
