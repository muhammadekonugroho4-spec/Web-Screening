package L0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f942a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f943b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f944c;
    public final boolean d;

    public b(boolean r1, boolean r2, boolean r3, boolean r4) {
        this.f942a = r1;
        this.f943b = r2;
        this.f944c = r3;
        this.d = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f942a == r52.f942a) goto L12;
        return false;
    L12:
        if (this.f943b == r52.f943b) goto L15;
        return false;
    L15:
        if (this.f944c == r52.f944c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public final int hashCode() {
        boolean r02 = this.f942a;
        int r1 = 1;
        ?? r03 = r02;
        if (r02 == false) goto L5;
        r03 = 1;
    L5:
        int r04 = r03 * 31;
        ?? r2 = this.f943b;
        int r22 = r2;
        if (r2 == 0) goto L8;
        r22 = 1;
    L8:
        int r05 = (r04 + r22) * 31;
        ?? r23 = this.f944c;
        int r24 = r23;
        if (r23 == 0) goto L11;
        r24 = 1;
    L11:
        int r06 = (r05 + r24) * 31;
        boolean r25 = this.d;
        if (r25 == true) goto L16;
        r1 = r25 ? 1 : 0;
    L16:
        return r06 + r1;
    }

    public final String toString() {
        return "ShadowRegion(left=" + this.f942a + ", top=" + this.f943b + ", right=" + this.f944c + ", bottom=" + this.d + ")";
    }
}
