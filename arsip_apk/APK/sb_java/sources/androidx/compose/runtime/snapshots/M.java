package androidx.compose.runtime.snapshots;

import kotlin.collections.AbstractC11772p;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public int f16527a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f16528b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.compose.runtime.internal.B[] f16529c;

    static {
    }

    public M() {
        this.f16528b = new int[16];
        this.f16529c = new androidx.compose.runtime.internal.B[16];
    }

    public final boolean a(Object r14) {
        int r02 = this.f16527a;
        int r1 = androidx.compose.runtime.internal.v.a(r14);
        if (r02 <= 0) goto L7;
        int r3 = b(r14, r1);
        if (r3 < 0) goto L8;
        return false;
    L8:
        int r9 = -(r3 + 1);
        androidx.compose.runtime.internal.B[] r32 = this.f16529c;
        int r5 = r32.length;
        if (r02 != r5) goto L11;
        int r52 = r5 * 2;
        androidx.compose.runtime.internal.B[] r12 = new androidx.compose.runtime.internal.B[r52];
        int[] r6 = new int[r52];
        int r53 = r9 + 1;
        System.arraycopy(r32, r9, r12, r53, r02 - r9);
        System.arraycopy(this.f16529c, 0, r12, 0, r9);
        AbstractC11772p.m(this.f16528b, r6, r53, r9, r02);
        AbstractC11772p.r(this.f16528b, r6, 0, 0, r9, 6, null);
        this.f16529c = r12;
        this.f16528b = r6;
    L12:
        this.f16529c[r9] = new androidx.compose.runtime.internal.B(r14);
        this.f16528b[r9] = r1;
        this.f16527a++;
        return true;
    L11:
        int r2 = r9 + 1;
        System.arraycopy(r32, r9, r32, r2, r02 - r9);
        int[] r33 = this.f16528b;
        AbstractC11772p.m(r33, r33, r2, r9, r02);
        goto L12
    L7:
        r3 = -1;
        goto L8
    }

    public final int b(Object r5, int r6) {
        int r02 = this.f16527a - 1;
        int r1 = 0;
    L3:
        if (r1 > r02) goto L18;
        int r2 = (r1 + r02) >>> 1;
        int r3 = this.f16528b[r2];
        if (r3 < r6) goto L6;
        if (r3 <= r6) goto L9;
        r02 = r2 - 1;
        goto L3
    L9:
        androidx.compose.runtime.internal.B r03 = this.f16529c[r2];
        if (r03 == null) goto L12;
        Object r04 = r03.get();
    L13:
        if (r5 != r04) goto L16;
        return r2;
    L16:
        return c(r2, r5, r6);
    L12:
        r04 = null;
        goto L13
    L6:
        r1 = r2 + 1;
        goto L3
    L18:
        return -(r1 + 1);
    }

    public final int c(int r4, Object r5, int r6) {
        int r02 = r4 - 1;
    L3:
        Object r1 = null;
        if ((-1) >= r02) goto L14;
        if (this.f16528b[r02] != r6) goto L14;
        androidx.compose.runtime.internal.B r2 = this.f16529c[r02];
        if (r2 == null) goto L11;
        r1 = r2.get();
    L11:
        if (r1 == r5) goto L12;
        r02 = r02 - 1;
        goto L3
    L12:
        return r02;
    L14:
        int r42 = r4 + 1;
        int r03 = this.f16527a;
    L15:
        if (r42 >= r03) goto L27;
        if (this.f16528b[r42] != r6) goto L19;
        androidx.compose.runtime.internal.B r22 = this.f16529c[r42];
        if (r22 == null) goto L23;
        Object r23 = r22.get();
    L24:
        if (r23 == r5) goto L25;
        r42 = r42 + 1;
        goto L15
    L25:
        return r42;
    L23:
        r23 = null;
    L19:
        return -(r42 + 1);
    L27:
        r42 = this.f16527a;
        goto L19
    }

    public final int[] d() {
        return this.f16528b;
    }

    public final int e() {
        return this.f16527a;
    }

    public final androidx.compose.runtime.internal.B[] f() {
        return this.f16529c;
    }

    public final void g(int r1) {
        this.f16527a = r1;
    }
}
