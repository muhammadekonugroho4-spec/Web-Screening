package androidx.compose.runtime.internal;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f16351a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f16352b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f16353c;

    static {
    }

    public w(int r1, long[] r2, Object[] r3) {
        this.f16351a = r1;
        this.f16352b = r2;
        this.f16353c = r3;
    }

    public final int a(long r9) {
        int r02 = this.f16351a - 1;
        if (r02 == (-1)) goto L22;
        int r2 = 0;
        if (r02 == 0) goto L15;
    L6:
        if (r2 > r02) goto L14;
        int r1 = (r2 + r02) >>> 1;
        long r4 = this.f16352b[r1] - r9;
        if (r4 < 0) goto L9;
        if (r4 <= 0) goto L12;
        r02 = r1 - 1;
        goto L6
    L12:
        return r1;
    L9:
        r2 = r1 + 1;
        goto L6
    L14:
        return -(r2 + 1);
    L15:
        long r3 = this.f16352b[0];
        if (r3 != r9) goto L19;
        return 0;
    L19:
        if (r3 <= r9) goto L22;
        return -2;
    L22:
        return -1;
    }

    public final Object b(long r1) {
        int r12 = a(r1);
        if (r12 >= 0) goto L5;
        return null;
    L5:
        return this.f16353c[r12];
    }

    public final w c(long r12, Object r14) {
        int r02 = this.f16351a;
        Object[] r1 = this.f16353c;
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r2) goto L8;
        if (r1[r4] == null) goto L7;
        r5 = r5 + 1;
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        int r13 = r5 + 1;
        long[] r22 = new long[r13];
        Object[] r42 = new Object[r13];
        if (r13 <= 1) goto L26;
        int r6 = 0;
    L11:
        if (r3 >= r13) goto L19;
        if (r6 >= r02) goto L19;
        long r8 = this.f16352b[r6];
        Object r7 = this.f16353c[r6];
        if (r8 > r12) goto L15;
        if (r7 == null) goto L18;
        r22[r3] = r8;
        r42[r3] = r7;
        r3 = r3 + 1;
    L18:
        r6 = r6 + 1;
        goto L11
    L15:
        r22[r3] = r12;
        r42[r3] = r14;
        r3 = r3 + 1;
    L19:
        if (r6 != r02) goto L21;
        r22[r5] = r12;
        r42[r5] = r14;
    L28:
        return new w(r13, r22, r42);
    L21:
        if (r3 >= r13) goto L28;
        long r132 = this.f16352b[r6];
        Object r122 = this.f16353c[r6];
        if (r122 == null) goto L25;
        r22[r3] = r132;
        r42[r3] = r122;
        r3 = r3 + 1;
    L25:
        r6 = r6 + 1;
        goto L21
    L26:
        r22[0] = r12;
        r42[0] = r14;
        goto L28
    }

    public final boolean d(long r1, Object r3) {
        int r12 = a(r1);
        if (r12 >= 0) goto L6;
        return false;
    L6:
        this.f16353c[r12] = r3;
        return true;
    }
}
